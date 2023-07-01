
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.daemonium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;

import net.mcreator.daemonium.item.DemonicScytheItem;
import net.mcreator.daemonium.block.display.AltarDisplayItem;
import net.mcreator.daemonium.DaemoniumMod;

public class DaemoniumModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DaemoniumMod.MODID);
	public static final RegistryObject<Item> ALTAR = REGISTRY.register(DaemoniumModBlocks.ALTAR.getId().getPath(), () -> new AltarDisplayItem(DaemoniumModBlocks.ALTAR.get(), new Item.Properties().tab(CreativeModeTab.TAB_DECORATIONS)));
	public static final RegistryObject<Item> DEMONIC_SCYTHE = REGISTRY.register("demonic_scythe", () -> new DemonicScytheItem());
}
