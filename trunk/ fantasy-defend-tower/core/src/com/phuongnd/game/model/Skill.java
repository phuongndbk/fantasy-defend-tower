package com.phuongnd.game.model;

import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.model.BaseUnit.SKILL_AFFECTED_STATE;

public class Skill {

	private int id;
	private String name;
	private String description;
	private boolean isActive;

	public Skill(int id) {
		super();
		this.id = id;

		switch (id) {
		case Constant.SKILL_1_ID:
			this.name = Constant.SKILL_1_NAME;
			this.description = Constant.SKILL_1_DESCRIPTION;
			break;
		case Constant.SKILL_2_ID:
			this.name = Constant.SKILL_2_NAME;
			this.description = Constant.SKILL_2_DESCRIPTION;
			break;
		case Constant.SKILL_3_ID:
			this.name = Constant.SKILL_3_NAME;
			this.description = Constant.SKILL_3_DESCRIPTION;
			break;
		case Constant.SKILL_4_ID:
			this.name = Constant.SKILL_4_NAME;
			this.description = Constant.SKILL_4_DESCRIPTION;
			break;
		case Constant.SKILL_5_ID:
			this.name = Constant.SKILL_5_NAME;
			this.description = Constant.SKILL_5_DESCRIPTION;
			break;
		case Constant.SKILL_6_ID:
			this.name = Constant.SKILL_6_NAME;
			this.description = Constant.SKILL_6_DESCRIPTION;
			break;
		default:
			break;
		}
		isActive = false;
	}

	public void active(BaseUnit unit) {
		switch (getId()) {
		case Constant.SKILL_1_ID:
			// Start skill 1
			unit.setSkill_affected(SKILL_AFFECTED_STATE.NINJA);
			break;
		case Constant.SKILL_2_ID:
			// Start skill 2
			unit.setSkill_affected(SKILL_AFFECTED_STATE.HEX);
			break;
		case Constant.SKILL_3_ID:
			// Start skill 3
			unit.setSkill_affected(SKILL_AFFECTED_STATE.NORMAL);
			break;
		case Constant.SKILL_4_ID:
			// Start skill 4
			unit.setSkill_affected(SKILL_AFFECTED_STATE.TELEPORT);
			break;
		case Constant.SKILL_5_ID:
			// Start skill 5
			unit.setSkill_affected(SKILL_AFFECTED_STATE.BITE);
			break;
		case Constant.SKILL_6_ID:
			// Start skill 6
			unit.setSkill_affected(SKILL_AFFECTED_STATE.MOON);
			break;
		default:
			break;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
