package fr.osalys.mod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.osalys.mod.item.ExperienceBottleItem;
import fr.osalys.mod.OsalysmodMod;

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
