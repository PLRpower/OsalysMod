package fr.osalys.mod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.osalys.mod.OsalysmodMod;

public class RadiationsQuandLeffetCommenceEstAppliqueProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency entity for procedure RadiationsQuandLeffetCommenceEstApplique!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.ABSORPTION, (int) 100, (int) 2, (false), (false)));
	}
}
