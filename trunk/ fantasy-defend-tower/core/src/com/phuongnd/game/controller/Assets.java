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
	public Texture enemy1;
	public Texture tower1;

	// Texture: Menu Screen, Button, etc...
	public TextureRegion backgroundMenu;
	// Map
	public TextureRegion map_1;
	public TextureRegion map_2;
	public TextureRegion map_3;
	public TextureRegion map_4;

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

	// Enemy
	public Animation enemy1_Animation_Up;
	public Animation enemy1_Animation_Down;
	public Animation enemy1_Animation_Left;
	public Animation enemy1_Animation_Right;

	// Tower
	public Animation tower1_Animation_Up;
	public Animation tower1_Animation_Down;
	public Animation tower1_Animation_Left;
	public Animation tower1_Animation_Right;

	// Music and sound
	public Music backgroundPlayMusic;
	public Sound buttonClick;

	public Assets() {
		Resolution resolution = new Resolution(800, 480, ".800x480");
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
		manager.load(Constant.enemy_1_path, Texture.class);
		manager.load(Constant.tower_1_path, Texture.class);

		/**********************************************************************************************/
		// Maps
		manager.load(Constant.map_atlas_path, TextureAtlas.class);

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
		manager.unload(Constant.enemy_1_path);
		manager.unload(Constant.tower_1_path);
		manager.unload(Constant.map_atlas_path);
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

		enemy1 = manager.get(Constant.enemy_1_path);
		enemy1_Animation_Up = load_AnimationSprite(enemy1, 4, 4, 4, false, 0.2f);
		enemy1_Animation_Down = load_AnimationSprite(enemy1, 4, 4, 1, false,
				0.2f);
		enemy1_Animation_Left = load_AnimationSprite(enemy1, 4, 4, 2, false,
				0.2f);
		enemy1_Animation_Right = load_AnimationSprite(enemy1, 4, 4, 3, false,
				0.2f);

		tower1 = manager.get(Constant.tower_1_path);
		tower1_Animation_Up = load_AnimationSprite(tower1, 4, 4, 4, false, 0.2f);
		tower1_Animation_Down = load_AnimationSprite(tower1, 4, 4, 1, false,
				0.2f);
		tower1_Animation_Left = load_AnimationSprite(tower1, 4, 4, 2, false,
				0.2f);
		tower1_Animation_Right = load_AnimationSprite(tower1, 4, 4, 3, false,
				0.2f);

		// Map atlas
		mapAtlas = manager.get(Constant.map_atlas_path);
		// map_1 = numberAtlas.findRegion("map1");
		// map_2 = numberAtlas.findRegion("map2");
		// map_3 = numberAtlas.findRegion("map3");
		// map_4 = numberAtlas.findRegion("map4");

		// Background, etc
		backgroundMenu = new TextureRegion(
				(Texture) manager.get(Constant.backgroundMenu_path));

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
