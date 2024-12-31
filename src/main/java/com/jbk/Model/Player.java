package com.jbk.Model;

public class Player {
private int playerid;
private String name;
private int age;
private String teamid;
private String role;

public Player() {
	// TODO Auto-generated constructor stub
}

public Player(int playerid, String name, int age, String teamid, String role) {
	super();
	this.playerid = playerid;
	this.name = name;
	this.age = age;
	this.teamid = teamid;
	this.role = role;
}

public int getPlayerid() {
	return playerid;
}

public void setPlayerid(int playerid) {
	this.playerid = playerid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getTeamid() {
	return teamid;
}

public void setTeamid(String teamid) {
	this.teamid = teamid;
}

public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

@Override
public String toString() {
	return "Player [playerid=" + playerid + ", name=" + name + ", age=" + age + ", teamid=" + teamid + ", role=" + role
			+ "]";
}



}
