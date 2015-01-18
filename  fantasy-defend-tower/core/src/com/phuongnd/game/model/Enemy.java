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
	private float distance;
	private float time_to_attack;

	private int index = 0;
	private float time_extra = 0;
	private ArrayList<Vector2> paths;
	private Vector2 destination;

	@Override
	public void init(int id, Vector2 position, int numAnimation) {
		// TODO Auto-generated method stub

	}

	public void init(int id, Vector2 position, int numAnimation, int start) {
		// TODO Auto-generated method stub
		setId(id);
		setPosition(position);
		setNUM_ANIMATION(numAnimation);
		setAnimation(new Animation[numAnimation]);
		setState(STATE.ACTIVE);
		paths = new ArrayList<Vector2>();
		destination = new Vector2();
		index = start;

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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
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
			setAnimation(Assets.shared().enemy1_Animation_Up, 0);
			setAnimation(Assets.shared().enemy1_Animation_Down, 1);
			setAnimation(Assets.shared().enemy1_Animation_Left, 2);
			setAnimation(Assets.shared().enemy1_Animation_Right, 3);
			break;

		default:
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

	@Override
	public void attack(BaseUnit unit, float delta) {
		time_to_attack += delta;
		if (time_to_attack >= getAttack_speed()) {
			int damage = getDamage() - unit.getArmor();
			unit.setHp(unit.getHp() - damage);
			time_to_attack = 0;
		}

		if (unit.getHp() <= 0)
			unit.setState(STATE.DEAD);
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
					world.activeTower.get(i).attack(this, delta);
				}
			}
		}

		// Check colision with warrior
		if (getRange() > 0) {
			for (int i = 0; i < world.activeWarrior.size; i++) {
				String result = world.checkOverlapRadar(getPosition(),
						world.activeWarrior.get(i).getPosition(), getRange()
								* Constant.MAP_UNIT_SIZE_WIDTH,
						world.activeWarrior.get(i).getRange()
								* Constant.MAP_UNIT_SIZE_WIDTH);
				if (result.contains("inside")) {
					if (result.equals("2 inside")) {
						if (getState() != STATE.DEAD) {
							setState(STATE.IDLE);
							attack(world.activeWarrior.get(i), delta);
						}
					} else if (result.equals("1 inside")) {
						if (world.activeWarrior.get(i).getState() != STATE.DEAD) {
							world.activeWarrior.get(i).setState(STATE.IDLE);
							world.activeWarrior.get(i).attack(this, delta);
						}
					} else {
						if (world.activeWarrior.get(i).getState() != STATE.DEAD) {
							setState(STATE.IDLE);
							attack(world.activeWarrior.get(i), delta);
						}
						if (world.activeWarrior.get(i).getState() != STATE.DEAD) {
							world.activeWarrior.get(i).setState(STATE.IDLE);
							world.activeWarrior.get(i).attack(this, delta);
						}
					}
					kq = true;
					// break;
				} else {
					// continue;
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
						warrior.attack(this, delta);
					}
				}
				if (getBounder().overlaps(warrior.getBounder())) {
					if (getState() != STATE.DEAD) {
						setState(STATE.IDLE);
						attack(warrior, delta);
					}
					kq = true;
					// break;
				} else {
					if (warrior.getState() != STATE.DEAD) {
						warrior.setState(STATE.ACTIVE);
					}
					// continue;
				}
			}
		}
		return kq;
	}

	public void move(float delta) {
		// for (int i = 0; i < paths.size(); i++) {
		// System.out.println(paths.get(i).x + " - " + paths.get(i).y);
		// }
		// System.out.println("------------");
		if (index < paths.size() - 1) {
			destination = paths.get(index + 1);
			if (!check(Ulti.convertPositionWorld(destination))) {
				moveTo();
			} else {
				index++;
			}
		} else {
			time_extra += delta;
			if (time_extra >= 0.5f)
				setState(STATE.DEAD);
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
		Vector2 start = Ulti.convertPositionWorld(paths.get(index));
		Vector2 end = Ulti.convertPositionWorld(paths.get(index + 1));
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

	public float getDistance() {
		return distance;
	}

	public void setDistance(float distance) {
		this.distance = distance;
	}

	public ArrayList<Vector2> getPaths() {
		return paths;
	}

	public void setPaths(ArrayList<Vector2> paths) {
		this.paths = paths;
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
	}

}
