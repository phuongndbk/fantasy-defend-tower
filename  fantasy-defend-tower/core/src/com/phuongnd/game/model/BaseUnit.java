package com.phuongnd.game.model;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Pool.Poolable;
import com.phuongnd.game.controller.Animation;

public abstract class BaseUnit implements Poolable {

	public enum STATE {
		IDLE, ACTIVE, DEAD
	}

	private STATE state;

	public enum MOVE_STATE {
		UP, DOWN, LEFT, RIGHT, UP_LEFT, UP_RIGHT, DOWN_LEFT, DOWN_RIGHT
	}

	private MOVE_STATE move_state;

	private String name;
	private String description;

	private int id;
	private int hp;
	private int totalHp;
	private int speed;
	private int damage;
	private int armor;
	private int range;
	private int skill;
	private int attack_speed;
	private int NUM_ANIMATION;

	private float width, height;

	private Animation[] animation;
	private Vector2 position;
	private Rectangle bounder;

	public BaseUnit() {
		// TODO Auto-generated constructor stub
		position = new Vector2();
		setState(STATE.DEAD);
	}

	// public BaseUnit(int id, Vector2 position, int numAni) {
	// super();
	// this.id = id;
	// this.position = position;
	// this.NUM_ANIMATION = numAni;
	// this.animation = new Animation[NUM_ANIMATION];
	// setState(STATE.ACTIVE);
	// }

	public abstract void init(int id, Vector2 position, int numAnimation);

	public abstract void update(float delta);

	public STATE getState() {
		return state;
	}

	public void setState(STATE state) {
		this.state = state;
	}

	public MOVE_STATE getMove_state() {
		return move_state;
	}

	public void setMove_state(MOVE_STATE move_state) {
		this.move_state = move_state;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getTotalHp() {
		return totalHp;
	}

	public void setTotalHp(int totalHp) {
		this.totalHp = totalHp;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getArmor() {
		return armor;
	}

	public void setArmor(int armor) {
		this.armor = armor;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public int getAttack_speed() {
		return attack_speed;
	}

	public void setAttack_speed(int attack_speed) {
		this.attack_speed = attack_speed;
	}

	public int getNUM_ANIMATION() {
		return NUM_ANIMATION;
	}

	public void setNUM_ANIMATION(int nUM_ANIMATION) {
		NUM_ANIMATION = nUM_ANIMATION;
	}

	public Vector2 getPosition() {
		return position;
	}

	public void setPosition(Vector2 position) {
		this.position = position;
	}

	public void setPosition(float x, float y) {
		this.position.x = x;
		this.position.y = y;
	}

	public float getWidth() {
		return width;
	}

	public float getWidth2() {
		return animation[0].keyFrames[0].getRegionWidth();
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public float getHeight2() {
		return animation[0].keyFrames[0].getRegionHeight();
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Animation[] getAnimation() {
		return animation;
	}

	public void setAnimation(Animation[] animation) {
		this.animation = animation;
	}

	public void setAnimation(Animation animation, int pos) {
		this.animation[pos] = animation;
	}

	public Rectangle getBounder() {
		return bounder;
	}

	public void setBounder(Rectangle bounder) {
		this.bounder = bounder;
	}

	public void setBounder(Vector2 position) {
		this.bounder.x = position.x;
		this.bounder.y = position.y;
	}

	public void setBounder(float x, float y) {
		this.bounder.x = x;
		this.bounder.y = y;
	}

	public abstract String toString();

	public abstract void attack(BaseUnit unit, float delta);

}
