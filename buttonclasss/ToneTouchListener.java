package com.qcmouseproject.buttonclasss;

import android.media.AudioManager;
import android.media.ToneGenerator;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

public class ToneTouchListener implements OnTouchListener{

	public boolean onTouch(View v, MotionEvent event) {
		
		switch ( event.getAction() ) {
		case MotionEvent.ACTION_DOWN: {
    		//http://stackoverflow.com/questions/12154940/how-to-make-a-beep-in-android
    		ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_ALARM, 65);
    		toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 200); 
            break;
        }
		case MotionEvent.ACTION_UP: break;
        
		}
        return false;
		
	}

}
