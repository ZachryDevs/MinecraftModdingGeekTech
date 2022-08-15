package com.zachry.ipsec.items;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import com.zachry.ipsec.IPSec;
import net.minecraftforge.registries.RegistryObject;

public class item {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, IPSec.MOD_ID);

    public static final RegistryObject<Item> LAPTOP = ITEMS.register("laptop", () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    public static void register (IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
