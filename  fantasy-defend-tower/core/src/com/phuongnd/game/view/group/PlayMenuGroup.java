package com.phuongnd.game.view.group;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.phuongnd.game.controller.Assets;
import com.phuongnd.game.controller.Constant;
import com.phuongnd.game.controller.Setting;
import com.phuongnd.game.view.PlayScreen;
import com.phuongnd.game.view.PlayScreen.STATE;

public class PlayMenuGroup extends BaseGroup {

	public Image pauseButton;
	public Image speedButton;
	public Image musicOnButton;
	public Image musicOffButton;
	public Image soundOnButton;
	public Image soundOffButton;
	public Image expandButton;
	public Image unExpandButton;

	public Image pauseButton_press;
	public Image speedButton_press;
	public Image musicOnButton_press;
	public Image musicOffButton_press;
	public Image soundOnButton_press;
	public Image soundOffButton_press;
	public Image expandButton_press;
	public Image unExpandButton_press;

	public float timeClickSpeed;
	public float timeClickExpand;
	public float timeClickUnExpand;
	public float timeClickMusic;
	public float timeClickSound;
	public boolean isClickSpeed;
	public boolean isClickExpand;
	public boolean isClickUnExpand;
	public boolean isClickMusic;
	public boolean isClickSound;
	public boolean isExpand;

	public PlayMenuGroup(PlayScreen screen) {
		super(screen);
		// TODO Auto-generated constructor stub
		initGroup();
	}

