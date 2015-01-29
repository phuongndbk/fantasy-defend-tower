package com.phuongnd.game.model;

import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.World;

public class Tower extends BaseUnit {

	private int coin;
	private int upgradeCoin;
	private int sellCoin;
	private int currentUpgrade;
	private boolean isSkill;
	private boolean isProduct;
	private String skillName;

	private TextureRegion skillImage;
	private TextureRegion towerImage;

	public float xPlus, yPlus;

	public static final int UPGRADE_MAX = 2;
	private static final int UPGRADE_COIN = 100;
	private float time_to_attack = 0;
	private float time_to_produce = 8;

	@Override
	public void init(int id, Vector2 position, int numAnimation) {
		// TODO Auto-generated method stub
		setId(id);
		setPosition(position);
		setNUM_ANIMATION(numAnimation);
		// setAnimation(new Animation[numAnimation]);
		setState(STATE.ACTIVE);

		switch (getId()) {
		case 1:
			setName(Constant.TOWER_1_NAME);
			setDescription(Constant.TOWER_1_DESCRIPTION);
			setSpeed(Constant.TOWER_1_SPEED);
			setDamage(Constant.TOWER_1_DAMAGE);
			setRange(Constant.TOWER_1_RANGE);
			setSkill(Constant.TOWER_1_SKILL);
			setAttack_speed(Constant.TOWER_1_ATTACK_SPEED);
			setCoin(Constant.TOWER_1_COIN);
			// setAnimation(Assets.shared().tower1_Animation_Up, 0);
			// setAnimation(Assets.shared().tower1_Animation_Down, 1);
			// setAnimation(Assets.shared().tower1_Animation_Left, 2);
			// setAnimation(Assets.shared().tower1_Animation_Right, 3);
			setTowerImage(Assets.shared().tower_1);
			skillName = Constant.SKILL_1_NAME;
			setSkillImage(new TextureRegion(Assets.shared().skill_ninja));
			break;
		case 2:
			setName(Constant.TOWER_2_NAME);
			setDescription(Constant.TOWER_2_DESCRIPTION);
			setSpeed(Constant.TOWER_2_SPEED);
			setDamage(Constant.TOWER_2_DAMAGE);
			setRange(Constant.TOWER_2_RANGE);
			setSkill(Constant.TOWER_2_SKILL);
			setAttack_speed(Constant.TOWER_2_ATTACK_SPEED);
			setCoin(Constant.TOWER_2_COIN);
			// setAnimation(Assets.shared().tower2_Animation_Up, 0);
			// setAnimation(Assets.shared().tower2_Animation_Down, 1);
			// setAnimation(Assets.shared().tower2_Animation_Left, 2);
			// setAnimation(Assets.shared().tower2_Animation_Right, 3);
			setTowerImage(Assets.shared().tower_2);
			skillName = Constant.SKILL_1_NAME;
			setSkillImage(new TextureRegion(Assets.shared().skill_ninja));
			break;
		case 3:
			setName(Constant.TOWER_3_NAME);
			setDescription(Constant.TOWER_3_DESCRIPTION);
			setSpeed(Constant.TOWER_3_SPEED);
			setDamage(Constant.TOWER_3_DAMAGE);
			setRange(Constant.TOWER_3_RANGE);
			setSkill(Constant.TOWER_3_SKILL);
			setAttack_speed(Constant.TOWER_3_ATTACK_SPEED);
			setCoin(Constant.TOWER_3_COIN);
			// setAnimation(Assets.shared().tower3_Animation_Up, 0);
			// setAnimation(Assets.shared().tower3_Animation_Down, 1);
			// setAnimation(Assets.shared().tower3_Animation_Left, 2);
			// setAnimation(Assets.shared().tower3_Animation_Right, 3);
			setTowerImage(Assets.shared().tower_3);
			skillName = Constant.SKILL_1_NAME;
			setSkillImage(new TextureRegion(Assets.shared().skill_ninja));
			break;
		case 4:
			setName(Constant.TOWER_4_NAME);
			setDescription(Constant.TOWER_4_DESCRIPTION);
			setSpeed(Constant.TOWER_4_SPEED);
			setDamage(Constant.TOWER_4_DAMAGE);
			setRange(Constant.TOWER_4_RANGE);
			setSkill(Constant.TOWER_4_SKILL);
			setAttack_speed(Constant.TOWER_4_ATTACK_SPEED);
			setCoin(Constant.TOWER_4_COIN);
			// setAnimation(Assets.shared().tower4_Animation_Up, 0);
			// setAnimation(Assets.shared().tower4_Animation_Down, 1);
			// setAnimation(Assets.shared().tower4_Animation_Left, 2);
			// setAnimation(Assets.shared().tower4_Animation_Right, 3);
			setTowerImage(Assets.shared().tower_4);
			skillName = Constant.SKILL_1_NAME;
			setSkillImage(new TextureRegion(Assets.shared().skill_ninja));
			break;
		case 5:
			setName(Constant.TOWER_5_NAME);
			setDescription(Constant.TOWER_5_DESCRIPTION);
			setSpeed(Constant.TOWER_5_SPEED);
			setDamage(Constant.TOWER_5_DAMAGE);
			setRange(Constant.TOWER_5_RANGE);
			setSkill(Constant.TOWER_5_SKILL);
			setAttack_speed(Constant.TOWER_5_ATTACK_SPEED);
			setCoin(Constant.TOWER_5_COIN);
			// setAnimation(Assets.shared().tower5_Animation_Up, 0);
			// setAnimation(Assets.shared().tower5_Animation_Down, 1);
			// setAnimation(Assets.shared().tower5_Animation_Left, 2);
			// setAnimation(Assets.shared().tower5_Animation_Right, 3);
			setTowerImage(Assets.shared().tower_5);
			skillName = Constant.SKILL_1_NAME;
			setSkillImage(new TextureRegion(Assets.shared().skill_ninja));
			break;
		case 6:
			setName(Constant.TOWER_6_NAME);
			setDescription(Constant.TOWER_6_DESCRIPTION);
			setSpeed(Constant.TOWER_6_SPEED);
			setDamage(Constant.TOWER_6_DAMAGE);
			setRange(Constant.TOWER_6_RANGE);
			setSkill(Constant.TOWER_6_SKILL);
			setAttack_speed(Constant.TOWER_6_ATTACK_SPEED);
			setCoin(Constant.TOWER_6_COIN);
			// setAnimation(Assets.shared().tower6_Animation_Up, 0);
			// setAnimation(Assets.shared().tower6_Animation_Down, 1);
			// setAnimation(Assets.shared().tower6_Animation_Left, 2);
			// setAnimation(Assets.shared().tower6_Animation_Right, 3);
			setTowerImage(Assets.shared().tower_6);
			skillName = Constant.SKILL_2_NAME;
			setSkillImage(new TextureRegion(Assets.shared().skill_hex));
			break;
		case 7:
			setName(Constant.TOWER_7_NAME);
			setDescription(Constant.TOWER_7_DESCRIPTION);
			setSpeed(Constant.TOWER_7_SPEED);
			setDamage(Constant.TOWER_7_DAMAGE);
			setRange(Constant.TOWER_7_RANGE);
			setSkill(Constant.TOWER_7_SKILL);
			setAttack_speed(Constant.TOWER_7_ATTACK_SPEED);
			setCoin(Constant.TOWER_7_COIN);
			// setAnimation(Assets.shared().tower7_Animation_Up, 0);
			// setAnimation(Assets.shared().tower7_Animation_Down, 1);
			// setAnimation(Assets.shared().tower7_Animation_Left, 2);
			// setAnimation(Assets.shared().tower7_Animation_Right, 3);
			setTowerImage(Assets.shared().tower_7);
			skillName = Constant.SKILL_3_NAME;
			setSkillImage(new TextureRegion(Assets.shared().skill_ninja));
			break;
		case 8:
			setName(Constant.TOWER_8_NAME);
			setDescription(Constant.TOWER_8_DESCRIPTION);
			setSpeed(Constant.TOWER_8_SPEED);
			setDamage(Constant.TOWER_8_DAMAGE);
			setRange(Constant.TOWER_8_RANGE);
			setSkill(Constant.TOWER_8_SKILL);
			setAttack_speed(Constant.TOWER_8_ATTACK_SPEED);
			setCoin(Constant.TOWER_8_COIN);
			// setAnimation(Assets.shared().tower8_Animation_Up, 0);
			// setAnimation(Assets.shared().tower8_Animation_Down, 1);
			// setAnimation(Assets.shared().tower8_Animation_Left, 2);
			// setAnimation(Assets.shared().tower8_Animation_Right, 3);
			setTowerImage(Assets.shared().tower_8);
			skillName = Constant.SKILL_4_NAME;
			setSkillImage(new TextureRegion(Assets.shared().skill_teleport));
			break;
		case 9:
			setName(Constant.TOWER_9_NAME);
			setDescription(Constant.TOWER_9_DESCRIPTION);
			setSpeed(Constant.TOWER_9_SPEED);
			setDamage(Constant.TOWER_9_DAMAGE);
			setRange(Constant.TOWER_9_RANGE);
			setSkill(Constant.TOWER_9_SKILL);
			setAttack_speed(Constant.TOWER_9_ATTACK_SPEED);
			setCoin(Constant.TOWER_9_COIN);
			// setAnimation(Assets.shared().tower9_Animation_Up, 0);
			// setAnimation(Assets.shared().tower9_Animation_Down, 1);
			// setAnimation(Assets.shared().tower9_Animation_Left, 2);
			// setAnimation(Assets.shared().tower9_Animation_Right, 3);
			setTowerImage(Assets.shared().tower_9);
			skillName = Constant.SKILL_5_NAME;
			setSkillImage(new TextureRegion(Assets.shared().skill_vampire));
			break;
		case 10:
			setName(Constant.TOWER_10_NAME);
			setDescription(Constant.TOWER_10_DESCRIPTION);
			setSpeed(Constant.TOWER_10_SPEED);
			setDamage(Constant.TOWER_10_DAMAGE);
			setRange(Constant.TOWER_10_RANGE);
			setSkill(Constant.TOWER_10_SKILL);
			setAttack_speed(Constant.TOWER_10_ATTACK_SPEED);
			setCoin(Constant.TOWER_10_COIN);
			// setAnimation(Assets.shared().tower10_Animation_Up, 0);
			// setAnimation(Assets.shared().tower10_Animation_Down, 1);
			// setAnimation(Assets.shared().tower10_Animation_Left, 2);
			// setAnimation(Assets.shared().tower10_Animation_Right, 3);
			setTowerImage(Assets.shared().tower_10);
			skillName = Constant.SKILL_6_NAME;
			setSkillImage(new TextureRegion(Assets.shared().skill_moon));
			break;
		}

		setBounder(new Rectangle(getPosition().x, getPosition().y,
				getWidth2() - 10, getHeight2() - 10));
		setUpgradeCoin(UPGRADE_COIN);
		setSellCoin(getCoin() / 2);

		xPlus = Constant.MAP_UNIT_SIZE_WIDTH / 2 - getWidth2() / 2;
		yPlus = Constant.MAP_UNIT_SIZE_HEIGHT / 2 - getHeight2() / 2;
		getPosition().x += xPlus;
		getPosition().y += yPlus;
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub
		time_to_attack += delta;
		time_to_produce += delta;
	}

