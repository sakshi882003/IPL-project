package com.jbk.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.Dao.PlayerDao;
import com.jbk.Model.Player;

@Service
public class PlayerService {

	@Autowired
	PlayerDao playerdao;
	
	public List<Player> getAllPlayers() {
		return playerdao.getAllPlayers();
		
	}
	
	public String addPlayer(Player player) {
		return playerdao.addplayer(player);
		
		
	}
	
	public String deletePlayer(int playerid) {
		return playerdao.deletePlayer(playerid);
		
		
	}
	
	public Object getPlayerById(int playerid) {
		return playerdao.getPlayerById(playerid);
		
	}

	public Player updatePlayer(int playerid, Player playernew) {
		return playerdao.updatePlayer(playerid,playernew);
	}

}
