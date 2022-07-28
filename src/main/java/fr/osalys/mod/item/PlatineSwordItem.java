
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class PlatineSwordItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:platine_sword")
	public static final Item block = null;

	public PlatineSwordItem(OsalysmodModElements instance) {
		super(instance, 289);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 15f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlatineIngotItem.block));
			}
		}, 3, -2.4f, new Item.Properties().group(ExoliaItemGroup.tab)) {
		}.setRegistryName("platine_sword"));
	}
}
