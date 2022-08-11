package fr.osalys.mod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;

import java.util.Map;

import fr.osalys.mod.block.MediumAntimatterBudBlock;
import fr.osalys.mod.OsalysmodMod;

public class SmallAntimatterCludMiseAJourDuTickProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency world for procedure SmallAntimatterCludMiseAJourDuTick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency x for procedure SmallAntimatterCludMiseAJourDuTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency y for procedure SmallAntimatterCludMiseAJourDuTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency z for procedure SmallAntimatterCludMiseAJourDuTick!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.setBlockState(new BlockPos(x, y, z), MediumAntimatterBudBlock.block.getDefaultState(), 3);
	}
}
