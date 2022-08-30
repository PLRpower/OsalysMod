
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import fr.osalys.mod.itemgroup.OsalysTabItemGroup;
import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class AntimatterHammer5x5UpgradeItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:antimatter_hammer_5x_5_upgrade")
	public static final Item block = null;

	public AntimatterHammer5x5UpgradeItem(OsalysmodModElements instance) {
		super(instance, 259);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(OsalysTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("antimatter_hammer_5x_5_upgrade");
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
