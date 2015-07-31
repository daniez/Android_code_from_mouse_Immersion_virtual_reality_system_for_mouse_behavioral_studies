package com.qcmouseproject.buttonclasss;

//This class written by my team member Alex White

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;


public class Transformation {
	
	int width;
	int height;
	int x;
	int y;
	
	public Transformation(int w, int h, int x, int y, Context c){
		
		int [] return_specs = new int[4];
		int [] input_specs = new int[4];
		int [] display_dimensions = getSpecs(c);		
		input_specs[0] = w;
		input_specs[1] = h;
		input_specs[2] = x;
		input_specs[3] = y;
				
		return_specs = convertSpecs(display_dimensions, input_specs);
		this.width = return_specs[0];
		this.height = return_specs[1];
		this.x = return_specs[2];
		this.y = return_specs[3];
	}
	
	private static int[] getSpecs(Context c){
		
		int [] dims = new int[2];
		
		WindowManager w = (WindowManager) c.getSystemService(c.WINDOW_SERVICE);
		Display display = w.getDefaultDisplay();
		Point size = new Point();
		display.getSize(size);
		
		dims[0] = size.x;
		dims[1] = size.y;
		Log.v("Screen Size", "X: " + dims[0] + ", Y: " + dims[1]);
		
		return dims;
	}
	
	private static int [] convertSpecs(int [] display_specs, int [] object_specs){
		
		int [] return_specs = new int[4];
		
		//takes system width, divide by 100
		/*return x*/ int converted_x = display_specs[0]/100;
		/*return y*/ int converted_y = display_specs[1]/111;
		
		// need to adjust width because percentage of screen dimension x needs to be lower
		/*return width*/  return_specs[0] = object_specs[0] * (converted_x * display_specs[1]/display_specs[0]);
				//(object_specs[0]/2);
		/*return height*/ return_specs[1] = object_specs[1] * converted_y;
		
		/*return x*/ return_specs[2] = converted_x*object_specs[2] - (return_specs[0]/2);
		/*return y*/ return_specs[3] = converted_y*object_specs[3] - (return_specs[1]/2)+20;
		
		return return_specs;		
	}
}
