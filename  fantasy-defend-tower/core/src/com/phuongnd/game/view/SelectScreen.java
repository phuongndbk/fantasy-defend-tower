package com.phuongnd.game.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.FantasyTowerDefend;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Setting;

public class SelectScreen extends BaseScreen {

	public SelectScreen(FantasyTowerDefend game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	// Background and button, etc...
	private Image imgBack;

	private Image slot1;
	private Image slot2;
	private Image slot3;

	private Image start;
	private Image delete;
	private Image shop;

	private int selected = 0;

	@Override
	public void render(float delta) {
		super.render(delta);
		update(delta);
		draw(delta);
	}

	private void update(float delta) {
		// TODO Auto-generated method stub
		if (selected > 0) {
			start.setVisible(true);
			delete.setVisible(true);
			shop.setVisible(true);
		}
		if (selected == 1) {
			start.setPosition(slot1.getX(), slot1.getY());
			delete.setPosition(slot1.getX() + 60, slot1.getY());
			shop.setPosition(slot1.getX() + 120, slot1.getY());
		} else if (selected == 2) {
			start.setPosition(slot2.getX(), slot2.getY());
			delete.setPosition(slot2.getX() + 60, slot2.getY());
			shop.setPosition(slot2.getX() + 120, slot2.getY());
		} else if (selected == 3) {
			start.setPosition(slot3.getX(), slot3.getY());
			delete.setPosition(slot3.getX() + 60, slot3.getY());
			shop.setPosition(slot3.getX() + 120, slot3.getY());
		}
	}

	private void draw(float delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void show() {
		super.show();

		// Constructor
		imgBack = new Image(Assets.shared().backgroundMenu);
		stage.addActor(imgBack);

		if (Setting.soundEnabled) {
			// Play music and sound
			Assets.shared().backgroundPlayMusic.play();
		} else {
			// Pause music and sound
			Assets.shared().backgroundPlayMusic.pause();
		}

		slot1 = new Image(Assets.shared().backgroundMenu);
		slot1.setSize(100, 200);
		slot1.setPosition(100, 100);
		slot1.setColor(Color.GREEN);
		stage.addActor(slot1);

		slot2 = new Image(Assets.shared().backgroundMenu);
		slot2.setSize(100, 200);
		slot2.setPosition(350, 100);
		slot2.setColor(Color.GREEN);
		stage.addActor(slot2);

		slot3 = new Image(Assets.shared().backgroundMenu);
		slot3.setSize(100, 200);
		slot3.setPosition(600, 100);
		slot3.setColor(Color.GREEN);
		stage.addActor(slot3);

		start = new Image(Assets.shared().backgroundMenu);
		start.setSize(50, 50);
		start.setPosition(0, 0);
		start.setColor(Color.BLUE);
		start.setVisible(false);
		stage.addActor(start);

		delete = new Image(Assets.shared().backgroundMenu);
		delete.setSize(50, 50);
		delete.setPosition(0, 0);
		delete.setColor(Color.RED);
		delete.setVisible(false);
		stage.addActor(delete);

		shop = new Image(Assets.shared().backgroundMenu);
		shop.setSize(50, 50);
		shop.setPosition(0, 0);
		shop.setColor(Color.YELLOW);
		shop.setVisible(false);
		stage.addActor(shop);

		// Button Event...
		slot1.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				selected = 1;
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		slot2.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				selected = 2;
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		slot3.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				selected = 3;
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		start.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				loadData();
				FantasyTowerDefend.getManagerScreen().createScreen(
						ManagerScreen.SCREEN_PLAY);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		delete.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				deleteData(selected - 1);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		shop.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
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

	public void loadData() {
		Setting.slotSelected = selected - 1;
		if (selected == 1) {
			if (!Setting.slot1DataSaved) {
				Setting.saveDatas[0].restart();
				Setting.saveDatas[0].save();
				Setting.slot1DataSaved = true;
			} else {
				Setting.saveDatas[0].load();
				// if (Setting.saveDatas[0].getLevel() == 1) {
				// Setting.saveDatas[0].restart();
				// }
			}
		} else if (selected == 2) {
			if (!Setting.slot2DataSaved) {
				Setting.saveDatas[1].restart();
				Setting.saveDatas[1].save();
				Setting.slot1DataSaved = true;
			} else {
				Setting.saveDatas[1].load();
				// if (Setting.saveDatas[0].getLevel() == 1) {
				// Setting.saveDatas[0].restart();
				// }
			}
		} else {
			if (!Setting.slot2DataSaved) {
				Setting.saveDatas[2].restart();
				Setting.saveDatas[2].save();
				Setting.slot2DataSaved = true;
			} else {
				Setting.saveDatas[2].load();
				// if (Setting.saveDatas[0].getLevel() == 1) {
				// Setting.saveDatas[0].restart();
				// }
			}
		}

	}

	public void deleteData(int slot) {
		Setting.saveDatas[slot].restart();
		Setting.saveDatas[slot].save();
		if (slot == 0) {
			Setting.slot1DataSaved = false;
		} else if (slot == 1) {
			Setting.slot2DataSaved = false;
		} else {
			Setting.slot3DataSaved = false;
		}
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
	}

}
