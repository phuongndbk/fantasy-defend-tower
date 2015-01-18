package com.phuongnd.game.controller;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Pool;
import com.phuongnd.game.model.BaseUnit.MOVE_STATE;
import com.phuongnd.game.model.Enemy;
import com.phuongnd.game.model.Level;
import com.phuongnd.game.model.Tower;
import com.phuongnd.game.model.Warrior;

public class World {

	// World state
	public static enum STATE {
		WORLD_RUNNING, WORLD_NEXT_LEVEL, WORLD_GAME_OVER
	}

	public STATE state;

	// Objects, etc...
	public float timePlay = 0f;
	public float timeOver = 0f;
	public float timeRemaining;

	public Level level;

	public final Array<Warrior> activeWarrior = new Array<Warrior>();
	private final Pool<Warrior> warriorPool = new Pool<Warrior>() {

		@Override
		protected Warrior newObject() {
			// TODO Auto-generated method stub
			return new Warrior();
		}

	};

	public final Array<Tower> activeTower = new Array<Tower>();
	private final Pool<Tower> towerPool = new Pool<Tower>() {

		@Override
		protected Tower newObject() {
			// TODO Auto-generated method stub
			return new Tower();
		}

	};

	public final Array<Enemy> activeEnemy = new Array<Enemy>();
	private final Pool<Enemy> enemyPool = new Pool<Enemy>() {

		@Override
		protected Enemy newObject() {
			// TODO Auto-generated method stub
			return new Enemy();
		}

	};

	public World(int level) {
		// TODO Auto-generated constructor stub
		// create objects, etc...
		generateLevel(level);

		this.state = STATE.WORLD_RUNNING;
	}

	// Sinh 1 level
	private void generateLevel(int level) {
		// TODO Auto-generated method stub
		this.level = new Level(level);
		// this.score = 0;

		for (int i = 0; i < 4; i++) {
			addNewEnemy(
					1,
					Ulti.convertPositionWorld(this.level.getMap().getPaths()
							.get(i)), 4, i);
		}

		/*
		 * if (level < 10) this.levelString = "0" + String.valueOf(level); else
		 * this.levelString = String.valueOf(level);
		 */
	}

	public void addNewWarrior(int id, Vector2 position, int numAni) {
		Warrior warrior = warriorPool.obtain();
		warrior.init(id, position, numAni);
		warrior.setMove_state(MOVE_STATE.LEFT);
		activeWarrior.add(warrior);
		warrior = null;
	}

	public void addNewTower(int id, Vector2 position, int numAni) {
		Tower tower = towerPool.obtain();
		tower.init(id, position, numAni);
		activeTower.add(tower);
		tower = null;
	}

	public void addNewEnemy(int id, Vector2 position, int numAni, int start) {
		Enemy enemy = enemyPool.obtain();
		enemy.init(id, position, numAni, start);
		enemy.setPaths(level.getMap().getPaths());
		activeEnemy.add(enemy);
		enemy = null;
	}

	public String checkOverlapRadar(Vector2 pos1, Vector2 pos2, float radius1,
			float radius2) {
		String result = "";
		float dx = pos2.x - pos1.x;
		float dy = pos2.y - pos1.y;
		float distance = (float) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		if (distance < Math.min(radius1, radius2)) {
			result = "all inside";
			return result;
		} else {
			if (distance > (radius1 + radius2))
				result = "not overlap";
			else if (distance <= Math.abs(radius1 - radius2))
				result = "inside";
			else {
				if (distance < Math.max(radius1, radius2)) {
					result = "inside";
				} else
					result = "overlap";
			}
			if (result.equals("inside")) {
				if (radius1 < radius2) {
					result = "1 inside";
				} else {
					result = "2 inside";
				}
			}
			return result;
		}
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

		// System.out.println("Warriors: " + activeWarrior.size + " - Enemies: "
		// + activeEnemy.size + " - Warriors Pool: "
		// + warriorPool.getFree() + " - Enemies: " + enemyPool.getFree());

		// for (int i = 0; i < activeEnemy.size; i++) {
		// activeEnemy.get(i).printEnemy();
		// }
		// System.out.println("----------------------------------------------");

		// update objects, ...
		int len = activeWarrior.size;
		Warrior warrior;
		for (int i = len - 1; i >= 0; i--) {
			warrior = activeWarrior.get(i);
			warrior.update(deltaTime);
			if (warrior.getState() == com.phuongnd.game.model.BaseUnit.STATE.DEAD) {
				activeWarrior.removeIndex(i);
				warriorPool.free(warrior);
			} else {
				warrior.setState(com.phuongnd.game.model.BaseUnit.STATE.ACTIVE);
			}
		}
		warrior = null;

		len = activeTower.size;
		Tower tower;
		for (int i = len - 1; i >= 0; i--) {
			tower = activeTower.get(i);
			tower.update(deltaTime);
			if (tower.getState() == com.phuongnd.game.model.BaseUnit.STATE.DEAD) {
				activeTower.removeIndex(i);
				towerPool.free(tower);
			} else {
				tower.setState(com.phuongnd.game.model.BaseUnit.STATE.ACTIVE);
			}
		}
		warrior = null;

		len = activeEnemy.size;
		Enemy enemy;
		boolean kq = false;
		for (int i = len - 1; i >= 0; i--) {
			enemy = activeEnemy.get(i);
			enemy.update(deltaTime);
			kq = enemy.checkCollision(this, deltaTime);
			if (enemy.getState() == com.phuongnd.game.model.BaseUnit.STATE.DEAD) {
				activeEnemy.removeIndex(i);
				enemyPool.free(enemy);
			}
			if (kq == false)
				enemy.setState(com.phuongnd.game.model.BaseUnit.STATE.ACTIVE);
			// break;
		}
		enemy = null;

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
		activeWarrior.clear();
		warriorPool.clear();

		activeTower.clear();
		towerPool.clear();

		activeEnemy.clear();
		enemyPool.clear();
	}
}
