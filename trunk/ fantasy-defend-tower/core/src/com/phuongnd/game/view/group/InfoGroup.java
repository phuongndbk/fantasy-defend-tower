package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.view.PlayScreen;

public class InfoGroup extends BaseGroup {

	public Image coin;
	public Image wave;
	public Label coinLabel;
	public Label waveLabel;

	public InfoGroup(PlayScreen screen) {
		super(screen);
		// TODO Auto-generated constructor stub
		initGroup();
	}

	@Override
	public void initGroup() {
		// TODO Auto-generated method stub
		setWidth(Constant.MAP_UNIT_SIZE_WIDTH * 4 + 40);
		setHeight(Constant.MAP_UNIT_SIZE_HEIGHT + 10);
		setPosition(Constant.WIDTH - getWidth(), Constant.HEIGHT - getHeight());

		coin = new Image(Assets.shared().button_coin);
		coin.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		coin.setColor(Color.YELLOW);
		addActor(coin);

		wave = new Image(Assets.shared().button_skull);
		wave.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		wave.setPosition(getWidth() / 2, 0);
		addActor(wave);

		coinLabel = new Label("Coin", new LabelStyle(Assets.shared().font,
				Color.WHITE));
		coinLabel.setPosition(coin.getX() + coin.getWidth() + 5,
				coin.getY() + 10);
		coinLabel.setTouchable(Touchable.disabled);
		addActor(coinLabel);

		waveLabel = new Label("Wave", new LabelStyle(Assets.shared().font,
				Color.WHITE));
		waveLabel.setPosition(wave.getX() + wave.getWidth() + 5,
				wave.getY() + 10);
		waveLabel.setTouchable(Touchable.disabled);
		addActor(waveLabel);

		setTouchable(Touchable.disabled);

	}

	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		coinLabel.setText(String.valueOf(screen.world.coin));
		waveLabel.setText(String.valueOf(screen.world.wave) + " / "
				+ screen.world.level.getNumWave());
	}
}
