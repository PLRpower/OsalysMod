package fr.osalys.mod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class AntimatterCrystalActuatorQuandLitemEstDansLinventaireParTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OsalysmodMod.LOGGER
						.warn("Failed to load dependency entity for procedure AntimatterCrystalActuatorQuandLitemEstDansLinventaireParTick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(WriteOffsPotionEffect.potion, (int) 200, (int) 1, (false), (false)));
	}

}
