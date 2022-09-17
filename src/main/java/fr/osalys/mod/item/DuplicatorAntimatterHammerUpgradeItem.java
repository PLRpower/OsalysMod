
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import fr.osalys.mod.itemgroup.OsalysTabItemGroup;
import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class DuplicatorAntimatterHammerUpgradeItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:duplicator_antimatter_hammer_upgrade")
	public static final Item block = null;

	public DuplicatorAntimatterHammerUpgradeItem(OsalysmodModElements instance) {
		super(instance, 75);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OsalysTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("duplicator_antimatter_hammer_upgrade");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
