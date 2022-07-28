
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class OsaliumHammerItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:osalium_hammer")
	public static final Item block = null;

	public OsaliumHammerItem(OsalysmodModElements instance) {
		super(instance, 218);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ExoliumItem.block));
			}
		}, 1, -2.8f, new Item.Properties().group(ExoliaItemGroup.tab)) {
		}.setRegistryName("osalium_hammer"));
	}
}
