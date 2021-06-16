package br.com.screen.login;

import br.com.screen.login.commands.ScoreboardCommand;
import br.com.screen.login.listeners.JoinListener;
import br.com.screen.login.managers.configurations.MessagesConfigManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class MainScreen extends JavaPlugin {

    public static MainScreen plugin;

    public MessagesConfigManager messagesConfig = new MessagesConfigManager(this, "messages_br.yml");

    @Override
    public void onEnable() {
        plugin = this;

        registerEvents();
        registerCommands();

        messagesConfig.saveDefaultConfig();

        Bukkit.getConsoleSender().sendMessage("§f[§a" + (plugin.getName()) + "§f] §a--------------------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§f[§a" + (plugin.getName()) + "§f] §aPlugin successfully initialized, without problems apparently.");
        Bukkit.getConsoleSender().sendMessage("§f[§a" + (plugin.getName()) + "§f] §aVersion: " + (plugin.getConfig().getString("plugin-version")));
        Bukkit.getConsoleSender().sendMessage("§f[§a" + (plugin.getName()) + "§f] §a--------------------------------------------------------------------");
    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§f[§c" + (plugin.getName()) + "§f] §c--------------------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage("§f[§c" + (plugin.getName()) + "§f] §cPlugin/processes closed successfully!");
        Bukkit.getConsoleSender().sendMessage("§f[§c" + (plugin.getName()) + "§f] §c--------------------------------------------------------------------");
    }

    public void registerEvents() {
        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new JoinListener(), this);
    }

    public void registerCommands() {
        getCommand("scoreboard").setExecutor(new ScoreboardCommand());
    }
}
