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

import com.jbk.Model.Matches;
import com.jbk.Service.MatchesService;

@RestController
public class MatchesController {

	@Autowired
	MatchesService matchesservice;

	@GetMapping("/api/matchess1")
	public List<Matches> getAllMatchess() {
		return matchesservice.getAllMatchess();

	}

	@PostMapping("/api/matchess/addMatches")
	public String addMatches(@RequestBody Matches matches) {
		return matchesservice.addMatches(matches);

	}

	@DeleteMapping("/api/matchess/deletematches")
	public String deleteMatches(@RequestParam int matchesid) {
		return matchesservice.deleteMatches(matchesid);

	}
	
	@GetMapping("/api/matchess/getbyid")
	public Object getMatchesById(@RequestParam int matchesid) {
		return matchesservice.getMatchesById(matchesid);
		}
	
	@PutMapping("/api/matchess/updatematches")
	public Matches updateMatches(@RequestParam int matchesid , @RequestBody Matches matchesnew) {
		return matchesservice.updateMatches(matchesid,matchesnew);
		
		
	}
}
