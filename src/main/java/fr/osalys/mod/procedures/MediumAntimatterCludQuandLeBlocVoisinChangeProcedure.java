package fr.osalys.mod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;

import java.util.Map;

import fr.osalys.mod.item.AntimatterFragmentItem;
import fr.osalys.mod.OsalysmodMod;

public class MediumAntimatterCludQuandLeBlocVoisinChangeProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency world for procedure MediumAntimatterCludQuandLeBlocVoisinChange!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency x for procedure MediumAntimatterCludQuandLeBlocVoisinChange!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency y for procedure MediumAntimatterCludQuandLeBlocVoisinChange!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency z for procedure MediumAntimatterCludQuandLeBlocVoisinChange!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if (((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.REDSTONE_BLOCK) == false) {
			world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(AntimatterFragmentItem.block));
				entityToSpawn.setPickupDelay((int) 0);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		}
	}
}
