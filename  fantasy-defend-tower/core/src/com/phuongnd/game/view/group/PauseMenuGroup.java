package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.FantasyTowerDefend;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.view.ManagerScreen;
import com.phuongnd.game.view.PlayScreen;
import com.phuongnd.game.view.PlayScreen.STATE;

public class PauseMenuGroup extends BaseGroup {

	public Image bkg;
	public Image resumeButton;
	public Image restartButton;
	public Image exitButton;
	public Image resumeButton_press;
	public Image restartButton_press;
	public Image exitButton_press;

	public PauseMenuGroup(PlayScreen screen) {
		super(screen);
		// TODO Auto-generated constructor stub
		initGroup();
	}

	@Override
	public void initGroup() {
		// TODO Auto-generated method stub
		setWidth(Constant.WIDTH / 2);
		setHeight(Constant.HEIGHT / 2);
		setPosition(Constant.WIDTH / 4, Constant.HEIGHT / 4);

		bkg = new Image(Assets.shared().backgroundLevel);
		bkg.setSize(getWidth(), getHeight());
		bkg.setPosition(0, 0);
		addActor(bkg);

		resumeButton = new Image(Assets.shared().button_play);
		resumeButton.setPosition(Constant.MAP_UNIT_SIZE_WIDTH / 2 + 10,
				Constant.MAP_UNIT_SIZE_HEIGHT * 1.5f);
		resumeButton.setColor(Color.GREEN);
		addActor(resumeButton);

		resumeButton_press = new Image(Assets.shared().button_play_click);
		resumeButton_press.setPosition(Constant.MAP_UNIT_SIZE_WIDTH / 2 + 10,
				Constant.MAP_UNIT_SIZE_HEIGHT * 1.5f);
		resumeButton_press.setColor(Color.GREEN);
		resumeButton_press.setVisible(false);
		addActor(resumeButton_press);

		restartButton = new Image(Assets.shared().button_restart);
		restartButton.setPosition(resumeButton.getX() + resumeButton.getWidth()
				+ 12, Constant.MAP_UNIT_SIZE_HEIGHT * 1.5f);
		restartButton.setColor(Color.ORANGE);
		addActor(restartButton);

		restartButton_press = new Image(Assets.shared().button_restart_click);
		restartButton_press.setPosition(
				resumeButton.getX() + resumeButton.getWidth() + 12,
				Constant.MAP_UNIT_SIZE_HEIGHT * 1.5f);
		restartButton_press.setColor(Color.ORANGE);
		restartButton_press.setVisible(false);
		addActor(restartButton_press);

		exitButton = new Image(Assets.shared().button_exit);
		exitButton.setPosition(restartButton.getX() + restartButton.getWidth()
				+ 12, Constant.MAP_UNIT_SIZE_HEIGHT * 1.5f);
		exitButton.setColor(Color.RED);
		addActor(exitButton);

		exitButton_press = new Image(Assets.shared().button_exit_click);
		exitButton_press.setPosition(
				restartButton.getX() + restartButton.getWidth() + 12,
				Constant.MAP_UNIT_SIZE_HEIGHT * 1.5f);
		exitButton_press.setColor(Color.RED);
		exitButton_press.setVisible(false);
		addActor(exitButton_press);

		resumeButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				resumeButton.setVisible(true);
				resumeButton_press.setVisible(false);
				screen.state = STATE.GAME_RUNNING;
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				resumeButton.setVisible(false);
				resumeButton_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		restartButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				restartButton.setVisible(true);
				restartButton_press.setVisible(false);
				FantasyTowerDefend.getManagerScreen().createScreen(
						ManagerScreen.SCREEN_PLAY);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				restartButton.setVisible(false);
				restartButton_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		exitButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				exitButton.setVisible(true);
				exitButton_press.setVisible(false);
				FantasyTowerDefend.getManagerScreen().createScreen(
						ManagerScreen.SCREEN_MENU);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				exitButton.setVisible(false);
				exitButton_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}
}
