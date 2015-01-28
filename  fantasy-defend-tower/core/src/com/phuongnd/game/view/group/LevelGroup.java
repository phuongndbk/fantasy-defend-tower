package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.Align;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.FantasyTowerDefend;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.Setting;
import com.phuongnd.game.view.BaseScreen;
import com.phuongnd.game.view.ManagerScreen;

public class LevelGroup extends Group {

	public static final int LEVEL_NUMBER = 30;
	public ScrollPane scrollPane;
	public Image bkg;
	public Image next;
	public Image next_press;
	public Image back;
	public Image back_press;

	public BaseScreen screen;

	public LevelGroup(BaseScreen screen) {
		this.screen = screen;
		// TODO Auto-generated constructor stub
		initGroup();
	}

	public void initGroup() {
		// TODO Auto-generated method stub
		bkg = new Image(Assets.shared().backgroundLevel);
		setWidth(Assets.shared().backgroundLevel.getRegionWidth());
		setHeight(Assets.shared().backgroundLevel.getRegionHeight());

		Table table = new Table();

		for (int i = 0; i < 5; i++) {
			LevelUnit t = new LevelUnit(i);
			table.add(t);
		}
		for (int i = 15; i < 20; i++) {
			LevelUnit t = new LevelUnit(i);
			table.add(t);
		}
		table.row();
		for (int i = 5; i < 10; i++) {
			LevelUnit t = new LevelUnit(i);
			table.add(t);
		}
		for (int i = 20; i < 25; i++) {
			LevelUnit t = new LevelUnit(i);
			table.add(t);
		}
		table.row();
		for (int i = 10; i < 15; i++) {
			LevelUnit t = new LevelUnit(i);
			table.add(t);
		}
		for (int i = 25; i < 30; i++) {
			LevelUnit t = new LevelUnit(i);
			table.add(t);
		}
		scrollPane = new ScrollPane(table);
		scrollPane.setWidth(getWidth() - 100);
		scrollPane.setHeight(getHeight() - 80);
		scrollPane.setPosition(getX() + 50, getY() + 40);
		scrollPane.setScrollingDisabled(false, true);

		next = new Image(Assets.shared().button_next);
		next.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		next.setPosition(getWidth(), getHeight() / 2 - next.getHeight() / 2);

		next_press = new Image(Assets.shared().button_next_click);
		next_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		next_press.setPosition(getWidth(), getHeight() / 2 - next.getHeight()
				/ 2);
		next_press.setVisible(false);

		next.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				scrollPane.scrollTo(505, 0, getWidth(), getHeight());
				next.setVisible(true);
				next_press.setVisible(false);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				next.setVisible(false);
				next_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		back = new Image(Assets.shared().button_back);
		back.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		back.setPosition(getX() - back.getWidth(),
				getHeight() / 2 - back.getHeight() / 2);

		back_press = new Image(Assets.shared().button_back_click);
		back_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		back_press.setPosition(getX() - back.getWidth(),
				getHeight() / 2 - back.getHeight() / 2);
		back_press.setVisible(false);

		back.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				scrollPane.scrollTo(0, 0, getWidth(), getHeight());
				back.setVisible(true);
				back_press.setVisible(false);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				back.setVisible(false);
				back_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		addActor(bkg);
		addActor(scrollPane);
		addActor(next);
		addActor(next_press);
		addActor(back);
		addActor(back_press);
		setPosition(100, 10);
	}

	public class LevelUnit extends Group {
		public int id;
		public int starNum;
		public boolean lock;
		public Image level;
		public Image star1, star2, star3;
		public Image lockImage;
		public Label name;

