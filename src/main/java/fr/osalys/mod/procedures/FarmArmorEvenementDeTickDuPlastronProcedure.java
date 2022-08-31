package fr.osalys.mod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FarmArmorEvenementDeTickDuPlastronProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency entity for procedure FarmArmorEvenementDeTickDuPlastron!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.FIRE_RESISTANCE, (int) 60, (int) 0, (false), (false)));
	}

}
