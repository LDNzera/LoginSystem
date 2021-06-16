package br.com.screen.login.commands;

import br.com.screen.login.MainScreen;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ScoreboardCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {

        if (sender instanceof Player) {
            sender.sendMessage(MainScreen.plugin.messagesConfig.getString("Messages.other-messages.scoreboard-message"));
        }

        return false;
    }
}
