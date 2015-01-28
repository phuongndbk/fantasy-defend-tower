package com.phuongnd.game.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Dialog;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

public class Setting {
	public static boolean soundEnabled = true;
	public static boolean musicEnabled = true;
	public static boolean slot1DataSaved = false;
	public static boolean slot2DataSaved = false;
	public static boolean slot3DataSaved = false;

	public final static String[] names = new String[] { "Phuong", "Nguyen",
			"Duy", "Bach", "Khoa" };
	public final static int[] scores = new int[] { 1000, 800, 600, 400, 200 };
	public final static String file = ".fantasyTowerDefend";

	// Saving Information
	public static SaveData[] saveDatas = new SaveData[] {
			new SaveData("slot1"), new SaveData("slot2"), new SaveData("slot3") };
	public static int slotSelected = 0;
	public static int star = 0;

	// etc...
	public static Skin skin = new Skin(
			Gdx.files.internal("data/uiskin/uiskin.json"));
	public static Dialog dialog;
	public static TextButton btnOK;

	// Restart game
	public static void restart() {

	}

	// Dialog
	public static void showDialog(Stage stage, String title, String text) {

		dialog = new Dialog(title, skin);
		dialog.text("   " + text + "   " + "\n\n\n").show(stage);

		btnOK = new TextButton("OK", skin);
		btnOK.setSize(75, 45);
		btnOK.setPosition(dialog.getWidth() / 2 - btnOK.getWidth() / 2, 10);
		dialog.addActor(btnOK);

		btnOK.addListener(new ClickListener() {
			@Override
			public void touchUp(InputEvent event, float x, float y,
					int pointer, int button) {
				// TODO Auto-generated method stub
				super.touchUp(event, x, y, pointer, button);
				Assets.playSound(Assets.shared().buttonClick);
				dialog.hide();
			}

		});
		dialog.setSize(500, 500);
		dialog.show(stage);
	}

	// Load File
	public static String loadLevel(int level) {
		String kq = "";
		FileHandle handle = Gdx.files.internal("data/level/level_"
				+ String.valueOf(level) + ".txt");
		if (handle != null) {
			kq = handle.readString();
		}
		return kq;
	}

	public static void load() {
		if (Gdx.files.external(file) == null) {
			save();
			return;
		}

		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(Gdx.files.external(
					file).read()));
			soundEnabled = Boolean.parseBoolean(in.readLine());
			musicEnabled = Boolean.parseBoolean(in.readLine());
			slot1DataSaved = Boolean.parseBoolean(in.readLine());
			slot2DataSaved = Boolean.parseBoolean(in.readLine());
			slot3DataSaved = Boolean.parseBoolean(in.readLine());

			for (int i = 0; i < 5; i++) {
				names[i] = in.readLine();
				scores[i] = Integer.parseInt(in.readLine());
			}
		} catch (Throwable e) {
			// :( It's ok we have defaults
		} finally {
			try {
				if (in != null)
					in.close();
			} catch (IOException e) {
			}
		}
	}

	// Save File
	public static void save() {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(Gdx.files.external(
					file).write(false)));
			out.write(Boolean.toString(soundEnabled) + "\n");
			out.write(Boolean.toString(musicEnabled) + "\n");
			out.write(Boolean.toString(slot1DataSaved) + "\n");
			out.write(Boolean.toString(slot2DataSaved) + "\n");
			out.write(Boolean.toString(slot3DataSaved) + "\n");
			for (int i = 0; i < 5; i++) {
				out.write(names[i] + "\n");
				out.write(Integer.toString(scores[i]) + "\n");
			}

		} catch (Throwable e) {
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
			}
		}
	}

	// Add value
	public static void addValue(String name, int score) {
		for (int i = 0; i < 5; i++) {
			if (scores[i] < score) {
				for (int j = 4; j > i; j--) {
					scores[j] = scores[j - 1];
					names[j] = names[j - 1];
				}
				scores[i] = score;
				names[i] = name;
				break;
			}
		}
	}

}