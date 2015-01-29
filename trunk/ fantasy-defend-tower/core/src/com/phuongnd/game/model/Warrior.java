package com.phuongnd.game.model;

import java.util.ArrayList;
import java.util.Random;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.controller.Animation;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.Ulti;
import com.phuongnd.game.controller.World;

public class Warrior extends BaseUnit {

	private float time_to_attack;
	private float time_live;

	private int path = 1;
	private int index = 0;
	private ArrayList<Piece> paths;
	public Vector2 destination;
	public Vector2 temp;
	public Vector2 direction;
	public Vector2 start;
	private boolean isMove;
	private boolean isBreak;

	private int originalDamage;
	private int originalAttackSpeed;
	private int originalSpeed;
	private Skill skills;

	@Override
	public void init(int id, Vector2 position, int numAnimation) {
		// TODO Auto-generated method stub

	}

	public void init(int id, Vector2 position, int numAnimation, int start,
			int path, boolean isSkill) {
		// TODO Auto-generated method stub
		setId(id);
		setPosition(position);
		setNUM_ANIMATION(numAnimation);
		setAnimation(new Animation[numAnimation]);
		setState(STATE.ACTIVE);

		paths = new ArrayList<Piece>();
		destination = new Vector2();
		temp = new Vector2();
		direction = new Vector2();
		index = start;
		this.start = new Vector2(getPosition().x, getPosition().y);
		this.path = path;

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
			setSkills(new Skill(Constant.SKILL_1_ID));
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
			setSkills(new Skill(Constant.SKILL_1_ID));
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
			setSkills(new Skill(Constant.SKILL_1_ID));
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
			setSkills(new Skill(Constant.SKILL_1_ID));
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
			setSkills(new Skill(Constant.SKILL_1_ID));
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
			setSkills(new Skill(Constant.SKILL_2_ID));
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
			setSkills(new Skill(Constant.SKILL_3_ID));
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
			setSkills(new Skill(Constant.SKILL_4_ID));
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
			setSkills(new Skill(Constant.SKILL_5_ID));
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
			setSkills(new Skill(Constant.SKILL_6_ID));
			break;
		}

		initAnimation(false);

		if (isSkill) {
			skills.setActive(true);
			if (skills.getId() == Constant.SKILL_1_ID) {
				initAnimation(true);
				setSkill_affected(SKILL_AFFECTED_STATE.NINJA);
			}

			if (skills.getId() == Constant.SKILL_6_ID) {
				setSkill_affected(SKILL_AFFECTED_STATE.MOON);
			}
		}

		setOriginalAttackSpeed(getOriginalAttackSpeed());
		setOriginalDamage(getOriginalDamage());
		setOriginalSpeed(getOriginalSpeed());

		setBounder(new Rectangle(getPosition().x, getPosition().y,
				getAnimation()[0].keyFrames[0].getRegionWidth() - 10,
				getAnimation()[0].keyFrames[0].getRegionHeight() - 10));

