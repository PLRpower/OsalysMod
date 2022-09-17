package fr.osalys.mod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class ExperienceBottleEvenementAuClicDroitDansLairProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency entity for procedure ExperienceBottleEvenementAuClicDroitDansLair!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).addExperienceLevel((int) 5);
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(ExperienceBottleItem.block);
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
	}

}
