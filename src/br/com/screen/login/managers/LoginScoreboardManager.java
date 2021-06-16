package br.com.screen.login.managers;

import br.com.screen.login.MainScreen;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.scoreboard.*;

public class LoginScoreboardManager implements Listener {

    @EventHandler
    public static void ScoreboardManager (Player player) {

        ScoreboardManager manager = Bukkit.getScoreboardManager();
        Scoreboard scoreboard = manager.getNewScoreboard();

        Objective objective = scoreboard.registerNewObjective("Login Scoreboard", "");
        objective.setDisplaySlot(DisplaySlot.SIDEBAR);
        objective.setDisplayName("§6§lREDE SCREEN");

        Score blankField5 = objective.getScore(ChatColor.DARK_RED + "   ");

        objective.getScore(" §7§l● §7§lREGISTRAR").setScore(13);
        Score loginField = objective.getScore(ChatColor.WHITE + " Use este comando");
        objective.getScore(" para se registrar.").setScore(11);

        Score blankField4 = objective.getScore(ChatColor.YELLOW + "   ");

        objective.getScore(" §8➜ §f/register §c<senha> <senha>").setScore(9);

        Score blankField3 = objective.getScore(ChatColor.GREEN + "   ");

        objective.getScore(" §7§l● §7§lAUTENTICAR").setScore(7);
        Score registerField = objective.getScore(" §fUse este comando");
        objective.getScore(" para se autenticar.").setScore(5);

        Score blankField2 = objective.getScore(ChatColor.DARK_GRAY + "   ");

        objective.getScore(" §8➜ §f/login §a<senha>").setScore(3);

        Score blankField = objective.getScore(ChatColor.AQUA + "   ");

        objective.getScore("§ewww.redescreen.com").setScore(1);

        loginField.setScore(12);
        registerField.setScore(6);

        blankField.setScore(2);
        blankField2.setScore(4);
        blankField3.setScore(8);
        blankField4.setScore(10);
        blankField5.setScore(14);

        player.setScoreboard(scoreboard);

    }
}
