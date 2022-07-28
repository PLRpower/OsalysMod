
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class PlatineHoeItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:platine_hoe")
	public static final Item block = null;

	public PlatineHoeItem(OsalysmodModElements instance) {
		super(instance, 291);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlatineIngotItem.block));
			}
		}, 0, -2.8f, new Item.Properties().group(ExoliaItemGroup.tab)) {
		}.setRegistryName("platine_hoe"));
	}
}