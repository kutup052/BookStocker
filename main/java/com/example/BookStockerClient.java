package com.example;

import com.example.event.KeyInputHandler;
import net.fabricmc.api.ClientModInitializer;

public class BookStockerClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        KeyInputHandler.register();
    }
}
