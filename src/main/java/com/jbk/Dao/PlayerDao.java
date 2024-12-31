package com.jbk.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.jbk.Model.Player;

@Repository
public class PlayerDao {
	List<Player> players = new ArrayList<Player>();

	public List<Player> getAllPlayers() {
		
		return players;
	}

	public String addplayer(Player player) {

		players.add(player);
		return "Added successfully!";

	}
	
	public String deletePlayer(int playerid) {
		for (Player player : players) {
			if(player.getPlayerid()==playerid) {
				players.remove(player);
				
			}
		}
		return "Deleted successfully!";
		
	}
	
	public Object getPlayerById(int playerid) {
		for (Player player : players) {
			if(player.getPlayerid()==playerid) {
				return player;
			}
		}
		return "not found!";
		
	}

	public Player updatePlayer(int playerid, Player playernew) {
		for (Player player : players) {
			if(player.getPlayerid()==playerid) {
				players.remove(player);
				players.add(playernew);
			}
		}
		return playernew;
		
	}
}
