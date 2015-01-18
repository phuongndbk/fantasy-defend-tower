package com.phuongnd.game.controller;

/* **********************************************************************

 Day la class dung de luu lai thong tin Level nguoi choi dang choi.
 Bao gom tat ca cac thong tin can thiet de nguoi choi co the tiep tuc
 choi lai vao lan tiep theo: Tien, diem so, sung, dan, ...

 Chuong trinh se tao 1 file .saveGame va luu vao trong bo nho trong
 cua thiet bi Android. Lan choi tiep theo, chuong trinh se doc file
 nay de thiet lap cac thong so cho tro choi...

 ************************************************************************ */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import com.badlogic.gdx.Gdx;

public class SaveData {

	private int money;
	private int score;
	private int bonusScore;
	private int totalScore;
	private int level;
	private int power;

	public String file;

	// Tao 1 doi tuong de luu vao 1 o nho (co 3 o nho - slot se duoc dung de luu
	// thong tin)
	public SaveData(String fileName) {
		// TODO Auto-generated constructor stub
		this.file = fileName + ".savegame";
		money = 0;
		score = bonusScore = totalScore = 0;
		level = 1;
		power = 3;
	}

	// Thiet lap lai tat ca cac thong so tro choi ve trang thai ban dau
	// Day la dieu can thiet de khi nguoi choi muon xoa du lieu da luu,
	// hoac tao du lieu moi
	public void restart() {
		level = 1;
		money = 0;
		score = bonusScore = totalScore = 0;
		power = 3;
	}

	// Doc file .saveGame da luu trong bo nho trong
	public void load() {
		BufferedReader in = null;
		try {
			in = new BufferedReader(new InputStreamReader(Gdx.files.external(
					file).read()));
			money = Integer.parseInt(in.readLine());
			totalScore = Integer.parseInt(in.readLine());
			level = Integer.parseInt(in.readLine());
			power = Integer.parseInt(in.readLine());
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

	// Luu lai cac thong so vao file .saveGame
	// Neu file chua ton tai, tao 1 file moi
	public void save() {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(Gdx.files.external(
					file).write(false)));
			out.write(Integer.toString(money));
			out.write(Integer.toString(totalScore));
			out.write(Integer.toString(level));
			out.write(Integer.toString(power));
		} catch (Throwable e) {
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
			}
		}
	}

	// Cac ham lay ra va thiet lap lai cac thong so cua tro choi
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getBonusScore() {
		return bonusScore;
	}

	public void setBonusScore(int bonusScore) {
		this.bonusScore = bonusScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

}
