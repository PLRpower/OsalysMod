
package fr.osalys.mod;

@OsalysmodModElements.ModElement.Tag
public class ExperienceBottleRecipeBrewingRecipe extends OsalysmodModElements.ModElement {

	public ExperienceBottleRecipeBrewingRecipe(OsalysmodModElements instance) {
		super(instance, 206);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == OsaliumBottleItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.DRAGON_BREATH;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(ExperienceBottleItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}