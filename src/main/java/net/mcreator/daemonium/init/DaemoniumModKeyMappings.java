
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.daemonium.init;

import org.lwjgl.glfw.GLFW;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

import net.mcreator.daemonium.network.Skill1Message;
import net.mcreator.daemonium.DaemoniumMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DaemoniumModKeyMappings {
	public static final KeyMapping SKILL_1 = new KeyMapping("key.daemonium.skill_1", GLFW.GLFW_KEY_V, "key.categories.misc");
	private static long SKILL_1_LASTPRESS = 0;

	@SubscribeEvent
	public static void registerKeyBindings(FMLClientSetupEvent event) {
		ClientRegistry.registerKeyBinding(SKILL_1);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onKeyInput(InputEvent.KeyInputEvent event) {
			if (Minecraft.getInstance().screen == null) {
				if (event.getKey() == SKILL_1.getKey().getValue()) {
					if (event.getAction() == GLFW.GLFW_PRESS) {
						DaemoniumMod.PACKET_HANDLER.sendToServer(new Skill1Message(0, 0));
						Skill1Message.pressAction(Minecraft.getInstance().player, 0, 0);
						SKILL_1_LASTPRESS = System.currentTimeMillis();
					} else if (event.getAction() == GLFW.GLFW_RELEASE) {
						int dt = (int) (System.currentTimeMillis() - SKILL_1_LASTPRESS);
						DaemoniumMod.PACKET_HANDLER.sendToServer(new Skill1Message(1, dt));
						Skill1Message.pressAction(Minecraft.getInstance().player, 1, dt);
					}
				}
			}
		}
	}
}
