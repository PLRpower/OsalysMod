package fr.osalys.mod.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.IWorld;

import java.util.Map;
import java.util.HashMap;

import fr.osalys.mod.OsalysmodModVariables;
import fr.osalys.mod.OsalysmodMod;

public class AnimeFeuProcedure {
	@Mod.EventBusSubscriber
	private static class GlobalTrigger {
		@SubscribeEvent
		public static void onWorldTick(TickEvent.WorldTickEvent event) {
			if (event.phase == TickEvent.Phase.END) {
				IWorld world = event.world;
				Map<String, Object> dependencies = new HashMap<>();
				dependencies.put("world", world);
				dependencies.put("event", event);
				executeProcedure(dependencies);
			}
		}
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency world for procedure AnimeFeu!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		if (OsalysmodModVariables.MapVariables.get(world).animeFour < 3) {
			OsalysmodModVariables.MapVariables.get(world).animeFour = (OsalysmodModVariables.MapVariables.get(world).animeFour + 1);
			OsalysmodModVariables.MapVariables.get(world).syncData(world);
		} else {
			OsalysmodModVariables.MapVariables.get(world).animeFour = 1;
			OsalysmodModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
