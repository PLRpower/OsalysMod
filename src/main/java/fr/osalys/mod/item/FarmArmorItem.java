
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ArmorItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import java.util.Collections;

import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class FarmArmorItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:farm_armor_helmet")
	public static final Item helmet = null;
	@ObjectHolder("osalysmod:farm_armor_chestplate")
	public static final Item body = null;
	@ObjectHolder("osalysmod:farm_armor_leggings")
	public static final Item legs = null;
	@ObjectHolder("osalysmod:farm_armor_boots")
	public static final Item boots = null;

	public FarmArmorItem(OsalysmodModElements instance) {
		super(instance, 297);
	}

	@Override
	public void initElements() {
		IArmorMaterial armormaterial = new IArmorMaterial() {
			@Override
			public int getDurability(EquipmentSlotType slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 40;
			}

			@Override
			public int getDamageReductionAmount(EquipmentSlotType slot) {
				return new int[]{2, 4, 6, 2}[slot.getIndex()];
			}

			@Override
			public int getEnchantability() {
				return 9;
			}

			@Override
			public net.minecraft.util.SoundEvent getSoundEvent() {
				return (net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
			}

			@Override
			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ExoliumIngotItem.block));
			}

			@OnlyIn(Dist.CLIENT)
			@Override
			public String getName() {
				return "farm_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		};
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.HEAD, new Item.Properties().group(ExoliaItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "osalysmod:textures/models/armor/farm__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				super.onArmorTick(itemstack, world, entity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				AventureArmorArmorHelmetTickEventProcedure.executeProcedure(Collections.emptyMap());
			}
		}.setRegistryName("farm_armor_helmet"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.CHEST, new Item.Properties().group(ExoliaItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "osalysmod:textures/models/armor/farm__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				AventureArmorArmorBodyTickEventProcedure.executeProcedure(Collections.emptyMap());
			}
		}.setRegistryName("farm_armor_chestplate"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.LEGS, new Item.Properties().group(ExoliaItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "osalysmod:textures/models/armor/farm__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				AventureArmorArmorLeggingsTickEventProcedure.executeProcedure(Collections.emptyMap());
			}
		}.setRegistryName("farm_armor_leggings"));
		elements.items.add(() -> new ArmorItem(armormaterial, EquipmentSlotType.FEET, new Item.Properties().group(ExoliaItemGroup.tab)) {
			@Override
			public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
				return "osalysmod:textures/models/armor/farm__layer_" + (slot == EquipmentSlotType.LEGS ? "2" : "1") + ".png";
			}

			@Override
			public void onArmorTick(ItemStack itemstack, World world, PlayerEntity entity) {
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();

				AventureArmorArmorBootsTickEventProcedure.executeProcedure(Collections.emptyMap());
			}
		}.setRegistryName("farm_armor_boots"));
	}

}
