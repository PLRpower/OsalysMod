
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import fr.osalys.mod.itemgroup.OsalysTabItemGroup;
import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class AntimatiereAxeItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:antimatiere_axe")
	public static final Item block = null;

	public AntimatiereAxeItem(OsalysmodModElements instance) {
		super(instance, 5);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 3500;
			}

			public float getEfficiency() {
				return 22f;
			}

			public float getAttackDamage() {
				return 13f;
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
		}, 1, -3.2f, new Item.Properties().group(OsalysTabItemGroup.tab)) {
			@Override
			@OnlyIn(Dist.CLIENT)
			public boolean hasEffect(ItemStack itemstack) {
				return true;
			}
		}.setRegistryName("antimatiere_axe"));
	}
}
