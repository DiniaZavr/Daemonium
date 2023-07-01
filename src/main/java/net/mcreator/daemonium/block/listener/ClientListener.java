package net.mcreator.daemonium.block.listener;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.daemonium.init.DaemoniumModBlockEntities;
import net.mcreator.daemonium.block.renderer.AltarTileRenderer;
import net.mcreator.daemonium.DaemoniumMod;

@Mod.EventBusSubscriber(modid = DaemoniumMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(DaemoniumModBlockEntities.ALTAR.get(), AltarTileRenderer::new);
	}
}
