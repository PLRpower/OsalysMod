
package fr.osalys.mod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@OsalysmodModElements.ModElement.Tag
public class EmptyExperienceBottleItem extends OsalysmodModElements.ModElement {

	@ObjectHolder("osalysmod:empty_experience_bottle")
	public static final Item block = null;

	public EmptyExperienceBottleItem(OsalysmodModElements instance) {
		super(instance, 78);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(OsalysTabItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("empty_experience_bottle");
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
