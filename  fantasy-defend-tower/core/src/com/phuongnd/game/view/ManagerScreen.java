package com.phuongnd.game.view;

import com.badlogic.gdx.Screen;
import com.phuongnd.game.FantasyTowerDefend;

public class ManagerScreen {

	// Screen Definition
	public static int SCREEN_MENU = 0;
	public static int SCREEN_PLAY = 1;
	public static int SCREEN_SELECT_SLOT = 2;
	// public static int SCREEN_SPLASH = -1;

	public final FantasyTowerDefend game;
	private Screen nowScreen;

	public ManagerScreen(FantasyTowerDefend game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public Screen getScreen() {
		if (nowScreen == null) {
			nowScreen = new MenuScreen(game);
			nowScreen.show();
		}
		return nowScreen;
	}

	public Screen createScreen(int select) {
		switch (select) {
		/*
		 * case -1:
		 * 
		 * clearNowScreen(); nowScreen = new SplashScreen(); nowScreen.show();
		 * return nowScreen;
		 */

		case 0:
			clearNowScreen();
			nowScreen = new MenuScreen(game);
			nowScreen.show();
			return nowScreen;
		case 1:
			clearNowScreen();
			nowScreen = new PlayScreen(game);
			nowScreen.show();
			return nowScreen;
		case 2:
			clearNowScreen();
			nowScreen = new SelectScreen(game);
			nowScreen.show();
			return nowScreen;
		}
		return new MenuScreen(game);
	}

	private void clearNowScreen() {
		if (nowScreen != null)
			nowScreen.dispose();
	}

}
