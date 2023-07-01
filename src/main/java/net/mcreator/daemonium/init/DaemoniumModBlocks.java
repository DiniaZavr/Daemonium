
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.daemonium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.daemonium.block.AltarBlock;
import net.mcreator.daemonium.DaemoniumMod;

public class DaemoniumModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DaemoniumMod.MODID);
	public static final RegistryObject<Block> ALTAR = REGISTRY.register("altar", () -> new AltarBlock());
}
