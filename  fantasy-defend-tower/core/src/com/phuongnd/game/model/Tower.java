package com.phuongnd.game.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.controller.Animation;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;

public class Tower extends BaseUnit {

	private float time_to_attack = 0;

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
			setName(Constant.TOWER_1_NAME);
			setDescription(Constant.TOWER_1_DESCRIPTION);
			setSpeed(Constant.TOWER_1_SPEED);
			setDamage(Constant.TOWER_1_DAMAGE);
			setRange(Constant.TOWER_1_RANGE);
			setSkill(Constant.TOWER_1_SKILL);
			setAttack_speed(Constant.TOWER_1_ATTACK_SPEED);
			setAnimation(Assets.shared().tower1_Animation_Up, 0);
			setAnimation(Assets.shared().tower1_Animation_Down, 1);
			setAnimation(Assets.shared().tower1_Animation_Left, 2);
			setAnimation(Assets.shared().tower1_Animation_Right, 3);
			break;
		case 2:
			setName(Constant.TOWER_2_NAME);
			setDescription(Constant.TOWER_2_DESCRIPTION);
			setSpeed(Constant.TOWER_2_SPEED);
			setDamage(Constant.TOWER_2_DAMAGE);
			setRange(Constant.TOWER_2_RANGE);
			setSkill(Constant.TOWER_2_SKILL);
			setAttack_speed(Constant.TOWER_2_ATTACK_SPEED);
			setAnimation(Assets.shared().tower1_Animation_Up, 0);
			setAnimation(Assets.shared().tower1_Animation_Down, 1);
			setAnimation(Assets.shared().tower1_Animation_Left, 2);
			setAnimation(Assets.shared().tower1_Animation_Right, 3);
			break;
		case 3:
			setName(Constant.TOWER_3_NAME);
			setDescription(Constant.TOWER_3_DESCRIPTION);
			setSpeed(Constant.TOWER_3_SPEED);
			setDamage(Constant.TOWER_3_DAMAGE);
			setRange(Constant.TOWER_3_RANGE);
			setSkill(Constant.TOWER_3_SKILL);
			setAttack_speed(Constant.TOWER_3_ATTACK_SPEED);
			setAnimation(Assets.shared().tower1_Animation_Up, 0);
			setAnimation(Assets.shared().tower1_Animation_Down, 1);
			setAnimation(Assets.shared().tower1_Animation_Left, 2);
			setAnimation(Assets.shared().tower1_Animation_Right, 3);
			break;
		case 4:
			setName(Constant.TOWER_4_NAME);
			setDescription(Constant.TOWER_4_DESCRIPTION);
			setSpeed(Constant.TOWER_4_SPEED);
			setDamage(Constant.TOWER_4_DAMAGE);
			setRange(Constant.TOWER_4_RANGE);
			setSkill(Constant.TOWER_4_SKILL);
			setAttack_speed(Constant.TOWER_4_ATTACK_SPEED);
			setAnimation(Assets.shared().tower1_Animation_Up, 0);
			setAnimation(Assets.shared().tower1_Animation_Down, 1);
			setAnimation(Assets.shared().tower1_Animation_Left, 2);
			setAnimation(Assets.shared().tower1_Animation_Right, 3);
			break;
		case 5:
			setName(Constant.TOWER_5_NAME);
			setDescription(Constant.TOWER_5_DESCRIPTION);
			setSpeed(Constant.TOWER_5_SPEED);
			setDamage(Constant.TOWER_5_DAMAGE);
			setRange(Constant.TOWER_5_RANGE);
			setSkill(Constant.TOWER_5_SKILL);
			setAttack_speed(Constant.TOWER_5_ATTACK_SPEED);
			setAnimation(Assets.shared().tower1_Animation_Up, 0);
			setAnimation(Assets.shared().tower1_Animation_Down, 1);
			setAnimation(Assets.shared().tower1_Animation_Left, 2);
			setAnimation(Assets.shared().tower1_Animation_Right, 3);
			break;
		case 6:
			setName(Constant.TOWER_6_NAME);
			setDescription(Constant.TOWER_6_DESCRIPTION);
			setSpeed(Constant.TOWER_6_SPEED);
			setDamage(Constant.TOWER_6_DAMAGE);
			setRange(Constant.TOWER_6_RANGE);
			setSkill(Constant.TOWER_6_SKILL);
			setAttack_speed(Constant.TOWER_6_ATTACK_SPEED);
			setAnimation(Assets.shared().tower1_Animation_Up, 0);
			setAnimation(Assets.shared().tower1_Animation_Down, 1);
			setAnimation(Assets.shared().tower1_Animation_Left, 2);
			setAnimation(Assets.shared().tower1_Animation_Right, 3);
			break;
		case 7:
			setName(Constant.TOWER_7_NAME);
			setDescription(Constant.TOWER_7_DESCRIPTION);
			setSpeed(Constant.TOWER_7_SPEED);
			setDamage(Constant.TOWER_7_DAMAGE);
			setRange(Constant.TOWER_7_RANGE);
			setSkill(Constant.TOWER_7_SKILL);
			setAttack_speed(Constant.TOWER_7_ATTACK_SPEED);
			setAnimation(Assets.shared().tower1_Animation_Up, 0);
			setAnimation(Assets.shared().tower1_Animation_Down, 1);
			setAnimation(Assets.shared().tower1_Animation_Left, 2);
			setAnimation(Assets.shared().tower1_Animation_Right, 3);
			break;
		case 8:
			setName(Constant.TOWER_8_NAME);
			setDescription(Constant.TOWER_8_DESCRIPTION);
			setSpeed(Constant.TOWER_8_SPEED);
			setDamage(Constant.TOWER_8_DAMAGE);
			setRange(Constant.TOWER_8_RANGE);
			setSkill(Constant.TOWER_8_SKILL);
			setAttack_speed(Constant.TOWER_8_ATTACK_SPEED);
			setAnimation(Assets.shared().tower1_Animation_Up, 0);
			setAnimation(Assets.shared().tower1_Animation_Down, 1);
			setAnimation(Assets.shared().tower1_Animation_Left, 2);
			setAnimation(Assets.shared().tower1_Animation_Right, 3);
			break;
		case 9:
			setName(Constant.TOWER_9_NAME);
			setDescription(Constant.TOWER_9_DESCRIPTION);
			setSpeed(Constant.TOWER_9_SPEED);
			setDamage(Constant.TOWER_9_DAMAGE);
			setRange(Constant.TOWER_9_RANGE);
			setSkill(Constant.TOWER_9_SKILL);
			setAttack_speed(Constant.TOWER_9_ATTACK_SPEED);
			setAnimation(Assets.shared().tower1_Animation_Up, 0);
			setAnimation(Assets.shared().tower1_Animation_Down, 1);
			setAnimation(Assets.shared().tower1_Animation_Left, 2);
			setAnimation(Assets.shared().tower1_Animation_Right, 3);
			break;
		case 10:
			setName(Constant.TOWER_10_NAME);
			setDescription(Constant.TOWER_10_DESCRIPTION);
			setSpeed(Constant.TOWER_10_SPEED);
			setDamage(Constant.TOWER_10_DAMAGE);
			setRange(Constant.TOWER_10_RANGE);
			setSkill(Constant.TOWER_10_SKILL);
			setAttack_speed(Constant.TOWER_10_ATTACK_SPEED);
			setAnimation(Assets.shared().tower1_Animation_Up, 0);
			setAnimation(Assets.shared().tower1_Animation_Down, 1);
			setAnimation(Assets.shared().tower1_Animation_Left, 2);
			setAnimation(Assets.shared().tower1_Animation_Right, 3);
			break;
		}

		setBounder(new Rectangle(getPosition().x, getPosition().y,
				getAnimation()[0].keyFrames[0].getRegionWidth() - 10,
				getAnimation()[0].keyFrames[0].getRegionHeight() - 10));
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub

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

		if (unit.getHp() <= 0)
			unit.setState(STATE.DEAD);
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
