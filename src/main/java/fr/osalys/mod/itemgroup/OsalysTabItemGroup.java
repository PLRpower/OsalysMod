
package fr.osalys.mod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import fr.osalys.mod.item.OsaliumArmorItem;
import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class OsalysTabItemGroup extends OsalysmodModElements.ModElement {
	public OsalysTabItemGroup(OsalysmodModElements instance) {
		super(instance, 326);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabosalys_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(OsaliumArmorItem.helmet);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
