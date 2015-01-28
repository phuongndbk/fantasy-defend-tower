package com.phuongnd.game.view.group;

import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.Ulti;
import com.phuongnd.game.view.PlayScreen;
import com.phuongnd.game.view.PlayScreen.STATE;

public class StartWaveGroup extends BaseGroup {

	public Image startWaveButton;
	public Image startWaveButton_press;

	public StartWaveGroup(PlayScreen screen) {
		super(screen);
		// TODO Auto-generated constructor stub
		initGroup();
	}

	@Override
	public void initGroup() {
		// TODO Auto-generated method stub
		setPosition(
				Ulti.convertPositionWorld(screen.world.level.getStartPos1()).x,
				Ulti.convertPositionWorld(screen.world.level.getStartPos1()).y);

		startWaveButton = new Image(Assets.shared().button_startWave);
		startWaveButton.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		//startWaveButton.setColor(Color.RED);
		startWaveButton.setPosition(0, 0);
		addActor(startWaveButton);

		startWaveButton_press = new Image(
				Assets.shared().button_startWave_click);
		startWaveButton_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		//startWaveButton_press.setColor(Color.RED);
		startWaveButton_press.setPosition(0, 0);
		startWaveButton_press.setVisible(false);
		addActor(startWaveButton_press);

		startWaveButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (screen.state == STATE.GAME_RUNNING) {
					screen.towerGroup.setVisible(false);
					for (int i = 0; i < screen.towerDrag.length; i++) {
						screen.towerDrag[i].setVisible(false);
					}
					setVisible(false);
					screen.world.createWave(screen.world.wave);
					startWaveButton_press.setVisible(false);
				}
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (screen.state == STATE.GAME_RUNNING) {
					startWaveButton_press.setVisible(true);
				}
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		// super.show();
		setVisible(true);
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		// super.hide();
		setVisible(false);
	}
}
