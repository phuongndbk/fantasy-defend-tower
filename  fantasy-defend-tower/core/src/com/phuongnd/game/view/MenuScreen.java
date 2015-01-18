package com.phuongnd.game.view;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.FantasyTowerDefend;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Setting;

public class MenuScreen extends BaseScreen {

	public MenuScreen(FantasyTowerDefend game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	// Background and button, etc...
	private Image imgBack;

	@Override
	public void render(float delta) {
		super.render(delta);
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

		// Button Event...
		imgBack.addListener(new ClickListener() {
			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				FantasyTowerDefend.getManagerScreen().createScreen(
						ManagerScreen.SCREEN_SELECT_SLOT);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

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
