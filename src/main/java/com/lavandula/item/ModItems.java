package com.lavandula.item;

import com.lavandula.lavglen.LavenderGlen;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item LAVENDER_FLOWER = registerItem("lavender_flower", new Item(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM,Identifier.of(LavenderGlen.MOD_ID,"lavender_flower")))));


    private static Item registerItem( String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LavenderGlen.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LavenderGlen.LOGGER.info("Registering Mod Items for " + LavenderGlen.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(LAVENDER_FLOWER);
        });
    }
}
