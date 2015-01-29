package com.phuongnd.game.model;

import java.util.ArrayList;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.controller.Animation;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.Ulti;
import com.phuongnd.game.controller.World;

public class Enemy extends BaseUnit {

	private int life_cost;
	private int coin;
	private float distance;
	private float time_to_attack;
	private float time_to_teleport;
	private float time_to_hex;
	private float time_to_vampire;
	private float time_to_heath;
	private float time_to_speedup;
	private float time_speedup;

	private int originalDamage;
	private int originalSpeed;
	private int originalHP;
	private int path = 1;
	private int index = 0;
	private float time_extra = 0;
	private ArrayList<Piece> paths;
	private Vector2 destination;

	private Skill skills;

	private boolean isVampire;
	private boolean isStop;
	private boolean isSpeedUp;
	private boolean isHex;
	private boolean isTeleport;

	@Override
	public void init(int id, Vector2 position, int numAnimation) {
		// TODO Auto-generated method stub

	}

	public void init(int id, Vector2 position, int numAnimation, int start,
			int path) {
		// TODO Auto-generated method stub
		setId(id);
		setPosition(position);
		setNUM_ANIMATION(numAnimation);
		setAnimation(new Animation[numAnimation]);
		setState(STATE.ACTIVE);
		paths = new ArrayList<Piece>();
		destination = new Vector2();
		index = start;
		this.path = path;

		switch (getId()) {
		case 1:
			setName(Constant.ENEMY_1_NAME);
			setDescription(Constant.ENEMY_1_DESCRIPTION);
			setHp(Constant.ENEMY_1_HP);
			setTotalHp(Constant.ENEMY_1_HP);
			setSpeed(Constant.ENEMY_1_SPEED);
			setDamage(Constant.ENEMY_1_DAMAGE);
			setArmor(Constant.ENEMY_1_ARMOR);
			setRange(Constant.ENEMY_1_RANGE);
			setSkill(Constant.ENEMY_1_SKILL);
			setAttack_speed(Constant.ENEMY_1_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_1_LIFE_COST);
			setCoin(Constant.ENEMY_1_COIN);
			break;
		case 2:
			setName(Constant.ENEMY_2_NAME);
			setDescription(Constant.ENEMY_2_DESCRIPTION);
			setHp(Constant.ENEMY_2_HP);
			setTotalHp(Constant.ENEMY_2_HP);
			setSpeed(Constant.ENEMY_2_SPEED);
			setDamage(Constant.ENEMY_2_DAMAGE);
			setArmor(Constant.ENEMY_2_ARMOR);
			setRange(Constant.ENEMY_2_RANGE);
			setSkill(Constant.ENEMY_2_SKILL);
			setAttack_speed(Constant.ENEMY_2_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_2_LIFE_COST);
			setCoin(Constant.ENEMY_2_COIN);
			break;
		case 3:
			setName(Constant.ENEMY_3_NAME);
			setDescription(Constant.ENEMY_3_DESCRIPTION);
			setHp(Constant.ENEMY_3_HP);
			setTotalHp(Constant.ENEMY_3_HP);
			setSpeed(Constant.ENEMY_3_SPEED);
			setDamage(Constant.ENEMY_3_DAMAGE);
			setArmor(Constant.ENEMY_3_ARMOR);
			setRange(Constant.ENEMY_3_RANGE);
			setSkill(Constant.ENEMY_3_SKILL);
			setAttack_speed(Constant.ENEMY_3_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_3_LIFE_COST);
			setCoin(Constant.ENEMY_3_COIN);
			break;
		case 4:
			setName(Constant.ENEMY_4_NAME);
			setDescription(Constant.ENEMY_4_DESCRIPTION);
			setHp(Constant.ENEMY_4_HP);
			setTotalHp(Constant.ENEMY_4_HP);
			setSpeed(Constant.ENEMY_4_SPEED);
			setDamage(Constant.ENEMY_4_DAMAGE);
			setArmor(Constant.ENEMY_4_ARMOR);
			setRange(Constant.ENEMY_4_RANGE);
			setSkill(Constant.ENEMY_4_SKILL);
			setAttack_speed(Constant.ENEMY_4_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_4_LIFE_COST);
			setCoin(Constant.ENEMY_4_COIN);
			break;
		case 5:
			setName(Constant.ENEMY_5_NAME);
			setDescription(Constant.ENEMY_5_DESCRIPTION);
			setHp(Constant.ENEMY_5_HP);
			setTotalHp(Constant.ENEMY_5_HP);
			setSpeed(Constant.ENEMY_5_SPEED);
			setDamage(Constant.ENEMY_5_DAMAGE);
			setArmor(Constant.ENEMY_5_ARMOR);
			setRange(Constant.ENEMY_5_RANGE);
			setSkill(Constant.ENEMY_5_SKILL);
			setAttack_speed(Constant.ENEMY_5_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_5_LIFE_COST);
			setCoin(Constant.ENEMY_5_COIN);
			break;
		case 6:
			setName(Constant.ENEMY_6_NAME);
			setDescription(Constant.ENEMY_6_DESCRIPTION);
			setHp(Constant.ENEMY_6_HP);
			setTotalHp(Constant.ENEMY_6_HP);
			setSpeed(Constant.ENEMY_6_SPEED);
			setDamage(Constant.ENEMY_6_DAMAGE);
			setArmor(Constant.ENEMY_6_ARMOR);
			setRange(Constant.ENEMY_6_RANGE);
			setSkill(Constant.ENEMY_6_SKILL);
			setAttack_speed(Constant.ENEMY_6_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_6_LIFE_COST);
			setCoin(Constant.ENEMY_6_COIN);
			break;
		case 7:
			setName(Constant.ENEMY_7_NAME);
			setDescription(Constant.ENEMY_7_DESCRIPTION);
			setHp(Constant.ENEMY_7_HP);
			setTotalHp(Constant.ENEMY_7_HP);
			setSpeed(Constant.ENEMY_7_SPEED);
			setDamage(Constant.ENEMY_7_DAMAGE);
			setArmor(Constant.ENEMY_7_ARMOR);
			setRange(Constant.ENEMY_7_RANGE);
			setSkill(Constant.ENEMY_7_SKILL);
			setAttack_speed(Constant.ENEMY_7_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_7_LIFE_COST);
			setCoin(Constant.ENEMY_7_COIN);
			break;
		case 8:
			setName(Constant.ENEMY_8_NAME);
			setDescription(Constant.ENEMY_8_DESCRIPTION);
			setHp(Constant.ENEMY_8_HP);
			setTotalHp(Constant.ENEMY_8_HP);
			setSpeed(Constant.ENEMY_8_SPEED);
			setDamage(Constant.ENEMY_8_DAMAGE);
			setArmor(Constant.ENEMY_8_ARMOR);
			setRange(Constant.ENEMY_8_RANGE);
			setSkill(Constant.ENEMY_8_SKILL);
			setAttack_speed(Constant.ENEMY_8_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_8_LIFE_COST);
			setCoin(Constant.ENEMY_8_COIN);
			break;
		case 9:
			setName(Constant.ENEMY_9_NAME);
			setDescription(Constant.ENEMY_9_DESCRIPTION);
			setHp(Constant.ENEMY_9_HP);
			setTotalHp(Constant.ENEMY_9_HP);
			setSpeed(Constant.ENEMY_9_SPEED);
			setDamage(Constant.ENEMY_9_DAMAGE);
			setArmor(Constant.ENEMY_9_ARMOR);
			setRange(Constant.ENEMY_9_RANGE);
			setSkill(Constant.ENEMY_9_SKILL);
			setAttack_speed(Constant.ENEMY_9_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_9_LIFE_COST);
			setCoin(Constant.ENEMY_9_COIN);
			break;
		case 10:
			setName(Constant.ENEMY_10_NAME);
			setDescription(Constant.ENEMY_10_DESCRIPTION);
			setHp(Constant.ENEMY_10_HP);
			setTotalHp(Constant.ENEMY_10_HP);
			setSpeed(Constant.ENEMY_10_SPEED);
			setDamage(Constant.ENEMY_10_DAMAGE);
			setArmor(Constant.ENEMY_10_ARMOR);
			setRange(Constant.ENEMY_10_RANGE);
			setSkill(Constant.ENEMY_10_SKILL);
			setAttack_speed(Constant.ENEMY_10_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_10_LIFE_COST);
			setCoin(Constant.ENEMY_10_COIN);
			break;
		case 11:
			setName(Constant.ENEMY_11_NAME);
			setDescription(Constant.ENEMY_11_DESCRIPTION);
			setHp(Constant.ENEMY_11_HP);
			setTotalHp(Constant.ENEMY_11_HP);
			setSpeed(Constant.ENEMY_11_SPEED);
			setDamage(Constant.ENEMY_11_DAMAGE);
			setArmor(Constant.ENEMY_11_ARMOR);
			setRange(Constant.ENEMY_11_RANGE);
			setSkill(Constant.ENEMY_11_SKILL);
			setAttack_speed(Constant.ENEMY_11_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_11_LIFE_COST);
			setCoin(Constant.ENEMY_11_COIN);
			break;
		case 12:
			setName(Constant.ENEMY_12_NAME);
			setDescription(Constant.ENEMY_12_DESCRIPTION);
			setHp(Constant.ENEMY_12_HP);
			setTotalHp(Constant.ENEMY_12_HP);
			setSpeed(Constant.ENEMY_12_SPEED);
			setDamage(Constant.ENEMY_12_DAMAGE);
			setArmor(Constant.ENEMY_12_ARMOR);
			setRange(Constant.ENEMY_12_RANGE);
			setSkill(Constant.ENEMY_12_SKILL);
			setAttack_speed(Constant.ENEMY_12_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_12_LIFE_COST);
			setCoin(Constant.ENEMY_12_COIN);
			break;
		case 13:
			setName(Constant.ENEMY_13_NAME);
			setDescription(Constant.ENEMY_13_DESCRIPTION);
			setHp(Constant.ENEMY_13_HP);
			setTotalHp(Constant.ENEMY_13_HP);
			setSpeed(Constant.ENEMY_13_SPEED);
			setDamage(Constant.ENEMY_13_DAMAGE);
			setArmor(Constant.ENEMY_13_ARMOR);
			setRange(Constant.ENEMY_13_RANGE);
			setSkill(Constant.ENEMY_13_SKILL);
			setAttack_speed(Constant.ENEMY_13_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_13_LIFE_COST);
			setCoin(Constant.ENEMY_13_COIN);
			break;
		case 14:
			setName(Constant.ENEMY_14_NAME);
			setDescription(Constant.ENEMY_14_DESCRIPTION);
			setHp(Constant.ENEMY_14_HP);
			setTotalHp(Constant.ENEMY_14_HP);
			setSpeed(Constant.ENEMY_14_SPEED);
			setDamage(Constant.ENEMY_14_DAMAGE);
			setArmor(Constant.ENEMY_14_ARMOR);
			setRange(Constant.ENEMY_14_RANGE);
			setSkill(Constant.ENEMY_14_SKILL);
			setAttack_speed(Constant.ENEMY_14_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_14_LIFE_COST);
			setCoin(Constant.ENEMY_14_COIN);
			break;
		case 15:
			setName(Constant.ENEMY_15_NAME);
			setDescription(Constant.ENEMY_15_DESCRIPTION);
			setHp(Constant.ENEMY_15_HP);
			setTotalHp(Constant.ENEMY_15_HP);
			setSpeed(Constant.ENEMY_15_SPEED);
			setDamage(Constant.ENEMY_15_DAMAGE);
			setArmor(Constant.ENEMY_15_ARMOR);
			setRange(Constant.ENEMY_15_RANGE);
			setSkill(Constant.ENEMY_15_SKILL);
			setAttack_speed(Constant.ENEMY_15_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_15_LIFE_COST);
			setCoin(Constant.ENEMY_15_COIN);
			break;
		case 16:
			setName(Constant.ENEMY_16_NAME);
			setDescription(Constant.ENEMY_16_DESCRIPTION);
			setHp(Constant.ENEMY_16_HP);
			setTotalHp(Constant.ENEMY_16_HP);
			setSpeed(Constant.ENEMY_16_SPEED);
			setDamage(Constant.ENEMY_16_DAMAGE);
			setArmor(Constant.ENEMY_16_ARMOR);
			setRange(Constant.ENEMY_16_RANGE);
			setSkill(Constant.ENEMY_16_SKILL);
			setAttack_speed(Constant.ENEMY_16_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_16_LIFE_COST);
			setCoin(Constant.ENEMY_16_COIN);
			break;
		case 17:
			setName(Constant.ENEMY_17_NAME);
			setDescription(Constant.ENEMY_17_DESCRIPTION);
			setHp(Constant.ENEMY_17_HP);
			setTotalHp(Constant.ENEMY_17_HP);
			setSpeed(Constant.ENEMY_17_SPEED);
			setDamage(Constant.ENEMY_17_DAMAGE);
			setArmor(Constant.ENEMY_17_ARMOR);
			setRange(Constant.ENEMY_17_RANGE);
			setSkill(Constant.ENEMY_17_SKILL);
			setAttack_speed(Constant.ENEMY_17_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_17_LIFE_COST);
			setCoin(Constant.ENEMY_17_COIN);
			break;
		case 18:
			setName(Constant.ENEMY_18_NAME);
			setDescription(Constant.ENEMY_18_DESCRIPTION);
			setHp(Constant.ENEMY_18_HP);
			setTotalHp(Constant.ENEMY_18_HP);
			setSpeed(Constant.ENEMY_18_SPEED);
			setDamage(Constant.ENEMY_18_DAMAGE);
			setArmor(Constant.ENEMY_18_ARMOR);
			setRange(Constant.ENEMY_18_RANGE);
			setSkill(Constant.ENEMY_18_SKILL);
			setAttack_speed(Constant.ENEMY_18_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_18_LIFE_COST);
			setCoin(Constant.ENEMY_18_COIN);
			break;
		case 19:
			setName(Constant.ENEMY_19_NAME);
			setDescription(Constant.ENEMY_19_DESCRIPTION);
			setHp(Constant.ENEMY_19_HP);
			setTotalHp(Constant.ENEMY_19_HP);
			setSpeed(Constant.ENEMY_19_SPEED);
			setDamage(Constant.ENEMY_19_DAMAGE);
			setArmor(Constant.ENEMY_19_ARMOR);
			setRange(Constant.ENEMY_19_RANGE);
			setSkill(Constant.ENEMY_19_SKILL);
			setAttack_speed(Constant.ENEMY_19_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_19_LIFE_COST);
			setCoin(Constant.ENEMY_19_COIN);
			break;
		case 20:
			setName(Constant.ENEMY_20_NAME);
			setDescription(Constant.ENEMY_20_DESCRIPTION);
			setHp(Constant.ENEMY_20_HP);
			setTotalHp(Constant.ENEMY_20_HP);
			setSpeed(Constant.ENEMY_20_SPEED);
			setDamage(Constant.ENEMY_20_DAMAGE);
			setArmor(Constant.ENEMY_20_ARMOR);
			setRange(Constant.ENEMY_20_RANGE);
			setSkill(Constant.ENEMY_20_SKILL);
			setAttack_speed(Constant.ENEMY_20_ATTACK_SPEED);
			setLife_cost(Constant.ENEMY_20_LIFE_COST);
			setCoin(Constant.ENEMY_20_COIN);
			break;

		default:
			break;
		}

		initAnimation(false);
		originalDamage = getDamage();
		originalSpeed = getSpeed();
		originalHP = getHp();

		setBounder(new Rectangle(getPosition().x, getPosition().y,
				getAnimation()[0].keyFrames[0].getRegionWidth() - 10,
				getAnimation()[0].keyFrames[0].getRegionHeight() - 10));
		setMove_state(MOVE_STATE.RIGHT);
	}

