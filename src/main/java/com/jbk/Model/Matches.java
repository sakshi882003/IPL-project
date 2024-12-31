package com.jbk.Model;

public class Matches {

	int matchId;
	String date;
	String venue;
	String result;
	String team1;
	String team2;
	
	public Matches() {
		// TODO Auto-generated constructor stub
	}
	public Matches(int matchId, String date, String venue, String result, String team1, String team2) {
		super();
		this.matchId = matchId;
		this.date = date;
		this.venue = venue;
		this.result = result;
		this.team1 = team1;
		this.team2 = team2;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getVenue() {
		return venue;
	}
	public void setVenue(String venue) {
		this.venue = venue;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	@Override
	public String toString() {
		return "Mateches [matchId=" + matchId + ", date=" + date + ", venue=" + venue + ", result=" + result
				+ ", team1=" + team1 + ", team2=" + team2 + "]";
	}
	
	
	
	
	
}
