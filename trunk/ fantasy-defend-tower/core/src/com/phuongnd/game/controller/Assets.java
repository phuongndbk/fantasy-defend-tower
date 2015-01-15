package com.phuongnd.game.controller;

import com.badlogic.gdx.Gdx;
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

	// Texture: Menu Screen, Button, etc...
	public static TextureRegion backgroundMenu;

	// Font
	public BitmapFont font;

	// Animation
	public TextureAtlas exampleAnimationAtlas;
	public Animation exampleAnimation;

	// Number
	public TextureAtlas numberAtlas;
	public TextureRegion num_empty;
	public TextureRegion num_0;
	public TextureRegion num_2;
	public TextureRegion num_4;
	public TextureRegion num_8;
	public TextureRegion num_16;
	public TextureRegion num_32;
	public TextureRegion num_64;
	public TextureRegion num_128;
	public TextureRegion num_256;
	public TextureRegion num_512;

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

		// Texture: Menu Screen, Button, etc...
		backgroundMenu = loadTextureRegion("data/image/texture/backgroundMenu.png");

		/**********************************************************************************************/
		// Font
		BitmapFontParameter font_parameter = new BitmapFontParameter();
		font_parameter.magFilter = TextureFilter.Linear;
		font_parameter.minFilter = TextureFilter.Linear;
		manager.load(Constant.font_path, BitmapFont.class, font_parameter);

		/**********************************************************************************************/
		// Animation
		manager.load(Constant.example_animation_atlas_path, TextureAtlas.class);

		/**********************************************************************************************/
		// Number
		manager.load(Constant.number_atlas_path, TextureAtlas.class);

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
		manager.unload(Constant.font_path);
		manager.unload(Constant.example_animation_atlas_path);
		manager.unload(Constant.number_atlas_path);
		manager.unload(Constant.backgroundPlayMusic_path);
		manager.unload(Constant.buttonClick_path);
	}

	public void getResource() {
		// Font
		font = manager.get(Constant.font_path);

		// Number atlas
		numberAtlas = manager.get(Constant.number_atlas_path);
		num_empty = numberAtlas.findRegion("empty");
		num_0 = numberAtlas.findRegion("0");
		num_2 = numberAtlas.findRegion("2");
		num_4 = numberAtlas.findRegion("4");
		num_8 = numberAtlas.findRegion("8");
		num_16 = numberAtlas.findRegion("16");
		num_32 = numberAtlas.findRegion("32");
		num_64 = numberAtlas.findRegion("64");
		num_128 = numberAtlas.findRegion("128");
		num_256 = numberAtlas.findRegion("256");
		num_512 = numberAtlas.findRegion("512");

		// Animation
		exampleAnimationAtlas = manager
				.get(Constant.example_animation_atlas_path);
		exampleAnimation = load_Animation(exampleAnimationAtlas, 8, false, 0.1f);

		// Music and Sound
		backgroundPlayMusic = manager.get(Constant.backgroundPlayMusic_path);
		backgroundPlayMusic.setLooping(true);

		buttonClick = manager.get(Constant.buttonClick_path);
	}

	// Load texture
	public Texture loadTexture(String file) {
		return new Texture(Gdx.files.internal(file));
	}

	// Load texture region
	public TextureRegion loadTextureRegion(String path) {
		// Texture.setEnforcePotImages(false);
		return new TextureRegion(new Texture(Gdx.files.internal(path)));
	}

	// Load animation from file
	public Animation load_Animation(TextureAtlas atlas, int count,
			boolean flip, float time) {
		TextureRegion[] arrayTextureRegion = new TextureRegion[count];
		for (int i = 0; i < count; i++) {
			arrayTextureRegion[i] = atlas.findRegion("" + i + 1);
		}
		Animation ani = new Animation(time, flip, arrayTextureRegion);
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

}
