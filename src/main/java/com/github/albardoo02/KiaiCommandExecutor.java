package com.github.albardoo02;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KiaiCommandExecutor implements CommandExecutor, TabCompleter {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("help")) {
                for (String line : Kiai.getInstance().getConfig().getStringList("Kiai.help")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                }

            } else if (args[0].equalsIgnoreCase("1")) {
                for (String line : Kiai.getInstance().getConfig().getStringList("Kiai.msg1")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                }
            } else if (args[0].equalsIgnoreCase("2")) {
                for (String line : Kiai.getInstance().getConfig().getStringList("Kiai.msg2")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                }
            } else if (args[0].equalsIgnoreCase("3")) {
                for (String line : Kiai.getInstance().getConfig().getStringList("Kiai.msg3")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                }
            } else if (args[0].equalsIgnoreCase("4")) {
                for (String line : Kiai.getInstance().getConfig().getStringList("Kiai.msg4")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                }
            } else if (args[0].equalsIgnoreCase("5")) {
                for (String line : Kiai.getInstance().getConfig().getStringList("Kiai.msg5")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                }
            } else if (args[0].equalsIgnoreCase("reload")) {
                for (String line : Kiai.getInstance().getConfig().getStringList("Kiai.reload")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
                }
            }

        } else {
            for (String line : Kiai.getInstance().getConfig().getStringList("Kiai.help")) {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', line));
            }
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (command.getName().equalsIgnoreCase("kiai")) {
            if (args.length == 1) {
                if (args[0].length() == 0) {
                    return Arrays.asList("help", "1", "2", "3", "4", "5", "reload");
                } else {
                    if ("help".startsWith(args[0]) && "1".startsWith(args[0]) && "2".startsWith(args[0]) && "3".startsWith(args[0]) && "4".startsWith(args[0]) && "5".startsWith(args[0]) && "reload".startsWith(args[0])) {
                        return Arrays.asList("help", "1", "2", "3", "4", "5", "reload");
                    } else if ("help".startsWith(args[0])) {
                        return Collections.singletonList("help");
                    } else if ("1".startsWith(args[0])) {
                        return Collections.singletonList("1");
                    } else if ("2".startsWith(args[0])) {
                        return Collections.singletonList("2");
                    } else if ("3".startsWith(args[0])) {
                        return Collections.singletonList("3");
                    } else if ("4".startsWith(args[0])) {
                        return Collections.singletonList("4");
                    } else if ("5".startsWith(args[0])) {
                        return Collections.singletonList("5");
                    } else if ("reload".startsWith(args[0])) {
                        return Collections.singletonList("reload");
                    }
                }
            }

        }
        return null;
    }
}
