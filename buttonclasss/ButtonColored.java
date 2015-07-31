package com.qcmouseproject.buttonclasss;

import java.util.ArrayList;
import java.util.LinkedList;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

public class ButtonColored extends Button {
	
	private String colorSecond = "";
	private ArrayList<String> onClickMethods= new ArrayList<String>();
	private ArrayList<String> onTouchMethods= new ArrayList<String>();

	public ButtonColored(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public ButtonColored(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public ButtonColored(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	public void setSecondColor(String color){
		colorSecond=color;
	}
	
	public String getSecondColor(){
		return colorSecond;
	}
	
	public void setOnClickMethods(String method){
		onClickMethods.add(method);
	}
	
	public ArrayList<String> getOnClickMethods(){
		return onClickMethods;
	}
	
	

}
