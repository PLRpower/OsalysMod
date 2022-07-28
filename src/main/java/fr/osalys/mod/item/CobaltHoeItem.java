
package fr.osalys.mod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@OsalysmodModElements.ModElement.Tag
public class CobaltHoeItem extends OsalysmodModElements.ModElement {

	@ObjectHolder("osalysmod:cobalt_hoe")
	public static final Item block = null;

	public CobaltHoeItem(OsalysmodModElements instance) {
		super(instance, 316);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2000;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CobatlIngotItem.block));
			}
		}, 0, -2.8f, new Item.Properties().group(ExoliaItemGroup.tab)) {

		}.setRegistryName("cobalt_hoe"));
	}

}
