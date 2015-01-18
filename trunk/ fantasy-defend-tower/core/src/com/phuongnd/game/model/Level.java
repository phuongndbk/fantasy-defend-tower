package com.phuongnd.game.model;

import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.Setting;

public class Level {

	private int level;
	private String levelInformation;

	private Map map;

	public Level(int level) {
		// TODO Auto-generated constructor stub
		levelInformation = Setting.loadLevel(level);
		this.level = level;

		map = new Map();
		getMapInfomation(levelInformation);
		getPieceInfomation();
	}

	public void getMapInfomation(String string) {
		String[] temp1 = string.split("\n");
		for (int i = 0; i < Constant.MAP_ROWS; i++) {
			String[] temp2 = temp1[3 + i].split(":");
			for (int j = 0; j < Constant.MAP_COLS; j++) {
				map.getBoards()[i][j].setId((int) Float.parseFloat(temp2[j]));
			}
		}
	}

	public void getPieceInfomation() {
		for (int i = 0; i < Constant.MAP_ROWS; ++i) {
			for (int j = 0; j < Constant.MAP_COLS; ++j) {
				if (map.getBoards()[i][j].getId() == Constant.PIECE_STREET) {
					map.getPaths().add(new Vector2(i, j));
				} else if (map.getBoards()[i][j].getId() == Constant.PIECE_BUILD) {
					map.getTowers().add(new Vector2(i, j));
				}
			}
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getLevelInformation() {
		return levelInformation;
	}

	public void setLevelInformation(String levelInformation) {
		this.levelInformation = levelInformation;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

}
