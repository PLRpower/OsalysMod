
package fr.osalys.mod.item;

import net.minecraft.entity.ai.attributes.Attributes;

@OsalysmodModElements.ModElement.Tag
public class SaphirePickaxeItem extends OsalysmodModElements.ModElement {

	@ObjectHolder("osalysmod:saphire_pickaxe")
	public static final Item block = null;

	public SaphirePickaxeItem(OsalysmodModElements instance) {
		super(instance, 264);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 1000;
			}

			public float getEfficiency() {
				return 7f;
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
				return Ingredient.fromStacks(new ItemStack(SaphireIngotItem.block));
			}
		}, 1, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)) {

		}.setRegistryName("saphire_pickaxe"));
	}

}
