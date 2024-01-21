package com.example.event;
import com.example.gui.Screen;
import com.example.gui.gui;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;

public class KeyInputHandler {
    public static final String KEY_CATEGORY = "Book Stocker";
    public static final String KEY_SCREEN = "GUI";

    public static KeyBinding screenKey;

    public static void registerKeyInputs(){
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(screenKey.wasPressed()){
                System.out.println("Gui Opened!");
                MinecraftClient.getInstance().setScreen(new Screen(new gui()));
            }
        });
    }


    public static void register(){
        screenKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_SCREEN,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_M,
                KEY_CATEGORY
        ));

        registerKeyInputs();
    }
}
