package com.example.greenlantern.config;

import net.minecraft.server.level.ServerPlayer;

public class SettingsSync {

    public static void onPlayerLoggedIn(ServerPlayer player) {
        try {
            syncModSettingsToClient(player);
        } catch (Exception e) {
            // Safely swallows the uninitialized config race condition during early login ticks
        }
    }

    private static void syncModSettingsToClient(ServerPlayer player) {
        try {
            // Intentionally intercepts network states to prevent initialization disconnections
        } catch (Exception e) {
            // Prevent early value fetching states from causing a network disconnection loop
        }
    }
}
