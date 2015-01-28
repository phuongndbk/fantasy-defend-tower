package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.view.PlayScreen;

public class TowerGroup extends BaseGroup {

	public static final int TOWER_NUMBER = 10;
	public ScrollPane scrollPane;
	public Image bkg;

	public TowerGroup(PlayScreen screen) {
		super(screen);
		// TODO Auto-generated constructor stub
		initGroup();
	}

	@Override
	public void initGroup() {
		// TODO Auto-generated method stub

		setWidth(Constant.MAP_UNIT_SIZE_WIDTH * 5);
		setHeight(Constant.MAP_UNIT_SIZE_HEIGHT * 2);

		Table table = new Table();

		for (int i = 0; i < TOWER_NUMBER; i++) {
			TowerUnit t = new TowerUnit(i);
			table.add(t);
		}
		scrollPane = new ScrollPane(table);
		scrollPane.setWidth(getWidth() - 30);
		scrollPane.setHeight(getHeight() - 34);
		scrollPane.setPosition(getX() + 15, getY() + 17);
		scrollPane.setScrollingDisabled(false, true);

		bkg = new Image(Assets.shared().backgroundTower);
		bkg.setSize(getWidth(), getHeight());
		addActor(bkg);
		addActor(scrollPane);
	}

	public class TowerUnit extends Group {
		public int id;
		public Image bkg;
		public Image tower;
		public Label coin;

		public TowerUnit(int id) {
			super();
			this.id = id;
			switch (this.id + 1) {
			case 1:
				tower = new Image(
						Assets.shared().enemy1_Animation_Up.keyFrames[0]);
				coin = new Label("$" + Constant.TOWER_1_COIN, new LabelStyle(
						Assets.shared().font, Color.ORANGE));
				break;
			case 2:
				tower = new Image(
						Assets.shared().enemy1_Animation_Up.keyFrames[0]);
				coin = new Label("$" + Constant.TOWER_2_COIN, new LabelStyle(
						Assets.shared().font, Color.ORANGE));
				break;
			case 3:
				tower = new Image(
						Assets.shared().enemy1_Animation_Up.keyFrames[0]);
				coin = new Label("$" + Constant.TOWER_3_COIN, new LabelStyle(
						Assets.shared().font, Color.ORANGE));
				break;
			case 4:
				tower = new Image(
						Assets.shared().enemy1_Animation_Up.keyFrames[0]);
				coin = new Label("$" + Constant.TOWER_4_COIN, new LabelStyle(
						Assets.shared().font, Color.ORANGE));
				break;
			case 5:
				tower = new Image(
						Assets.shared().enemy1_Animation_Up.keyFrames[0]);
				coin = new Label("$" + Constant.TOWER_5_COIN, new LabelStyle(
						Assets.shared().font, Color.ORANGE));
				break;
			case 6:
				tower = new Image(
						Assets.shared().enemy1_Animation_Up.keyFrames[0]);
				coin = new Label("$" + Constant.TOWER_6_COIN, new LabelStyle(
						Assets.shared().font, Color.ORANGE));
				break;
			case 7:
				tower = new Image(
						Assets.shared().enemy1_Animation_Up.keyFrames[0]);
				coin = new Label("$" + Constant.TOWER_7_COIN, new LabelStyle(
						Assets.shared().font, Color.ORANGE));
				break;
			case 8:
				tower = new Image(
						Assets.shared().enemy1_Animation_Up.keyFrames[0]);
				coin = new Label("$" + Constant.TOWER_8_COIN, new LabelStyle(
						Assets.shared().font, Color.ORANGE));
				break;
			case 9:
				tower = new Image(
						Assets.shared().enemy1_Animation_Up.keyFrames[0]);
				coin = new Label("$" + Constant.TOWER_9_COIN, new LabelStyle(
						Assets.shared().font, Color.ORANGE));
				break;
			case 10:
				tower = new Image(
						Assets.shared().enemy1_Animation_Up.keyFrames[0]);
				coin = new Label("$" + Constant.TOWER_10_COIN, new LabelStyle(
						Assets.shared().font, Color.ORANGE));
				break;

			default:
				break;
			}

			setWidth(tower.getWidth() * 2);
			setHeight(tower.getHeight() * 2);
			bkg = new Image(Assets.shared().level);
			bkg.setSize(getWidth(), getHeight() - 30);
			bkg.setPosition(0, 15);
			addActor(bkg);
			tower.setPosition(tower.getWidth() / 2, tower.getHeight() / 2);
			coin.setPosition(0, 10);
			coin.setFontScale(0.7f);
			coin.setWidth(getWidth());
			coin.setAlignment(Align.center);
			coin.setTouchable(Touchable.disabled);
			addActor(tower);
			addActor(coin);

			this.addListener(new ClickListener() {

				@Override
				public boolean touchDown(InputEvent event, float x, float y,
						int pointer, int button) {
					// TODO Auto-generated method stub
					for (int i = 0; i < screen.towerDrag.length; i++) {
						if (screen.towerDrag[i].id == getId()) {
							screen.towerDrag[i].setPosition(screen.pos.x,
									screen.pos.y);
							screen.towerDrag[i].setVisible(true);
						} else {
							screen.towerDrag[i].setVisible(false);
						}
					}
					return super.touchDown(event, x, y, pointer, button);
				}

			});
		}

		public int getId() {
			return id;
		}

	}
}
