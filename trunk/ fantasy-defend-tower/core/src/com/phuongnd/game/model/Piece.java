package com.phuongnd.game.model;

import com.badlogic.gdx.math.Vector2;

public class Piece {

	private Vector2 position;
	private int id;

	public Piece(int id, Vector2 position) {
		super();
		this.position = position;
		this.id = id;
	}

	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
