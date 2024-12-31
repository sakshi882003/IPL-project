package com.jbk.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.MatchesDao;
import com.jbk.Model.Matches;

@Service
public class MatchesService {

	@Autowired
	MatchesDao matchesdao;
	
	public List<Matches> getAllMatchess() {
		return matchesdao.getAllMatchess();
		
	}
	
	public String addMatches(Matches matches) {
		return matchesdao.addmatches(matches);
		
		
	}
	
	public String deleteMatches(int matchesid) {
		return matchesdao.deleteMatches(matchesid);
		
		
	}
	
	public Object getMatchesById(int matchesid) {
		return matchesdao.getMatchesById(matchesid);
		
	}

	public Matches updateMatches(int matchesid, Matches matchesnew) {
		return matchesdao.updateMatches(matchesid,matchesnew);
	}

}
