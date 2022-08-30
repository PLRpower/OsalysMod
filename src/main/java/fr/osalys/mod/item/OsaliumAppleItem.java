
package fr.osalys.mod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@OsalysmodModElements.ModElement.Tag
public class OsaliumAppleItem extends OsalysmodModElements.ModElement {

	@ObjectHolder("osalysmod:osalium_apple")
	public static final Item block = null;

	public OsaliumAppleItem(OsalysmodModElements instance) {
		super(instance, 246);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(OsalysTabItemGroup.tab).maxStackSize(64).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(4).saturation(0.6f).setAlwaysEdible().build()));
			setRegistryName("osalium_apple");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);

			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			OsaliumAppleLeJoueurTermineDutiliserLitemProcedure.executeProcedure(Collections.emptyMap());

			return retval;
		}

	}

}
