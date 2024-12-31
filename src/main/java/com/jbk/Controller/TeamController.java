package com.jbk.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.Model.Team;
import com.jbk.Service.TeamService;

@RestController
public class TeamController {

	@Autowired
	TeamService teamservice;
	
	@GetMapping("/api/teams")
	public List<Team> getAllTeams() {
		List<Team> inreturn=teamservice.getAllTeams();
		return inreturn;

	}
	
	@PostMapping( "/api/teams1")
	public String addTeam(@RequestBody Team team) {
		String inreturn=teamservice.addTeam(team);
		return inreturn;
		
	}
	
	@GetMapping("/api/teamsid")
	public Team addById(@RequestParam String teamId) {
		Team inreturn=teamservice.addById(teamId);
		if (inreturn == null) {
            throw new IllegalArgumentException("Team with ID " + teamId + " not found.");
        }

		return inreturn;
		
	}
	
	@PutMapping("/api/teamsup")
	public String updateTeam(@RequestParam String teamId, @RequestBody Team updatedTeam) {
	    String response = teamservice.updateTeam(teamId, updatedTeam);
	    return response;
	}

	@DeleteMapping("/api/teamsdelete")
	public String deleteTeam(@RequestParam String teamId) {
		return teamservice.deleteTeam(teamId);
		
	}
}
