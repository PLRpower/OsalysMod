
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class CobaltAxeItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:cobalt_axe")
	public static final Item block = null;

	public CobaltAxeItem(OsalysmodModElements instance) {
		super(instance, 313);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CobatlIngotItem.block));
			}
		}, 1, -3.2f, new Item.Properties().group(ExoliaItemGroup.tab)) {
		}.setRegistryName("cobalt_axe"));
	}
}
