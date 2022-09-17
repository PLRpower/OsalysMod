
package fr.osalys.mod;

@OsalysmodModElements.ModElement.Tag
public class OsaliumBottleRecipeBrewingRecipe extends OsalysmodModElements.ModElement {

	public OsaliumBottleRecipeBrewingRecipe(OsalysmodModElements instance) {
		super(instance, 205);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == EmptyExperienceBottleItem.block;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == OsaliumDustItem.block;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(OsaliumBottleItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}