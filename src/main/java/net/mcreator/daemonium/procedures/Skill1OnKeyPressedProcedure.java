package net.mcreator.daemonium.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.daemonium.network.DaemoniumModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class Skill1OnKeyPressedProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		double skill1 = 0;
		{
			boolean _setval = true;
			entity.getCapability(DaemoniumModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.skill1 = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
