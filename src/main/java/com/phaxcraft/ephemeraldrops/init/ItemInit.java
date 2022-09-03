package com.phaxcraft.ephemeraldrops.init;

import com.phaxcraft.ephemeraldrops.items.*;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.*;

public class ItemInit {
    public static final CurrencyItem CURRENCY_ITEM = new CurrencyItem(new FabricItemSettings().group(ItemGroup.MISC));

    public void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("ephemeraldrops", "currency_item"), CURRENCY_ITEM);
    }
}
