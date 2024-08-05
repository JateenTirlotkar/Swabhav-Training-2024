package com.model;

public class CricketPlayer {
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int wickets;

	public CricketPlayer() {
	}

	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs, int wickets) {
		this.playerId = playerId;
		this.name = name;
		this.numberOfMatches = numberOfMatches;
		this.runs = runs;
		this.wickets = wickets;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	public void display() {
		System.out.println("PlayerId: " + this.playerId);
		System.out.println("PlayerName: " + this.name);
		System.out.println("Number of Matches Played: " + this.numberOfMatches);
		System.out.println("Runs Scored: " + this.runs);
		System.out.println("Wickets Taken: " + this.wickets);
	}

	public double calculateAverage() {
		if (numberOfMatches == 0) {
			return 0.0;
		}
		return (double) runs / numberOfMatches;
	}
}
