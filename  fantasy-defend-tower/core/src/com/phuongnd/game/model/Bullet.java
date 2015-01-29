package com.phuongnd.game.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.phuongnd.game.controller.Animation;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.World;

public class Bullet extends BaseUnit {

	private Vector2 direction;
	private Vector2 start;
	private Vector2 destination;
	private BaseUnit target;
	private int belong_to;
	private int type;
	private float dx;
	private float dy;

	@Override
	public void init(int id, Vector2 position, int numAnimation) {
		// TODO Auto-generated method stub

	}

	public void init(int id, Vector2 position, int numAnimation, BaseUnit target) {
		// TODO Auto-generated method stub
		setId(id);
		setPosition(position);
		setNUM_ANIMATION(numAnimation);
		setAnimation(new Animation[numAnimation]);
		setState(STATE.ACTIVE);

		this.target = target;
		direction = new Vector2(1, 1);
		start = getPosition();
		destination = new Vector2(this.target.getPosition().x
				+ this.target.getWidth2() / 2, this.target.getPosition().y);

		switch (getId()) {
		case 1:
			setName(Constant.BULLET_1_NAME);
			setDescription(Constant.BULLET_1_DESCRIPTION);
			setSpeed(Constant.BULLET_1_SPEED);
			setDamage(Constant.BULLET_1_DAMAGE);
			setRange(Constant.BULLET_1_RANGE);
			setAnimation(Assets.shared().bullet1_Animation_Up, 0);
			setAnimation(Assets.shared().bullet1_Animation_Down, 1);
			setAnimation(Assets.shared().bullet1_Animation_Left, 2);
			setAnimation(Assets.shared().bullet1_Animation_Right, 3);
			belong_to = 0;
			type = 0;
			break;
		case 2:
			setName(Constant.BULLET_2_NAME);
			setDescription(Constant.BULLET_2_DESCRIPTION);
			setSpeed(Constant.BULLET_2_SPEED);
			setDamage(Constant.BULLET_2_DAMAGE);
			setRange(Constant.BULLET_2_RANGE);
			setAnimation(Assets.shared().bullet2_Animation_Up, 0);
			setAnimation(Assets.shared().bullet2_Animation_Down, 1);
			setAnimation(Assets.shared().bullet2_Animation_Left, 2);
			setAnimation(Assets.shared().bullet2_Animation_Right, 3);
			belong_to = 1;
			type = 0;
			break;
		case 3:
			setName(Constant.BULLET_3_NAME);
			setDescription(Constant.BULLET_3_DESCRIPTION);
			setSpeed(Constant.BULLET_3_SPEED);
			setDamage(Constant.BULLET_3_DAMAGE);
			setRange(Constant.BULLET_3_RANGE);
			setAnimation(Assets.shared().bullet1_Animation_Up, 0);
			setAnimation(Assets.shared().bullet1_Animation_Down, 1);
			setAnimation(Assets.shared().bullet1_Animation_Left, 2);
			setAnimation(Assets.shared().bullet1_Animation_Right, 3);
			belong_to = 0;
			type = 0;
			break;
		case 4:
			setName(Constant.BULLET_4_NAME);
			setDescription(Constant.BULLET_4_DESCRIPTION);
			setSpeed(Constant.BULLET_4_SPEED);
			setDamage(Constant.BULLET_4_DAMAGE);
			setRange(Constant.BULLET_4_RANGE);
			setAnimation(Assets.shared().bullet1_Animation_Up, 0);
			setAnimation(Assets.shared().bullet1_Animation_Down, 1);
			setAnimation(Assets.shared().bullet1_Animation_Left, 2);
			setAnimation(Assets.shared().bullet1_Animation_Right, 3);
			belong_to = 0;
			type = 0;
			break;
		case 5:
			setName(Constant.BULLET_5_NAME);
			setDescription(Constant.BULLET_5_DESCRIPTION);
			setSpeed(Constant.BULLET_5_SPEED);
			setDamage(Constant.BULLET_5_DAMAGE);
			setRange(Constant.BULLET_5_RANGE);
			setAnimation(Assets.shared().bullet1_Animation_Up, 0);
			setAnimation(Assets.shared().bullet1_Animation_Down, 1);
			setAnimation(Assets.shared().bullet1_Animation_Left, 2);
			setAnimation(Assets.shared().bullet1_Animation_Right, 3);
			belong_to = 0;
			type = 0;
			break;
		case 6:
			setName(Constant.BULLET_6_NAME);
			setDescription(Constant.BULLET_6_DESCRIPTION);
			setSpeed(Constant.BULLET_6_SPEED);
			setDamage(Constant.BULLET_6_DAMAGE);
			setRange(Constant.BULLET_6_RANGE);
			setAnimation(Assets.shared().bullet1_Animation_Up, 0);
			setAnimation(Assets.shared().bullet1_Animation_Down, 1);
			setAnimation(Assets.shared().bullet1_Animation_Left, 2);
			setAnimation(Assets.shared().bullet1_Animation_Right, 3);
			belong_to = 0;
			type = 0;
			break;
		case 7:
			setName(Constant.BULLET_7_NAME);
			setDescription(Constant.BULLET_7_DESCRIPTION);
			setSpeed(Constant.BULLET_7_SPEED);
			setDamage(Constant.BULLET_7_DAMAGE);
			setRange(Constant.BULLET_7_RANGE);
			setAnimation(Assets.shared().bullet1_Animation_Up, 0);
			setAnimation(Assets.shared().bullet1_Animation_Down, 1);
			setAnimation(Assets.shared().bullet1_Animation_Left, 2);
			setAnimation(Assets.shared().bullet1_Animation_Right, 3);
			belong_to = 0;
			type = 0;
			break;
		case 8:
			setName(Constant.BULLET_8_NAME);
			setDescription(Constant.BULLET_8_DESCRIPTION);
			setSpeed(Constant.BULLET_8_SPEED);
			setDamage(Constant.BULLET_8_DAMAGE);
			setRange(Constant.BULLET_8_RANGE);
			setAnimation(Assets.shared().bullet1_Animation_Up, 0);
			setAnimation(Assets.shared().bullet1_Animation_Down, 1);
			setAnimation(Assets.shared().bullet1_Animation_Left, 2);
			setAnimation(Assets.shared().bullet1_Animation_Right, 3);
			belong_to = 0;
			type = 0;
			break;
		case 9:
			setName(Constant.BULLET_9_NAME);
			setDescription(Constant.BULLET_9_DESCRIPTION);
			setSpeed(Constant.BULLET_9_SPEED);
			setDamage(Constant.BULLET_9_DAMAGE);
			setRange(Constant.BULLET_9_RANGE);
			setAnimation(Assets.shared().bullet1_Animation_Up, 0);
			setAnimation(Assets.shared().bullet1_Animation_Down, 1);
			setAnimation(Assets.shared().bullet1_Animation_Left, 2);
			setAnimation(Assets.shared().bullet1_Animation_Right, 3);
			belong_to = 0;
			type = 0;
			break;
		case 10:
			setName(Constant.BULLET_10_NAME);
			setDescription(Constant.BULLET_10_DESCRIPTION);
			setSpeed(Constant.BULLET_10_SPEED);
			setDamage(Constant.BULLET_10_DAMAGE);
			setRange(Constant.BULLET_10_RANGE);
			setAnimation(Assets.shared().bullet1_Animation_Up, 0);
			setAnimation(Assets.shared().bullet1_Animation_Down, 1);
			setAnimation(Assets.shared().bullet1_Animation_Left, 2);
			setAnimation(Assets.shared().bullet1_Animation_Right, 3);
			belong_to = 0;
			type = 0;
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

	public void update(World world, float delta) {
		// TODO Auto-generated method stub
		if (getState() == STATE.ACTIVE) {
			if (type == 0)
				moveDirect(world, delta);
			else if (type == 1)
				moveFollow(world, delta);
		}
	}

	public void calculateMove() {
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
	}

	public void moveFollow(World world, float delta) {
		dx = target.getPosition().x - start.x;
		dy = target.getPosition().y - start.y;
		calculateMove();

		if (target.getState() != STATE.DEAD) {
			if (!getBounder().overlaps(target.getBounder())) {
				setPosition(getPosition().x + direction.x * getSpeed() * delta,
						getPosition().y + direction.y * getSpeed() * delta);
			} else {
				// damage
				if (getRange() > 0) {
					attackArea(world);
				} else {
					attack(target);
				}
				setState(STATE.DEAD);
			}
		} else {
			// miss
			if (getRange() > 0)
				attackArea(world);
			setState(STATE.DEAD);
		}

		setBounder(getPosition());
	}

	public void moveDirect(World world, float delta) {
		dx = destination.x - start.x;
		dy = destination.y - start.y;
		calculateMove();

		if (check(getPosition(), destination) >= 5) {
			setPosition(getPosition().x + direction.x * getSpeed() * delta,
					getPosition().y + direction.y * getSpeed() * delta);
		} else {
			if (check(getPosition(), target.getPosition()) <= target
					.getWidth2()) {
				// damage
				if (getRange() > 0)
					attackArea(world);
				else
					attack(target);
			} else {
				// miss
				if (getRange() > 0)
					attackArea(world);
			}
			setState(STATE.DEAD);
		}
		setBounder(getPosition());
	}

	public float check(Vector2 start, Vector2 end) {
		float dx = end.x - start.x;
		float dy = end.y - start.y;
		float distance = (float) Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
		return distance;
	}

	@Override
	public void attack(BaseUnit unit) {
		// TODO Auto-generated method stub
		int damage = getDamage() - unit.getArmor();
		unit.setHp(unit.getHp() - damage);
		if (unit.getHp() <= 0) {
			unit.setHp(0);
			unit.setState(STATE.DEAD);
		}
	}

	public void attackArea(World world) {
		if (belong_to == 1) {
			for (Warrior warrior : world.activeWarrior) {
				if (world.checkOverlapRadar(getPosition(),
						warrior.getPosition(), getRange(), warrior.getRange())
						.equals("2 inside")) {
					attack(warrior);
				}
			}
		} else {
			for (Enemy enemy : world.activeEnemy) {
				if (world.checkOverlapRadar(getPosition(), enemy.getPosition(),
						getRange() * Constant.MAP_UNIT_SIZE_WIDTH,
						enemy.getRange() * Constant.MAP_UNIT_SIZE_WIDTH)
						.contains("inside")) {
					attack(enemy);
				}
			}
		}
	}

	public Vector2 getDirection() {
		return direction;
	}

	public void setDirection(Vector2 direction) {
		this.direction = direction;
	}

	public void setDirection(float x, float y) {
		this.direction.x = x;
		this.direction.y = y;
	}

	public Vector2 getDestination() {
		return destination;
	}

	public void setDestination(Vector2 destination) {
		this.destination = destination;
	}

	public void setDestination(float x, float y) {
		this.destination.x = x;
		this.destination.y = y;
	}

	public int getBelong_to() {
		return belong_to;
	}

	public void setBelong_to(int belong_to) {
		this.belong_to = belong_to;
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
		setDirection(1, 1);
		setDestination(0, 0);
	}
}
