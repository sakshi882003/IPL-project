package com.jbk.Model;

public class Team {

	String teamId;
	String name;
	String city;
	String coach;
	
	public Team() {
		// TODO Auto-generated constructor stub
	}

	public Team(String teamId, String name, String city, String coach) {
		super();
		this.teamId = teamId;
		this.name = name;
		this.city = city;
		this.coach = coach;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", name=" + name + ", city=" + city + ", coach=" + coach + "]";
	}
	
	
}
