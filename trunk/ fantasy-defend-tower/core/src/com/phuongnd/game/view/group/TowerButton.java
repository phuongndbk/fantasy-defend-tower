package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.Ulti;
import com.phuongnd.game.model.Tower;
import com.phuongnd.game.view.PlayScreen;
import com.phuongnd.game.view.PlayScreen.STATE;

public class TowerButton extends BaseGroup {

	public Image towerButtonVisible;
	public Image towerButtonVisible_press;
	public Image towerButtonInvisible;
	public boolean isVisible = true;

	public TowerButton(PlayScreen screen) {
		super(screen);
		// TODO Auto-generated constructor stub
		initGroup();
	}

	@Override
	public void initGroup() {
		// TODO Auto-generated method stub
		setWidth(Constant.MAP_UNIT_SIZE_WIDTH);
		setHeight(Constant.MAP_UNIT_SIZE_HEIGHT);

		towerButtonVisible = new Image(Assets.shared().button_build);
		towerButtonVisible.setWidth(getWidth());
		towerButtonVisible.setHeight(getHeight());
		towerButtonVisible.setColor(Color.GREEN);
		addActor(towerButtonVisible);

		towerButtonVisible_press = new Image(Assets.shared().button_build_click);
		towerButtonVisible_press.setWidth(getWidth());
		towerButtonVisible_press.setHeight(getHeight());
		towerButtonVisible_press.setColor(Color.GREEN);
		towerButtonVisible_press.setVisible(false);
		addActor(towerButtonVisible_press);

		towerButtonInvisible = new Image();
		towerButtonInvisible.setWidth(getWidth());
		towerButtonInvisible.setHeight(getHeight());
		towerButtonInvisible.setVisible(false);
		addActor(towerButtonInvisible);

		addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (screen.state == STATE.GAME_RUNNING) {
					int x0 = (int) (event.getStageX() / Constant.MAP_UNIT_SIZE_WIDTH);
					int y0 = (int) (event.getStageY() / Constant.MAP_UNIT_SIZE_HEIGHT);
					screen.pos = Ulti.convertPositionWorld_2(x0, y0);
					boolean check = false;
					for (int j = 0; j < screen.world.activeTower.size; j++) {
						if ((screen.world.activeTower.get(j).getPosition().x - screen.world.activeTower
								.get(j).xPlus) == screen.pos.x
								&& (screen.world.activeTower.get(j)
										.getPosition().y - screen.world.activeTower
										.get(j).yPlus) == screen.pos.y) {
							check = true;
							screen.towerPos = j;
							break;
						}
					}
					if (check) {
						screen.radar = true;
						screen.towerGroup.setVisible(false);
						screen.towerEdit.setVisible(true);
						if (screen.world.activeTower.get(screen.towerPos)
								.getCurrentUpgrade() == Tower.UPGRADE_MAX) {
							screen.towerEdit.isUpgradeMax = true;
						} else {
							screen.towerEdit.isUpgradeMax = false;
						}

						if (!screen.world.activeTower.get(screen.towerPos)
								.isSkill()) {
							screen.towerEdit.skill.setVisible(true);
							screen.towerEdit.skillLabel.setVisible(true);
						} else {
							screen.towerEdit.skill.setVisible(false);
							screen.towerEdit.skillLabel.setVisible(false);
						}

						screen.towerEdit.coinUpgradeLabel.setText(String
								.valueOf(screen.world.activeTower.get(
										screen.towerPos).getUpgradeCoin()));
						screen.towerEdit.coinSellLabel.setText(String
								.valueOf(screen.world.activeTower.get(
										screen.towerPos).getSellCoin()));
						screen.towerEdit.skillLabel
								.setText(screen.world.activeTower.get(
										screen.towerPos).getSkillName());
					} else {
						screen.radar = false;
						screen.towerGroup.setVisible(true);
						screen.towerEdit.setVisible(false);
					}
					screen.towerGroup.setPosition(screen.pos.x
							- Constant.MAP_UNIT_SIZE_WIDTH * 2, screen.pos.y
							+ Constant.MAP_UNIT_SIZE_HEIGHT);
					if (screen.pos.x <= Constant.MAP_UNIT_SIZE_WIDTH * 2) {
						screen.towerGroup.setPosition(screen.pos.x,
								screen.towerGroup.getY());
					}
					if (screen.pos.x >= Constant.WIDTH
							- Constant.MAP_UNIT_SIZE_WIDTH * 2) {
						screen.towerGroup.setPosition(screen.pos.x
								- screen.towerGroup.getWidth() * 4 / 5,
								screen.towerGroup.getY());
					}
					if (screen.pos.y >= Constant.HEIGHT
							- Constant.MAP_UNIT_SIZE_HEIGHT * 3
							- screen.manaGroup.getHeight()) {
						screen.towerGroup.setPosition(screen.towerGroup.getX(),
								screen.pos.y - screen.towerGroup.getHeight());
					}

					screen.towerEdit.setPosition(screen.pos.x
							- Constant.MAP_UNIT_SIZE_WIDTH, screen.pos.y
							- Constant.MAP_UNIT_SIZE_HEIGHT);

					for (int i = 0; i < screen.towerDrag.length; i++) {
						screen.towerDrag[i].setVisible(false);
					}
				}
				if (isVisible)
					towerButtonVisible_press.setVisible(false);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (isVisible)
					towerButtonVisible_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}

		});

	}

	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		if (isVisible) {
			towerButtonVisible.setVisible(true);
			towerButtonInvisible.setVisible(false);
		} else {
			towerButtonVisible.setVisible(false);
			towerButtonInvisible.setVisible(true);
		}
	}

}