	@Override
	public void attack(BaseUnit unit) {
		// TODO Auto-generated method stub
		// if (time_to_attack >= getAttack_speed()) {
		// int damage = getDamage() - unit.getArmor();
		// unit.setHp(unit.getHp() - damage);
		// time_to_attack = 0;
		// }
		//
		// if (unit.getHp() <= 0) {
		// unit.setHp(0);
		// unit.setState(STATE.DEAD);
		// }
	}

	public void attack(BaseUnit unit, World world, float delta) {
		// TODO Auto-generated method stub
		if (time_to_attack >= 1.0 / getAttack_speed()) {
			world.addNewBullet(1,
					new Vector2(getPosition().x, getPosition().y), 4, unit);
			time_to_attack = 0;
		}
	}

	public void produceWarrior(World world, float delta) {
		if (time_to_produce >= 10) {
			if (!isProduct) {
				// isProduct = true;
				if (world.level.getMap().getPath_2().isEmpty())
					world.addNewWarrior(getId(), new Vector2(getPosition().x,
							getPosition().y), 4, 0, 1, isSkill);
				else {
					world.addNewWarrior(getId(), new Vector2(getPosition().x,
							getPosition().y), 4, 0, 2, isSkill);
				}
			}
			time_to_produce = 0;
		}
	}

