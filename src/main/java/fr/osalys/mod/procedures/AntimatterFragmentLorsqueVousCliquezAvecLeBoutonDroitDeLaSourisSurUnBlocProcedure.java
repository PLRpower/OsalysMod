package fr.osalys.mod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import java.util.Map;

import fr.osalys.mod.item.AntimatterFragmentItem;
import fr.osalys.mod.block.SmallAntimatterBudBlock;
import fr.osalys.mod.OsalysmodMod;

public class AntimatterFragmentLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OsalysmodMod.LOGGER.warn(
						"Failed to load dependency world for procedure AntimatterFragmentLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBloc!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OsalysmodMod.LOGGER
						.warn("Failed to load dependency x for procedure AntimatterFragmentLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBloc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OsalysmodMod.LOGGER
						.warn("Failed to load dependency y for procedure AntimatterFragmentLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBloc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OsalysmodMod.LOGGER
						.warn("Failed to load dependency z for procedure AntimatterFragmentLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBloc!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OsalysmodMod.LOGGER.warn(
						"Failed to load dependency entity for procedure AntimatterFragmentLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBloc!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.REDSTONE_BLOCK
				&& ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR
						|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.VOID_AIR
						|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR)) {
			world.setBlockState(new BlockPos(x, y + 1, z), SmallAntimatterBudBlock.block.getDefaultState(), 3);
			if (entity instanceof PlayerEntity) {
				ItemStack _stktoremove = new ItemStack(AntimatterFragmentItem.block);
				((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
						((PlayerEntity) entity).container.func_234641_j_());
			}
		}
	}
}
