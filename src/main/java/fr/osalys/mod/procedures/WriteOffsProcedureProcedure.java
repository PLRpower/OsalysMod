package fr.osalys.mod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class WriteOffsProcedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency entity for procedure WriteOffsProcedure!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) > 6) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 0.3);
		}
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHealth() : -1) <= 6) {
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.NAUSEA, (int) 100, (int) 1));
		}
	}

}
