package com.phuongnd.game.controller;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Pool;
import com.phuongnd.game.model.Ball;

public class World {

	// World state
	public static enum STATE {
		WORLD_RUNNING, WORLD_NEXT_LEVEL, WORLD_GAME_OVER
	}

	public STATE state;

	// Objects, etc...
	public float timePlay = 0f;
	public float timeOver = 0f;
	public int timeRemaining;

	public final Array<Ball> activeBall = new Array<Ball>();
	private final Pool<Ball> ballPool = new Pool<Ball>() {

		@Override
		protected Ball newObject() {
			// TODO Auto-generated method stub
			return new Ball();
		}

	};

	public World() {
		// TODO Auto-generated constructor stub
		// create objects, etc...

		// Ball ball = ballPool.obtain();
		// ball.init(2, 2);
		// activeBall.add(ball);
		// Ball ball2 = ballPool.obtain();
		// ball2.init(200, 200);
		// activeBall.add(ball2);
		// Ball ball3 = ballPool.obtain();
		// ball3.init(100, 400);
		// activeBall.add(ball3);

		this.state = STATE.WORLD_RUNNING;
	}

	public void update(float deltaTime) {
		// Update every object in the world
		refreshWorld(deltaTime);

		// Check condition
		checkLevelEnd();
		checkGameOver();
	}

	private void refreshWorld(float deltaTime) {
		// TODO Auto-generated method stub

		// update objects, ...
		// Ball ball;
		// int len = activeBall.size;
		// for (int i = len; --i >= 0;) {
		// ball = activeBall.get(i);
		// ball.update(deltaTime);
		// if (ball.alive == false) {
		// Vector2 pos = ball.oriPosition;
		// // System.out.println(pos.x + ", " + pos.y);
		// activeBall.removeIndex(i);
		// ballPool.free(ball);
		// Ball newBall = ballPool.obtain();
		// newBall.init(pos.x, pos.y);
		// activeBall.add(newBall);
		// }
		// }
	}

	private void checkLevelEnd() {
		// TODO Auto-generated method stub

		// state = STATE.WORLD_NEXT_LEVEL;
	}

	private void checkGameOver() {
		// TODO Auto-generated method stub

		// state = STATE.WORLD_GAME_OVER;
	}

	public void dispose() {
		// dispose objects in the world
		activeBall.clear();
		ballPool.clear();
	}
}
