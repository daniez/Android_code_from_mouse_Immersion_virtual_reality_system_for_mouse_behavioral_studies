package com.qcmouseproject.buttonclasss;

import java.util.ArrayList;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;

public class MultiClickListener implements OnClickListener {

	@Override
	public void onClick(View v) {
		
		
		ArrayList list = ((ButtonColored)v).getOnClickMethods();
		int length = list.size();
		String method="";
		for(int i =0; i < length; i++){
		    method = (String) list.get(i);
			if(method=="TONE"){
				ToneClickListener tcl = new ToneClickListener();
				tcl.onClick(v);
			}
			else if(method =="COLOR"){
				ColorClickListener ccl = new ColorClickListener();
				ccl.onClick(v);
			
			}
		}
		
		
		
	}
	

	
	

}
