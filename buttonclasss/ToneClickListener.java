package com.qcmouseproject.buttonclasss;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;

public class ToneClickListener implements OnClickListener {

	@Override
	public void onClick(View v) {
		//http://stackoverflow.com/questions/12154940/how-to-make-a-beep-in-android
		ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_ALARM, 65);
		toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 200); 
		//Log.d("tcl", "tcl");
	}
	

	
	

}
