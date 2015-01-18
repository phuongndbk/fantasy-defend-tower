package com.phuongnd.game.view;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.FantasyTowerDefend;
import com.phuongnd.game.controller.Animation;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.MyInputProcessor;
import com.phuongnd.game.controller.Setting;
import com.phuongnd.game.controller.Ulti;
import com.phuongnd.game.controller.World;
import com.phuongnd.game.model.BaseUnit.MOVE_STATE;
import com.phuongnd.game.model.Enemy;
import com.phuongnd.game.model.Map;
import com.phuongnd.game.model.Tower;
import com.phuongnd.game.model.Warrior;

public class PlayScreen extends BaseScreen {

	ShapeRenderer shapeRenderer = new ShapeRenderer();

	// Game state
	public enum STATE {
		GAME_READY, GAME_RUNNING, GAME_PAUSE, GAME_LEVEL_END, GAME_OVER
	}

	private STATE state;

	// Button, etc...
	private int towerPos;
	private Image[] towerButton;
	private Image[] towerBuild;
	private Vector2 pos;
	private boolean DEBUG = false;
	private boolean radar = false;

	// World
	public World world = null;

	public PlayScreen(FantasyTowerDefend game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show() {
		super.show();

		// Play Music and Sound
		if (Setting.soundEnabled) {
			// Play music and sound
			Assets.shared().backgroundPlayMusic.play();
		} else {
			// Pause music and sound
			Assets.shared().backgroundPlayMusic.pause();
		}

		// Constructor for button, etc...
		pos = new Vector2();

		// Event

		// State
		state = STATE.GAME_READY;

		// World
		// if (world == null)
		world = new World(Setting.saveDatas[Setting.slotSelected].getLevel());

		towerButton = new Image[world.level.getMap().getTowers().size()];
		for (int i = 0; i < world.level.getMap().getTowers().size(); i++) {
			towerButton[i] = new Image(Assets.shared().backgroundMenu);
			towerButton[i].setSize(Constant.MAP_UNIT_SIZE_WIDTH,
					Constant.MAP_UNIT_SIZE_HEIGHT);
			towerButton[i].setColor(Color.BLUE);
			pos = Ulti.convertPositionWorld(world.level.getMap().getTowers()
					.get(i));
			towerButton[i].setPosition(pos.x, pos.y);
			stage.addActor(towerButton[i]);

			towerButton[i].addListener(new ClickListener() {
				@Override
				public void touchUp(InputEvent event, float x, float y,
						int pointer, int button) {
					// TODO Auto-generated method stub
					int x0 = (int) event.getStageX()
							/ Constant.MAP_UNIT_SIZE_WIDTH;
					int y0 = (int) ((Constant.HEIGHT - event.getStageY()) / Constant.MAP_UNIT_SIZE_HEIGHT);
					pos = Ulti.convertPositionWorld(y0, x0);

					towerBuild[0].setPosition(pos.x
							- Constant.MAP_UNIT_SIZE_WIDTH, pos.y
							+ Constant.MAP_UNIT_SIZE_HEIGHT);
					towerBuild[0].setVisible(true);

					towerBuild[1].setPosition(pos.x
							+ Constant.MAP_UNIT_SIZE_WIDTH, pos.y
							+ Constant.MAP_UNIT_SIZE_HEIGHT);
					towerBuild[1].setVisible(true);

					towerBuild[2].setPosition(pos.x
							- Constant.MAP_UNIT_SIZE_WIDTH, pos.y
							- Constant.MAP_UNIT_SIZE_HEIGHT);
					towerBuild[2].setVisible(true);

					towerBuild[3].setPosition(pos.x
							+ Constant.MAP_UNIT_SIZE_WIDTH, pos.y
							- Constant.MAP_UNIT_SIZE_HEIGHT);
					towerBuild[3].setVisible(true);

					super.touchUp(event, x, y, pointer, button);
				}

				@Override
				public boolean touchDown(InputEvent event, float x, float y,
						int pointer, int button) {
					// TODO Auto-generated method stub
					return super.touchDown(event, x, y, pointer, button);
				}
			});
		}

		towerBuild = new Image[4];
		for (int i = 0; i < 4; i++) {
			towerBuild[i] = new Image(Assets.shared().backgroundMenu);
			towerBuild[i].setSize(Constant.MAP_UNIT_SIZE_WIDTH,
					Constant.MAP_UNIT_SIZE_HEIGHT);
			towerBuild[i].setPosition(0, 0);
			towerBuild[i].setVisible(false);
			stage.addActor(towerBuild[i]);

			towerBuild[i].addListener(new ClickListener() {
				@Override
				public void touchUp(InputEvent event, float x, float y,
						int pointer, int button) {
					// TODO Auto-generated method stub

					boolean search = false;
					for (int j = 0; j < world.activeTower.size; j++) {
						if (world.activeTower.get(j).getPosition().x == pos.x
								&& world.activeTower.get(j).getPosition().y == pos.y) {
							search = true;
							break;
						}
					}
					System.out.println(search);
					if (search == false) {
						world.addNewTower(1, pos, 4);
						for (int j = 0; j < world.activeTower.size; j++) {
							if (world.activeTower.get(j).getPosition().x == pos.x
									&& world.activeTower.get(j).getPosition().y == pos.y) {
								radar = true;
								towerPos = j;
								break;
							}
						}
					}
					super.touchUp(event, x, y, pointer, button);
				}

				@Override
				public boolean touchDown(InputEvent event, float x, float y,
						int pointer, int button) {
					// TODO Auto-generated method stub
					return super.touchDown(event, x, y, pointer, button);
				}
			});
		}

		InputMultiplexer input = new InputMultiplexer();
		input.addProcessor(stage);
		input.addProcessor(new MyInputProcessor() {
			@Override
			public boolean keyDown(int keycode) {
				// TODO Auto-generated method stub
				switch (keycode) {
				case Keys.A:
					// Move left
					break;
				case Keys.S:
					// Move Down
					break;
				case Keys.D:
					// Move right
					break;
				case Keys.W:
					// Move up
					break;
				case Keys.SPACE:
					// Debug mode
					if (DEBUG)
						DEBUG = false;
					else
						DEBUG = true;
					break;
				case Keys.P:
					if (state == STATE.GAME_RUNNING)
						state = STATE.GAME_PAUSE;
					else
						state = STATE.GAME_RUNNING;
				default:
					break;
				}
				return true;
			}
		});
		Gdx.input.setInputProcessor(input);

	}

	@Override
	public void render(float delta) {
		super.render(delta);
		update(delta);
		draw(delta);
	}

	private void update(float deltaTime) {
		if (deltaTime > 0.1f)
			deltaTime = 0.1f;
		switch (state) {
		case GAME_READY:
			updateReady(deltaTime);
			break;

		case GAME_RUNNING:
			updateRunning(deltaTime);
			break;

		case GAME_PAUSE:
			updatePause(deltaTime);
			break;

		case GAME_LEVEL_END:
			updateLevelEnd(deltaTime);
			break;

		case GAME_OVER:
			updateGameOver(deltaTime);
			break;

		default:
			break;
		}
	}

	// Game Ready
	private void updateReady(float deltaTime) {
		// TODO Auto-generated method stub
		if (Gdx.input.justTouched())
			state = STATE.GAME_RUNNING;
	}

	// Game Running
	private void updateRunning(float deltaTime) {
		// TODO Auto-generated method stub
		// Update time play
		world.timePlay += deltaTime;

		System.gc();
		ApplicationType apptype = Gdx.app.getType();
		if (apptype == ApplicationType.Android
				|| apptype == ApplicationType.Desktop)
			world.update(deltaTime);

		// Update Money, etc...
		if (Gdx.input.justTouched()) {
			int x0 = (int) Gdx.input.getX() / Constant.MAP_UNIT_SIZE_WIDTH;
			int y0 = (int) (Gdx.input.getY() / Constant.MAP_UNIT_SIZE_HEIGHT);
			Vector2 temp = Ulti.convertPositionWorld(y0, x0);
			if ((temp.x >= towerBuild[2].getX())
					&& (temp.x <= towerBuild[3].getX())
					&& (temp.y >= towerBuild[2].getY())
					&& (temp.y <= towerBuild[0].getY())) {

			} else {
				towerBuild[0].setVisible(false);
				towerBuild[1].setVisible(false);
				towerBuild[2].setVisible(false);
				towerBuild[3].setVisible(false);
				radar = false;
			}

			// Click Tower
			for (int i = 0; i < towerButton.length; i++) {
				if ((temp.x >= towerButton[i].getX())
						&& (temp.x <= towerButton[i].getX()
								+ Constant.MAP_UNIT_SIZE_WIDTH)
						&& (temp.y >= towerButton[i].getY())
						&& (temp.y <= towerButton[i].getY()
								+ Constant.MAP_UNIT_SIZE_HEIGHT)) {

					for (int j = 0; j < world.activeTower.size; j++) {
						if (world.activeTower.get(j).getPosition().x == towerButton[i]
								.getX()
								&& world.activeTower.get(j).getPosition().y == towerButton[i]
										.getY()) {
							radar = true;
							towerPos = j;
							break;
						}
					}
				}
			}
		}

		// If Level End
		if (world.state == World.STATE.WORLD_NEXT_LEVEL) {
			state = STATE.GAME_LEVEL_END;

			// Next Level

			System.gc();
			world.dispose();
		}

		// If Game Over
		if (world.state == World.STATE.WORLD_GAME_OVER) {
			state = STATE.GAME_OVER;

			// End Game

			System.gc();
			world.dispose();
		}

	}

	// Game Pause
	private void updatePause(float deltaTime) {
		// TODO Auto-generated method stub

	}

	// Game Level End
	private void updateLevelEnd(float deltaTime) {
		// TODO Auto-generated method stub

		// Win, next level

	}

	// Game Over
	private void updateGameOver(float deltaTime) {
		// TODO Auto-generated method stub

		System.gc();
		// Game over
		if (Gdx.input.justTouched())
			FantasyTowerDefend.getManagerScreen().createScreen(
					ManagerScreen.SCREEN_MENU);
	}

	// Draw Objects
	private void draw(float deltaTime) {
		// TODO Auto-generated method stub
		// Debug mode
		if (DEBUG) {
			// Map
			shapeRenderer.setProjectionMatrix(camera.combined);
			shapeRenderer.setColor(Color.GREEN); // line's color

			shapeRenderer.begin(ShapeType.Line); // shape type
			for (int i = 0; i <= Constant.MAP_COLS; i++) {
				shapeRenderer.line(i * Constant.MAP_UNIT_SIZE_WIDTH, 0, i
						* Constant.MAP_UNIT_SIZE_WIDTH, Constant.HEIGHT);
			}
			for (int i = 0; i <= Constant.MAP_ROWS; i++) {
				shapeRenderer.line(0, i * Constant.MAP_UNIT_SIZE_HEIGHT,
						Constant.WIDTH, i * Constant.MAP_UNIT_SIZE_HEIGHT);
			}
			shapeRenderer.end();

			Map map = world.level.getMap();
			for (int i = 0; i < map.getPaths().size(); i++) {
				shapeRenderer.begin(ShapeType.Filled); // shape type
				shapeRenderer.rect(map.getPaths().get(i).y
						* Constant.MAP_UNIT_SIZE_WIDTH
						+ Constant.MAP_UNIT_SIZE_WIDTH / 8, (Constant.MAP_ROWS
						- map.getPaths().get(i).x - 1)
						* Constant.MAP_UNIT_SIZE_HEIGHT
						+ Constant.MAP_UNIT_SIZE_HEIGHT / 8,
						Constant.MAP_UNIT_SIZE_WIDTH * 3 / 4,
						Constant.MAP_UNIT_SIZE_HEIGHT * 3 / 4);
				shapeRenderer.end();
			}
			for (int i = 0; i < map.getTowers().size(); i++) {
				shapeRenderer.begin(ShapeType.Line); // shape type
				shapeRenderer.circle(map.getTowers().get(i).y
						* Constant.MAP_UNIT_SIZE_WIDTH
						+ Constant.MAP_UNIT_SIZE_WIDTH / 2, (Constant.MAP_ROWS
						- map.getTowers().get(i).x - 1)
						* Constant.MAP_UNIT_SIZE_HEIGHT
						+ Constant.MAP_UNIT_SIZE_HEIGHT / 2,
						Constant.MAP_UNIT_SIZE_WIDTH / 3);
				shapeRenderer.end();
			}

			// Radar for objects
			for (int i = 0; i < world.activeEnemy.size; i++) {
				drawRadar(world.activeEnemy.get(i).getPosition().x
						+ world.activeEnemy.get(i).getWidth2() / 2,
						world.activeEnemy.get(i).getPosition().y
								+ world.activeEnemy.get(i).getHeight2() / 2,
						world.activeEnemy.get(i).getRange()
								* Constant.MAP_UNIT_SIZE_WIDTH, Color.GREEN);
			}

			for (int i = 0; i < world.activeWarrior.size; i++) {
				drawRadar(world.activeWarrior.get(i).getPosition().x
						+ world.activeWarrior.get(i).getWidth2() / 2,
						world.activeWarrior.get(i).getPosition().y
								+ world.activeWarrior.get(i).getHeight2() / 2,
						world.activeWarrior.get(i).getRange()
								* Constant.MAP_UNIT_SIZE_WIDTH, Color.GREEN);
			}
			batch.setProjectionMatrix(camera.combined);
		}

		// Radar of tower
		if (radar) {
			shapeRenderer.setProjectionMatrix(camera.combined);
			drawRadar(world.activeTower.get(towerPos).getPosition().x
					+ world.activeTower.get(towerPos).getWidth2() / 2,
					world.activeTower.get(towerPos).getPosition().y
							+ world.activeTower.get(towerPos).getHeight2() / 2,
					world.activeTower.get(towerPos).getRange()
							* Constant.MAP_UNIT_SIZE_WIDTH, Color.GREEN);
			batch.setProjectionMatrix(camera.combined);
		}

		// HP of objects
		shapeRenderer.setProjectionMatrix(camera.combined);
		shapeRenderer.setColor(Color.GREEN); // line's color
		shapeRenderer.begin(ShapeType.Filled); // shape type
		for (Warrior warrior : world.activeWarrior) {
			shapeRenderer
					.rect(warrior.getPosition().x,
							warrior.getPosition().y
									+ warrior.getAnimation()[0].keyFrames[0]
											.getRegionHeight(),
							(float) ((1.0 * warrior.getHp() / warrior
									.getTotalHp()) * warrior.getAnimation()[0].keyFrames[0]
									.getRegionWidth()),
							Constant.MAP_UNIT_SIZE_HEIGHT / 10);
		}
		for (Enemy enemy : world.activeEnemy) {
			shapeRenderer.rect(enemy.getPosition().x, enemy.getPosition().y
					+ enemy.getAnimation()[0].keyFrames[0].getRegionHeight(),
					(float) ((1.0 * enemy.getHp() / enemy.getTotalHp()) * enemy
							.getAnimation()[0].keyFrames[0].getRegionWidth()),
					Constant.MAP_UNIT_SIZE_HEIGHT / 10);
		}
		shapeRenderer.end();
		batch.setProjectionMatrix(camera.combined);

		// etc...
		batch.begin();
		for (Warrior warrior : world.activeWarrior) {
			if (warrior.getMove_state() == MOVE_STATE.UP) {
				batch.draw(warrior.getAnimation()[0].getKeyFrame(
						world.timePlay, Animation.ANIMATION_LOOPING), warrior
						.getPosition().x, warrior.getPosition().y);
			} else if (warrior.getMove_state() == MOVE_STATE.DOWN) {
				batch.draw(warrior.getAnimation()[1].getKeyFrame(
						world.timePlay, Animation.ANIMATION_LOOPING), warrior
						.getPosition().x, warrior.getPosition().y);
			} else if (warrior.getMove_state() == MOVE_STATE.LEFT) {
				batch.draw(warrior.getAnimation()[2].getKeyFrame(
						world.timePlay, Animation.ANIMATION_LOOPING), warrior
						.getPosition().x, warrior.getPosition().y);
			} else if (warrior.getMove_state() == MOVE_STATE.RIGHT) {
				batch.draw(warrior.getAnimation()[3].getKeyFrame(
						world.timePlay, Animation.ANIMATION_LOOPING), warrior
						.getPosition().x, warrior.getPosition().y);
			}
		}

		for (Tower tower : world.activeTower) {
			batch.draw(tower.getAnimation()[0].getKeyFrame(world.timePlay,
					Animation.ANIMATION_LOOPING), tower.getPosition().x, tower
					.getPosition().y);
		}

		for (Enemy enemy : world.activeEnemy) {
			if (enemy.getMove_state() == MOVE_STATE.UP) {
				batch.draw(enemy.getAnimation()[0].getKeyFrame(world.timePlay,
						Animation.ANIMATION_LOOPING), enemy.getPosition().x,
						enemy.getPosition().y);
			} else if (enemy.getMove_state() == MOVE_STATE.DOWN) {
				batch.draw(enemy.getAnimation()[1].getKeyFrame(world.timePlay,
						Animation.ANIMATION_LOOPING), enemy.getPosition().x,
						enemy.getPosition().y);
			} else if (enemy.getMove_state() == MOVE_STATE.LEFT) {
				batch.draw(enemy.getAnimation()[2].getKeyFrame(world.timePlay,
						Animation.ANIMATION_LOOPING), enemy.getPosition().x,
						enemy.getPosition().y);
			} else if (enemy.getMove_state() == MOVE_STATE.RIGHT) {
				batch.draw(enemy.getAnimation()[3].getKeyFrame(world.timePlay,
						Animation.ANIMATION_LOOPING), enemy.getPosition().x,
						enemy.getPosition().y);
			} else if (enemy.getMove_state() == MOVE_STATE.UP_LEFT) {
				batch.draw(enemy.getAnimation()[2].getKeyFrame(world.timePlay,
						Animation.ANIMATION_LOOPING), enemy.getPosition().x,
						enemy.getPosition().y);
			} else if (enemy.getMove_state() == MOVE_STATE.UP_RIGHT) {
				batch.draw(enemy.getAnimation()[3].getKeyFrame(world.timePlay,
						Animation.ANIMATION_LOOPING), enemy.getPosition().x,
						enemy.getPosition().y);
			} else if (enemy.getMove_state() == MOVE_STATE.DOWN_LEFT) {
				batch.draw(enemy.getAnimation()[2].getKeyFrame(world.timePlay,
						Animation.ANIMATION_LOOPING), enemy.getPosition().x,
						enemy.getPosition().y);
			} else if (enemy.getMove_state() == MOVE_STATE.DOWN_RIGHT) {
				batch.draw(enemy.getAnimation()[3].getKeyFrame(world.timePlay,
						Animation.ANIMATION_LOOPING), enemy.getPosition().x,
						enemy.getPosition().y);
			}
		}

		switch (state) {
		case GAME_READY:
			presentReady();
			break;
		case GAME_RUNNING:
			presentRunning();
			break;
		case GAME_PAUSE:
			presentPaused();
			break;
		case GAME_LEVEL_END:
			presentLevelEnd();
			break;
		case GAME_OVER:
			presentGameOver();
			break;
		default:
			break;
		}
		batch.end();
	}

	// Draw Radar
	private void drawRadar(float x, float y, float radius, Color color) {
		shapeRenderer.begin(ShapeType.Line); // shape type
		shapeRenderer.setColor(color);
		shapeRenderer.circle(x, y, radius);
		shapeRenderer.end();
	}

	// Draw Game Ready
	private void presentReady() {
		// TODO Auto-generated method stub
		Assets.shared().font.draw(batch, "READY", 800 / 2 - 40, 480 / 2 + 25);
	}

	// Draw Game Running
	private void presentRunning() {
		// TODO Auto-generated method stub
		// Assets.font.draw(batch, "RUNNING", 800 / 2 - 40, 480 / 2 + 25);
		// Used memory
		long freeMemory = Runtime.getRuntime().maxMemory()
				- Runtime.getRuntime().freeMemory();
		Assets.shared().font.draw(batch, String.valueOf(freeMemory),
				800 / 2 - 50, 0 / 2 + 25);
	}

	// Draw Game Pause
	private void presentPaused() {
		// TODO Auto-generated method stub
		Assets.shared().font.draw(batch, "PAUSE", 800 / 2 - 40, 480 / 2 + 25);
	}

	// Draw Game Level End
	private void presentLevelEnd() {
		// TODO Auto-generated method stub
		Assets.shared().font.draw(batch, "LEVEL COMPLETED...", 800 / 2 - 100,
				480 / 2 + 25);
	}

	// Draw Game Over
	private void presentGameOver() {
		// TODO Auto-generated method stub
		Assets.shared().font.draw(batch, "GAME OVER", 800 / 2 - 70,
				480 / 2 + 25);
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		super.hide();
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		super.pause();
		if (state == STATE.GAME_RUNNING)
			state = STATE.GAME_PAUSE;
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		super.resume();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
		world.dispose();
	}

}
