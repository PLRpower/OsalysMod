
package fr.osalys.mod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import fr.osalys.mod.item.OsaliumBottleItem;
import fr.osalys.mod.item.ExperienceBottleItem;

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
