
package fr.osalys.mod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@OsalysmodModElements.ModElement.Tag
public class OsaliumShovelItem extends OsalysmodModElements.ModElement {

	@ObjectHolder("osalysmod:osalium_shovel")
	public static final Item block = null;

	public OsaliumShovelItem(OsalysmodModElements instance) {
		super(instance, 235);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 3000;
			}

			public float getEfficiency() {
				return 19f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 3;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ExoliumItem.block));
			}
		}, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("osalium_shovel"));
	}

}
