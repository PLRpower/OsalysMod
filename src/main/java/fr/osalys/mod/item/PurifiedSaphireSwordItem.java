
package fr.osalys.mod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;

import java.util.stream.Stream;
import java.util.Map;
import java.util.HashMap;
import java.util.AbstractMap;

import fr.osalys.mod.procedures.PurifiedSaphireSwordProcedureProcedure;
import fr.osalys.mod.OsalysmodModElements;

@OsalysmodModElements.ModElement.Tag
public class PurifiedSaphireSwordItem extends OsalysmodModElements.ModElement {
	@ObjectHolder("osalysmod:purified_saphire_sword")
	public static final Item block = null;

	public PurifiedSaphireSwordItem(OsalysmodModElements instance) {
		super(instance, 193);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1100;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 8;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.TOOLS)) {
			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;

				PurifiedSaphireSwordProcedureProcedure.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z),
								new AbstractMap.SimpleEntry<>("entity", entity))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}
		}.setRegistryName("purified_saphire_sword"));
	}
}
