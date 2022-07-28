package fr.osalys.mod.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;
import net.minecraft.block.Block;

import java.util.Map;

import fr.osalys.mod.OsalysmodModVariables;
import fr.osalys.mod.OsalysmodMod;

public class OsaliumHammerProcedureProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency world for procedure OsaliumHammerProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency x for procedure OsaliumHammerProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency y for procedure OsaliumHammerProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency z for procedure OsaliumHammerProcedure!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency entity for procedure OsaliumHammerProcedure!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		OsalysmodModVariables.MapVariables.get(world).RANDOM = Math.random();
		OsalysmodModVariables.MapVariables.get(world).syncData(world);
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == ExoliumOreItem.block) {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z)), (World) world, new BlockPos(x, y, z));
				world.destroyBlock(new BlockPos(x, y, z), false);
			}
			if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(RenforcedExoliumItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ExoliumItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ExoliumDustItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ExoliumDustItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ExoliumDustItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			} else {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(ExoliumDustItem.block));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
			}
		} else {
			if (world instanceof World) {
				Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z)), (World) world, new BlockPos(x, y, z));
				world.destroyBlock(new BlockPos(x, y, z), false);
			}
		}
		if (entity.rotationPitch > 40 || entity.rotationPitch < -40) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.OBSIDIAN)
					&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ExobsidienneItem.block)) {
				if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.OBSIDIAN)
					&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ExobsidienneItem.block)) {
				if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y, z + 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z + 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z + 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y, z - 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z - 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z - 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y, z - 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y, z - 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z - 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z - 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y, z - 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y, z + 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z + 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z + 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y, z + 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y, z - 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y, z - 1), false);
					}
				}
			}
		} else if ((entity.getHorizontalFacing()) == Direction.NORTH || (entity.getHorizontalFacing()) == Direction.SOUTH) {
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x + 1, y, z)))
							.getBlock() == ExobsidienneItem.block) == !((world.getBlockState(new BlockPos(x + 1, y, z)))
									.getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x - 1, y, z)))
							.getBlock() == ExobsidienneItem.block) == !((world.getBlockState(new BlockPos(x - 1, y, z)))
									.getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), y, z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x + 1, y + 1, z)))
							.getBlock() == ExobsidienneItem.block) == !((world.getBlockState(new BlockPos(x + 1, y + 1, z)))
									.getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y + 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y + 1, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y + 1), z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y + 1), z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y + 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y + 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z)))
							.getBlock() == ExobsidienneItem.block) == !((world.getBlockState(new BlockPos(x + 1, y - 1, z)))
									.getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y - 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y - 1, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y - 1), z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y - 1), z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 1), (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y - 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x + 1, y - 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z)))
							.getBlock() == ExobsidienneItem.block) == !((world.getBlockState(new BlockPos(x - 1, y - 1, z)))
									.getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y - 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y - 1, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y - 1), z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y - 1), z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y - 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y - 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x - 1, y + 1, z)))
							.getBlock() == ExobsidienneItem.block) == !((world.getBlockState(new BlockPos(x - 1, y + 1, z)))
									.getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y + 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y + 1, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y + 1), z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y + 1), z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, (x - 1), (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y + 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x - 1, y + 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y + 1, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y + 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y - 1, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y - 1, z), false);
					}
				}
			}
		} else if ((entity.getHorizontalFacing()) == Direction.WEST || (entity.getHorizontalFacing()) == Direction.EAST) {
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y, z + 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y, z - 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y, z - 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y + 1, z + 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z + 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z + 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y + 1, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y - 1, z + 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z + 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z + 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z + 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z + 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y - 1, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y - 1, z - 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z - 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z - 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y - 1, z - 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y + 1, z - 1), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z - 1), new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z - 1), new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), (z - 1), new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z - 1)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y + 1, z - 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y + 1, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y + 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y + 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ExobsidienneItem.block)
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.OBSIDIAN)) {
				if ((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == ExoliumOreItem.block) {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y - 1, z), false);
					}
					if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.001) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(RenforcedExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.01) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(ExoliumItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.5) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else if (OsalysmodModVariables.MapVariables.get(world).RANDOM < 0.75) {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					} else {
						if (world instanceof World && !world.isRemote()) {
							ItemEntity entityToSpawn = new ItemEntity((World) world, x, (y - 1), z, new ItemStack(ExoliumDustItem.block));
							entityToSpawn.setPickupDelay((int) 10);
							world.addEntity(entityToSpawn);
						}
					}
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y, z));
						world.destroyBlock(new BlockPos(x, y - 1, z), false);
					}
				}
			}
		}
	}
}