		setMove_state(MOVE_STATE.UP);
	}

	public void initAnimation(boolean isNinja) {
		if (!isNinja) {
			switch (getId()) {
			case 1:
				setAnimation(Assets.shared().warrior1_Animation_Up, 0);
				setAnimation(Assets.shared().warrior1_Animation_Down, 1);
				setAnimation(Assets.shared().warrior1_Animation_Left, 2);
				setAnimation(Assets.shared().warrior1_Animation_Right, 3);
				break;
			case 2:
				setAnimation(Assets.shared().warrior2_Animation_Up, 0);
				setAnimation(Assets.shared().warrior2_Animation_Down, 1);
				setAnimation(Assets.shared().warrior2_Animation_Left, 2);
				setAnimation(Assets.shared().warrior2_Animation_Right, 3);
				break;
			case 3:
				setAnimation(Assets.shared().warrior3_Animation_Up, 0);
				setAnimation(Assets.shared().warrior3_Animation_Down, 1);
				setAnimation(Assets.shared().warrior3_Animation_Left, 2);
				setAnimation(Assets.shared().warrior3_Animation_Right, 3);
				break;
			case 4:
				setAnimation(Assets.shared().warrior4_Animation_Up, 0);
				setAnimation(Assets.shared().warrior4_Animation_Down, 1);
				setAnimation(Assets.shared().warrior4_Animation_Left, 2);
				setAnimation(Assets.shared().warrior4_Animation_Right, 3);
				break;
			case 5:
				setAnimation(Assets.shared().warrior5_Animation_Up, 0);
				setAnimation(Assets.shared().warrior5_Animation_Down, 1);
				setAnimation(Assets.shared().warrior5_Animation_Left, 2);
				setAnimation(Assets.shared().warrior5_Animation_Right, 3);
				break;
			case 6:
				setAnimation(Assets.shared().hero1_Animation_Up, 0);
				setAnimation(Assets.shared().hero1_Animation_Down, 1);
				setAnimation(Assets.shared().hero1_Animation_Left, 2);
				setAnimation(Assets.shared().hero1_Animation_Right, 3);
				break;
			case 7:
				setAnimation(Assets.shared().hero2_Animation_Up, 0);
				setAnimation(Assets.shared().hero2_Animation_Down, 1);
				setAnimation(Assets.shared().hero2_Animation_Left, 2);
				setAnimation(Assets.shared().hero2_Animation_Right, 3);
				break;
			case 8:
				setAnimation(Assets.shared().hero3_Animation_Up, 0);
				setAnimation(Assets.shared().hero3_Animation_Down, 1);
				setAnimation(Assets.shared().hero3_Animation_Left, 2);
				setAnimation(Assets.shared().hero3_Animation_Right, 3);
				break;
			case 9:
				setAnimation(Assets.shared().hero4_Animation_Up, 0);
				setAnimation(Assets.shared().hero4_Animation_Down, 1);
				setAnimation(Assets.shared().hero4_Animation_Left, 2);
				setAnimation(Assets.shared().hero4_Animation_Right, 3);
				break;
			case 10:
				setAnimation(Assets.shared().hero5_Animation_Up, 0);
				setAnimation(Assets.shared().hero5_Animation_Down, 1);
				setAnimation(Assets.shared().hero5_Animation_Left, 2);
				setAnimation(Assets.shared().hero5_Animation_Right, 3);
				break;
			}
		} else {
			setAnimation(Assets.shared().ninja_Animation_Up, 0);
			setAnimation(Assets.shared().ninja_Animation_Down, 1);
			setAnimation(Assets.shared().ninja_Animation_Left, 2);
			setAnimation(Assets.shared().ninja_Animation_Right, 3);
		}
	}

	@Override
	public void update(float delta) {
		// TODO Auto-generated method stub
	}

	public void update(World world, float delta) {
		// TODO Auto-generated method stub
		time_to_attack += delta;
		time_live += delta;
		if (time_live >= 10) {
			setState(STATE.DEAD);
		}
		if (getState() == STATE.ACTIVE) {
			move(world, delta);
		}
		checkSkillAffect(world, delta);
	}

	public void move(World world, float delta) {
		// if (index > 0) {
		// destination = paths.get(index - 1).getPosition();
		// if (!check(Ulti.convertPositionWorld(destination))) {
		// moveTo();
		// } else {
		// index--;
		// }
		// } else {
		// time_extra += delta;
		// if (time_extra >= 5 * 10 / getSpeed())
		// setState(STATE.DEAD);
		// }

		if (!isMove) {
			Vector2 pos1 = Ulti.convertPositionWorld_2(
					(int) (getPosition().x / Constant.MAP_UNIT_SIZE_WIDTH),
					(int) (getPosition().y / Constant.MAP_UNIT_SIZE_HEIGHT));
			Vector2 pos2, pos3 = new Vector2();

			if (!isBreak) {
				pos3.x = pos1.x;
				pos3.y = pos1.y + 50;
				for (int i = 0; i < paths.size(); i++) {
					pos2 = new Vector2(Ulti.convertPositionWorld(paths.get(i)
							.getPosition()));
					if (checkPosAround(pos2, pos3)) {
						destination.x = pos3.x + new Random().nextInt(10);
						destination.y = pos3.y + new Random().nextInt(10);
						moveTo(pos1, pos3);
						isMove = true;
						isBreak = true;
						setMove_state(MOVE_STATE.UP);
						break;
					}
				}
			}

			if (!isBreak) {
				pos3.x = pos1.x;
				pos3.y = pos1.y - 50;
				for (int i = 0; i < paths.size(); i++) {
					pos2 = new Vector2(Ulti.convertPositionWorld(paths.get(i)
							.getPosition()));
					if (checkPosAround(pos2, pos3)) {
						destination.x = pos3.x + new Random().nextInt(10);
						destination.y = pos3.y + new Random().nextInt(10);
						moveTo(pos1, pos3);
						isMove = true;
						isBreak = true;
						setMove_state(MOVE_STATE.DOWN);
						break;
					}
				}
			}

			if (!isBreak) {
				pos3.x = pos1.x - 50;
				pos3.y = pos1.y;
				for (int i = 0; i < paths.size(); i++) {
					pos2 = new Vector2(Ulti.convertPositionWorld(paths.get(i)
							.getPosition()));
					if (checkPosAround(pos2, pos3)) {
						destination.x = pos3.x + new Random().nextInt(10);
						destination.y = pos3.y + new Random().nextInt(10);
						moveTo(pos1, pos3);
						isMove = true;
						isBreak = true;
						setMove_state(MOVE_STATE.LEFT);
						break;
					}
				}
			}

			if (!isBreak) {
				pos3.x = pos1.x + 50;
				pos3.y = pos1.y;
				for (int i = 0; i < paths.size(); i++) {
					pos2 = new Vector2(Ulti.convertPositionWorld(paths.get(i)
							.getPosition()));
					if (checkPosAround(pos2, pos3)) {
						destination.x = pos3.x + new Random().nextInt(10);
						destination.y = pos3.y + new Random().nextInt(10);
						moveTo(pos1, pos3);
						isMove = true;
						isBreak = true;
						setMove_state(MOVE_STATE.RIGHT);
						break;
					}
				}
			}

			if (!isBreak) {
				pos3.x = pos1.x - 50;
				pos3.y = pos1.y + 50;
				for (int i = 0; i < paths.size(); i++) {
					pos2 = new Vector2(Ulti.convertPositionWorld(paths.get(i)
							.getPosition()));
					if (checkPosAround(pos2, pos3)) {
						destination.x = pos3.x + new Random().nextInt(10);
						destination.y = pos3.y + new Random().nextInt(10);
						moveTo(pos1, pos3);
						isMove = true;
						isBreak = true;
						setMove_state(MOVE_STATE.UP_LEFT);
						break;
					}
				}
			}

			if (!isBreak) {
				pos3.x = pos1.x + 50;
				pos3.y = pos1.y + 50;
				for (int i = 0; i < paths.size(); i++) {
					pos2 = new Vector2(Ulti.convertPositionWorld(paths.get(i)
							.getPosition()));
					if (checkPosAround(pos2, pos3)) {
						destination.x = pos3.x + new Random().nextInt(10);
						destination.y = pos3.y + new Random().nextInt(10);
						moveTo(pos1, pos3);
						isMove = true;
						isBreak = true;
						setMove_state(MOVE_STATE.UP_RIGHT);
						break;
					}
				}
			}

			if (!isBreak) {
				pos3.x = pos1.x + 50;
				pos3.y = pos1.y - 50;
				for (int i = 0; i < paths.size(); i++) {
					pos2 = new Vector2(Ulti.convertPositionWorld(paths.get(i)
							.getPosition()));
					if (checkPosAround(pos2, pos3)) {
						destination.x = pos3.x + new Random().nextInt(10);
						destination.y = pos3.y + new Random().nextInt(10);
						moveTo(pos1, pos3);
						isMove = true;
						isBreak = true;
						setMove_state(MOVE_STATE.DOWN_RIGHT);
						break;
					}
				}
			}

			if (!isBreak) {
				pos3.x = pos1.x - 50;
				pos3.y = pos1.y - 50;
				for (int i = 0; i < paths.size(); i++) {
					pos2 = new Vector2(Ulti.convertPositionWorld(paths.get(i)
							.getPosition()));
					if (checkPosAround(pos2, pos3)) {
						destination.x = pos3.x + new Random().nextInt(10);
						destination.y = pos3.y + new Random().nextInt(10);
						moveTo(pos1, pos3);
						isMove = true;
						isBreak = true;
						setMove_state(MOVE_STATE.DOWN_LEFT);
						break;
					}
				}
			}
		} else {
			if (!check(destination)) {
				setPosition(getPosition().x + direction.x * getSpeed() * delta,
						getPosition().y + direction.y * getSpeed() * delta);
			} else {
				for (Enemy enemy : world.activeEnemy) {
					float distance = (float) Math.sqrt(Math.pow(
							enemy.getPosition().x - getPosition().x, 2)
							+ Math.pow(enemy.getPosition().y - getPosition().y,
									2));
					if (distance <= 120) {
						temp.x = enemy.getPosition().x;
						temp.y = enemy.getPosition().y;
						break;
					} else {
						temp.x = 0;
						temp.y = 0;
						continue;
					}
				}
			}
		}

		if (temp.x != 0 && temp.y != 0) {
			if (!check(temp)) {
				moveTo(getPosition(), temp);
				setPosition(getPosition().x + direction.x * getSpeed() * delta,
						getPosition().y + direction.y * getSpeed() * delta);
			} else {
				temp.x = 0;
				temp.y = 0;
				moveTo(getPosition(), destination);
			}
		}

		// switch (getMove_state()) {
		// case UP:
		// setPosition(getPosition().x, getPosition().y + getSpeed() * delta);
		// break;
		// case DOWN:
		// setPosition(getPosition().x, getPosition().y - getSpeed() * delta);
		// break;
		// case LEFT:
		// setPosition(getPosition().x - getSpeed() * delta, getPosition().y);
		// break;
		// case RIGHT:
		// setPosition(getPosition().x + getSpeed() * delta, getPosition().y);
		// break;
		// case UP_LEFT:
		// setPosition(getPosition().x - getSpeed() * delta, getPosition().y
		// + getSpeed() * delta);
		// break;
		// case UP_RIGHT:
		// setPosition(getPosition().x + getSpeed() * delta, getPosition().y
		// + getSpeed() * delta);
		// break;
		// case DOWN_LEFT:
		// setPosition(getPosition().x - getSpeed() * delta, getPosition().y
		// - getSpeed() * delta);
		// break;
		// case DOWN_RIGHT:
		// setPosition(getPosition().x + getSpeed() * delta, getPosition().y
		// - getSpeed() * delta);
		// break;
		// default:
		// break;
		// }
		setBounder(getPosition());
	}

	public void moveTo(Vector2 start, Vector2 destination) {
		float dx = destination.x - start.x;
		float dy = destination.y - start.y;

		if (dx == 0) {
			direction.x = 0;
			if (dy > 0) {
				direction.y = 1;
			} else if (dy < 0) {
				direction.y = -1;
			} else
				direction.y = 0;
		} else {
			double alpha = Math.atan(Math.abs(dy / dx));
			direction.x = (float) Math.cos(alpha);
			direction.y = (float) Math.sin(alpha);
			if (dx < 0) {
				direction.x = -direction.x;
			}
			if (dy < 0) {
				direction.y = -direction.y;
			}
		}

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

	public boolean checkPosAround(Vector2 start, Vector2 destination) {
		float dx = start.x - destination.x;
		float dy = start.y - destination.y;
		float distance = (float) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		if (distance <= 75) {
			return true;
		}
		return false;
	}

	public boolean check(Vector2 destination) {
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
		Vector2 start = Ulti.convertPositionWorld(paths.get(index)
				.getPosition());
		Vector2 end = Ulti.convertPositionWorld(paths.get(index - 1)
				.getPosition());
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

	@Override
	public void attack(BaseUnit unit) {
		// TODO Auto-generated method stub
		if (time_to_attack >= 1.0f / getAttack_speed()) {
			int damage = getDamage() - unit.getArmor();
			if (damage > 0)
				unit.setHp(unit.getHp() - damage);
			time_to_attack = 0;
		}

		if (skills.isActive()) {
			skills.active(unit);
		}

		if (unit.getHp() <= 0) {
			unit.setHp(0);
			unit.setState(STATE.DEAD);
			if (getState() != STATE.DEAD) {
				setState(STATE.ACTIVE);
			}
		}
		Ulti.checkOpposite(unit, this);
	}

	public void attack(BaseUnit unit, World world) {
		if (time_to_attack >= 1.0f / getAttack_speed()) {
			if (!skills.isActive()) {
				world.addNewBullet(1, new Vector2(getPosition().x + getWidth2()
						/ 2, getPosition().y + getHeight2() / 2), 4, unit);
			} else {
				world.addNewBullet(1, new Vector2(getPosition().x + getWidth2()
						/ 2, getPosition().y + getHeight2() / 2), 4, unit);
				skills.active(unit);
			}
			time_to_attack = 0;
		}
		Ulti.checkOpposite(unit, this);
	}

	public void checkSkillAffect(World world, float delta) {
		switch (getSkill_affected()) {
		case NORMAL:
			break;
		case NINJA:
			setAttack_speed(2);
			setSpeed(100);
			initAnimation(true);
			break;
		case TELEPORT:
			break;
		case HEX:
			break;
		case BITE:
			break;
		case MOON:

			break;

		default:
			break;
		}
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

	public Vector2 getDestination() {
		return destination;
	}

	public void setDestination(Vector2 destination) {
		this.destination = destination;
	}

	public void setSkills(Skill skills) {
		this.skills = skills;
	}

	public Skill getSkills() {
		return skills;
	}

	public float getTime_live() {
		return time_live;
	}

	public void setTime_live(float time_live) {
		this.time_live = time_live;
	}

	public int getOriginalDamage() {
		return originalDamage;
	}

	public void setOriginalDamage(int originalDamage) {
		this.originalDamage = originalDamage;
	}

	public int getOriginalSpeed() {
		return originalSpeed;
	}

	public void setOriginalSpeed(int originalSpeed) {
		this.originalSpeed = originalSpeed;
	}

	public int getOriginalAttackSpeed() {
		return originalAttackSpeed;
	}

	public void setOriginalAttackSpeed(int originalAttackSpeed) {
		this.originalAttackSpeed = originalAttackSpeed;
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
		time_live = 0;
		index = 0;
		isMove = false;
		isBreak = false;
		setSkill_affected(SKILL_AFFECTED_STATE.NORMAL);
	}

}