	@Override
	public void initGroup() {
		// TODO Auto-generated method stub
		setWidth(Constant.MAP_UNIT_SIZE_WIDTH + 10);
		setHeight(5 * Constant.MAP_UNIT_SIZE_HEIGHT + 50);
		setPosition(10, Constant.HEIGHT - getHeight());
		setTouchable(Touchable.childrenOnly);

		soundOnButton = new Image(Assets.shared().button_sound_on);
		soundOnButton.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		soundOnButton.setVisible(false);
		addActor(soundOnButton);

		soundOnButton_press = new Image(Assets.shared().button_sound_on_click);
		soundOnButton_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		soundOnButton_press.setVisible(false);
		addActor(soundOnButton_press);

		soundOffButton = new Image(Assets.shared().button_sound_off);
		soundOffButton.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		soundOffButton.setVisible(false);
		addActor(soundOffButton);

		soundOffButton_press = new Image(Assets.shared().button_sound_off_click);
		soundOffButton_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		soundOffButton_press.setVisible(false);
		addActor(soundOffButton_press);

		musicOnButton = new Image(Assets.shared().button_music_on);
		musicOnButton.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		musicOnButton.setPosition(0, Constant.MAP_UNIT_SIZE_HEIGHT + 10);
		musicOnButton.setVisible(false);
		addActor(musicOnButton);

		musicOnButton_press = new Image(Assets.shared().button_music_on_click);
		musicOnButton_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		musicOnButton_press.setPosition(0, Constant.MAP_UNIT_SIZE_HEIGHT + 10);
		musicOnButton_press.setVisible(false);
		addActor(musicOnButton_press);

		musicOffButton = new Image(Assets.shared().button_music_off);
		musicOffButton.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		musicOffButton.setPosition(0, Constant.MAP_UNIT_SIZE_HEIGHT + 10);
		musicOffButton.setVisible(false);
		addActor(musicOffButton);

		musicOffButton_press = new Image(Assets.shared().button_music_off_click);
		musicOffButton_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		musicOffButton_press.setPosition(0, Constant.MAP_UNIT_SIZE_HEIGHT + 10);
		musicOffButton_press.setVisible(false);
		addActor(musicOffButton_press);

		speedButton = new Image(Assets.shared().button_speed);
		speedButton.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		speedButton.setPosition(0, 2 * Constant.MAP_UNIT_SIZE_HEIGHT + 20);
		speedButton.setVisible(false);
		addActor(speedButton);

		speedButton_press = new Image(Assets.shared().button_speed_click);
		speedButton_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		speedButton_press
				.setPosition(0, 2 * Constant.MAP_UNIT_SIZE_HEIGHT + 20);
		speedButton_press.setVisible(false);
		addActor(speedButton_press);

		pauseButton = new Image(Assets.shared().button_pause);
		pauseButton.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		pauseButton.setPosition(0, 3 * Constant.MAP_UNIT_SIZE_HEIGHT + 30);
		pauseButton.setVisible(false);
		addActor(pauseButton);

		pauseButton_press = new Image(Assets.shared().button_pause_click);
		pauseButton_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		pauseButton_press
				.setPosition(0, 3 * Constant.MAP_UNIT_SIZE_HEIGHT + 30);
		pauseButton_press.setVisible(false);
		addActor(pauseButton_press);

		expandButton = new Image(Assets.shared().button_downgrade);
		expandButton.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		expandButton.setPosition(0, 4 * Constant.MAP_UNIT_SIZE_HEIGHT + 40);
		addActor(expandButton);

		expandButton_press = new Image(Assets.shared().button_downgrade_click);
		expandButton_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		expandButton_press.setPosition(0,
				4 * Constant.MAP_UNIT_SIZE_HEIGHT + 40);
		expandButton_press.setVisible(false);
		addActor(expandButton_press);

		unExpandButton = new Image(Assets.shared().button_upgrade);
		unExpandButton.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		unExpandButton.setVisible(false);
		unExpandButton.setPosition(0, 4 * Constant.MAP_UNIT_SIZE_HEIGHT + 40);
		addActor(unExpandButton);

		unExpandButton_press = new Image(Assets.shared().button_upgrade_click);
		unExpandButton_press.setSize(Constant.MAP_UNIT_SIZE_WIDTH,
				Constant.MAP_UNIT_SIZE_HEIGHT);
		unExpandButton_press.setVisible(false);
		unExpandButton_press.setPosition(0,
				4 * Constant.MAP_UNIT_SIZE_HEIGHT + 40);
		addActor(unExpandButton_press);

		soundOnButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				Setting.soundEnabled = false;
				soundOnButton.setVisible(true);
				soundOnButton_press.setVisible(false);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				soundOnButton.setVisible(false);
				soundOnButton_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		soundOffButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				Setting.soundEnabled = true;
				soundOffButton.setVisible(true);
				soundOffButton_press.setVisible(false);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				soundOffButton.setVisible(false);
				soundOffButton_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		musicOnButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				Setting.musicEnabled = false;
				Assets.shared().backgroundPlayMusic.pause();
				musicOnButton.setVisible(true);
				musicOnButton_press.setVisible(false);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				musicOnButton.setVisible(false);
				musicOnButton_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		musicOffButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				Setting.musicEnabled = true;
				Assets.shared().backgroundPlayMusic.play();
				musicOffButton.setVisible(true);
				musicOffButton_press.setVisible(false);
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				musicOffButton.setVisible(false);
				musicOffButton_press.setVisible(true);
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		pauseButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (screen.state == STATE.GAME_RUNNING) {
					screen.state = STATE.GAME_PAUSE;
					pauseButton.setVisible(true);
					pauseButton_press.setVisible(false);
				}
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (screen.state == STATE.GAME_RUNNING) {
					pauseButton.setVisible(false);
					pauseButton_press.setVisible(true);
				}
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		speedButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (!isClickSpeed) {
					isClickSpeed = true;
					if (screen.state == STATE.GAME_RUNNING) {
						if (screen.speed == 1) {
							screen.speed = 2;
							speedButton.setColor(Color.GREEN);
						} else {
							screen.speed = 1;
							speedButton.setColor(Color.WHITE);
						}
					}
					speedButton.setVisible(true);
					speedButton_press.setVisible(false);
				}
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (!isClickSpeed) {
					speedButton.setVisible(false);
					speedButton_press.setVisible(true);
				}
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		expandButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (!isClickExpand) {
					isClickExpand = true;
					if (screen.state == STATE.GAME_RUNNING) {
						expandButton_press.setVisible(false);
						expandButton.setVisible(true);
						isExpand = true;
					}
				}
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (!isClickExpand) {
					if (screen.state == STATE.GAME_RUNNING) {
						expandButton.setVisible(false);
						expandButton_press.setVisible(true);
					}
				}
				return super.touchDown(event, x, y, pointer, button);
			}
		});

		unExpandButton.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (!isClickUnExpand) {
					isClickUnExpand = true;
					if (screen.state == STATE.GAME_RUNNING) {
						unExpandButton.setVisible(true);
						unExpandButton_press.setVisible(false);
						isExpand = false;
					}
				}
				super.touchUp(event, x, y, pointer, button);
			}

			@Override
			public boolean touchDown(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				if (!isClickUnExpand) {
					if (screen.state == STATE.GAME_RUNNING) {
						unExpandButton.setVisible(false);
						unExpandButton_press.setVisible(true);
					}
				}
				return super.touchDown(event, x, y, pointer, button);
			}
		});
	}

	@Override
	public void act(float delta) {
		// TODO Auto-generated method stub
		super.act(delta);
		setPosition(getX(), Constant.HEIGHT - getHeight());

		if (isExpand) {
			if (Setting.musicEnabled) {
				musicOnButton.setVisible(true);
				musicOffButton.setVisible(false);
			} else {
				musicOnButton.setVisible(false);
				musicOffButton.setVisible(true);
			}

			if (Setting.soundEnabled) {
				soundOnButton.setVisible(true);
				soundOffButton.setVisible(false);
			} else {
				soundOnButton.setVisible(false);
				soundOffButton.setVisible(true);
			}
			pauseButton.setVisible(true);
			speedButton.setVisible(true);
			expandButton.setVisible(false);
			unExpandButton.setVisible(true);
		} else {
			musicOnButton.setVisible(false);
			musicOffButton.setVisible(false);
			soundOnButton.setVisible(false);
			soundOffButton.setVisible(false);
			pauseButton.setVisible(false);
			speedButton.setVisible(false);
			expandButton.setVisible(true);
			unExpandButton.setVisible(false);
		}

		if (isClickSpeed) {
			timeClickSpeed += delta;
			if (timeClickSpeed >= 1) {
				isClickSpeed = false;
				timeClickSpeed = 0;
			}
		}

		if (isClickExpand) {
			timeClickExpand += delta;
			if (timeClickExpand >= 1) {
				isClickExpand = false;
				timeClickExpand = 0;
			}
		}

		if (isClickUnExpand) {
			timeClickUnExpand += delta;
			if (timeClickUnExpand >= 1) {
				isClickUnExpand = false;
				timeClickUnExpand = 0;
			}
		}

		if (isClickMusic) {
			timeClickMusic += delta;
			if (timeClickMusic >= 1) {
				isClickMusic = false;
				timeClickMusic = 0;
			}
		}

		if (isClickSound) {
			timeClickSound += delta;
			if (timeClickSound >= 1) {
				isClickSound = false;
				timeClickSound = 0;
			}
		}
	}
}
