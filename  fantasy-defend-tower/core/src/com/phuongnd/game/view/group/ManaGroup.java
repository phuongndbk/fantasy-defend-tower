package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.view.PlayScreen;

public class ManaGroup extends BaseGroup {

	public Image mana;
	public Image life;
	public Label manaLabel;
	public Label lifeLabel;

	public ManaGroup(PlayScreen screen) {
		super(screen);
		// TODO Auto-generated constructor stub
		initGroup();
	}

	@Override
	public void initGroup() {
		// TODO Auto-generated method stub
		setWidth(Constant.MAP_UNIT_SIZE_WIDTH * 4 + 30);
		setHeight(Constant.MAP_UNIT_SIZE_HEIGHT + 10);
		setPosition(Constant.MAP_UNIT_SIZE_WIDTH + 30, Constant.HEIGHT
				- getHeight());

		mana = new Image(Assets.shared().button_mana);
		mana.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		addActor(mana);

		life = new Image(Assets.shared().button_heart);
		life.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		life.setColor(Color.RED);
		life.setPosition(getWidth() / 2, 0);
		addActor(life);

		manaLabel = new Label("Mana", new LabelStyle(Assets.shared().font,
				Color.WHITE));
		manaLabel.setPosition(mana.getX() + mana.getWidth() + 5,
				mana.getY() + 10);
		manaLabel.setTouchable(Touchable.disabled);
		addActor(manaLabel);

		lifeLabel = new Label("Life", new LabelStyle(Assets.shared().font,
				Color.WHITE));
		lifeLabel.setPosition(life.getX() + life.getWidth() + 5,
				life.getY() + 10);
		lifeLabel.setTouchable(Touchable.disabled);
		addActor(lifeLabel);

		setTouchable(Touchable.disabled);
	}

	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		manaLabel.setText(String.valueOf(screen.world.mana));
		lifeLabel.setText(String.valueOf(screen.world.life));
	}
}
