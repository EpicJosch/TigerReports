package fr.mrtigreroux.tigerreports.utils;

import org.bukkit.Bukkit;
import org.bukkit.Location;

import fr.mrtigreroux.tigerreports.bungee.BungeeManager;

/**
 * @author MrTigreroux
 */
public class SerializationUtils {
    
    private SerializationUtils() {}
    
    public static String serializeBungeeLocation(Location loc, BungeeManager bm) {
        StringBuilder serializedLocation =
                new StringBuilder(bm.getServerName()).append("/").append(loc.getWorld().getName());
        for (Object coords : new Object[] {
                loc.getX(), loc.getY(), loc.getZ(), loc.getYaw(), loc.getPitch()
        }) {
            String coord = String.valueOf(coords);
            int end = (end = coord.indexOf('.') + 3) < coord.length() ? end : coord.length();
            serializedLocation.append("/").append(coord.substring(0, end));
        }
        return serializedLocation.toString();
    }
    
    public static Location deserializeLocation(String serializedBungeeLocation) {
        if (serializedBungeeLocation == null) {
            return null;
        }
        String[] coords = serializedBungeeLocation.split("/");
        return new Location(
                Bukkit.getWorld(coords[1]),
                Double.parseDouble(coords[2]),
                Double.parseDouble(coords[3]),
                Double.parseDouble(coords[4]),
                Float.parseFloat(coords[5]),
                Float.parseFloat(coords[6])
        );
    }
    
    public static String deserializeServer(String serializedBungeeLocation) {
        return serializedBungeeLocation != null ? serializedBungeeLocation.split("/")[0] : null;
    }
    
}
