package com.phuongnd.game.android;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;
import com.phuongnd.game.FantasyTowerDefend;
import com.phuongnd.game.android.SimpleGestureFilter.SimpleGestureListener;

public class AndroidLauncher extends AndroidApplication implements
		SimpleGestureListener {

	private SimpleGestureFilter detector;
	private FantasyTowerDefend game;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		AndroidApplicationConfiguration config = new AndroidApplicationConfiguration();
		game = new FantasyTowerDefend();
		initialize(game, config);

		// Detect touched area
		detector = new SimpleGestureFilter(this, this);
	}

	@Override
	public void onSwipe(int direction) {
		// TODO Auto-generated method stub
		String str = "";

		switch (direction) {

		case SimpleGestureFilter.SWIPE_RIGHT:
			str = "Swipe Right";
			break;
		case SimpleGestureFilter.SWIPE_LEFT:
			str = "Swipe Left";
			break;
		case SimpleGestureFilter.SWIPE_DOWN:
			str = "Swipe Down";
			break;
		case SimpleGestureFilter.SWIPE_UP:
			str = "Swipe Up";
			break;

		}
		Log.d("FANTASY-TOWER-DEFEND: ", str);
	}

	@Override
	public void onDoubleTap() {
		// TODO Auto-generated method stub
		Log.d("FANTASY-TOWER-DEFEND: ", "Double Tap");
	}

	@Override
	public boolean dispatchTouchEvent(MotionEvent me) {
		// TODO Auto-generated method stub
		// Call onTouchEvent of SimpleGestureFilter class
		this.detector.onTouchEvent(me);
		return super.dispatchTouchEvent(me);
	}
}
