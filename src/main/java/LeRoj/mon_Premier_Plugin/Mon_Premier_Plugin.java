package LeRoj.mon_Premier_Plugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Mon_Premier_Plugin extends JavaPlugin {

    CommandExecutor heal = new HealCommand();

    @Override
    public void onEnable() {
        System.out.println("Le Plugin vient de s'allumer !");
        getServer().getPluginManager().registerEvents(new JoinListener(), this);
        getCommand("heal").setExecutor(heal);
    }

    @Override
    public void onDisable() {
        System.out.println("Le Plugin vient de s'éteindre !");
    }
}