	public void initAnimation(boolean isVampire) {
		if (!isVampire) {
			switch (getId()) {
			case 1:
				setAnimation(Assets.shared().enemy1_Animation_Up, 0);
				setAnimation(Assets.shared().enemy1_Animation_Down, 1);
				setAnimation(Assets.shared().enemy1_Animation_Left, 2);
				setAnimation(Assets.shared().enemy1_Animation_Right, 3);
				break;
			case 2:
				setAnimation(Assets.shared().enemy2_Animation_Up, 0);
				setAnimation(Assets.shared().enemy2_Animation_Down, 1);
				setAnimation(Assets.shared().enemy2_Animation_Left, 2);
				setAnimation(Assets.shared().enemy2_Animation_Right, 3);
				break;
			case 3:
				setAnimation(Assets.shared().enemy3_Animation_Up, 0);
				setAnimation(Assets.shared().enemy3_Animation_Down, 1);
				setAnimation(Assets.shared().enemy3_Animation_Left, 2);
				setAnimation(Assets.shared().enemy3_Animation_Right, 3);
				break;
			case 4:
				setAnimation(Assets.shared().enemy4_Animation_Up, 0);
				setAnimation(Assets.shared().enemy4_Animation_Down, 1);
				setAnimation(Assets.shared().enemy4_Animation_Left, 2);
				setAnimation(Assets.shared().enemy4_Animation_Right, 3);
				break;
			case 5:
				setAnimation(Assets.shared().enemy5_Animation_Up, 0);
				setAnimation(Assets.shared().enemy5_Animation_Down, 1);
				setAnimation(Assets.shared().enemy5_Animation_Left, 2);
				setAnimation(Assets.shared().enemy5_Animation_Right, 3);
				break;
			case 6:
				setAnimation(Assets.shared().enemy6_Animation_Up, 0);
				setAnimation(Assets.shared().enemy6_Animation_Down, 1);
				setAnimation(Assets.shared().enemy6_Animation_Left, 2);
				setAnimation(Assets.shared().enemy6_Animation_Right, 3);
				break;
			case 7:
				setAnimation(Assets.shared().enemy7_Animation_Up, 0);
				setAnimation(Assets.shared().enemy7_Animation_Down, 1);
				setAnimation(Assets.shared().enemy7_Animation_Left, 2);
				setAnimation(Assets.shared().enemy7_Animation_Right, 3);
				break;
			case 8:
				setAnimation(Assets.shared().enemy8_Animation_Up, 0);
				setAnimation(Assets.shared().enemy8_Animation_Down, 1);
				setAnimation(Assets.shared().enemy8_Animation_Left, 2);
				setAnimation(Assets.shared().enemy8_Animation_Right, 3);
				break;
			case 9:
				setAnimation(Assets.shared().enemy9_Animation_Up, 0);
				setAnimation(Assets.shared().enemy9_Animation_Down, 1);
				setAnimation(Assets.shared().enemy9_Animation_Left, 2);
				setAnimation(Assets.shared().enemy9_Animation_Right, 3);
				break;
			case 10:
				setAnimation(Assets.shared().enemy10_Animation_Up, 0);
				setAnimation(Assets.shared().enemy10_Animation_Down, 1);
				setAnimation(Assets.shared().enemy10_Animation_Left, 2);
				setAnimation(Assets.shared().enemy10_Animation_Right, 3);
				break;
			case 11:
				setAnimation(Assets.shared().enemy11_Animation_Up, 0);
				setAnimation(Assets.shared().enemy11_Animation_Down, 1);
				setAnimation(Assets.shared().enemy11_Animation_Left, 2);
				setAnimation(Assets.shared().enemy11_Animation_Right, 3);
				break;
			case 12:
				setAnimation(Assets.shared().enemy12_Animation_Up, 0);
				setAnimation(Assets.shared().enemy12_Animation_Down, 1);
				setAnimation(Assets.shared().enemy12_Animation_Left, 2);
				setAnimation(Assets.shared().enemy12_Animation_Right, 3);
				break;
			case 13:
				setAnimation(Assets.shared().enemy13_Animation_Up, 0);
				setAnimation(Assets.shared().enemy13_Animation_Down, 1);
				setAnimation(Assets.shared().enemy13_Animation_Left, 2);
				setAnimation(Assets.shared().enemy13_Animation_Right, 3);
				break;
			case 14:
				setAnimation(Assets.shared().enemy14_Animation_Up, 0);
				setAnimation(Assets.shared().enemy14_Animation_Down, 1);
				setAnimation(Assets.shared().enemy14_Animation_Left, 2);
				setAnimation(Assets.shared().enemy14_Animation_Right, 3);
				break;
			case 15:
				setAnimation(Assets.shared().enemy15_Animation_Up, 0);
				setAnimation(Assets.shared().enemy15_Animation_Down, 1);
				setAnimation(Assets.shared().enemy15_Animation_Left, 2);
				setAnimation(Assets.shared().enemy15_Animation_Right, 3);
				break;
			case 16:
				setAnimation(Assets.shared().enemy16_Animation_Up, 0);
				setAnimation(Assets.shared().enemy16_Animation_Down, 1);
				setAnimation(Assets.shared().enemy16_Animation_Left, 2);
				setAnimation(Assets.shared().enemy16_Animation_Right, 3);
				break;
			case 17:
				setAnimation(Assets.shared().enemy17_Animation_Up, 0);
				setAnimation(Assets.shared().enemy17_Animation_Down, 1);
				setAnimation(Assets.shared().enemy17_Animation_Left, 2);
				setAnimation(Assets.shared().enemy17_Animation_Right, 3);
				break;
			case 18:
				setAnimation(Assets.shared().enemy18_Animation_Up, 0);
				setAnimation(Assets.shared().enemy18_Animation_Down, 1);
				setAnimation(Assets.shared().enemy18_Animation_Left, 2);
				setAnimation(Assets.shared().enemy18_Animation_Right, 3);
				break;
			case 19:
				setAnimation(Assets.shared().enemy19_Animation_Up, 0);
				setAnimation(Assets.shared().enemy19_Animation_Down, 1);
				setAnimation(Assets.shared().enemy19_Animation_Left, 2);
				setAnimation(Assets.shared().enemy19_Animation_Right, 3);
				break;
			case 20:
				setAnimation(Assets.shared().enemy20_Animation_Up, 0);
				setAnimation(Assets.shared().enemy20_Animation_Down, 1);
				setAnimation(Assets.shared().enemy20_Animation_Left, 2);
				setAnimation(Assets.shared().enemy20_Animation_Right, 3);
				break;

			default:
				break;
			}
		} else {
			switch (getId()) {
			case 1:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 2:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 3:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 4:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 5:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 6:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 7:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 8:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 9:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 10:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 11:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 12:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 13:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 14:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 15:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 16:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 17:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 18:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 19:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 20:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;

			default:
				break;
			}
		}
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub

	}

