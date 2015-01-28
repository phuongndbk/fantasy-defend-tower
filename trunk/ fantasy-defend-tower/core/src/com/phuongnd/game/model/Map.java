package com.phuongnd.game.model;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.controller.Constant;

public class Map {
	private Piece[][] boards;
	private ArrayList<Piece> path_1, path_2, towers;

	public Map() {
		// TODO Auto-generated constructor stub
		boards = new Piece[Constant.MAP_ROWS][Constant.MAP_COLS];
		for (int i = 0; i < boards.length; i++) {
			for (int j = 0; j < boards[i].length; j++) {
				boards[i][j] = new Piece(Constant.PIECE_EMPTY,
						new Vector2(i, j));
			}
		}
		path_1 = new ArrayList<Piece>();
		path_2 = new ArrayList<Piece>();
		towers = new ArrayList<Piece>();
	}

	public Piece[][] getBoards() {
		return boards;
	}

	public void setBoards(Piece[][] boards) {
		this.boards = boards;
	}

	public ArrayList<Piece> getPath_1() {
		return path_1;
	}

	public void setPath_1(ArrayList<Piece> path_1) {
		this.path_1 = path_1;
	}

	public ArrayList<Piece> getPath_2() {
		return path_2;
	}

	public void setPath_2(ArrayList<Piece> path_2) {
		this.path_2 = path_2;
	}

	public ArrayList<Piece> getTowers() {
		return towers;
	}

	public void setTowers(ArrayList<Piece> towers) {
		this.towers = towers;
	}
}
