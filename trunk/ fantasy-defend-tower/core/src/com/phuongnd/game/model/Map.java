package com.phuongnd.game.model;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.controller.Constant;

public class Map {
	private Piece[][] boards;
	private ArrayList<Vector2> paths, towers;

	public Map() {
		// TODO Auto-generated constructor stub
		boards = new Piece[Constant.MAP_ROWS][Constant.MAP_COLS];
		for (int i = 0; i < boards.length; i++) {
			for (int j = 0; j < boards[i].length; j++) {
				boards[i][j] = new Piece(Constant.PIECE_EMPTY, i, j);
			}
		}
		paths = new ArrayList<Vector2>();
		towers = new ArrayList<Vector2>();
	}

	public Piece[][] getBoards() {
		return boards;
	}

	public void setBoards(Piece[][] boards) {
		this.boards = boards;
	}

	public ArrayList<Vector2> getPaths() {
		return paths;
	}

	public void setPaths(ArrayList<Vector2> paths) {
		this.paths = paths;
	}

	public ArrayList<Vector2> getTowers() {
		return towers;
	}

	public void setTowers(ArrayList<Vector2> towers) {
		this.towers = towers;
	}

}
