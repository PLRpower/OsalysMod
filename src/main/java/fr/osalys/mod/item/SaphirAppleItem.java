
package fr.osalys.mod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@OsalysmodModElements.ModElement.Tag
public class SaphirAppleItem extends OsalysmodModElements.ModElement {

	@ObjectHolder("osalysmod:saphir_apple")
	public static final Item block = null;

	public SaphirAppleItem(OsalysmodModElements instance) {
		super(instance, 248);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(OsalysTabItemGroup.tab).maxStackSize(64).rarity(Rarity.UNCOMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.6f).setAlwaysEdible().build()));
			setRegistryName("saphir_apple");
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

			SaphirAppleProcedureProcedure.executeProcedure(Collections.emptyMap());

			return retval;
		}

	}

}
