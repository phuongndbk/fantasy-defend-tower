package com.phuongnd.game.view.group;

import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.ScaleToAction;
import com.phuongnd.game.view.PlayScreen;

public abstract class BaseGroup extends Group {

	public PlayScreen screen;

	public BaseGroup(PlayScreen screen) {
		// TODO Auto-generated constructor stub
		this.screen = screen;
	}

	public abstract void initGroup();

	public void show() {
		ScaleToAction scaleTo = Actions.scaleTo(1, 1, 0.1f);
		// scaleTo.setInterpolation(Interpolation.pow2Out);
		Action action = Actions.sequence(Actions.scaleBy(0, 0), scaleTo);
		this.clearActions();
		this.addAction(action);
		// Timeline.createSequence()
		// .push(Tween.set(this, ActorAccessor.Scale).target(0, 0))
		// .push(Tween.to(this, ActorAccessor.Scale, 0.5f).target(1, 1)
		// .ease(TweenEquations.easeOutBack))
		// .setCallback(new TweenCallback() {
		//
		// @Override
		// public void onEvent(int arg0, BaseTween<?> arg1) {
		// // TODO Auto-generated method stub
		//
		// }
		// }).start(tweenManager);
	}

	public void hide() {
		// Global.updateCamGesture = true;
		// ScaleByAction scaleTo = Actions.scaleBy(1, 1, 0.1f);
		// scaleTo.setInterpolation(Interpolation.bounce);
		Action action = Actions.sequence(Actions.scaleTo(0, 0, 0.1f));
		this.clearActions();
		this.addAction(action);
		//
		// Timeline.createSequence()
		// .push(Tween.set(this, ActorAccessor.Scale).target(1, 1))
		// .push(Tween.to(this, ActorAccessor.Scale, 0.5f).target(0, 0)
		// .ease(TweenEquations.easeInBack))
		// .setCallback(new TweenCallback() {
		//
		// @Override
		// public void onEvent(int arg0, BaseTween<?> arg1) {
		// // TODO Auto-generated method stub
		// // GroupKho.this.setVisible(false);
		// }
		// }).start(tweenManager);
	}

}
