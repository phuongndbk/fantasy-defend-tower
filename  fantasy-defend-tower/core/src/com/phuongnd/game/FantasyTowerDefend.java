package com.phuongnd.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Setting;
import com.phuongnd.game.view.ManagerScreen;

public class FantasyTowerDefend extends Game {

	private static ManagerScreen manager;

	public FantasyTowerDefend() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void create() {
		manager = new ManagerScreen(this);
		if (!Assets.isload)
			Assets.load();
		Setting.load();
		FantasyTowerDefend.getManagerScreen().createScreen(
				ManagerScreen.SCREEN_MENU);
		Gdx.input.setCatchBackKey(true);
	}

	@Override
	public void dispose() {
		super.dispose();
	}

	@Override
	public void pause() {
		super.pause();
	}

	@Override
	public void resume() {
		super.resume();
	}

	@Override
	public void render() {
		if (manager.getScreen() != null)
			manager.getScreen().render(Gdx.graphics.getDeltaTime());
	}

	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
	}

	@Override
	public void setScreen(Screen screen) {
		super.setScreen(screen);
	}

	@Override
	public Screen getScreen() {
		return super.getScreen();
	}

	public static ManagerScreen getManagerScreen() {
		return manager;
	}

}
