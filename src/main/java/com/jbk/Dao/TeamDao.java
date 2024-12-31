package com.jbk.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;

import com.jbk.Model.Team;

@Repository
public class TeamDao {
	List<Team> teams = new ArrayList<>();
	 
	@Autowired
	public List<Team> getAllTeams() {

		return teams;
	}

	
	public String addTeam(Team team) {
		teams.add(team);
		return "Added successfully!";
		
	}
	
	public Team addById(String teamId) {
		for (Team team : teams) {
			if(team.getTeamId()==teamId) {
				return team;
			}
			
		}
		return null;
		
		
	}


	public String updateTeam(String teamId, Team updatedTeam) {
	    for (int i = 0; i < teams.size(); i++) {
	        if (teams.get(i).getTeamId().equals(teamId)) {
	            teams.remove(i); 
	            break;
	        }
	    }
	    
	   
	    for (Team team : teams) {
	        if (team.getTeamId().equals(teamId)) {
	            team.setName(updatedTeam.getName());
	            return "Team updated successfully!";
	        }
	    }

	    return "Team with ID " + teamId + " not found.";
	}



	public String deleteTeam(String teamId) {
		for (Team team : teams) {
			if(team.getTeamId().equals(teamId)) {
				teams.remove(team);
				return "deleted successfully!";
			}
		}
		return "Team not found";
	}

	
}
