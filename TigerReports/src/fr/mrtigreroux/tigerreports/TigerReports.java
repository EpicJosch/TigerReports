package fr.mrtigreroux.tigerreports;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.mrtigreroux.tigerreports.commands.ReportCommand;
import fr.mrtigreroux.tigerreports.commands.ReportsCommand;
import fr.mrtigreroux.tigerreports.data.ConfigFile;
import fr.mrtigreroux.tigerreports.listeners.InventoryListener;
import fr.mrtigreroux.tigerreports.listeners.PlayerListener;
import fr.mrtigreroux.tigerreports.listeners.SignListener;
import fr.mrtigreroux.tigerreports.runnables.ReportsNotifier;
import fr.mrtigreroux.tigerreports.utils.UserUtils;

/**
 * @author MrTigreroux
 * Finished on: 30/06/2016
 */

public class TigerReports extends JavaPlugin {

	public static TigerReports instance;
	
	@Override
	public void onEnable() {
		instance = this;
		loadFiles();
		
		PluginManager pm = Bukkit.getServer().getPluginManager();
		pm.registerEvents(new InventoryListener(), this);
		pm.registerEvents(new SignListener(), this);
		pm.registerEvents(new PlayerListener(), this);
		
		this.getCommand("report").setExecutor(new ReportCommand());
		this.getCommand("reports").setExecutor(new ReportsCommand());
		
		for(Player p : Bukkit.getOnlinePlayers()) ConfigFile.DATA.get().set("Data."+p.getUniqueId()+".Name", p.getName());
		ConfigFile.DATA.save();
		
		ReportsNotifier.start();
	}
	
	@Override
	public void onDisable() {
		for(Player p : Bukkit.getOnlinePlayers()) if(UserUtils.getUser(p).getOpenedMenu() != null) p.closeInventory();
	}
	
	public static TigerReports getInstance() {
		return instance;
	}
	
	public static void loadFiles() {
		for(ConfigFile configFiles : ConfigFile.values()) configFiles.load();
	}
	
}
