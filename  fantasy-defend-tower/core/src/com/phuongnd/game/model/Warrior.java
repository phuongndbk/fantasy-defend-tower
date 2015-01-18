package com.phuongnd.game.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.controller.Animation;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;

public class Warrior extends BaseUnit {

	private float time_to_attack;

	@Override
	public void init(int id, Vector2 position, int numAnimation) {
		// TODO Auto-generated method stub
		setId(id);
		setPosition(position);
		setNUM_ANIMATION(numAnimation);
		setAnimation(new Animation[numAnimation]);
		setState(STATE.ACTIVE);

		switch (getId()) {
		case 1:
			setName(Constant.WARRIOR_1_NAME);
			setDescription(Constant.WARRIOR_1_DESCRIPTION);
			setHp(Constant.WARRIOR_1_HP);
			setTotalHp(Constant.WARRIOR_1_HP);
			setSpeed(Constant.WARRIOR_1_SPEED);
			setDamage(Constant.WARRIOR_1_DAMAGE);
			setArmor(Constant.WARRIOR_1_ARMOR);
			setRange(Constant.WARRIOR_1_RANGE);
			setSkill(Constant.WARRIOR_1_SKILL);
			setAttack_speed(Constant.WARRIOR_1_ATTACK_SPEED);
			setAnimation(Assets.shared().warrior1_Animation_Up, 0);
			setAnimation(Assets.shared().warrior1_Animation_Down, 1);
			setAnimation(Assets.shared().warrior1_Animation_Left, 2);
			setAnimation(Assets.shared().warrior1_Animation_Right, 3);
			break;
		case 2:
			setName(Constant.WARRIOR_2_NAME);
			setDescription(Constant.WARRIOR_2_DESCRIPTION);
			setHp(Constant.WARRIOR_2_HP);
			setTotalHp(Constant.WARRIOR_2_HP);
			setSpeed(Constant.WARRIOR_2_SPEED);
			setDamage(Constant.WARRIOR_2_DAMAGE);
			setArmor(Constant.WARRIOR_2_ARMOR);
			setRange(Constant.WARRIOR_2_RANGE);
			setSkill(Constant.WARRIOR_2_SKILL);
			setAttack_speed(Constant.WARRIOR_2_ATTACK_SPEED);
			setAnimation(Assets.shared().warrior2_Animation_Up, 0);
			setAnimation(Assets.shared().warrior2_Animation_Down, 1);
			setAnimation(Assets.shared().warrior2_Animation_Left, 2);
			setAnimation(Assets.shared().warrior2_Animation_Right, 3);
			break;
		case 3:
			setName(Constant.WARRIOR_3_NAME);
			setDescription(Constant.WARRIOR_3_DESCRIPTION);
			setHp(Constant.WARRIOR_3_HP);
			setTotalHp(Constant.WARRIOR_3_HP);
			setSpeed(Constant.WARRIOR_3_SPEED);
			setDamage(Constant.WARRIOR_3_DAMAGE);
			setArmor(Constant.WARRIOR_3_ARMOR);
			setRange(Constant.WARRIOR_3_RANGE);
			setSkill(Constant.WARRIOR_3_SKILL);
			setAttack_speed(Constant.WARRIOR_3_ATTACK_SPEED);
			setAnimation(Assets.shared().warrior3_Animation_Up, 0);
			setAnimation(Assets.shared().warrior3_Animation_Down, 1);
			setAnimation(Assets.shared().warrior3_Animation_Left, 2);
			setAnimation(Assets.shared().warrior3_Animation_Right, 3);
			break;
		case 4:
			setName(Constant.WARRIOR_4_NAME);
			setDescription(Constant.WARRIOR_4_DESCRIPTION);
			setHp(Constant.WARRIOR_4_HP);
			setTotalHp(Constant.WARRIOR_4_HP);
			setSpeed(Constant.WARRIOR_4_SPEED);
			setDamage(Constant.WARRIOR_4_DAMAGE);
			setArmor(Constant.WARRIOR_4_ARMOR);
			setRange(Constant.WARRIOR_4_RANGE);
			setSkill(Constant.WARRIOR_4_SKILL);
			setAttack_speed(Constant.WARRIOR_4_ATTACK_SPEED);
			setAnimation(Assets.shared().warrior4_Animation_Up, 0);
			setAnimation(Assets.shared().warrior4_Animation_Down, 1);
			setAnimation(Assets.shared().warrior4_Animation_Left, 2);
			setAnimation(Assets.shared().warrior4_Animation_Right, 3);
			break;
		case 5:
			setName(Constant.WARRIOR_5_NAME);
			setDescription(Constant.WARRIOR_5_DESCRIPTION);
			setHp(Constant.WARRIOR_5_HP);
			setTotalHp(Constant.WARRIOR_5_HP);
			setSpeed(Constant.WARRIOR_5_SPEED);
			setDamage(Constant.WARRIOR_5_DAMAGE);
			setArmor(Constant.WARRIOR_5_ARMOR);
			setRange(Constant.WARRIOR_5_RANGE);
			setSkill(Constant.WARRIOR_5_SKILL);
			setAttack_speed(Constant.WARRIOR_5_ATTACK_SPEED);
			setAnimation(Assets.shared().warrior5_Animation_Up, 0);
			setAnimation(Assets.shared().warrior5_Animation_Down, 1);
			setAnimation(Assets.shared().warrior5_Animation_Left, 2);
			setAnimation(Assets.shared().warrior5_Animation_Right, 3);
			break;
		case 6:
			setName(Constant.HERO_1_NAME);
			setDescription(Constant.HERO_1_DESCRIPTION);
			setHp(Constant.HERO_1_HP);
			setTotalHp(Constant.HERO_1_HP);
			setSpeed(Constant.HERO_1_SPEED);
			setDamage(Constant.HERO_1_DAMAGE);
			setArmor(Constant.HERO_1_ARMOR);
			setRange(Constant.HERO_1_RANGE);
			setSkill(Constant.HERO_1_SKILL);
			setAttack_speed(Constant.HERO_1_ATTACK_SPEED);
			setAnimation(Assets.shared().hero1_Animation_Up, 0);
			setAnimation(Assets.shared().hero1_Animation_Down, 1);
			setAnimation(Assets.shared().hero1_Animation_Left, 2);
			setAnimation(Assets.shared().hero1_Animation_Right, 3);
			break;
		case 7:
			setName(Constant.HERO_2_NAME);
			setDescription(Constant.HERO_2_DESCRIPTION);
			setHp(Constant.HERO_2_HP);
			setTotalHp(Constant.HERO_2_HP);
			setSpeed(Constant.HERO_2_SPEED);
			setDamage(Constant.HERO_2_DAMAGE);
			setArmor(Constant.HERO_2_ARMOR);
			setRange(Constant.HERO_2_RANGE);
			setSkill(Constant.HERO_2_SKILL);
			setAttack_speed(Constant.HERO_2_ATTACK_SPEED);
			setAnimation(Assets.shared().hero2_Animation_Up, 0);
			setAnimation(Assets.shared().hero2_Animation_Down, 1);
			setAnimation(Assets.shared().hero2_Animation_Left, 2);
			setAnimation(Assets.shared().hero2_Animation_Right, 3);
			break;
		case 8:
			setName(Constant.HERO_3_NAME);
			setDescription(Constant.HERO_3_DESCRIPTION);
			setHp(Constant.HERO_3_HP);
			setTotalHp(Constant.HERO_3_HP);
			setSpeed(Constant.HERO_3_SPEED);
			setDamage(Constant.HERO_3_DAMAGE);
			setArmor(Constant.HERO_3_ARMOR);
			setRange(Constant.HERO_3_RANGE);
			setSkill(Constant.HERO_3_SKILL);
			setAttack_speed(Constant.HERO_3_ATTACK_SPEED);
			setAnimation(Assets.shared().hero3_Animation_Up, 0);
			setAnimation(Assets.shared().hero3_Animation_Down, 1);
			setAnimation(Assets.shared().hero3_Animation_Left, 2);
			setAnimation(Assets.shared().hero3_Animation_Right, 3);
			break;
		case 9:
			setName(Constant.HERO_4_NAME);
			setDescription(Constant.HERO_4_DESCRIPTION);
			setHp(Constant.HERO_4_HP);
			setTotalHp(Constant.HERO_4_HP);
			setSpeed(Constant.HERO_4_SPEED);
			setDamage(Constant.HERO_4_DAMAGE);
			setArmor(Constant.HERO_4_ARMOR);
			setRange(Constant.HERO_4_RANGE);
			setSkill(Constant.HERO_4_SKILL);
			setAttack_speed(Constant.HERO_4_ATTACK_SPEED);
			setAnimation(Assets.shared().hero4_Animation_Up, 0);
			setAnimation(Assets.shared().hero4_Animation_Down, 1);
			setAnimation(Assets.shared().hero4_Animation_Left, 2);
			setAnimation(Assets.shared().hero4_Animation_Right, 3);
			break;
		case 10:
			setName(Constant.HERO_5_NAME);
			setDescription(Constant.HERO_5_DESCRIPTION);
			setHp(Constant.HERO_5_HP);
			setTotalHp(Constant.HERO_5_HP);
			setSpeed(Constant.HERO_5_SPEED);
			setDamage(Constant.HERO_5_DAMAGE);
			setArmor(Constant.HERO_5_ARMOR);
			setRange(Constant.HERO_5_RANGE);
			setSkill(Constant.HERO_5_SKILL);
			setAttack_speed(Constant.HERO_5_ATTACK_SPEED);
			setAnimation(Assets.shared().hero5_Animation_Up, 0);
			setAnimation(Assets.shared().hero5_Animation_Down, 1);
			setAnimation(Assets.shared().hero5_Animation_Left, 2);
			setAnimation(Assets.shared().hero5_Animation_Right, 3);
			break;
		}

		setBounder(new Rectangle(getPosition().x, getPosition().y,
				getAnimation()[0].keyFrames[0].getRegionWidth() - 10,
				getAnimation()[0].keyFrames[0].getRegionHeight() - 10));
		setMove_state(MOVE_STATE.RIGHT);
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub
		if (getState() == STATE.ACTIVE)
			move(delta);
	}

	public void move(float delta) {
		switch (getMove_state()) {
		case UP:
			setPosition(getPosition().x, getPosition().y + getSpeed() * delta);
			break;
		case DOWN:
			setPosition(getPosition().x, getPosition().y - getSpeed() * delta);
			break;
		case LEFT:
			setPosition(getPosition().x - getSpeed() * delta, getPosition().y);
			break;
		case RIGHT:
			setPosition(getPosition().x + getSpeed() * delta, getPosition().y);
			break;
		default:
			break;
		}
		setBounder(getPosition());
	}

	@Override
	public void attack(BaseUnit unit, float delta) {
		// TODO Auto-generated method stub
		time_to_attack += delta;
		if (time_to_attack >= getAttack_speed()) {
			int damage = getDamage() - unit.getArmor();
			unit.setHp(unit.getHp() - damage);
			time_to_attack = 0;
		}

		if (unit.getHp() <= 0) {
			unit.setState(STATE.DEAD);
			if (getState() != STATE.DEAD) {
				setState(STATE.ACTIVE);
			}
		}
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
	}

}
