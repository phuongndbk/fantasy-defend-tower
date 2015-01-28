package com.phuongnd.game.controller;

import com.badlogic.gdx.math.Vector2;

public class Ulti {

	public static Vector2 convertPositionWorld(Vector2 position) {
		Vector2 kq = new Vector2();
		kq.x = position.y * Constant.MAP_UNIT_SIZE_WIDTH;
		kq.y = (Constant.MAP_ROWS - position.x - 1)
				* Constant.MAP_UNIT_SIZE_HEIGHT;
		return kq;
	}

	public static Vector2 convertPositionWorld_2(int x, int y) {
		Vector2 kq = new Vector2();
		kq.x = x * Constant.MAP_UNIT_SIZE_WIDTH;
		kq.y = y * Constant.MAP_UNIT_SIZE_HEIGHT;
		return kq;
	}
}
