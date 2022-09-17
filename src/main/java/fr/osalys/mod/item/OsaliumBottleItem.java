
package fr.osalys.mod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@OsalysmodModElements.ModElement.Tag
public class OsaliumBottleItem extends OsalysmodModElements.ModElement {

	@ObjectHolder("osalysmod:osalium_bottle")
	public static final Item block = null;

	public OsaliumBottleItem(OsalysmodModElements instance) {
		super(instance, 79);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(OsalysTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("osalium_bottle");
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