	public void activateSkill() {
		isSkill = true;
	}

	public void upgrade() {
		if (currentUpgrade < UPGRADE_MAX) {
			currentUpgrade++;
			setUpgradeCoin(getUpgradeCoin() + UPGRADE_COIN);
			setSellCoin((getCoin() + UPGRADE_COIN * currentUpgrade) / 2);

			setDamage(getDamage() + 1);
			setRange(getRange() + 1);
			setAttack_speed(getAttack_speed() + 1);
		}
	}

	public void sell() {
		setState(STATE.DEAD);
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public int getUpgradeCoin() {
		return upgradeCoin;
	}

	public void setUpgradeCoin(int upgradeCoin) {
		this.upgradeCoin = upgradeCoin;
	}

	public int getSellCoin() {
		return sellCoin;
	}

	public void setSellCoin(int sellCoin) {
		this.sellCoin = sellCoin;
	}

	public int getCurrentUpgrade() {
		return currentUpgrade;
	}

	public void setCurrentUpgrade(int currentUpgrade) {
		this.currentUpgrade = currentUpgrade;
	}

	public String getSkillName() {
		return skillName;
	}

	public boolean isSkill() {
		return isSkill;
	}

	public void setSkillImage(TextureRegion skillImage) {
		this.skillImage = skillImage;
	}

	public TextureRegion getSkillImage() {
		return skillImage;
	}

	public void setTowerImage(TextureRegion towerImage) {
		this.towerImage = towerImage;
	}

	public TextureRegion getTowerImage() {
		return towerImage;
	}

	@Override
	public float getWidth2() {
		// TODO Auto-generated method stub
		return towerImage.getRegionWidth();
	}

	@Override
	public float getHeight2() {
		// TODO Auto-generated method stub
		return towerImage.getRegionHeight();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		setState(STATE.DEAD);
		setPosition(0, 0);
		time_to_attack = 0;
		time_to_produce = 8;
		currentUpgrade = 0;
		isSkill = false;
		isProduct = false;
	}

}
