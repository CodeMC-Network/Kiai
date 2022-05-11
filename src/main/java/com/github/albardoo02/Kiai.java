package com.github.albardoo02;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class Kiai extends JavaPlugin {

    private static Kiai instance;

    public Kiai (){
        instance = this;
    }

    public static Kiai getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        getLogger().info("Kiai has been enabled.");

        this.getCommand("kiai").setExecutor(new KiaiCommandExecutor());

        this.saveDefaultConfig();

    }


    @Override
    public void onDisable() {
        getLogger().info("Kiai has been disabled.");
    }
}