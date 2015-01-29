package com.phuongnd.game.controller;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.assets.loaders.BitmapFontLoader.BitmapFontParameter;
import com.badlogic.gdx.assets.loaders.TextureLoader;
import com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver;
import com.badlogic.gdx.assets.loaders.resolvers.ResolutionFileResolver;
import com.badlogic.gdx.assets.loaders.resolvers.ResolutionFileResolver.Resolution;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Assets {

	private static Assets _shared;

	public static Assets shared() {
		if (_shared == null) {
			_shared = new Assets();
		}
		return _shared;
	}

	public AssetManager manager;

	// Texture Atlas
	public TextureAtlas exampleAnimationAtlas;
	public TextureAtlas numberAtlas;
	public TextureAtlas mapAtlas;
	public TextureAtlas buttonAtlas;
	public TextureAtlas backgroundAtlas;
	public TextureAtlas circleAtlas;
	public TextureAtlas iconAtlas;
	public TextureAtlas towerAtlas;

	// Texture
	public Texture warrior1;
	public Texture warrior2;
	public Texture warrior3;
	public Texture warrior4;
	public Texture warrior5;
	public Texture hero1;
	public Texture hero2;
	public Texture hero3;
	public Texture hero4;
	public Texture hero5;
	public Texture ninja;

	public Texture enemy1;
	public Texture enemy2;
	public Texture enemy3;
	public Texture enemy4;
	public Texture enemy5;
	public Texture enemy6;
	public Texture enemy7;
	public Texture enemy8;
	public Texture enemy9;
	public Texture enemy10;
	public Texture enemy11;
	public Texture enemy12;
	public Texture enemy13;
	public Texture enemy14;
	public Texture enemy15;
	public Texture enemy16;
	public Texture enemy17;
	public Texture enemy18;
	public Texture enemy19;
	public Texture enemy20;

	public Texture tower1;
	public Texture tower2;
	public Texture tower3;
	public Texture tower4;
	public Texture tower5;
	public Texture tower6;
	public Texture tower7;
	public Texture tower8;
	public Texture tower9;
	public Texture tower10;

	public Texture bullet1;
	public Texture bullet2;

	// Texture: Menu Screen, Button, etc...
	public TextureRegion backgroundMenu;
	public TextureRegion backgroundLevel;
	public TextureRegion backgroundTower;
	public TextureRegion level;
	public TextureRegion slot;
	public TextureRegion star_full;
	public TextureRegion star_empty;

	// Map
	public TextureRegion map_1;
	public TextureRegion map_2;
	public TextureRegion map_3;
	public TextureRegion map_4;

	public TextureRegion tower_1;
	public TextureRegion tower_2;
	public TextureRegion tower_3;
	public TextureRegion tower_4;
	public TextureRegion tower_5;
	public TextureRegion tower_6;
	public TextureRegion tower_7;
	public TextureRegion tower_8;
	public TextureRegion tower_9;
	public TextureRegion tower_10;

	public TextureRegion button_back;
	public TextureRegion button_build;
	public TextureRegion button_coin;
	public TextureRegion button_up;
	public TextureRegion button_down;
	public TextureRegion button_exit;
	public TextureRegion button_heart;
	public TextureRegion button_info;
	public TextureRegion button_library;
	public TextureRegion button_lock;
	public TextureRegion button_mana;
	public TextureRegion button_music_on;
	public TextureRegion button_music_off;
	public TextureRegion button_sound_on;
	public TextureRegion button_sound_off;
	public TextureRegion button_next;
	public TextureRegion button_ok;
	public TextureRegion button_pause;
	public TextureRegion button_play;
	public TextureRegion button_restart;
	public TextureRegion button_setting;
	public TextureRegion button_shop;
	public TextureRegion button_skull;
	public TextureRegion button_speed;
	public TextureRegion button_startWave;
	public TextureRegion button_upgrade;
	public TextureRegion button_downgrade;

	public TextureRegion button_back_click;
	public TextureRegion button_build_click;
	public TextureRegion button_coin_click;
	public TextureRegion button_up_click;
	public TextureRegion button_down_click;
	public TextureRegion button_exit_click;
	public TextureRegion button_heart_click;
	public TextureRegion button_info_click;
	public TextureRegion button_library_click;
	public TextureRegion button_lock_click;
	public TextureRegion button_music_on_click;
	public TextureRegion button_music_off_click;
	public TextureRegion button_sound_on_click;
	public TextureRegion button_sound_off_click;
	public TextureRegion button_next_click;
	public TextureRegion button_ok_click;
	public TextureRegion button_pause_click;
	public TextureRegion button_play_click;
	public TextureRegion button_restart_click;
	public TextureRegion button_setting_click;
	public TextureRegion button_shop_click;
	public TextureRegion button_speed_click;
	public TextureRegion button_startWave_click;
	public TextureRegion button_upgrade_click;
	public TextureRegion button_downgrade_click;

	// Circle
	public TextureRegion tower_range;
	public TextureRegion enemy_range;

	// Skill
	public TextureRegion skill_ninja;
	public TextureRegion skill_hex;
	public TextureRegion skill_teleport;
	public TextureRegion skill_vampire;
	public TextureRegion skill_moon;

	public TextureRegion damage;
	public TextureRegion armor;
	public TextureRegion speed;
	public TextureRegion range;
	public TextureRegion skill;
	public TextureRegion attack_speed;

	// Font
	public BitmapFont font;

	// Animation
	public Animation exampleAnimation;

	// Warrior
	public Animation warrior1_Animation_Up;
	public Animation warrior1_Animation_Down;
	public Animation warrior1_Animation_Left;
	public Animation warrior1_Animation_Right;

	public Animation warrior2_Animation_Up;
	public Animation warrior2_Animation_Down;
	public Animation warrior2_Animation_Left;
	public Animation warrior2_Animation_Right;

	public Animation warrior3_Animation_Up;
	public Animation warrior3_Animation_Down;
	public Animation warrior3_Animation_Left;
	public Animation warrior3_Animation_Right;

	public Animation warrior4_Animation_Up;
	public Animation warrior4_Animation_Down;
	public Animation warrior4_Animation_Left;
	public Animation warrior4_Animation_Right;

	public Animation warrior5_Animation_Up;
	public Animation warrior5_Animation_Down;
	public Animation warrior5_Animation_Left;
	public Animation warrior5_Animation_Right;

	public Animation hero1_Animation_Up;
	public Animation hero1_Animation_Down;
	public Animation hero1_Animation_Left;
	public Animation hero1_Animation_Right;

	public Animation hero2_Animation_Up;
	public Animation hero2_Animation_Down;
	public Animation hero2_Animation_Left;
	public Animation hero2_Animation_Right;

	public Animation hero3_Animation_Up;
	public Animation hero3_Animation_Down;
	public Animation hero3_Animation_Left;
	public Animation hero3_Animation_Right;

	public Animation hero4_Animation_Up;
	public Animation hero4_Animation_Down;
	public Animation hero4_Animation_Left;
	public Animation hero4_Animation_Right;

	public Animation hero5_Animation_Up;
	public Animation hero5_Animation_Down;
	public Animation hero5_Animation_Left;
	public Animation hero5_Animation_Right;

	public Animation ninja_Animation_Up;
	public Animation ninja_Animation_Down;
	public Animation ninja_Animation_Left;
	public Animation ninja_Animation_Right;

	// Enemy
	public Animation enemy1_Animation_Up;
	public Animation enemy1_Animation_Down;
	public Animation enemy1_Animation_Left;
	public Animation enemy1_Animation_Right;

	public Animation enemy2_Animation_Up;
	public Animation enemy2_Animation_Down;
	public Animation enemy2_Animation_Left;
	public Animation enemy2_Animation_Right;

	public Animation enemy3_Animation_Up;
	public Animation enemy3_Animation_Down;
	public Animation enemy3_Animation_Left;
	public Animation enemy3_Animation_Right;

	public Animation enemy4_Animation_Up;
	public Animation enemy4_Animation_Down;
	public Animation enemy4_Animation_Left;
	public Animation enemy4_Animation_Right;

	public Animation enemy5_Animation_Up;
	public Animation enemy5_Animation_Down;
	public Animation enemy5_Animation_Left;
	public Animation enemy5_Animation_Right;

	public Animation enemy6_Animation_Up;
	public Animation enemy6_Animation_Down;
	public Animation enemy6_Animation_Left;
	public Animation enemy6_Animation_Right;

	public Animation enemy7_Animation_Up;
	public Animation enemy7_Animation_Down;
	public Animation enemy7_Animation_Left;
	public Animation enemy7_Animation_Right;

	public Animation enemy8_Animation_Up;
	public Animation enemy8_Animation_Down;
	public Animation enemy8_Animation_Left;
	public Animation enemy8_Animation_Right;

	public Animation enemy9_Animation_Up;
	public Animation enemy9_Animation_Down;
	public Animation enemy9_Animation_Left;
	public Animation enemy9_Animation_Right;

	public Animation enemy10_Animation_Up;
	public Animation enemy10_Animation_Down;
	public Animation enemy10_Animation_Left;
	public Animation enemy10_Animation_Right;

	public Animation enemy11_Animation_Up;
	public Animation enemy11_Animation_Down;
	public Animation enemy11_Animation_Left;
	public Animation enemy11_Animation_Right;

	public Animation enemy12_Animation_Up;
	public Animation enemy12_Animation_Down;
	public Animation enemy12_Animation_Left;
	public Animation enemy12_Animation_Right;

	public Animation enemy13_Animation_Up;
	public Animation enemy13_Animation_Down;
	public Animation enemy13_Animation_Left;
	public Animation enemy13_Animation_Right;

	public Animation enemy14_Animation_Up;
	public Animation enemy14_Animation_Down;
	public Animation enemy14_Animation_Left;
	public Animation enemy14_Animation_Right;

	public Animation enemy15_Animation_Up;
	public Animation enemy15_Animation_Down;
	public Animation enemy15_Animation_Left;
	public Animation enemy15_Animation_Right;

	public Animation enemy16_Animation_Up;
	public Animation enemy16_Animation_Down;
	public Animation enemy16_Animation_Left;
	public Animation enemy16_Animation_Right;

	public Animation enemy17_Animation_Up;
	public Animation enemy17_Animation_Down;
	public Animation enemy17_Animation_Left;
	public Animation enemy17_Animation_Right;

	public Animation enemy18_Animation_Up;
	public Animation enemy18_Animation_Down;
	public Animation enemy18_Animation_Left;
	public Animation enemy18_Animation_Right;

	public Animation enemy19_Animation_Up;
	public Animation enemy19_Animation_Down;
	public Animation enemy19_Animation_Left;
	public Animation enemy19_Animation_Right;

	public Animation enemy20_Animation_Up;
	public Animation enemy20_Animation_Down;
	public Animation enemy20_Animation_Left;
	public Animation enemy20_Animation_Right;

	// Bullet
	public Animation bullet1_Animation_Up;
	public Animation bullet1_Animation_Down;
	public Animation bullet1_Animation_Left;
	public Animation bullet1_Animation_Right;

	public Animation bullet2_Animation_Up;
	public Animation bullet2_Animation_Down;
	public Animation bullet2_Animation_Left;
	public Animation bullet2_Animation_Right;

	// Tower
	// public Animation tower1_Animation_Up;
	// public Animation tower1_Animation_Down;
	// public Animation tower1_Animation_Left;
	// public Animation tower1_Animation_Right;
	//
	// public Animation tower2_Animation_Up;
	// public Animation tower2_Animation_Down;
	// public Animation tower2_Animation_Left;
	// public Animation tower2_Animation_Right;
	//
	// public Animation tower3_Animation_Up;
	// public Animation tower3_Animation_Down;
	// public Animation tower3_Animation_Left;
	// public Animation tower3_Animation_Right;
	//
	// public Animation tower4_Animation_Up;
	// public Animation tower4_Animation_Down;
	// public Animation tower4_Animation_Left;
	// public Animation tower4_Animation_Right;
	//
	// public Animation tower5_Animation_Up;
	// public Animation tower5_Animation_Down;
	// public Animation tower5_Animation_Left;
	// public Animation tower5_Animation_Right;
	//
	// public Animation tower6_Animation_Up;
	// public Animation tower6_Animation_Down;
	// public Animation tower6_Animation_Left;
	// public Animation tower6_Animation_Right;
	//
	// public Animation tower7_Animation_Up;
	// public Animation tower7_Animation_Down;
	// public Animation tower7_Animation_Left;
	// public Animation tower7_Animation_Right;
	//
	// public Animation tower8_Animation_Up;
	// public Animation tower8_Animation_Down;
	// public Animation tower8_Animation_Left;
	// public Animation tower8_Animation_Right;
	//
	// public Animation tower9_Animation_Up;
	// public Animation tower9_Animation_Down;
	// public Animation tower9_Animation_Left;
	// public Animation tower9_Animation_Right;
	//
	// public Animation tower10_Animation_Up;
	// public Animation tower10_Animation_Down;
	// public Animation tower10_Animation_Left;
	// public Animation tower10_Animation_Right;

	// Music and sound
	public Music backgroundPlayMusic;
	public Sound buttonClick;

	public Assets() {
		Resolution[] resolution = { new Resolution(800, 480, ".800x480"),
				new Resolution(320, 480, ".320x480"),
				new Resolution(480, 320, ".480x320"),
				new Resolution(480, 800, ".480x800") };
		ResolutionFileResolver resolver = new ResolutionFileResolver(
				new InternalFileHandleResolver(), resolution);

		manager = new AssetManager();
		manager.setLoader(Texture.class, new TextureLoader(resolver));
	}

	public void load() {

		/**********************************************************************************************/
		manager.clear();

		// Background
		manager.load(Constant.backgroundMenu_path, Texture.class);

		/**********************************************************************************************/
		// Font
		BitmapFontParameter font_parameter = new BitmapFontParameter();
		font_parameter.magFilter = TextureFilter.Linear;
		font_parameter.minFilter = TextureFilter.Linear;
		manager.load(Constant.font_path, BitmapFont.class, font_parameter);

		/**********************************************************************************************/
		// Animation
		manager.load(Constant.example_animation_atlas_path, TextureAtlas.class);

		manager.load(Constant.warrior_1_path, Texture.class);
		manager.load(Constant.warrior_2_path, Texture.class);
		manager.load(Constant.warrior_3_path, Texture.class);
		manager.load(Constant.warrior_4_path, Texture.class);
		manager.load(Constant.warrior_5_path, Texture.class);
		manager.load(Constant.hero_1_path, Texture.class);
		manager.load(Constant.hero_2_path, Texture.class);
		manager.load(Constant.hero_3_path, Texture.class);
		manager.load(Constant.hero_4_path, Texture.class);
		manager.load(Constant.hero_5_path, Texture.class);
		manager.load(Constant.ninja_path, Texture.class);

		manager.load(Constant.enemy_1_path, Texture.class);
		manager.load(Constant.enemy_2_path, Texture.class);
		manager.load(Constant.enemy_3_path, Texture.class);
		manager.load(Constant.enemy_4_path, Texture.class);
		manager.load(Constant.enemy_5_path, Texture.class);
		manager.load(Constant.enemy_6_path, Texture.class);
		manager.load(Constant.enemy_7_path, Texture.class);
		manager.load(Constant.enemy_8_path, Texture.class);
		manager.load(Constant.enemy_9_path, Texture.class);
		manager.load(Constant.enemy_10_path, Texture.class);
		manager.load(Constant.enemy_11_path, Texture.class);
		manager.load(Constant.enemy_12_path, Texture.class);
		manager.load(Constant.enemy_13_path, Texture.class);
		manager.load(Constant.enemy_14_path, Texture.class);
		manager.load(Constant.enemy_15_path, Texture.class);
		manager.load(Constant.enemy_16_path, Texture.class);
		manager.load(Constant.enemy_17_path, Texture.class);
		manager.load(Constant.enemy_18_path, Texture.class);
		manager.load(Constant.enemy_19_path, Texture.class);
		manager.load(Constant.enemy_20_path, Texture.class);

		manager.load(Constant.tower_1_path, Texture.class);
		manager.load(Constant.tower_2_path, Texture.class);
		manager.load(Constant.tower_3_path, Texture.class);
		manager.load(Constant.tower_4_path, Texture.class);
		manager.load(Constant.tower_5_path, Texture.class);
		manager.load(Constant.tower_6_path, Texture.class);
		manager.load(Constant.tower_7_path, Texture.class);
		manager.load(Constant.tower_8_path, Texture.class);
		manager.load(Constant.tower_9_path, Texture.class);
		manager.load(Constant.tower_10_path, Texture.class);

		manager.load(Constant.bullet_1_path, Texture.class);
		manager.load(Constant.bullet_2_path, Texture.class);

		/**********************************************************************************************/
		// Maps
		manager.load(Constant.map_atlas_path, TextureAtlas.class);

		// Background, button, etc
		manager.load(Constant.background_atlas_path, TextureAtlas.class);
		manager.load(Constant.button_atlas_path, TextureAtlas.class);
		manager.load(Constant.circle_atlas_path, TextureAtlas.class);
		manager.load(Constant.icon_atlas_path, TextureAtlas.class);
		manager.load(Constant.tower_atlas_path, TextureAtlas.class);

		/**********************************************************************************************/
		// Music and sound
		// Music
		manager.load(Constant.backgroundPlayMusic_path, Music.class);

		/**********************************************************************************************/
		// Sound
		manager.load(Constant.buttonClick_path, Sound.class);

		// make sure load asset 1 time only
		manager.finishLoading();
		getResource();

		/**********************************************************************************************/
	}

	public void unLoad() {
		manager.unload(Constant.backgroundMenu_path);
		manager.unload(Constant.font_path);
		manager.unload(Constant.example_animation_atlas_path);
		manager.unload(Constant.warrior_1_path);
		manager.unload(Constant.warrior_2_path);
		manager.unload(Constant.warrior_3_path);
		manager.unload(Constant.warrior_4_path);
		manager.unload(Constant.warrior_5_path);
		manager.unload(Constant.hero_1_path);
		manager.unload(Constant.hero_2_path);
		manager.unload(Constant.hero_3_path);
		manager.unload(Constant.hero_4_path);
		manager.unload(Constant.hero_5_path);
		manager.unload(Constant.ninja_path);

		manager.unload(Constant.enemy_1_path);
		manager.unload(Constant.enemy_2_path);
		manager.unload(Constant.enemy_3_path);
		manager.unload(Constant.enemy_4_path);
		manager.unload(Constant.enemy_5_path);
		manager.unload(Constant.enemy_6_path);
		manager.unload(Constant.enemy_7_path);
		manager.unload(Constant.enemy_8_path);
		manager.unload(Constant.enemy_9_path);
		manager.unload(Constant.enemy_10_path);
		manager.unload(Constant.enemy_11_path);
		manager.unload(Constant.enemy_12_path);
		manager.unload(Constant.enemy_13_path);
		manager.unload(Constant.enemy_14_path);
		manager.unload(Constant.enemy_15_path);
		manager.unload(Constant.enemy_16_path);
		manager.unload(Constant.enemy_17_path);
		manager.unload(Constant.enemy_18_path);
		manager.unload(Constant.enemy_19_path);
		manager.unload(Constant.enemy_20_path);

		manager.unload(Constant.tower_1_path);
		manager.unload(Constant.tower_2_path);
		manager.unload(Constant.tower_3_path);
		manager.unload(Constant.tower_4_path);
		manager.unload(Constant.tower_5_path);
		manager.unload(Constant.tower_6_path);
		manager.unload(Constant.tower_7_path);
		manager.unload(Constant.tower_8_path);
		manager.unload(Constant.tower_9_path);
		manager.unload(Constant.tower_10_path);

		manager.unload(Constant.bullet_1_path);
		manager.unload(Constant.bullet_2_path);

		manager.unload(Constant.map_atlas_path);
		manager.unload(Constant.button_atlas_path);
		manager.unload(Constant.circle_atlas_path);
		manager.unload(Constant.icon_atlas_path);
		manager.unload(Constant.tower_atlas_path);

		manager.unload(Constant.background_atlas_path);
		manager.unload(Constant.backgroundPlayMusic_path);
		manager.unload(Constant.buttonClick_path);
	}

	public void getResource() {
		// Font
		font = manager.get(Constant.font_path);

		// Animation
		exampleAnimationAtlas = manager
				.get(Constant.example_animation_atlas_path);
		exampleAnimation = load_AnimationAtlas(exampleAnimationAtlas, 8, false,
				0.1f);

		/**********************************************************************************************/
		// Warrior
		warrior1 = manager.get(Constant.warrior_1_path);
		warrior1_Animation_Up = load_AnimationSprite(warrior1, 4, 4, 4, false,
				0.2f);
		warrior1_Animation_Down = load_AnimationSprite(warrior1, 4, 4, 1,
				false, 0.2f);
		warrior1_Animation_Left = load_AnimationSprite(warrior1, 4, 4, 2,
				false, 0.2f);
		warrior1_Animation_Right = load_AnimationSprite(warrior1, 4, 4, 3,
				false, 0.2f);

		warrior2 = manager.get(Constant.warrior_2_path);
		warrior2_Animation_Up = load_AnimationSprite(warrior2, 4, 4, 4, false,
				0.2f);
		warrior2_Animation_Down = load_AnimationSprite(warrior2, 4, 4, 1,
				false, 0.2f);
		warrior2_Animation_Left = load_AnimationSprite(warrior2, 4, 4, 2,
				false, 0.2f);
		warrior2_Animation_Right = load_AnimationSprite(warrior2, 4, 4, 3,
				false, 0.2f);

		warrior3 = manager.get(Constant.warrior_3_path);
		warrior3_Animation_Up = load_AnimationSprite(warrior3, 4, 4, 4, false,
				0.2f);
		warrior3_Animation_Down = load_AnimationSprite(warrior3, 4, 4, 1,
				false, 0.2f);
		warrior3_Animation_Left = load_AnimationSprite(warrior3, 4, 4, 2,
				false, 0.2f);
		warrior3_Animation_Right = load_AnimationSprite(warrior3, 4, 4, 3,
				false, 0.2f);

		warrior4 = manager.get(Constant.warrior_4_path);
		warrior4_Animation_Up = load_AnimationSprite(warrior4, 4, 4, 4, false,
				0.2f);
		warrior4_Animation_Down = load_AnimationSprite(warrior4, 4, 4, 1,
				false, 0.2f);
		warrior4_Animation_Left = load_AnimationSprite(warrior4, 4, 4, 2,
				false, 0.2f);
		warrior4_Animation_Right = load_AnimationSprite(warrior4, 4, 4, 3,
				false, 0.2f);

		warrior5 = manager.get(Constant.warrior_5_path);
		warrior5_Animation_Up = load_AnimationSprite(warrior5, 4, 4, 4, false,
				0.2f);
		warrior5_Animation_Down = load_AnimationSprite(warrior5, 4, 4, 1,
				false, 0.2f);
		warrior5_Animation_Left = load_AnimationSprite(warrior5, 4, 4, 2,
				false, 0.2f);
		warrior5_Animation_Right = load_AnimationSprite(warrior5, 4, 4, 3,
				false, 0.2f);

		hero1 = manager.get(Constant.hero_1_path);
		hero1_Animation_Up = load_AnimationSprite(hero1, 4, 4, 4, false, 0.2f);
		hero1_Animation_Down = load_AnimationSprite(hero1, 4, 4, 1, false, 0.2f);
		hero1_Animation_Left = load_AnimationSprite(hero1, 4, 4, 2, false, 0.2f);
		hero1_Animation_Right = load_AnimationSprite(hero1, 4, 4, 3, false,
				0.2f);

		hero2 = manager.get(Constant.hero_2_path);
		hero2_Animation_Up = load_AnimationSprite(hero2, 4, 4, 4, false, 0.2f);
		hero2_Animation_Down = load_AnimationSprite(hero2, 4, 4, 1, false, 0.2f);
		hero2_Animation_Left = load_AnimationSprite(hero2, 4, 4, 2, false, 0.2f);
		hero2_Animation_Right = load_AnimationSprite(hero2, 4, 4, 3, false,
				0.2f);

		hero3 = manager.get(Constant.hero_3_path);
		hero3_Animation_Up = load_AnimationSprite(hero3, 4, 4, 4, false, 0.2f);
		hero3_Animation_Down = load_AnimationSprite(hero3, 4, 4, 1, false, 0.2f);
		hero3_Animation_Left = load_AnimationSprite(hero3, 4, 4, 2, false, 0.2f);
		hero3_Animation_Right = load_AnimationSprite(hero3, 4, 4, 3, false,
				0.2f);

		hero4 = manager.get(Constant.hero_4_path);
		hero4_Animation_Up = load_AnimationSprite(hero4, 4, 4, 4, false, 0.2f);
		hero4_Animation_Down = load_AnimationSprite(hero4, 4, 4, 1, false, 0.2f);
		hero4_Animation_Left = load_AnimationSprite(hero4, 4, 4, 2, false, 0.2f);
		hero4_Animation_Right = load_AnimationSprite(hero4, 4, 4, 3, false,
				0.2f);

		hero5 = manager.get(Constant.hero_5_path);
		hero5_Animation_Up = load_AnimationSprite(hero5, 4, 4, 4, false, 0.2f);
		hero5_Animation_Down = load_AnimationSprite(hero5, 4, 4, 1, false, 0.2f);
		hero5_Animation_Left = load_AnimationSprite(hero5, 4, 4, 2, false, 0.2f);
		hero5_Animation_Right = load_AnimationSprite(hero5, 4, 4, 3, false,
				0.2f);

		ninja = manager.get(Constant.ninja_path);
		ninja_Animation_Up = load_AnimationSprite(ninja, 4, 4, 4, false, 0.2f);
		ninja_Animation_Down = load_AnimationSprite(ninja, 4, 4, 1, false, 0.2f);
		ninja_Animation_Left = load_AnimationSprite(ninja, 4, 4, 2, false, 0.2f);
		ninja_Animation_Right = load_AnimationSprite(ninja, 4, 4, 3, false,
				0.2f);

		/**********************************************************************************************/
		// Enemy
		enemy1 = manager.get(Constant.enemy_1_path);
		enemy1_Animation_Up = load_AnimationSprite(enemy1, 4, 4, 4, false, 0.2f);
		enemy1_Animation_Down = load_AnimationSprite(enemy1, 4, 4, 1, false,
				0.2f);
		enemy1_Animation_Left = load_AnimationSprite(enemy1, 4, 4, 2, false,
				0.2f);
		enemy1_Animation_Right = load_AnimationSprite(enemy1, 4, 4, 3, false,
				0.2f);

		enemy2 = manager.get(Constant.enemy_2_path);
		enemy2_Animation_Up = load_AnimationSprite(enemy2, 4, 4, 4, false, 0.2f);
		enemy2_Animation_Down = load_AnimationSprite(enemy2, 4, 4, 1, false,
				0.2f);
		enemy2_Animation_Left = load_AnimationSprite(enemy2, 4, 4, 2, false,
				0.2f);
		enemy2_Animation_Right = load_AnimationSprite(enemy2, 4, 4, 3, false,
				0.2f);

		enemy3 = manager.get(Constant.enemy_3_path);
		enemy3_Animation_Up = load_AnimationSprite(enemy3, 4, 4, 4, false, 0.2f);
		enemy3_Animation_Down = load_AnimationSprite(enemy3, 4, 4, 1, false,
				0.2f);
		enemy3_Animation_Left = load_AnimationSprite(enemy3, 4, 4, 2, false,
				0.2f);
		enemy3_Animation_Right = load_AnimationSprite(enemy3, 4, 4, 3, false,
				0.2f);

		enemy4 = manager.get(Constant.enemy_4_path);
		enemy4_Animation_Up = load_AnimationSprite(enemy4, 4, 4, 4, false, 0.2f);
		enemy4_Animation_Down = load_AnimationSprite(enemy4, 4, 4, 1, false,
				0.2f);
		enemy4_Animation_Left = load_AnimationSprite(enemy4, 4, 4, 2, false,
				0.2f);
		enemy4_Animation_Right = load_AnimationSprite(enemy4, 4, 4, 3, false,
				0.2f);

		enemy5 = manager.get(Constant.enemy_5_path);
		enemy5_Animation_Up = load_AnimationSprite(enemy5, 4, 4, 4, false, 0.2f);
		enemy5_Animation_Down = load_AnimationSprite(enemy5, 4, 4, 1, false,
				0.2f);
		enemy5_Animation_Left = load_AnimationSprite(enemy5, 4, 4, 2, false,
				0.2f);
		enemy5_Animation_Right = load_AnimationSprite(enemy5, 4, 4, 3, false,
				0.2f);

		enemy6 = manager.get(Constant.enemy_6_path);
		enemy6_Animation_Up = load_AnimationSprite(enemy6, 4, 4, 4, false, 0.2f);
		enemy6_Animation_Down = load_AnimationSprite(enemy6, 4, 4, 1, false,
				0.2f);
		enemy6_Animation_Left = load_AnimationSprite(enemy6, 4, 4, 2, false,
				0.2f);
		enemy6_Animation_Right = load_AnimationSprite(enemy6, 4, 4, 3, false,
				0.2f);

		enemy7 = manager.get(Constant.enemy_7_path);
		enemy7_Animation_Up = load_AnimationSprite(enemy7, 4, 4, 4, false, 0.2f);
		enemy7_Animation_Down = load_AnimationSprite(enemy7, 4, 4, 1, false,
				0.2f);
		enemy7_Animation_Left = load_AnimationSprite(enemy7, 4, 4, 2, false,
				0.2f);
		enemy7_Animation_Right = load_AnimationSprite(enemy7, 4, 4, 3, false,
				0.2f);

		enemy8 = manager.get(Constant.enemy_8_path);
		enemy8_Animation_Up = load_AnimationSprite(enemy8, 4, 4, 4, false, 0.2f);
		enemy8_Animation_Down = load_AnimationSprite(enemy8, 4, 4, 1, false,
				0.2f);
		enemy8_Animation_Left = load_AnimationSprite(enemy8, 4, 4, 2, false,
				0.2f);
		enemy8_Animation_Right = load_AnimationSprite(enemy8, 4, 4, 3, false,
				0.2f);

		enemy9 = manager.get(Constant.enemy_9_path);
		enemy9_Animation_Up = load_AnimationSprite(enemy9, 4, 4, 4, false, 0.2f);
		enemy9_Animation_Down = load_AnimationSprite(enemy9, 4, 4, 1, false,
				0.2f);
		enemy9_Animation_Left = load_AnimationSprite(enemy9, 4, 4, 2, false,
				0.2f);
		enemy9_Animation_Right = load_AnimationSprite(enemy9, 4, 4, 3, false,
				0.2f);

		enemy10 = manager.get(Constant.enemy_10_path);
		enemy10_Animation_Up = load_AnimationSprite(enemy10, 4, 4, 4, false,
				0.2f);
		enemy10_Animation_Down = load_AnimationSprite(enemy10, 4, 4, 1, false,
				0.2f);
		enemy10_Animation_Left = load_AnimationSprite(enemy10, 4, 4, 2, false,
				0.2f);
		enemy10_Animation_Right = load_AnimationSprite(enemy10, 4, 4, 3, false,
				0.2f);

		enemy11 = manager.get(Constant.enemy_11_path);
		enemy11_Animation_Up = load_AnimationSprite(enemy11, 4, 4, 4, false,
				0.2f);
		enemy11_Animation_Down = load_AnimationSprite(enemy11, 4, 4, 1, false,
				0.2f);
		enemy11_Animation_Left = load_AnimationSprite(enemy11, 4, 4, 2, false,
				0.2f);
		enemy11_Animation_Right = load_AnimationSprite(enemy11, 4, 4, 3, false,
				0.2f);

		enemy12 = manager.get(Constant.enemy_12_path);
		enemy12_Animation_Up = load_AnimationSprite(enemy12, 4, 4, 4, false,
				0.2f);
		enemy12_Animation_Down = load_AnimationSprite(enemy12, 4, 4, 1, false,
				0.2f);
		enemy12_Animation_Left = load_AnimationSprite(enemy12, 4, 4, 2, false,
				0.2f);
		enemy12_Animation_Right = load_AnimationSprite(enemy12, 4, 4, 3, false,
				0.2f);

		enemy13 = manager.get(Constant.enemy_13_path);
		enemy13_Animation_Up = load_AnimationSprite(enemy13, 4, 4, 4, false,
				0.2f);
		enemy13_Animation_Down = load_AnimationSprite(enemy13, 4, 4, 1, false,
				0.2f);
		enemy13_Animation_Left = load_AnimationSprite(enemy13, 4, 4, 2, false,
				0.2f);
		enemy13_Animation_Right = load_AnimationSprite(enemy13, 4, 4, 3, false,
				0.2f);

		enemy14 = manager.get(Constant.enemy_14_path);
		enemy14_Animation_Up = load_AnimationSprite(enemy14, 4, 4, 4, false,
				0.2f);
		enemy14_Animation_Down = load_AnimationSprite(enemy14, 4, 4, 1, false,
				0.2f);
		enemy14_Animation_Left = load_AnimationSprite(enemy14, 4, 4, 2, false,
				0.2f);
		enemy14_Animation_Right = load_AnimationSprite(enemy14, 4, 4, 3, false,
				0.2f);

		enemy15 = manager.get(Constant.enemy_15_path);
		enemy15_Animation_Up = load_AnimationSprite(enemy15, 4, 4, 4, false,
				0.2f);
		enemy15_Animation_Down = load_AnimationSprite(enemy15, 4, 4, 1, false,
				0.2f);
		enemy15_Animation_Left = load_AnimationSprite(enemy15, 4, 4, 2, false,
				0.2f);
		enemy15_Animation_Right = load_AnimationSprite(enemy15, 4, 4, 3, false,
				0.2f);

		enemy16 = manager.get(Constant.enemy_16_path);
		enemy16_Animation_Up = load_AnimationSprite(enemy16, 4, 4, 4, false,
				0.2f);
		enemy16_Animation_Down = load_AnimationSprite(enemy16, 4, 4, 1, false,
				0.2f);
		enemy16_Animation_Left = load_AnimationSprite(enemy16, 4, 4, 2, false,
				0.2f);
		enemy16_Animation_Right = load_AnimationSprite(enemy16, 4, 4, 3, false,
				0.2f);

		enemy17 = manager.get(Constant.enemy_17_path);
		enemy17_Animation_Up = load_AnimationSprite(enemy17, 4, 4, 4, false,
				0.2f);
		enemy17_Animation_Down = load_AnimationSprite(enemy17, 4, 4, 1, false,
				0.2f);
		enemy17_Animation_Left = load_AnimationSprite(enemy17, 4, 4, 2, false,
				0.2f);
		enemy17_Animation_Right = load_AnimationSprite(enemy17, 4, 4, 3, false,
				0.2f);

		enemy18 = manager.get(Constant.enemy_18_path);
		enemy18_Animation_Up = load_AnimationSprite(enemy18, 4, 4, 4, false,
				0.2f);
		enemy18_Animation_Down = load_AnimationSprite(enemy18, 4, 4, 1, false,
				0.2f);
		enemy18_Animation_Left = load_AnimationSprite(enemy18, 4, 4, 2, false,
				0.2f);
		enemy18_Animation_Right = load_AnimationSprite(enemy18, 4, 4, 3, false,
				0.2f);

		enemy19 = manager.get(Constant.enemy_19_path);
		enemy19_Animation_Up = load_AnimationSprite(enemy19, 4, 4, 4, false,
				0.2f);
		enemy19_Animation_Down = load_AnimationSprite(enemy19, 4, 4, 1, false,
				0.2f);
		enemy19_Animation_Left = load_AnimationSprite(enemy19, 4, 4, 2, false,
				0.2f);
		enemy19_Animation_Right = load_AnimationSprite(enemy19, 4, 4, 3, false,
				0.2f);

		enemy20 = manager.get(Constant.enemy_20_path);
		enemy20_Animation_Up = load_AnimationSprite(enemy20, 4, 4, 4, false,
				0.2f);
		enemy20_Animation_Down = load_AnimationSprite(enemy20, 4, 4, 1, false,
				0.2f);
		enemy20_Animation_Left = load_AnimationSprite(enemy20, 4, 4, 2, false,
				0.2f);
		enemy20_Animation_Right = load_AnimationSprite(enemy20, 4, 4, 3, false,
				0.2f);

		/**********************************************************************************************/
		// Tower
		// tower1 = manager.get(Constant.tower_1_path);
		// tower1_Animation_Up = load_AnimationSprite(tower1, 4, 4, 4, false,
		// 0.2f);
		// tower1_Animation_Down = load_AnimationSprite(tower1, 4, 4, 1, false,
		// 0.2f);
		// tower1_Animation_Left = load_AnimationSprite(tower1, 4, 4, 2, false,
		// 0.2f);
		// tower1_Animation_Right = load_AnimationSprite(tower1, 4, 4, 3, false,
		// 0.2f);
		//
		// tower2 = manager.get(Constant.tower_2_path);
		// tower2_Animation_Up = load_AnimationSprite(tower2, 4, 4, 4, false,
		// 0.2f);
		// tower2_Animation_Down = load_AnimationSprite(tower2, 4, 4, 1, false,
		// 0.2f);
		// tower2_Animation_Left = load_AnimationSprite(tower2, 4, 4, 2, false,
		// 0.2f);
		// tower2_Animation_Right = load_AnimationSprite(tower2, 4, 4, 3, false,
		// 0.2f);
		//
		// tower3 = manager.get(Constant.tower_3_path);
		// tower3_Animation_Up = load_AnimationSprite(tower3, 4, 4, 4, false,
		// 0.2f);
		// tower3_Animation_Down = load_AnimationSprite(tower3, 4, 4, 1, false,
		// 0.2f);
		// tower3_Animation_Left = load_AnimationSprite(tower3, 4, 4, 2, false,
		// 0.2f);
		// tower3_Animation_Right = load_AnimationSprite(tower3, 4, 4, 3, false,
		// 0.2f);
		//
		// tower4 = manager.get(Constant.tower_4_path);
		// tower4_Animation_Up = load_AnimationSprite(tower4, 4, 4, 4, false,
		// 0.2f);
		// tower4_Animation_Down = load_AnimationSprite(tower4, 4, 4, 1, false,
		// 0.2f);
		// tower4_Animation_Left = load_AnimationSprite(tower4, 4, 4, 2, false,
		// 0.2f);
		// tower4_Animation_Right = load_AnimationSprite(tower4, 4, 4, 3, false,
		// 0.2f);
		//
		// tower5 = manager.get(Constant.tower_5_path);
		// tower5_Animation_Up = load_AnimationSprite(tower5, 4, 4, 4, false,
		// 0.2f);
		// tower5_Animation_Down = load_AnimationSprite(tower5, 4, 4, 1, false,
		// 0.2f);
		// tower5_Animation_Left = load_AnimationSprite(tower5, 4, 4, 2, false,
		// 0.2f);
		// tower5_Animation_Right = load_AnimationSprite(tower5, 4, 4, 3, false,
		// 0.2f);
		//
		// tower6 = manager.get(Constant.tower_6_path);
		// tower6_Animation_Up = load_AnimationSprite(tower6, 4, 4, 4, false,
		// 0.2f);
		// tower6_Animation_Down = load_AnimationSprite(tower6, 4, 4, 1, false,
		// 0.2f);
		// tower6_Animation_Left = load_AnimationSprite(tower6, 4, 4, 2, false,
		// 0.2f);
		// tower6_Animation_Right = load_AnimationSprite(tower6, 4, 4, 3, false,
		// 0.2f);
		//
		// tower7 = manager.get(Constant.tower_7_path);
		// tower7_Animation_Up = load_AnimationSprite(tower7, 4, 4, 4, false,
		// 0.2f);
		// tower7_Animation_Down = load_AnimationSprite(tower7, 4, 4, 1, false,
		// 0.2f);
		// tower7_Animation_Left = load_AnimationSprite(tower7, 4, 4, 2, false,
		// 0.2f);
		// tower7_Animation_Right = load_AnimationSprite(tower7, 4, 4, 3, false,
		// 0.2f);
		//
		// tower8 = manager.get(Constant.tower_8_path);
		// tower8_Animation_Up = load_AnimationSprite(tower8, 4, 4, 4, false,
		// 0.2f);
		// tower8_Animation_Down = load_AnimationSprite(tower8, 4, 4, 1, false,
		// 0.2f);
		// tower8_Animation_Left = load_AnimationSprite(tower8, 4, 4, 2, false,
		// 0.2f);
		// tower8_Animation_Right = load_AnimationSprite(tower8, 4, 4, 3, false,
		// 0.2f);
		//
		// tower9 = manager.get(Constant.tower_9_path);
		// tower9_Animation_Up = load_AnimationSprite(tower9, 4, 4, 4, false,
		// 0.2f);
		// tower9_Animation_Down = load_AnimationSprite(tower9, 4, 4, 1, false,
		// 0.2f);
		// tower9_Animation_Left = load_AnimationSprite(tower9, 4, 4, 2, false,
		// 0.2f);
		// tower9_Animation_Right = load_AnimationSprite(tower9, 4, 4, 3, false,
		// 0.2f);
		//
		// tower10 = manager.get(Constant.tower_10_path);
		// tower10_Animation_Up = load_AnimationSprite(tower10, 4, 4, 4, false,
		// 0.2f);
		// tower10_Animation_Down = load_AnimationSprite(tower10, 4, 4, 1,
		// false,
		// 0.2f);
		// tower10_Animation_Left = load_AnimationSprite(tower10, 4, 4, 2,
		// false,
		// 0.2f);
		// tower10_Animation_Right = load_AnimationSprite(tower10, 4, 4, 3,
		// false,
		// 0.2f);

		/**********************************************************************************************/
		// Bullet
		bullet1 = manager.get(Constant.bullet_1_path);
		bullet1_Animation_Up = load_AnimationSprite(bullet1, 4, 4, 4, false,
				0.2f);
		bullet1_Animation_Down = load_AnimationSprite(bullet1, 4, 4, 1, false,
				0.2f);
		bullet1_Animation_Left = load_AnimationSprite(bullet1, 4, 4, 2, false,
				0.2f);
		bullet1_Animation_Right = load_AnimationSprite(bullet1, 4, 4, 3, false,
				0.2f);

		bullet2 = manager.get(Constant.bullet_2_path);
		bullet2_Animation_Up = load_AnimationSprite(bullet2, 4, 4, 4, false,
				0.2f);
		bullet2_Animation_Down = load_AnimationSprite(bullet2, 4, 4, 1, false,
				0.2f);
		bullet2_Animation_Left = load_AnimationSprite(bullet2, 4, 4, 2, false,
				0.2f);
		bullet2_Animation_Right = load_AnimationSprite(bullet2, 4, 4, 3, false,
				0.2f);

		/**********************************************************************************************/
		// Map atlas
		mapAtlas = manager.get(Constant.map_atlas_path);
		map_1 = mapAtlas.findRegion("map1");
		map_2 = mapAtlas.findRegion("map2");
		map_3 = mapAtlas.findRegion("map3");
		map_4 = mapAtlas.findRegion("map4");

		/**********************************************************************************************/
		// Background, etc
		backgroundMenu = new TextureRegion(
				(Texture) manager.get(Constant.backgroundMenu_path));
		backgroundAtlas = manager.get(Constant.background_atlas_path);
		backgroundLevel = backgroundAtlas.findRegion("background_level");
		backgroundTower = backgroundAtlas.findRegion("background_tower");
		level = backgroundAtlas.findRegion("level");
		slot = backgroundAtlas.findRegion("slot");
		star_full = backgroundAtlas.findRegion("star_full");
		star_empty = backgroundAtlas.findRegion("star_empty");

		// Button
		buttonAtlas = manager.get(Constant.button_atlas_path);
		button_back = buttonAtlas.findRegion("back");
		button_build = buttonAtlas.findRegion("build");
		button_coin = buttonAtlas.findRegion("coin");
		button_up = buttonAtlas.findRegion("up");
		button_down = buttonAtlas.findRegion("down");
		button_exit = buttonAtlas.findRegion("exit");
		button_heart = buttonAtlas.findRegion("heart");
		button_info = buttonAtlas.findRegion("info");
		button_library = buttonAtlas.findRegion("library");
		button_lock = buttonAtlas.findRegion("lock");
		button_mana = buttonAtlas.findRegion("mana");
		button_music_on = buttonAtlas.findRegion("music_on");
		button_music_off = buttonAtlas.findRegion("music_off");
		button_sound_on = buttonAtlas.findRegion("sound_on");
		button_sound_off = buttonAtlas.findRegion("sound_off");
		button_next = buttonAtlas.findRegion("next");
		button_ok = buttonAtlas.findRegion("ok");
		button_pause = buttonAtlas.findRegion("pause");
		button_play = buttonAtlas.findRegion("play");
		button_restart = buttonAtlas.findRegion("restart");
		button_setting = buttonAtlas.findRegion("setting");
		button_shop = buttonAtlas.findRegion("shop");
		button_skull = buttonAtlas.findRegion("skull");
		button_speed = buttonAtlas.findRegion("speed");
		button_startWave = buttonAtlas.findRegion("startWave");
		button_upgrade = buttonAtlas.findRegion("upgrade");
		button_downgrade = buttonAtlas.findRegion("downgrade");

		button_back_click = buttonAtlas.findRegion("back_press");
		button_build_click = buttonAtlas.findRegion("build_press");
		button_coin_click = buttonAtlas.findRegion("coin_press");
		button_up_click = buttonAtlas.findRegion("up_press");
		button_down_click = buttonAtlas.findRegion("down_press");
		button_exit_click = buttonAtlas.findRegion("exit_press");
		button_heart_click = buttonAtlas.findRegion("heart_press");
		button_info_click = buttonAtlas.findRegion("info_press");
		button_library_click = buttonAtlas.findRegion("library_press");
		button_lock_click = buttonAtlas.findRegion("lock_press");
		button_music_on_click = buttonAtlas.findRegion("music_on_press");
		button_music_off_click = buttonAtlas.findRegion("music_off_press");
		button_sound_on_click = buttonAtlas.findRegion("sound_on_press");
		button_sound_off_click = buttonAtlas.findRegion("sound_off_press");
		button_next_click = buttonAtlas.findRegion("next_press");
		button_ok_click = buttonAtlas.findRegion("ok_press");
		button_pause_click = buttonAtlas.findRegion("pause_press");
		button_play_click = buttonAtlas.findRegion("play_press");
		button_restart_click = buttonAtlas.findRegion("restart_press");
		button_setting_click = buttonAtlas.findRegion("setting_press");
		button_shop_click = buttonAtlas.findRegion("shop_press");
		button_speed_click = buttonAtlas.findRegion("speed_press");
		button_startWave_click = buttonAtlas.findRegion("startWave_press");
		button_upgrade_click = buttonAtlas.findRegion("upgrade_press");
		button_downgrade_click = buttonAtlas.findRegion("downgrade_press");

		// Circle
		circleAtlas = manager.get(Constant.circle_atlas_path);
		tower_range = circleAtlas.findRegion("tower");
		enemy_range = circleAtlas.findRegion("enemy");

		// Skill
		iconAtlas = manager.get(Constant.icon_atlas_path);
		skill_ninja = iconAtlas.findRegion("ninja");
		skill_hex = iconAtlas.findRegion("hex");
		skill_teleport = iconAtlas.findRegion("teleport");
		skill_vampire = iconAtlas.findRegion("vampire");
		skill_moon = iconAtlas.findRegion("moon");

		damage = iconAtlas.findRegion("damage");
		armor = iconAtlas.findRegion("armor");
		speed = iconAtlas.findRegion("speed");
		range = iconAtlas.findRegion("range");
		skill = iconAtlas.findRegion("skill");
		attack_speed = iconAtlas.findRegion("attack_speed");

		/**********************************************************************************************/
		// Tower atlas
		towerAtlas = manager.get(Constant.tower_atlas_path);
		tower_1 = towerAtlas.findRegion("tower1");
		tower_2 = towerAtlas.findRegion("tower1");
		tower_3 = towerAtlas.findRegion("tower1");
		tower_4 = towerAtlas.findRegion("tower1");
		tower_5 = towerAtlas.findRegion("tower1");
		tower_6 = towerAtlas.findRegion("tower2");
		tower_7 = towerAtlas.findRegion("tower3");
		tower_8 = towerAtlas.findRegion("tower4");
		tower_9 = towerAtlas.findRegion("tower5");
		tower_10 = towerAtlas.findRegion("tower6");

		/**********************************************************************************************/
		// Music and Sound
		backgroundPlayMusic = manager.get(Constant.backgroundPlayMusic_path);
		backgroundPlayMusic.setLooping(true);

		buttonClick = manager.get(Constant.buttonClick_path);
	}

	// Load animation from file
	public Animation load_AnimationSprite(Texture image, int row, int col,
			int pos, boolean flip, float time) {
		TextureRegion[][] temp = TextureRegion.split(image, image.getWidth()
				/ col, image.getHeight() / row);
		TextureRegion[] temp2 = new TextureRegion[row * col];
		TextureRegion[] temp3 = new TextureRegion[col];
		int index = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				temp2[index++] = temp[i][j];
			}
		}
		for (int i = 0; i < col; i++) {
			temp3[i] = temp2[(pos - 1) * col + i];
		}
		Animation ani = new Animation(time, flip, temp3);
		temp = null;
		temp2 = null;
		temp3 = null;
		return ani;
	}

	public Animation load_AnimationAtlas(TextureAtlas atlas, int count,
			boolean flip, float time) {
		TextureRegion[] arrayTextureRegion = new TextureRegion[count];
		for (int i = 0; i < count; i++) {
			arrayTextureRegion[i] = atlas.findRegion(String.valueOf(i + 1));
		}
		Animation ani = new Animation(time, flip, arrayTextureRegion);
		arrayTextureRegion = null;
		return ani;
	}

	// Play Sound
	public static void playSound(Sound sound) {
		if (Setting.soundEnabled) {
			sound.play(1);
		}
	}

	// Play Music
	public static void playMusic(Music music) {
		if (Setting.soundEnabled) {
			music.play();
		}
	}

	public void dispose() {
		unLoad();
	}

}