	public void update(World world, float delta) {
		// TODO Auto-generated method stub
		time_to_attack += delta;
		if (getState() == STATE.ACTIVE) {
			move(world, delta);
		}
		activateSkill(world, delta);
		checkSkillAffect(world, delta);

		if (!checkCollision(world, delta)) {
			if (getState() != STATE.DEAD) {
				setState(STATE.ACTIVE);
			}
		}
	}

	@Override
	public void attack(BaseUnit unit) {
		if (time_to_attack >= getAttack_speed()) {
			int damage = getDamage() - unit.getArmor();
			if (damage > 0)
				unit.setHp(unit.getHp() - damage);
			time_to_attack = 0;
		}

		if (unit.getHp() <= 0) {
			unit.setHp(0);
			unit.setState(STATE.DEAD);
		}
	}

	public void attack(BaseUnit unit, World world) {
		if (time_to_attack >= getAttack_speed()) {
			if (getDamage() > 0) {
				world.addNewBullet(2, new Vector2(getPosition().x + getWidth2()
						/ 2, getPosition().y + getHeight2() / 2), 4, unit);
			}
			time_to_attack = 0;
		}
	}

	public boolean checkCollision(World world, float delta) {
		boolean kq = false;

		// Check collision with tower
		for (int i = 0; i < world.activeTower.size; i++) {
			String result = world.checkOverlapRadar(getPosition(),
					world.activeTower.get(i).getPosition(), getRange()
							* Constant.MAP_UNIT_SIZE_WIDTH, world.activeTower
							.get(i).getRange() * Constant.MAP_UNIT_SIZE_WIDTH);
			if (result.contains("inside")) {
				if (result.equals("1 inside") || result.equals("all inside")) {
					// world.activeTower.get(i).attack(this, world, delta);
					world.activeTower.get(i).produceWarrior(world, delta);
				}
			}
		}

		if (isVampire) {
			// attack enemy
			if (getRange() > 0) {
				for (int i = 0; i < world.activeEnemy.size; i++) {
					if (!world.activeEnemy.get(i).equals(this)) {
						String result = world.checkOverlapRadar(getPosition(),
								world.activeEnemy.get(i).getPosition(),
								getRange() * Constant.MAP_UNIT_SIZE_WIDTH,
								world.activeEnemy.get(i).getRange()
										* Constant.MAP_UNIT_SIZE_WIDTH);
						if (result.contains("inside")) {
							if (result.equals("2 inside")) {
								if (getState() != STATE.DEAD) {
									setState(STATE.IDLE);
									attack(world.activeEnemy.get(i), world);
								}
							} else if (result.equals("1 inside")) {
								if (world.activeEnemy.get(i).getState() != STATE.DEAD) {
									world.activeEnemy.get(i).setState(
											STATE.IDLE);
									world.activeEnemy.get(i)
											.attack(this, world);
								}
							} else {
								if (getState() != STATE.DEAD) {
									setState(STATE.IDLE);
									attack(world.activeEnemy.get(i), world);
								}
								if (world.activeEnemy.get(i).getState() != STATE.DEAD) {
									world.activeEnemy.get(i).setState(
											STATE.IDLE);
									world.activeEnemy.get(i)
											.attack(this, world);
								}
							}
							kq = true;
							// break;
						} else {

							// continue;
						}
						if (world.activeEnemy.get(i).getRange() == 0) {
							if (getBounder().overlaps(
									world.activeEnemy.get(i).getBounder())) {
								if (world.activeEnemy.get(i).getState() != STATE.DEAD) {
									world.activeEnemy.get(i).setState(
											STATE.IDLE);
									world.activeEnemy.get(i).attack(this);
								}
							}
						}
					}
				}
			} else {
				for (Enemy enemy : world.activeEnemy) {
					if (!enemy.equals(this)) {
						float dx = enemy.getPosition().x - getPosition().x;
						float dy = enemy.getPosition().y - getPosition().y;
						float distance = (float) Math.sqrt(Math.pow(dx, 2)
								+ Math.pow(dy, 2));
						if (distance <= enemy.getRange()
								* Constant.MAP_UNIT_SIZE_WIDTH) {
							if (enemy.getState() != STATE.DEAD) {
								enemy.setState(STATE.IDLE);
								enemy.attack(this, world);
							}
						}
						if (getBounder().overlaps(enemy.getBounder())) {
							if (getState() != STATE.DEAD) {
								setState(STATE.IDLE);
								attack(enemy);
							}
							if (enemy.getRange() == 0) {
								if (enemy.getState() != STATE.DEAD) {
									enemy.setState(STATE.IDLE);
									enemy.attack(this);
								}
							}
							kq = true;
							// break;
						} else {
							// continue;
						}
					}
				}
			}
		} else {
			// Check colision with warrior
			if (getRange() > 0) {
				for (int i = 0; i < world.activeWarrior.size; i++) {
					String result = world.checkOverlapRadar(getPosition(),
							world.activeWarrior.get(i).getPosition(),
							getRange() * Constant.MAP_UNIT_SIZE_WIDTH,
							world.activeWarrior.get(i).getRange()
									* Constant.MAP_UNIT_SIZE_WIDTH);
					if (result.contains("inside")) {
						if (result.equals("2 inside")) {
							if (getState() != STATE.DEAD) {
								setState(STATE.IDLE);
								attack(world.activeWarrior.get(i), world);
							}
						} else if (result.equals("1 inside")) {
							if (world.activeWarrior.get(i).getState() != STATE.DEAD) {
								world.activeWarrior.get(i).setState(STATE.IDLE);
								world.activeWarrior.get(i).attack(this, world);
							}
						} else {
							if (getState() != STATE.DEAD) {
								setState(STATE.IDLE);
								attack(world.activeWarrior.get(i), world);
							}
							if (world.activeWarrior.get(i).getState() != STATE.DEAD) {
								world.activeWarrior.get(i).setState(STATE.IDLE);
								world.activeWarrior.get(i).attack(this, world);
							}
						}
						kq = true;
						// break;
					} else {

						// continue;
					}
					if (world.activeWarrior.get(i).getRange() == 0) {
						if (getBounder().overlaps(
								world.activeWarrior.get(i).getBounder())) {
							if (world.activeWarrior.get(i).getState() != STATE.DEAD) {
								world.activeWarrior.get(i).setState(STATE.IDLE);
								world.activeWarrior.get(i).attack(this);
							}
						}
					}
				}
			} else {
				for (Warrior warrior : world.activeWarrior) {
					float dx = warrior.getPosition().x - getPosition().x;
					float dy = warrior.getPosition().y - getPosition().y;
					float distance = (float) Math.sqrt(Math.pow(dx, 2)
							+ Math.pow(dy, 2));
					if (distance <= warrior.getRange()
							* Constant.MAP_UNIT_SIZE_WIDTH) {
						if (warrior.getState() != STATE.DEAD) {
							warrior.setState(STATE.IDLE);
							warrior.attack(this, world);
						}
					}
					if (getBounder().overlaps(warrior.getBounder())) {
						if (getState() != STATE.DEAD) {
							setState(STATE.IDLE);
							attack(warrior);
						}
						if (warrior.getRange() == 0) {
							if (warrior.getState() != STATE.DEAD) {
								warrior.setState(STATE.IDLE);
								warrior.attack(this);
							}
						}
						kq = true;
						// break;
					} else {
						// continue;
					}
				}
			}
		}

		return kq;
	}