		public LevelUnit(int id) {
			super();
			this.id = id + 1;

			if (getId() == 1)
				lock = false;
			else {
				if (Setting.saveDatas[Setting.slotSelected].getStars()[getId() - 1] >= 0)
					lock = false;
				else {
					lock = true;
				}
			}

			starNum = Setting.saveDatas[Setting.slotSelected].getStars()[getId() - 1];

			// if (Setting.saveDatas[Setting.slotSelected].getLevel() >=
			// getId()) {
			// lock = false;
			// starNum =
			// Setting.saveDatas[Setting.slotSelected].getStars()[getId() - 1];
			// } else
			// lock = true;

			level = new Image(Assets.shared().level);
			level.setSize(Constant.MAP_UNIT_SIZE_WIDTH * 1.7f,
					Constant.MAP_UNIT_SIZE_HEIGHT * 1.7f);
			setWidth(level.getWidth() + 16);
			setHeight(level.getHeight() + 10);
			level.setPosition(8, 5);
			level.setTouchable(Touchable.disabled);
			addActor(level);

			name = new Label("" + (id + 1), new LabelStyle(
					Assets.shared().font, Color.WHITE));
			name.setSize(getWidth(), getHeight());
			name.setPosition(0, 30);
			name.setAlignment(Align.center);
			name.setTouchable(Touchable.disabled);
			addActor(name);

			if (starNum >= 1) {
				star1 = new Image(Assets.shared().star_full);
				star1.setSize(25, 25);
				star1.setPosition(15, 5);
				addActor(star1);
			} else {
				star1 = new Image(Assets.shared().star_empty);
				star1.setSize(25, 25);
				star1.setPosition(15, 5);
				addActor(star1);
			}
			star1.setTouchable(Touchable.disabled);

			if (starNum >= 2) {
				star2 = new Image(Assets.shared().star_full);
				star2.setSize(25, 25);
				star2.setPosition(40, 5);
				addActor(star2);
			} else {
				star2 = new Image(Assets.shared().star_empty);
				star2.setSize(25, 25);
				star2.setPosition(40, 5);
				addActor(star2);
			}
			star2.setTouchable(Touchable.disabled);

			if (starNum >= 3) {
				star3 = new Image(Assets.shared().star_full);
				star3.setSize(25, 25);
				star3.setPosition(65, 5);
				addActor(star3);
			} else {
				star3 = new Image(Assets.shared().star_empty);
				star3.setSize(25, 25);
				star3.setPosition(65, 5);
				addActor(star3);
			}
			star3.setTouchable(Touchable.disabled);

			lockImage = new Image(Assets.shared().button_lock);
			lockImage.setSize(getWidth() / 3, getHeight() / 3);
			lockImage.setColor(Color.ORANGE);
			lockImage
					.setPosition(getWidth() / 2 - lockImage.getWidth() / 2, 12);
			lockImage.setVisible(false);
			lockImage.setTouchable(Touchable.disabled);
			addActor(lockImage);

			// event
			addListener(new ClickListener() {
				@Override
				public boolean touchDown(InputEvent event, float x, float y,
						int pointer, int button) {
					// TODO Auto-generated method stub
					if (!lock) {
						Setting.saveDatas[Setting.slotSelected]
								.setLevel(getId());
						FantasyTowerDefend.getManagerScreen().createScreen(
								ManagerScreen.SCREEN_PLAY);
					}
					return super.touchDown(event, x, y, pointer, button);
				}
			});
		}

		public int getId() {
			return id;
		}

		@Override
		public void act(float delta) {
			// TODO Auto-generated method stub
			super.act(delta);
			if (lock) {
				star1.setVisible(false);
				star2.setVisible(false);
				star3.setVisible(false);
				lockImage.setVisible(true);
			} else {
				star1.setVisible(true);
				star2.setVisible(true);
				star3.setVisible(true);
				lockImage.setVisible(false);
			}
		}
	}

	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		if (scrollPane.getScrollX() <= 0)
			back.setVisible(false);
		else
			back.setVisible(true);
		if (scrollPane.getScrollX() >= 505)
			next.setVisible(false);
		else
			next.setVisible(true);
	}
}
