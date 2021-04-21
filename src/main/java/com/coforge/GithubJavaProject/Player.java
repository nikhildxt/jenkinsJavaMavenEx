package com.coforge.GithubJavaProject;

public class Player {
	private int playerNo;
	private String playerName;
	private String state;
	public Player(int playerNo, String playerName, String state) {
		super();
		this.playerNo = playerNo;
		this.playerName = playerName;
		this.state = state;
	}
	
	public int getPlayerNo() {
		return playerNo;
	}
	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