	public void move(World world, float delta) {
		// for (int i = 0; i < paths.size(); i++) {
		// System.out.println(paths.get(i).x + " - " + paths.get(i).y);
		// }
		// System.out.println("------------");
		if (!isVampire) {
			if (isStop)
				setSpeed(0);
			else {
				if (!isSpeedUp)
					setSpeed(originalSpeed);
				else {
					time_speedup += delta;
					setSpeed(originalSpeed * 2);
					if (time_speedup >= 3f) {
						isSpeedUp = false;
						time_speedup = 0;
					}
				}
			}
			if (index < paths.size() - 1) {
				destination = paths.get(index + 1).getPosition();
				if (!check(Ulti.convertPositionWorld(destination))) {
					moveTo();
				} else {
					index++;
				}
			} else {
				time_extra += delta;
				if (time_extra >= 5 * 10 / originalSpeed) {
					world.life -= getLife_cost();
					setState(STATE.DEAD);
				}
			}
		} else {
			if (index > 0) {
				destination = paths.get(index - 1).getPosition();
				if (!check(Ulti.convertPositionWorld(destination))) {
					moveTo();
				} else {
					index--;
				}
			} else {
				// time_extra += delta;
				// if (time_extra >= 5 * 10 / getSpeed())
				setSpeed(0);
			}
		}

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
		case UP_LEFT:
			setPosition(getPosition().x - getSpeed() * delta, getPosition().y
					+ getSpeed() * delta);
			break;
		case UP_RIGHT:
			setPosition(getPosition().x + getSpeed() * delta, getPosition().y
					+ getSpeed() * delta);
			break;
		case DOWN_LEFT:
			setPosition(getPosition().x - getSpeed() * delta, getPosition().y
					- getSpeed() * delta);
			break;
		case DOWN_RIGHT:
			setPosition(getPosition().x + getSpeed() * delta, getPosition().y
					- getSpeed() * delta);
			break;

		default:
			break;
		}
		setBounder(getPosition());
		setDistance(getDistance() + getSpeed() * delta);
	}

	public void activateSkill(World world, float delta) {
		time_to_heath += delta;
		time_to_speedup += delta;
		if (skills != null) {
			switch (skills.getId()) {
			// Health
			case Constant.SKILL_7_ID:
				if (!isVampire) {
					if (time_to_heath >= 4f) {
						if (time_to_heath <= 6f) {
							isStop = true;
						} else {
							for (Enemy enemy : world.activeEnemy) {
								if (!enemy.equals(this)
										&& enemy.getId() != this.getId()) {
									if (enemy.getState() != STATE.DEAD) {
										String result = world
												.checkOverlapRadar(
														this.getPosition(),
														enemy.getPosition(),
														this.getRange()
																* Constant.MAP_UNIT_SIZE_WIDTH,
														enemy.getRange()
																* Constant.MAP_UNIT_SIZE_WIDTH);
										if (result.equals("2 inside")
												|| result.equals("all inside")) {
											if (!enemy.isVampire) {
												if (enemy.getHp() < enemy.originalHP)
													enemy.setHp(enemy.getHp() + 5);
												if (enemy.getHp() > enemy.originalHP)
													enemy.setHp(originalHP);
											}
										}
									}
								}
							}
							time_to_heath = 0;
							isStop = false;
						}
					}
				}
				break;
			// Speed up
			case Constant.SKILL_8_ID:
				if (!isVampire) {
					if (time_to_speedup >= 4f) {
						if (time_to_speedup <= 5f) {
							isStop = true;
							for (Enemy enemy : world.activeEnemy) {
								if (!enemy.equals(this)
										&& enemy.getId() != this.getId()) {
									if (enemy.getState() != STATE.DEAD) {
										String result = world
												.checkOverlapRadar(
														this.getPosition(),
														enemy.getPosition(),
														this.getRange()
																* Constant.MAP_UNIT_SIZE_WIDTH,
														enemy.getRange()
																* Constant.MAP_UNIT_SIZE_WIDTH);
										if (result.equals("2 inside")
												|| result.equals("all inside")) {
											if (!enemy.isVampire) {
												enemy.isSpeedUp = true;
											}
										}
									}
								}
							}
						} else {
							time_to_speedup = 0;
							isStop = false;
						}
					}
				}
				break;
			// Carry out
			case Constant.SKILL_9_ID:

				break;

			default:
				break;
			}
		}
	}

	public void checkSkillAffect(World world, float delta) {
		switch (getSkill_affected()) {
		case NORMAL:
			break;
		case NINJA:

			break;
		case TELEPORT:
			time_to_teleport += delta;
			isTeleport = true;
			if (time_to_teleport > 1f) {
				time_to_teleport = 0;
				index = 0;
				setPosition(Ulti.convertPositionWorld(getPaths().get(0)
						.getPosition()));
				setSkill_affected(SKILL_AFFECTED_STATE.NORMAL);
				isTeleport = false;
			}
			break;
		case HEX:
			time_to_hex += delta;
			if (time_to_hex >= 2f) {
				if (time_to_hex <= 5f) {
					setDamage(0);
					isHex = true;
				} else {
					setDamage(originalDamage);
					time_to_hex = 0;
					isHex = false;
					setSkill_affected(SKILL_AFFECTED_STATE.NORMAL);
				}
			}
			break;
		case BITE:
			time_to_vampire += delta;
			if (time_to_vampire >= 2f) {
				if (time_to_vampire <= 10f) {
					if (!isVampire) {
						setPosition(Ulti.convertPositionWorld(paths.get(index)
								.getPosition()));
						initAnimation(true);
						isVampire = true;
					}
				} else {
					isVampire = false;
					initAnimation(false);
					time_to_vampire = 0;
					setSkill_affected(SKILL_AFFECTED_STATE.NORMAL);
				}
			}
			break;
		case MOON:

			break;

		default:
			break;
		}
	}

	private boolean check(Vector2 destination) {
		// TODO Auto-generated method stub
		boolean kq = false;
		float dx = destination.x - getPosition().x;
		float dy = destination.y - getPosition().y;
		float distance = (float) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		if (distance <= 10) {
			kq = true;
		}
		return kq;
	}

	public void moveTo() {
		Vector2 start = new Vector2(), end = new Vector2();
		if (!isVampire) {
			start = Ulti.convertPositionWorld(paths.get(index).getPosition());
			end = Ulti.convertPositionWorld(paths.get(index + 1).getPosition());
		} else {
			start = Ulti.convertPositionWorld(paths.get(index).getPosition());
			end = Ulti.convertPositionWorld(paths.get(index - 1).getPosition());
		}
		float dx = end.x - start.x;
		float dy = end.y - start.y;
		if (dx > 0 && dy == 0)
			setMove_state(MOVE_STATE.RIGHT);
		if (dx < 0 && dy == 0)
			setMove_state(MOVE_STATE.LEFT);
		if (dx == 0 && dy > 0)
			setMove_state(MOVE_STATE.UP);
		if (dx == 0 && dy < 0)
			setMove_state(MOVE_STATE.DOWN);
		if (dx > 0 && dy > 0)
			setMove_state(MOVE_STATE.UP_RIGHT);
		if (dx > 0 && dy < 0)
			setMove_state(MOVE_STATE.DOWN_RIGHT);
		if (dx < 0 && dy > 0)
			setMove_state(MOVE_STATE.UP_LEFT);
		if (dx < 0 && dy < 0)
			setMove_state(MOVE_STATE.DOWN_LEFT);

	}

	public int getLife_cost() {
		return life_cost;
	}

	public void setLife_cost(int life_cost) {
		this.life_cost = life_cost;
	}

	public int getCoin() {
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public ArrayList<Piece> getPaths() {
		return paths;
	}

	public void setPaths(ArrayList<Piece> paths) {
		this.paths = paths;
	}

	public int getPath() {
		return path;
	}

	public void setPath(int path) {
		this.path = path;
	}

	public void setSkills(Skill skills) {
		this.skills = skills;
	}

	public Skill getSkills() {
		return skills;
	}

	public boolean isSpeedUp() {
		return isSpeedUp;
	}

	public boolean isVampire() {
		return isVampire;
	}

	public boolean isStop() {
		return isStop;
	}

	public boolean isHex() {
		return isHex;
	}

	public boolean isTeleport() {
		return isTeleport;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nName: " + getName() + "\nDescription: " + getDescription();
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		setState(STATE.DEAD);
		setPosition(0, 0);
		time_to_attack = 0;
		index = 0;
		time_extra = 0;
		time_to_teleport = 0;
		time_to_hex = 0;
		time_to_vampire = 0;
		time_to_heath = 0;
		time_to_speedup = 0;
		time_speedup = 0;
		isVampire = false;
		isStop = false;
		isSpeedUp = false;
		isHex = false;
		isTeleport = false;
		setSkill_affected(SKILL_AFFECTED_STATE.NORMAL);
		skills = null;
	}

}
