
package fr.osalys.mod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@OsalysmodModElements.ModElement.Tag
public class AutoSmelterOsaliumHammerUpgradeItem extends OsalysmodModElements.ModElement {

	@ObjectHolder("osalysmod:auto_smelter_osalium_hammer_upgrade")
	public static final Item block = null;

	public AutoSmelterOsaliumHammerUpgradeItem(OsalysmodModElements instance) {
		super(instance, 250);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(OsalysTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("auto_smelter_osalium_hammer_upgrade");
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
