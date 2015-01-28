package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.view.BaseScreen;

public class SlotGroup extends Group {

	public Image bkg;
	public Label level;
	public Image coinImage;
	public Label coin;

	public BaseScreen screen;

	public SlotGroup(BaseScreen screen) {
		this.screen = screen;
		// TODO Auto-generated constructor stub
		initGroup();
	}

	public void initGroup() {
		// TODO Auto-generated method stub
		setWidth(Assets.shared().slot.getRegionWidth() - 50);
		setHeight(Assets.shared().slot.getRegionWidth() - 50);

		bkg = new Image(Assets.shared().backgroundMenu);
		bkg.setColor(Color.WHITE);
		bkg.setSize(getWidth(), getHeight());

		level = new Label("Level", new LabelStyle(Assets.shared().font,
				Color.ORANGE));
		level.setWidth(getWidth());
		level.setPosition(0, getHeight() / 2);
		level.setAlignment(Align.center);
		level.setTouchable(Touchable.disabled);

		coinImage = new Image(Assets.shared().button_coin);
		coinImage.setWidth(50);
		coinImage.setHeight(50);
		coinImage.setPosition(5, 5);
		coinImage.setColor(Color.YELLOW);

		coin = new Label("Coin", new LabelStyle(Assets.shared().font,
				Color.YELLOW));
		coin.setWidth(getWidth());
		coin.setPosition(5, 12);
		coin.setAlignment(Align.center);
		coin.setTouchable(Touchable.disabled);

		addActor(bkg);
		addActor(level);
		addActor(coinImage);
		addActor(coin);

		setTouchable(Touchable.disabled);
	}

}
