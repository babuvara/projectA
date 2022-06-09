package com.chainsys.projectA.beans;

public class ScoreBoard {
	public int targetScore;

	private ScoreBoard() {
		System.out.println("Scoreboard object is created");
	}
	private ScoreBoard(int runs) {
		targetScore = runs;
		System.out.println("Scoreboard object is created");
	}
// factory method
	public static ScoreBoard createObject() {
		return new ScoreBoard(240);
	}
	public static ScoreBoard createObject(int runs) {
		return new ScoreBoard(runs);
	}
}