package com.phuongnd.game.controller;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Pool;
import com.phuongnd.game.model.BaseUnit;
import com.phuongnd.game.model.Bullet;
import com.phuongnd.game.model.Enemy;
import com.phuongnd.game.model.Level;
import com.phuongnd.game.model.Piece;
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
	public float timeWave;
	public boolean nextWave = false;
	public boolean allWaveDone = false;

	public Level level;
	public int wave;
	public int numberEnemies;
	public int mana;
	public int life;
	public int coin;
	public int star;

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

	public final Array<Bullet> activeBullet = new Array<Bullet>();
	private final Pool<Bullet> bulletPool = new Pool<Bullet>() {

		@Override
		protected Bullet newObject() {
			// TODO Auto-generated method stub
			return new Bullet();
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
		for (int i = 0; i < this.level.getNumbersEnemy().length; i++) {
			for (int j = 0; j < this.level.getNumbersEnemy()[0].length; j++) {
				if (this.level.getNumbersEnemy()[i][j] > 0)
					numberEnemies += this.level.getNumbersEnemy()[i][j];
			}
		}
		if (!this.level.getMap().getPath_2().isEmpty())
			numberEnemies *= 2;
		this.life = this.level.getLife();
		this.coin = this.level.getCoin();
		// this.score = 0;

		/*
		 * if (level < 10) this.levelString = "0" + String.valueOf(level); else
		 * this.levelString = String.valueOf(level);
		 */
	}

	public void createWave(int wave) {
		if (wave < level.getNumWave() - 1) {
			int[] enemy = this.level.getNumbersEnemy()[wave];
			for (int i = 0; i < enemy.length; i++) {
				if (enemy[i] > 0) {
					addNewEnemy(i + 1,
							Ulti.convertPositionWorld(level.getStartPos1()), 4,
							0, 1);
					if (!level.getMap().getPath_2().isEmpty()) {
						addNewEnemy(
								i + 1,
								Ulti.convertPositionWorld(level.getStartPos2()),
								4, 0, 2);
					}
				}
			}
			nextWave = false;
			this.wave++;
		} else {
			int[] enemy = this.level.getNumbersEnemy()[level.getNumWave() - 1];
			for (int i = 0; i < enemy.length; i++) {
				if (enemy[i] > 0) {
					addNewEnemy(i + 1,
							Ulti.convertPositionWorld(level.getStartPos1()), 4,
							0, 1);
					if (!level.getMap().getPath_2().isEmpty()) {
						addNewEnemy(
								i + 1,
								Ulti.convertPositionWorld(level.getStartPos2()),
								4, 0, 2);
					}
				}
			}
			allWaveDone = true;
			this.wave = level.getNumWave();
		}
	}

	public int getTowerCoin(int id) {
		int result = 0;
		switch (id) {
		case 1:
			result = Constant.TOWER_1_COIN;
			break;
		case 2:
			result = Constant.TOWER_2_COIN;
			break;
		case 3:
			result = Constant.TOWER_3_COIN;
			break;
		case 4:
			result = Constant.TOWER_4_COIN;
			break;
		case 5:
			result = Constant.TOWER_5_COIN;
			break;
		case 6:
			result = Constant.TOWER_6_COIN;
			break;
		case 7:
			result = Constant.TOWER_7_COIN;
			break;
		case 8:
			result = Constant.TOWER_8_COIN;
			break;
		case 9:
			result = Constant.TOWER_9_COIN;
			break;
		case 10:
			result = Constant.TOWER_10_COIN;
			break;
		default:
			break;
		}
		return result;
	}

	public void addNewWarrior(int id, Vector2 position, int numAni, int start,
			int path, boolean isSkill) {
		Warrior warrior = warriorPool.obtain();
		warrior.init(id, position, numAni, start, path, isSkill);
		if (path == 1)
			warrior.setPaths(level.getMap().getPath_1());
		else {
			for (int i = 0; i < level.getMap().getPath_1().size(); i++) {
				warrior.getPaths()
						.add(new Piece(level.getMap().getPath_1().get(i)
								.getId(), level.getMap().getPath_1().get(i)
								.getPosition()));
			}
			for (int i = 0; i < level.getMap().getPath_2().size(); i++) {
				warrior.getPaths()
						.add(new Piece(level.getMap().getPath_2().get(i)
								.getId(), level.getMap().getPath_2().get(i)
								.getPosition()));
			}
		}
		activeWarrior.add(warrior);
		warrior = null;
	}

	public void addNewTower(int id, Vector2 position, int numAni) {
		Tower tower = towerPool.obtain();
		tower.init(id, position, numAni);
		activeTower.add(tower);
		tower = null;
	}

	public void addNewEnemy(int id, Vector2 position, int numAni, int start,
			int path) {
		Enemy enemy = enemyPool.obtain();
		enemy.init(id, position, numAni, start, path);
		if (path == 1)
			enemy.setPaths(level.getMap().getPath_1());
		else
			enemy.setPaths(level.getMap().getPath_2());
		activeEnemy.add(enemy);
		enemy = null;
	}

	public void addNewBullet(int id, Vector2 position, int numAni,
			BaseUnit target) {
		Bullet bullet = bulletPool.obtain();
		bullet.init(id, position, numAni, target);
		activeBullet.add(bullet);
		bullet = null;
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

		if (nextWave == false) {
			timeWave += deltaTime;
			if (wave < level.getNumWave()) {
				if (timeWave >= level.getTimeWave()[wave]) {
					if (wave < this.level.getNumWave()) {
						nextWave = true;
					} else
						nextWave = false;
					timeWave = level.getTimeWave()[wave];
				}
			}
		}
		if (allWaveDone)
			nextWave = false;

		// update objects, ...
		int len = activeWarrior.size;
		Warrior warrior;
		for (int i = len - 1; i >= 0; i--) {
			warrior = activeWarrior.get(i);
			warrior.update(this, deltaTime);
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
		for (int i = len - 1; i >= 0; i--) {
			enemy = activeEnemy.get(i);
			enemy.update(this, deltaTime);
			if (enemy.getState() == com.phuongnd.game.model.BaseUnit.STATE.DEAD) {
				if (enemy.getHp() <= 0)
					coin += enemy.getCoin();
				activeEnemy.removeIndex(i);
				enemyPool.free(enemy);
				numberEnemies--;
			}
		}
		enemy = null;

		len = activeBullet.size;
		Bullet bullet;
		for (int i = len - 1; i >= 0; i--) {
			bullet = activeBullet.get(i);
			bullet.update(this, deltaTime);
			if (bullet.getState() == com.phuongnd.game.model.BaseUnit.STATE.DEAD) {
				activeBullet.removeIndex(i);
				bulletPool.free(bullet);
			} else {
				bullet.setState(com.phuongnd.game.model.BaseUnit.STATE.ACTIVE);
			}
		}
		bullet = null;

	}

	private void checkLevelEnd() {
		// TODO Auto-generated method stub
		if (numberEnemies <= 0)
			state = STATE.WORLD_NEXT_LEVEL;
	}

	private void checkGameOver() {
		// TODO Auto-generated method stub
		if (life <= 0) {
			state = STATE.WORLD_GAME_OVER;
		}
	}

	public void dispose() {
		// dispose objects in the world
		activeWarrior.clear();
		warriorPool.clear();

		activeTower.clear();
		towerPool.clear();

		activeEnemy.clear();
		enemyPool.clear();

		activeBullet.clear();
		bulletPool.clear();
	}
}
