package com.phuongnd.game.model;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.Setting;

public class Level {

	private int level;
	private String levelInformation;

	private int coin;
	private int life;
	private int numWave;
	private int[] timeWave;
	private int[][] numbersEnemy;
	private Vector2 startPos1;
	private Vector2 startPos2;

	private Map map;

	public Level(int level) {
		// TODO Auto-generated constructor stub
		levelInformation = Setting.loadLevel(level);
		this.level = level;

		map = new Map();
		getMapInfomation(levelInformation);
		getPieceInfomation();
		life = getNumLife(levelInformation);
		coin = getNumCoin(levelInformation);
		numWave = getNumWave(levelInformation);
		getTimeWave(levelInformation);
		getNumEnemy(levelInformation);
		startPos1 = map.getPath_1().get(0).getPosition();
		if (!map.getPath_2().isEmpty())
			startPos2 = map.getPath_2().get(0).getPosition();
	}

	public void getMapInfomation(String string) {
		String[] temp1 = string.split("\n");
		for (int i = 0; i < Constant.MAP_ROWS; i++) {
			String[] temp2 = temp1[3 + i].split("==");
			for (int j = 0; j < Constant.MAP_COLS; j++) {
				map.getBoards()[i][j].setId((int) Float.parseFloat(temp2[j]
						.trim()));
			}
		}
	}

	public void getPieceInfomation() {
		for (int i = 0; i < Constant.MAP_ROWS; ++i) {
			for (int j = 0; j < Constant.MAP_COLS; ++j) {
				if (map.getBoards()[i][j].getId() >= Constant.PIECE_STREET_1
						&& map.getBoards()[i][j].getId() < Constant.PIECE_STREET_2) {
					map.getPath_1().add(map.getBoards()[i][j]);
				} else if (map.getBoards()[i][j].getId() >= Constant.PIECE_STREET_2
						&& map.getBoards()[i][j].getId() < Constant.PIECE_BUILD) {
					map.getPath_2().add(map.getBoards()[i][j]);
				} else if (map.getBoards()[i][j].getId() == Constant.PIECE_BUILD) {
					map.getTowers().add(map.getBoards()[i][j]);
				}
			}
		}

		// Reconstruct
		ArrayList<Piece> temp = new ArrayList<Piece>();
		int index = 1;
		while (index < map.getPath_1().size()) {
			for (int i = 0; i < map.getPath_1().size(); i++) {
				if (map.getPath_1().get(i).getId() == (index)) {
					temp.add(map.getPath_1().get(i));
					index++;
				}
			}
		}
		map.getPath_1().clear();
		for (int i = 0; i < temp.size(); i++) {
			map.getPath_1().add(temp.get(i));
		}
		temp.clear();

		index = 0;
		while (index < map.getPath_2().size()) {
			for (int i = 0; i < map.getPath_2().size(); i++) {
				if (map.getPath_2().get(i).getId() == (100 + index)) {
					temp.add(map.getPath_2().get(i));
					index++;
				}
			}
		}
		map.getPath_2().clear();
		for (int i = 0; i < temp.size(); i++) {
			map.getPath_2().add(temp.get(i));
		}
		temp.clear();
		temp = null;

	}

	public int getNumCoin(String string) {
		String[] temp1 = string.split("\n");
		return (int) Float.parseFloat(temp1[17].trim());
	}

	public int getNumLife(String string) {
		String[] temp1 = string.split("\n");
		return (int) Float.parseFloat(temp1[15].trim());
	}

	public int getNumWave(String string) {
		String[] temp1 = string.split("\n");
		return (int) Float.parseFloat(temp1[19].trim());
	}

	public void getNumEnemy(String string) {
		String[] temp1 = string.split("\n");
		numbersEnemy = new int[numWave][20];
		for (int i = 0; i < numWave; i++) {
			String[] temp2 = temp1[20 + i].split(":");
			for (int j = 0; j < temp2.length - 1; j++) {
				numbersEnemy[i][j] = (int) Float
						.parseFloat(temp2[j + 1].trim());
			}
		}
	}

	public void getTimeWave(String string) {
		String[] temp1 = string.split("\n");
		timeWave = new int[numWave];
		for (int i = 0; i < numWave; i++) {
			String[] temp2 = temp1[20 + i].split(":");
			timeWave[i] = (int) Float.parseFloat(temp2[0].trim());
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

	public int getNumWave() {
		return numWave;
	}

	public void setNumWave(int numWave) {
		this.numWave = numWave;
	}

	public int[] getTimeWave() {
		return timeWave;
	}

	public void setTimeWave(int[] timeWave) {
		this.timeWave = timeWave;
	}

	public int[][] getNumbersEnemy() {
		return numbersEnemy;
	}

	public void setNumbersEnemy(int[][] numbersEnemy) {
		this.numbersEnemy = numbersEnemy;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public Vector2 getStartPos1() {
		return startPos1;
	}

	public void setStartPos1(Vector2 startPos1) {
		this.startPos1 = startPos1;
	}

	public Vector2 getStartPos2() {
		return startPos2;
	}

	public void setStartPos2(Vector2 startPos2) {
		this.startPos2 = startPos2;
	}

}
