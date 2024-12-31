package com.jbk.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.TeamDao;
import com.jbk.Model.Team;

@Service
public class TeamService {

	@Autowired
	TeamDao teamdao;

	public List<Team> getAllTeams() {
		List<Team> inreturn = teamdao.getAllTeams();
		return inreturn;
	}

	public String addTeam(Team team) {
		String inreturn = teamdao.addTeam(team);
		
		return inreturn;

	}

	public Team addById(String teamId) {
		return teamdao.addById(teamId);
		
	}

	public String updateTeam(String teamId, Team updatedTeam) {
	    return teamdao.updateTeam(teamId, updatedTeam);
	}

	public String deleteTeam(String teamId) {
		return teamdao.deleteTeam(teamId);
	}

}
