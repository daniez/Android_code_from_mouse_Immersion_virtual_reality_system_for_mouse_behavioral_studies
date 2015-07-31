package com.qcmouseproject.buttonclasss;

/*
 A simple part of code used in creating Android application which is part of project:
Immersion virtual reality system for mouse behavioral studies https://www.linkedin.com/in/daniellezoealoicius (see projects).
(Code for this project is private repo.)
Users (grad students) can use these methods in their onCreate method to make various sized buttons 
in their apps which change color on press down or release or emits a tone on press down or release.
*/
import com.example.buttonclasstest03232014.R;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.widget.AbsoluteLayout;

public class MainActivity extends Activity {
	
	AbsoluteLayout al;
	
    //grad student adds next line to add a button
	MPButton Bob1, Jane1, Mary1, Tom1, Bob2, Jane2, Mary2, Tom2, Bob3, Jane3, Mary3, Tom3;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.activity_main);
		al = (AbsoluteLayout)findViewById(R.id.a_layout);
		al.setBackgroundColor(Color.BLACK); 
		
	    //grad student adds following lines:
		Bob1 = new MPButton("Bob", 20, 20 , 10, 10, this, al); 
		Bob1.isVisible(false);
		Bob1.isVisible(true); 
		Bob1.setColorUp("RED");
		Bob1.addButton(al);
		//Bob1.changeColorOnRelease();
		Bob1.changeColorOnPress();

	
		Jane1 = new MPButton("Jane", 20, 20 , 20, 20, this, al);
		//Jane1.changeColorOnRelease();
		Jane1.changeColorOnPress();
		Jane1.setColorUp("BLACK");
		Jane1.addButton(al);
	
		Mary1 = new MPButton("Mary", 20, 20 , 30, 30, this, al); 
		Mary1.changeColorOnPress();
		Mary1.setColorUp("BLUE");
		Mary1.setSecondColor("WHITE");
		Mary1.addButton(al);
		
		Tom1 = new MPButton("Tom", 20, 20 , 40, 40, this, al); 
		//Tom1.changeColorOnRelease();
		Tom1.setColorUp("CYAN");
		Tom1.addButton(al);
		
		Bob2 = new MPButton("Bob", 20, 20 , 50, 50, this, al); 
		Bob2.isVisible(false);
		Bob2.isVisible(true); 		
		Bob2.setColorUp("DKGRAY");
		Bob2.addButton(al);
		//Bob2.changeColorOnRelease();

	
		Jane2 = new MPButton("Jane", 20, 20 , 60, 60, this, al);
		//Jane2.toneOnRelease();	
		Jane2.setColorUp("MAGENTA");
		//Jane2.changeColorOnRelease();
		Jane2.addMethodOnRelease("TONE");
		Jane2.addMethodOnRelease("COLOR");
		Jane2.multiEventOnRelease();	
		Jane2.addButton(al);
		
		Mary2 = new MPButton("Mary", 20, 20 , 70, 70, this, al); 
		//Mary2.changeColorOnRelease();
		Mary2.setColorUp("WHITE");
		Mary2.setSecondColor("RED");
		Mary2.addButton(al);
		
		Tom2 = new MPButton("Tom", 20, 20 , 80, 80, this, al); 
		//Tom2.changeColorOnRelease();
		Tom2.setColorUp("YELLOW");
		Tom2.setSecondColor("BLACK");
		Tom2.addButton(al);
		
		Bob3 = new MPButton("Bob", 20, 20 , 90, 90, this, al); 
		Bob3.isVisible(false);
		Bob3.isVisible(true); 		
		Bob3.setColorUp("GREEN");
		Bob3.addButton(al);
	

	


	}



}
