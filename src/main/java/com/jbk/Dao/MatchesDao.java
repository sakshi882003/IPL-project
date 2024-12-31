package com.jbk.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.jbk.Model.Matches;

@Repository
public class MatchesDao {
	List<Matches> matchess = new ArrayList<Matches>();

	public List<Matches> getAllMatchess() {
		
		return matchess;
	}

	public String addmatches(Matches matches) {

		matchess.add(matches);
		return "Added successfully!";

	}
	
	public String deleteMatches(int matchesid) {
		for (Matches matches : matchess) {
			if(matches.getMatchId()==matchesid) {
				matchess.remove(matches);
				
			}
		}
		return "Deleted successfully!";
		
	}
	
	public Object getMatchesById(int matchesid) {
		for (Matches matches : matchess) {
			if(matches.getMatchId()==matchesid) {
				return matches;
			}
		}
		return "not found!";
		
	}

	public Matches updateMatches(int matchesid, Matches matchesnew) {
		for (Matches matches : matchess) {
			if(matches.getMatchId()==matchesid) {
				matchess.remove(matches);
				matchess.add(matchesnew);
			}
		}
		return matchesnew;
		
	}
}
