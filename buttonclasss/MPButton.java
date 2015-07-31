package com.qcmouseproject.buttonclasss;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;

public class MPButton{
	
	String name;
	int width;
	int height;
	int xpos;
	int ypos;
	ButtonColored b;
	Context c;

	public MPButton(){
		
	}

	public MPButton(String n, int w, int h, int x, int y, Context con, AbsoluteLayout al){
		name=n;
		Transformation t = new Transformation(w, h, x, y, con);		
		width = t.width; 
		height = t.height;
		xpos = t.x;
		ypos = t.y;
		c=con;
		
		Log.v("Dimensions", "X: " + t.x + ", Y: " + t.y);

		
		AbsoluteLayout.LayoutParams param = new AbsoluteLayout.LayoutParams(t.width, t.height, t.x, t.y);

		b = new ButtonColored(con);
		b.setSecondColor("YELLOW"); //default color on click 
		b.setLayoutParams(param);

		
	}
	
	
	
	
	public void isVisible(Boolean bool){
		if (bool)
		   b.setVisibility(View.VISIBLE);
		else
		   b.setVisibility(View.INVISIBLE);
			
	}
	
	
    public void setColorUp(String s){
		if(s.equals("RED")) 
			b.setBackgroundColor(Color.RED);
		else if(s.equals("BLACK")) 
			b.setBackgroundColor(Color.BLACK);
		else if(s.equals("BLUE")) 
			b.setBackgroundColor(Color.BLUE);
		else if(s.equals("CYAN")) 
			b.setBackgroundColor(Color.CYAN);
		else if(s.equals("DKGRAY")) 
			b.setBackgroundColor(Color.DKGRAY);
		else if(s.equals("GRAY")) 
			b.setBackgroundColor(Color.GRAY);
		else if(s.equals("GREEN")) 
			b.setBackgroundColor(Color.GREEN);
		else if(s.equals("LTGRAY")) 
			b.setBackgroundColor(Color.LTGRAY);
		else if(s.equals("MAGENTA")) 
			b.setBackgroundColor(Color.MAGENTA);
		else if(s.equals("WHITE")) 
			b.setBackgroundColor(Color.WHITE);
		else if(s.equals("YELLOW")) 
			b.setBackgroundColor(Color.YELLOW);
		else
			b.setText("Not valid color");
			
    	
    }
    
    public void setSecondColor(String color){
    	b.setSecondColor(color);
    	
    }
	

    
	
	public void setColorUpGreyscale(int sat){ 
		
		
		b.getBackground().setColorFilter(0xff696969, PorterDuff.Mode.MULTIPLY);
	
		switch (sat) {
		case 0: 
			b.getBackground().setColorFilter(0xffd3d3d3, PorterDuff.Mode.MULTIPLY);
			break;
		case 1: 
			b.getBackground().setColorFilter(0xffbdbdbd, PorterDuff.Mode.MULTIPLY);
			break;
		case 2: 
			b.getBackground().setColorFilter(0xffa8a8a8, PorterDuff.Mode.MULTIPLY);
			break;
		case 3: 
			b.getBackground().setColorFilter(0xff939393, PorterDuff.Mode.MULTIPLY);
			break;
		case 4: 
			b.getBackground().setColorFilter(0xff7e7e7e, PorterDuff.Mode.MULTIPLY);
			break;
			
		case 5: 
			b.getBackground().setColorFilter(0xff696969, PorterDuff.Mode.MULTIPLY);
			break;
		case 6: 
			b.getBackground().setColorFilter(0xff545454, PorterDuff.Mode.MULTIPLY);
			break;
		case 7: 
			b.getBackground().setColorFilter(0xff3f3f3f, PorterDuff.Mode.MULTIPLY);
			break;
		case 8: 
			b.getBackground().setColorFilter(0xff2a2a2a, PorterDuff.Mode.MULTIPLY);
			break;
		case 9: 
			b.getBackground().setColorFilter(0xff151515, PorterDuff.Mode.MULTIPLY);
			break;
		case 10: 
			b.getBackground().setColorFilter(0xff000000, PorterDuff.Mode.MULTIPLY);
			break;
		}
		
		
		
	}
	

    public void addMethodOnRelease(String method){
    	//Going to have to give the user a list of the approved methods
    	b.setOnClickMethods(method);
    }
	public void multiEventOnRelease(){
		MultiClickListener mcl = new MultiClickListener();
		b.setOnClickListener(mcl);
	}
	
	public void toneOnPress(){
		ToneTouchListener ttl = new ToneTouchListener();
		b.setOnTouchListener(ttl);
		
	}
	
	
	public void changeColorOnPress(){
		ColorTouchListener ctl = new ColorTouchListener();
		b.setOnTouchListener(ctl);
		
	}
	
	
	public void setName(String n){
		name=n;
	}
	
	public String getName(){
		return name;
	}
	
	public void addButton(AbsoluteLayout al){
		al.addView(b);
		
	}
	
	

	
	
}
