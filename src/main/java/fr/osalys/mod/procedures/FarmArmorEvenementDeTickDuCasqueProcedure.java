package fr.osalys.mod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

import fr.osalys.mod.potion.WriteOffsPotionEffect;
import fr.osalys.mod.potion.WriteOffsImmunePotionEffect;
import fr.osalys.mod.item.FarmArmorItem;
import fr.osalys.mod.OsalysmodMod;

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
		if (((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.HEAD) : ItemStack.EMPTY)
				.getItem() == FarmArmorItem.helmet
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.CHEST) : ItemStack.EMPTY)
						.getItem() == FarmArmorItem.body
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.LEGS) : ItemStack.EMPTY)
						.getItem() == FarmArmorItem.legs
				&& ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.FEET) : ItemStack.EMPTY)
						.getItem() == FarmArmorItem.boots) {
			if (entity instanceof LivingEntity) {
				((LivingEntity) entity).removePotionEffect(WriteOffsPotionEffect.potion);
			}
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(WriteOffsImmunePotionEffect.potion, (int) 60, (int) 0, (false), (false)));
		}
	}
}
