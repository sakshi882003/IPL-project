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

import com.jbk.Model.Player;
import com.jbk.Service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	PlayerService playerservice;

	@GetMapping("/api/players1")
	public List<Player> getAllPlayers() {
		return playerservice.getAllPlayers();

	}

	@PostMapping("/api/players/addPlayer")
	public String addPlayer(@RequestBody Player player) {
		return playerservice.addPlayer(player);

	}

	@DeleteMapping("/api/players/deleteplayer")
	public String deletePlayer(@RequestParam int playerid) {
		return playerservice.deletePlayer(playerid);

	}
	
	@GetMapping("/api/players/getbyid")
	public Object getPlayerById(@RequestParam int playerid) {
		return playerservice.getPlayerById(playerid);
		}
	
	@PutMapping("/api/players/updateplayer")
	public Player updatePlayer(@RequestParam int playerid , @RequestBody Player playernew) {
		return playerservice.updatePlayer(playerid,playernew);
		
		
	}
}
