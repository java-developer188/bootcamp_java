package com.bootcamp.learning.cricket;

public class Team {
	String name;
	Player[]  players =new Player[12];
	
	protected Team(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Player[] getPlayers() {
		return players;
	}
	public void setPlayers(Player[] players) {
		this.players = players;
	}
	
	
}
