package fr.osalys.mod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.RayTraceContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import java.util.Map;

import fr.osalys.mod.item.AntimatterCrystalActuatorItem;
import fr.osalys.mod.block.UnstableBuddingRockBlock;
import fr.osalys.mod.block.SmallAntimatterBudBlock;
import fr.osalys.mod.OsalysmodMod;

public class AntimatterCrystalActuatorLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBlocProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OsalysmodMod.LOGGER.warn(
						"Failed to load dependency world for procedure AntimatterCrystalActuatorLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBloc!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OsalysmodMod.LOGGER.warn(
						"Failed to load dependency x for procedure AntimatterCrystalActuatorLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBloc!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OsalysmodMod.LOGGER.warn(
						"Failed to load dependency y for procedure AntimatterCrystalActuatorLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBloc!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OsalysmodMod.LOGGER.warn(
						"Failed to load dependency z for procedure AntimatterCrystalActuatorLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBloc!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OsalysmodMod.LOGGER.warn(
						"Failed to load dependency entity for procedure AntimatterCrystalActuatorLorsqueVousCliquezAvecLeBoutonDroitDeLaSourisSurUnBloc!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
				RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getFace()) == Direction.UP) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UnstableBuddingRockBlock.block
					&& ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.CAVE_AIR)) {
				world.setBlockState(new BlockPos(x, y + 1, z), SmallAntimatterBudBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos(x, y + 1, z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos(x, y + 1, z), _bs.with(_property, Direction.DOWN), 3);
					} else {
						world.setBlockState(new BlockPos(x, y + 1, z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.DOWN.getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AntimatterCrystalActuatorItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
		if ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
				RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getFace()) == Direction.DOWN) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UnstableBuddingRockBlock.block
					&& ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.CAVE_AIR)) {
				world.setBlockState(new BlockPos(x, y - 1, z), SmallAntimatterBudBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos(x, y - 1, z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos(x, y - 1, z), _bs.with(_property, Direction.UP), 3);
					} else {
						world.setBlockState(new BlockPos(x, y - 1, z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.UP.getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AntimatterCrystalActuatorItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
		if ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
				RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getFace()) == Direction.NORTH) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UnstableBuddingRockBlock.block
					&& ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.CAVE_AIR)) {
				world.setBlockState(new BlockPos(x, y, z - 1), SmallAntimatterBudBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos(x, y, z - 1));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos(x, y, z - 1), _bs.with(_property, Direction.SOUTH), 3);
					} else {
						world.setBlockState(new BlockPos(x, y, z - 1), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.SOUTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AntimatterCrystalActuatorItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
		if ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
				RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getFace()) == Direction.SOUTH) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UnstableBuddingRockBlock.block
					&& ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.CAVE_AIR)) {
				world.setBlockState(new BlockPos(x, y, z + 1), SmallAntimatterBudBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos(x, y, z + 1));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos(x, y, z + 1), _bs.with(_property, Direction.NORTH), 3);
					} else {
						world.setBlockState(new BlockPos(x, y, z + 1), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.NORTH.getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AntimatterCrystalActuatorItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
		if ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
				RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getFace()) == Direction.EAST) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UnstableBuddingRockBlock.block
					&& ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.CAVE_AIR)) {
				world.setBlockState(new BlockPos(x + 1, y, z), SmallAntimatterBudBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos(x + 1, y, z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos(x + 1, y, z), _bs.with(_property, Direction.WEST), 3);
					} else {
						world.setBlockState(new BlockPos(x + 1, y, z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.WEST.getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AntimatterCrystalActuatorItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
		if ((entity.world.rayTraceBlocks(new RayTraceContext(entity.getEyePosition(1f),
				entity.getEyePosition(1f).add(entity.getLook(1f).x * 2, entity.getLook(1f).y * 2, entity.getLook(1f).z * 2),
				RayTraceContext.BlockMode.COLLIDER, RayTraceContext.FluidMode.NONE, entity)).getFace()) == Direction.WEST) {
			if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == UnstableBuddingRockBlock.block
					&& ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.AIR
							|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.VOID_AIR
							|| (world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.CAVE_AIR)) {
				world.setBlockState(new BlockPos(x - 1, y, z), SmallAntimatterBudBlock.block.getDefaultState(), 3);
				try {
					BlockState _bs = world.getBlockState(new BlockPos(x - 1, y, z));
					DirectionProperty _property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (_property != null) {
						world.setBlockState(new BlockPos(x - 1, y, z), _bs.with(_property, Direction.EAST), 3);
					} else {
						world.setBlockState(new BlockPos(x - 1, y, z), _bs.with(
								(EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis"), Direction.EAST.getAxis()), 3);
					}
				} catch (Exception e) {
				}
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(AntimatterCrystalActuatorItem.block);
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
	}
}
