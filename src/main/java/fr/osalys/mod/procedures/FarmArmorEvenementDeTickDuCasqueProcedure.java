package fr.osalys.mod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FarmArmorEvenementDeTickDuCasqueProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency entity for procedure FarmArmorEvenementDeTickDuCasque!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NIGHT_VISION, (int) 240, (int) 0, (false), (false)));
	}

}
