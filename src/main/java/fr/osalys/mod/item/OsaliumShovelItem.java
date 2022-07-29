
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.osalys.mod.itemgroup.OsalysTabItemGroup;
import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class OsaliumShovelItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:osalium_shovel")
	public static final Item block = null;

	public OsaliumShovelItem(OsalysmodModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 19f;
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
				return Ingredient.EMPTY;
			}
		}, 1, -2.8f, new Item.Properties().group(OsalysTabItemGroup.tab)) {
		}.setRegistryName("osalium_shovel"));
	}
}
