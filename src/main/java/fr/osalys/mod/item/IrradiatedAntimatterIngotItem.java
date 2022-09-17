
package fr.osalys.mod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@OsalysmodModElements.ModElement.Tag
public class IrradiatedAntimatterIngotItem extends OsalysmodModElements.ModElement {

	@ObjectHolder("osalysmod:irradiated_antimatter_ingot")
	public static final Item block = null;

	public IrradiatedAntimatterIngotItem(OsalysmodModElements instance) {
		super(instance, 52);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(OsalysTabItemGroup.tab).maxStackSize(1).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("irradiated_antimatter_ingot");
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
		public void inventoryTick(ItemStack itemstack, World world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			AntimatterIngotQuandLitemEstDansLinventaireParTickProcedure.executeProcedure(Collections.emptyMap());
		}

	}

}
