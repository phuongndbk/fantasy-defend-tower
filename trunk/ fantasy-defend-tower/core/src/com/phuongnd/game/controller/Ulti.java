package com.phuongnd.game.controller;

import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.model.BaseUnit;
import com.phuongnd.game.model.BaseUnit.MOVE_STATE;

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

	public static void checkOpposite(BaseUnit unit1, BaseUnit unit2) {
		if (unit1.getMove_state() == MOVE_STATE.UP) {
			unit2.setMove_state(MOVE_STATE.DOWN);
		} else if (unit1.getMove_state() == MOVE_STATE.DOWN) {
			unit2.setMove_state(MOVE_STATE.UP);
		} else if (unit1.getMove_state() == MOVE_STATE.LEFT) {
			unit2.setMove_state(MOVE_STATE.RIGHT);
		} else if (unit1.getMove_state() == MOVE_STATE.RIGHT) {
			unit2.setMove_state(MOVE_STATE.LEFT);
		} else if (unit1.getMove_state() == MOVE_STATE.UP_LEFT) {
			unit2.setMove_state(MOVE_STATE.DOWN_RIGHT);
		} else if (unit1.getMove_state() == MOVE_STATE.UP_RIGHT) {
			unit2.setMove_state(MOVE_STATE.DOWN_LEFT);
		} else if (unit1.getMove_state() == MOVE_STATE.DOWN_LEFT) {
			unit2.setMove_state(MOVE_STATE.UP_RIGHT);
		} else if (unit1.getMove_state() == MOVE_STATE.DOWN_RIGHT) {
			unit2.setMove_state(MOVE_STATE.UP_LEFT);
		}
	}

	public static void checkFollow(BaseUnit unit1, BaseUnit unit2) {
		unit2.setMove_state(unit1.getMove_state());
	}
}
