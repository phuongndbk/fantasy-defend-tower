package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.view.BaseScreen;

public class DialogGroup extends Group {

	public Image bkg;
	public Image ok;
	public Image ok_press;

	public Label info;
	
	public BaseScreen screen;

	public DialogGroup(BaseScreen screen) {
		this.screen = screen;
		initGroup();
	}

	public void initGroup() {
		// TODO Auto-generated method stub
		setWidth(Constant.WIDTH / 2);
		setHeight(Constant.HEIGHT / 2);
		setPosition(getWidth() / 2, getHeight() / 2);

		bkg = new Image(Assets.shared().backgroundLevel);
		bkg.setSize(getWidth(), getHeight());
		addActor(bkg);

		info = new Label("Info", new LabelStyle(Assets.shared().font,
				Color.GREEN));
		info.setWidth(getWidth());
		info.setPosition(0, getHeight() / 2);
		info.setAlignment(Align.center);
		addActor(info);

		ok = new Image(Assets.shared().button_ok);
		ok.setSize(50, 50);
		ok.setPosition(getWidth() / 2 - ok.getWidth() / 2, 30);
		ok.setColor(Color.GREEN);
		addActor(ok);

		ok_press = new Image(Assets.shared().button_ok_click);
		ok_press.setSize(50, 50);
		ok_press.setPosition(getWidth() / 2 - ok.getWidth() / 2, 30);
		ok_press.setColor(Color.GREEN);
		ok_press.setVisible(false);
		addActor(ok_press);

		ok.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				ok.setVisible(true);
				ok_press.setVisible(false);
				setVisible(false);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				ok.setVisible(false);
				ok_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}

	public void setInfo(String info) {
		this.info.setText(info);
	}

}
