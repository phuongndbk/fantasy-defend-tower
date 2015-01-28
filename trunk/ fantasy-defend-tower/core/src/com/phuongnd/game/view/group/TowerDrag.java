package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.view.PlayScreen;

public class TowerDrag extends Group {

	public PlayScreen screen;
	public Image tower;
	public Image ok;
	public Image ok_press;

	public int id;
	public int range;

	public TowerDrag(PlayScreen screen, int id) {
		this.screen = screen;
		this.id = id;
		initGroup();
	}

	public void initGroup() {
		// TODO Auto-generated method stub
		setWidth(Constant.MAP_UNIT_SIZE_WIDTH * 2);
		setHeight(Constant.MAP_UNIT_SIZE_HEIGHT);

		switch (id + 1) {
		case 1:
			tower = new Image(Assets.shared().tower1_Animation_Up.keyFrames[0]);
			range = Constant.TOWER_1_RANGE;
			break;
		case 2:
			tower = new Image(Assets.shared().tower1_Animation_Up.keyFrames[0]);
			range = Constant.TOWER_2_RANGE;
			break;
		case 3:
			tower = new Image(Assets.shared().tower1_Animation_Up.keyFrames[0]);
			range = Constant.TOWER_3_RANGE;
			break;
		case 4:
			tower = new Image(Assets.shared().tower1_Animation_Up.keyFrames[0]);
			range = Constant.TOWER_4_RANGE;
			break;
		case 5:
			tower = new Image(Assets.shared().tower1_Animation_Up.keyFrames[0]);
			range = Constant.TOWER_5_RANGE;
			break;
		case 6:
			tower = new Image(Assets.shared().tower1_Animation_Up.keyFrames[0]);
			range = Constant.TOWER_6_RANGE;
			break;
		case 7:
			tower = new Image(Assets.shared().tower1_Animation_Up.keyFrames[0]);
			range = Constant.TOWER_7_RANGE;
			break;
		case 8:
			tower = new Image(Assets.shared().tower1_Animation_Up.keyFrames[0]);
			range = Constant.TOWER_8_RANGE;
			break;
		case 9:
			tower = new Image(Assets.shared().tower1_Animation_Up.keyFrames[0]);
			range = Constant.TOWER_9_RANGE;
			break;
		case 10:
			tower = new Image(Assets.shared().tower1_Animation_Up.keyFrames[0]);
			range = Constant.TOWER_10_RANGE;
			break;
		default:
			break;
		}
		tower.setPosition(Constant.MAP_UNIT_SIZE_WIDTH / 2 - tower.getWidth()
				/ 2, 0);
		addActor(tower);

		ok = new Image(Assets.shared().button_ok);
		ok.setWidth(Constant.MAP_UNIT_SIZE_WIDTH);
		ok.setHeight(Constant.MAP_UNIT_SIZE_HEIGHT);
		ok.setColor(Color.GREEN);
		ok.setPosition(getWidth() / 2, 0);
		addActor(ok);

		ok_press = new Image(Assets.shared().button_ok_click);
		ok_press.setWidth(Constant.MAP_UNIT_SIZE_WIDTH);
		ok_press.setHeight(Constant.MAP_UNIT_SIZE_HEIGHT);
		ok_press.setColor(Color.GREEN);
		ok_press.setPosition(getWidth() / 2, 0);
		ok_press.setVisible(false);
		addActor(ok_press);

		ok.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (screen.world.getTowerCoin(id + 1) <= screen.world.coin) {
					screen.world.coin -= screen.world.getTowerCoin(id + 1);
					screen.world.addNewTower(id + 1, screen.pos, 4);
					for (int i = 0; i < screen.towerButton.length; i++) {
						if (screen.towerButton[i].getX() == getX()
								&& screen.towerButton[i].getY() == getY()) {
							screen.towerButton[i].isVisible = false;
						}
					}

					for (int j = 0; j < screen.world.activeTower.size; j++) {
						if ((screen.world.activeTower.get(j).getPosition().x - screen.world.activeTower
								.get(j).xPlus) == getX()
								&& (screen.world.activeTower.get(j)
										.getPosition().y - screen.world.activeTower
										.get(j).yPlus) == getY()) {
							screen.radar = true;
							screen.towerPos = j;
							break;
						}
					}
					setVisible(false);
					screen.towerGroup.setVisible(false);
				} else {
					// not enough gold
					screen.dialog.setInfo(Constant.not_money_enough);
					screen.dialog.setVisible(true);
				}

				ok.setVisible(true);
				ok_press.setVisible(false);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				ok.setVisible(false);
				ok_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}
}
