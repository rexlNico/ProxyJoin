package de.rexlNico.Prox;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;

public class Join implements Listener{

	@EventHandler
	public void on(AsyncPlayerPreLoginEvent e){
		if(!e.getAddress().getHostAddress().equals("127.0.0.1")){
			e.setKickMessage("§4Bitte joine über §brexlNico.de");
			e.setLoginResult(Result.KICK_OTHER);
		}
		
	}
}
