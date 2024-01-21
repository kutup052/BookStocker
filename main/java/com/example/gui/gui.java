package com.example.gui;

import io.github.cottonmc.cotton.gui.client.LightweightGuiDescription;
import io.github.cottonmc.cotton.gui.widget.WGridPanel;
import io.github.cottonmc.cotton.gui.widget.WLabel;
import io.github.cottonmc.cotton.gui.widget.WButton;
import io.github.cottonmc.cotton.gui.widget.data.Insets;
import io.github.cottonmc.cotton.gui.widget.icon.ItemIcon;
import net.fabricmc.fabric.api.util.TriState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;

public class gui extends LightweightGuiDescription {
    public gui (){
        WGridPanel root = new WGridPanel();
        setRootPanel(root);
        root.setSize(280,
                    70);
        root.setInsets(Insets.ROOT_PANEL);

        WLabel guiName = new WLabel(Text.translatable("Book Stocker"));
        root.add(guiName, 0, 0, 4,1);
        WLabel version = new WLabel(Text.translatable("1.0.0"));
        version.setColor(000000);
        root.add(version, 0, 12, 3,1);

        WButton buttonCraftingTable = new WButton(new ItemIcon(new ItemStack(Items.WRITABLE_BOOK)));
        root.add(buttonCraftingTable, 15, 11, 1, 1);
    }
}
