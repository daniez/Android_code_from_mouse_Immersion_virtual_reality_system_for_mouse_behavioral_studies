package com.qcmouseproject.buttonclasss;


import android.R.color;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;

public class ColorClickListener implements OnClickListener {
	
	//hold the state of the button
	private String colorOrig="";
	private String colorSecond = "";
	
	
	
	
	@Override
	public void onClick(final View v) { //changes button to yellow on release, then back to orig color
		
		
		//get color that button is now
		final ColorDrawable buttonColor = (ColorDrawable) v.getBackground();
		
		int colorId = buttonColor.getColor();
		if (colorId==Color.RED) 
			colorOrig ="RED";
		else if(colorId==Color.BLACK)		 
			colorOrig ="BLACK";
		else if(colorId==Color.BLUE)	
			colorOrig ="BLUE";
		else if(colorId==Color.CYAN)		
			colorOrig ="CYAN";
		else if(colorId==Color.DKGRAY)		 
			colorOrig ="DKGRAY";
		else if(colorId==Color.GRAY)	 
			colorOrig ="GRAY";
		else if(colorId==Color.GREEN)
			colorOrig ="GREEN";
		else if(colorId==Color.LTGRAY)
			colorOrig ="LTGRAY";
		else if(colorId==Color.MAGENTA)		
			colorOrig ="MAGENTA";
		else if(colorId==Color.WHITE)
			colorOrig ="WHITE";
		else if(colorId==Color.YELLOW)
			colorOrig ="YELLOW";
			
		//set color on press
        colorSecond = ((ButtonColored) v).getSecondColor();
		//Log.d("ccl", "ccl" + colorSecond);
		
		if(colorSecond.equals("RED")) 
			v.setBackgroundColor(Color.RED);
		else if(colorSecond.equals("BLACK")) 
			v.setBackgroundColor(Color.BLACK);
		else if(colorSecond.equals("BLUE")) 
			v.setBackgroundColor(Color.BLUE);
		else if(colorSecond.equals("CYAN")) 
			v.setBackgroundColor(Color.CYAN);
		else if(colorSecond.equals("DKGRAY")) 
			v.setBackgroundColor(Color.DKGRAY);
		else if(colorSecond.equals("GRAY")) 
			v.setBackgroundColor(Color.GRAY);
		else if(colorSecond.equals("GREEN")) 
			v.setBackgroundColor(Color.GREEN);
		else if(colorSecond.equals("LTGRAY")) 
			v.setBackgroundColor(Color.LTGRAY);
		else if(colorSecond.equals("MAGENTA")) 
			v.setBackgroundColor(Color.MAGENTA);
		else if(colorSecond.equals("WHITE")) 
			v.setBackgroundColor(Color.WHITE);
		else if(colorSecond.equals("YELLOW")) 
			v.setBackgroundColor(Color.YELLOW);
		else
		    v.setBackgroundColor(Color.YELLOW); //default
		
	
		 new CountDownTimer(100, 10) { //when I had timer set at 300, 10 it froze when button pressed rapidly

		     public void onTick(long millisUntilFinished) {
		        
		     }

		     public void onFinish() {
		    		
		    		if(colorOrig=="RED")
		    		   v.setBackgroundColor(Color.RED);
		    		else if(colorOrig=="BLACK")
			    		   v.setBackgroundColor(Color.BLACK);
		    		else if(colorOrig=="BLUE")
			    		   v.setBackgroundColor(Color.BLUE);
		    		else if(colorOrig=="CYAN")
			    		   v.setBackgroundColor(Color.CYAN);
		    		else if(colorOrig=="DKGRAY")
			    		   v.setBackgroundColor(Color.DKGRAY);
		    		else if(colorOrig=="GRAY")
			    		   v.setBackgroundColor(Color.GRAY);
		    		else if(colorOrig=="GREEN")
			    		   v.setBackgroundColor(Color.GREEN);
		    		else if(colorOrig=="LTGRAY")
			    		   v.setBackgroundColor(Color.LTGRAY);
		    		else if(colorOrig=="MAGENTA")
			    		   v.setBackgroundColor(Color.MAGENTA);
		    		else if(colorOrig=="WHITE")
			    		   v.setBackgroundColor(Color.WHITE);
		    		else if(colorOrig=="YELLOW")
			    		   v.setBackgroundColor(Color.YELLOW);
		    		
		    		//Log.d("color", colorId + " color");
		     }
		  }.start();
	
		
		
	}//onClick
	
	public void getSecondColor(String color){
	 colorSecond=color;	
	}
	


}
