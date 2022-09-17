
package fr.osalys.mod;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.ItemStack;

import fr.osalys.mod.item.OsaliumDustItem;
import fr.osalys.mod.item.OsaliumBottleItem;
import fr.osalys.mod.item.EmptyExperienceBottleItem;

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
