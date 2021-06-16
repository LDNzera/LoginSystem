package br.com.screen.login.listeners;

import br.com.screen.login.MainScreen;
import br.com.screen.login.managers.LoginScoreboardManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener {

    public static LoginScoreboardManager ScoreboardManager;

    @EventHandler
    public void whenPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        event.setJoinMessage(null);

        player.sendMessage(MainScreen.plugin.messagesConfig.getString("Messages.other-messages.message-login"));

        LoginScoreboardManager.ScoreboardManager(player);
    }
}
