package LeRoj.mon_Premier_Plugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static org.bukkit.Bukkit.getPlayer;

public class HealCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if(args.length == 0) {
                player.setHealth(player.getMaxHealth());
                player.sendMessage("Vos HP on été restaurés !");
                return true;
            }
            else{
                Player cible = getPlayer(args[0]);
                if(cible != null){
                    cible.setHealth(cible.getMaxHealth());
                    cible.sendMessage("Vos HP on été restaurés !");
                    return true;
                }
                else {
                    return false;
                }
            }

        }
        else {
            return false;
        }
    }
}
