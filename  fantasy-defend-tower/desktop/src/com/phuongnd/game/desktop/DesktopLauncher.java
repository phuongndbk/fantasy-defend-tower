package com.phuongnd.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.phuongnd.game.FantasyTowerDefend;

public class DesktopLauncher {
	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Fantasy Tower Defend";
		config.useGL30 = false;
		config.width = 800;
		config.height = 480;
		config.resizable = false;
		new LwjglApplication(new FantasyTowerDefend(), config);
	}
}
