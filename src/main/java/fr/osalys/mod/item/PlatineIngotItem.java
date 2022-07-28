
package fr.osalys.mod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@OsalysmodModElements.ModElement.Tag
public class PlatineIngotItem extends OsalysmodModElements.ModElement {

	@ObjectHolder("osalysmod:platine_ingot")
	public static final Item block = null;

	public PlatineIngotItem(OsalysmodModElements instance) {
		super(instance, 8);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(ExoliaItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("platine_ingot");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

	}

}
