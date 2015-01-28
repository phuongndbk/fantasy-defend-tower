package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.Ulti;
import com.phuongnd.game.model.Tower;
import com.phuongnd.game.model.Warrior;
import com.phuongnd.game.view.PlayScreen;

public class TowerEdit extends BaseGroup {

	public Image upgrade;
	public Image sell;
	public Image skill;
	public Image upgrade_press;
	public Image sell_press;
	public Image skill_press;

	public Label coinUpgradeLabel;
	public Label coinSellLabel;
	public Label skillLabel;

	public boolean isUpgradeMax;
	public boolean isUpgradeDone;
	public boolean isSkillDone;
	public float timeUpgrade;
	public float timeSkill;

	public TowerEdit(PlayScreen screen) {
		super(screen);
		// TODO Auto-generated constructor stub
		initGroup();
	}

	@Override
	public void initGroup() {
		// TODO Auto-generated method stub
		setWidth(Constant.MAP_UNIT_SIZE_WIDTH * 3);
		setHeight(Constant.MAP_UNIT_SIZE_HEIGHT * 3);
		setTouchable(Touchable.childrenOnly);

		upgrade = new Image(Assets.shared().button_upgrade);
		upgrade.setWidth(getWidth() / 3);
		upgrade.setHeight(getHeight() / 3);
		upgrade.setColor(Color.GREEN);
		upgrade.setPosition(0, getHeight() / 3);
		addActor(upgrade);

		upgrade_press = new Image(Assets.shared().button_upgrade_click);
		upgrade_press.setWidth(getWidth() / 3);
		upgrade_press.setHeight(getHeight() / 3);
		upgrade_press.setColor(Color.GREEN);
		upgrade_press.setPosition(0, getHeight() / 3);
		upgrade_press.setVisible(false);
		addActor(upgrade_press);

		sell = new Image(Assets.shared().button_coin);
		sell.setWidth(getWidth() / 3);
		sell.setHeight(getHeight() / 3);
		sell.setColor(Color.YELLOW);
		sell.setPosition(getWidth() * 2 / 3, getHeight() / 3);
		addActor(sell);

		sell_press = new Image(Assets.shared().button_coin_click);
		sell_press.setWidth(getWidth() / 3);
		sell_press.setHeight(getHeight() / 3);
		sell_press.setColor(Color.YELLOW);
		sell_press.setPosition(getWidth() * 2 / 3, getHeight() / 3);
		sell_press.setVisible(false);
		addActor(sell_press);

		skill = new Image(Assets.shared().button_coin);
		skill.setWidth(getWidth() / 3);
		skill.setHeight(getHeight() / 3);
		skill.setColor(Color.YELLOW);
		skill.setPosition(getWidth() / 3, getHeight() * 2 / 3);
		addActor(skill);

		skill_press = new Image(Assets.shared().button_coin_click);
		skill_press.setWidth(getWidth() / 3);
		skill_press.setHeight(getHeight() / 3);
		skill_press.setColor(Color.YELLOW);
		skill_press.setPosition(getWidth() / 3, getHeight() * 2 / 3);
		skill_press.setVisible(false);
		addActor(sell_press);

		coinUpgradeLabel = new Label("Coin Upgrade", new LabelStyle(
				Assets.shared().font, Color.ORANGE));
		coinUpgradeLabel.setTouchable(Touchable.disabled);
		coinUpgradeLabel.setWidth(upgrade.getWidth());
		coinUpgradeLabel.setPosition(0, 15);
		coinUpgradeLabel.setAlignment(Align.center);
		addActor(coinUpgradeLabel);

		coinSellLabel = new Label("Coin Sell", new LabelStyle(
				Assets.shared().font, Color.ORANGE));
		coinSellLabel.setTouchable(Touchable.disabled);
		coinSellLabel.setWidth(sell.getWidth());
		coinSellLabel.setAlignment(Align.center);
		coinSellLabel.setPosition(getWidth() * 2 / 3, 15);
		addActor(coinSellLabel);

		skillLabel = new Label("Skill", new LabelStyle(Assets.shared().font,
				Color.GREEN));
		skillLabel.setTouchable(Touchable.disabled);
		skillLabel.setWidth(skill.getWidth());
		skillLabel.setAlignment(Align.center);
		skillLabel.setPosition(getWidth() / 3, getHeight());
		addActor(skillLabel);

		upgrade.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				int x0 = (int) (event.getStageX() / Constant.MAP_UNIT_SIZE_WIDTH);
				int y0 = (int) (event.getStageY() / Constant.MAP_UNIT_SIZE_HEIGHT);
				Vector2 pos = Ulti.convertPositionWorld_2(x0, y0);
				pos.x += Constant.MAP_UNIT_SIZE_WIDTH;
				// pos.y -= Constant.MAP_UNIT_SIZE_HEIGHT;

				int index = 0;
				for (int i = 0; i < screen.world.activeTower.size; i++) {
					if ((screen.world.activeTower.get(i).getPosition().x - screen.world.activeTower
							.get(i).xPlus) == pos.x
							&& (screen.world.activeTower.get(i).getPosition().y - screen.world.activeTower
									.get(i).yPlus) == pos.y) {
						index = i;
						break;
					}
				}
				if (!isUpgradeDone) {
					if (screen.world.activeTower.get(index).getUpgradeCoin() <= screen.world.coin) {
						screen.world.coin -= screen.world.activeTower
								.get(index).getUpgradeCoin();
						isUpgradeDone = true;
						screen.world.activeTower.get(index).upgrade();
						if (screen.world.activeTower.get(index)
								.getCurrentUpgrade() == Tower.UPGRADE_MAX) {
							isUpgradeMax = true;
						}
						coinUpgradeLabel.setText(String
								.valueOf(screen.world.activeTower.get(index)
										.getUpgradeCoin()));
						coinSellLabel.setText(String
								.valueOf(screen.world.activeTower.get(index)
										.getSellCoin()));
					} else {
						// not enough gold
						screen.dialog.setInfo(Constant.not_money_enough);
						screen.dialog.setVisible(true);
					}
				}

				upgrade.setVisible(true);
				upgrade_press.setVisible(false);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				upgrade.setVisible(false);
				upgrade_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		sell.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				int x0 = (int) (event.getStageX() / Constant.MAP_UNIT_SIZE_WIDTH);
				int y0 = (int) (event.getStageY() / Constant.MAP_UNIT_SIZE_HEIGHT);
				Vector2 pos = Ulti.convertPositionWorld_2(x0, y0);
				pos.x -= Constant.MAP_UNIT_SIZE_WIDTH;
				// pos.y -= Constant.MAP_UNIT_SIZE_HEIGHT;

				for (int i = 0; i < screen.world.activeTower.size; i++) {
					if ((screen.world.activeTower.get(i).getPosition().x - screen.world.activeTower
							.get(i).xPlus) == pos.x
							&& (screen.world.activeTower.get(i).getPosition().y - screen.world.activeTower
									.get(i).yPlus) == pos.y) {
						screen.world.coin += screen.world.activeTower.get(i)
								.getSellCoin();
						screen.world.activeTower.get(i).sell();
						setVisible(false);
						isUpgradeMax = false;
						for (int j = 0; j < screen.towerButton.length; j++) {
							if (screen.towerButton[j].getX() == pos.x
									&& screen.towerButton[j].getY() == pos.y) {
								screen.towerButton[j].isVisible = true;
								break;
							}
						}
						screen.radar = false;
						break;
					}
				}

				sell.setVisible(true);
				sell_press.setVisible(false);
				skill.setVisible(true);
				skillLabel.setVisible(true);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				sell.setVisible(false);
				sell_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		skill.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (!isSkillDone) {
					isSkillDone = true;
					skill_press.setVisible(false);

					int x0 = (int) (event.getStageX() / Constant.MAP_UNIT_SIZE_WIDTH);
					int y0 = (int) (event.getStageY() / Constant.MAP_UNIT_SIZE_HEIGHT);
					Vector2 pos = Ulti.convertPositionWorld_2(x0, y0);
					// pos.x -= Constant.MAP_UNIT_SIZE_WIDTH;
					pos.y -= Constant.MAP_UNIT_SIZE_HEIGHT;

					for (int i = 0; i < screen.world.activeTower.size; i++) {
						if ((screen.world.activeTower.get(i).getPosition().x - screen.world.activeTower
								.get(i).xPlus) == pos.x
								&& (screen.world.activeTower.get(i)
										.getPosition().y - screen.world.activeTower
										.get(i).yPlus) == pos.y) {
							// skill start
							screen.world.activeTower.get(i).activateSkill();
							for (Warrior warrior : screen.world.activeWarrior) {
								if (warrior.getId() == screen.world.activeTower
										.get(i).getId()) {
									// if warrior is produced by tower
									if (warrior.start.x == screen.world.activeTower
											.get(i).getPosition().x
											&& warrior.start.y == screen.world.activeTower
													.get(i).getPosition().y) {
										warrior.getSkills().setActive(true);
										if (warrior.getSkills().getId() == Constant.SKILL_1_ID
												|| warrior.getSkills().getId() == Constant.SKILL_6_ID) {
											warrior.getSkills().active(warrior);
										}
									}
								}
							}
							skill.setVisible(false);
							skillLabel.setVisible(false);
							break;
						}
					}

				}
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (!isSkillDone) {
					skill.setVisible(false);
					skill_press.setVisible(true);
				}
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}

	public void showUpgrade() {
		upgrade.setVisible(true);
		coinUpgradeLabel.setVisible(true);
	}

	public void hideUpgrade() {
		upgrade.setVisible(false);
		coinUpgradeLabel.setVisible(false);
	}

	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		if (isUpgradeMax) {
			hideUpgrade();
		} else {
			showUpgrade();
		}

		if (isUpgradeDone) {
			timeUpgrade += delta;
			if (timeUpgrade >= 1) {
				isUpgradeDone = false;
				timeUpgrade = 0;
			}
		}

		if (isSkillDone) {
			timeSkill += delta;
			if (timeSkill >= 1) {
				isSkillDone = false;
				timeSkill = 0;
			}
		}
	}
}
