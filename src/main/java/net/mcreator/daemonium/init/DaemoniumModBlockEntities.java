
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.daemonium.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.daemonium.block.entity.AltarTileEntity;
import net.mcreator.daemonium.DaemoniumMod;

public class DaemoniumModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, DaemoniumMod.MODID);
	public static final RegistryObject<BlockEntityType<AltarTileEntity>> ALTAR = REGISTRY.register("altar", () -> BlockEntityType.Builder.of(AltarTileEntity::new, DaemoniumModBlocks.ALTAR.get()).build(null));

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
