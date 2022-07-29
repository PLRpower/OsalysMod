
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import fr.osalys.mod.itemgroup.OsalysTabItemGroup;
import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class OsaliumSwordItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:osalium_sword")
	public static final Item block = null;

	public OsaliumSwordItem(OsalysmodModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 17f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(OsalysTabItemGroup.tab)) {
		}.setRegistryName("osalium_sword"));
	}
}
