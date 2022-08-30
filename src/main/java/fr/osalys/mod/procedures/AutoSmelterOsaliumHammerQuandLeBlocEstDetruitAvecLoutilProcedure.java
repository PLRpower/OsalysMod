package fr.osalys.mod.procedures;

import net.minecraftforge.eventbus.api.Event;

public class AutoSmelterOsaliumHammerQuandLeBlocEstDetruitAvecLoutilProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency world for procedure AutoSmelterOsaliumHammerQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency x for procedure AutoSmelterOsaliumHammerQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency y for procedure AutoSmelterOsaliumHammerQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency z for procedure AutoSmelterOsaliumHammerQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				OsalysmodMod.LOGGER.warn("Failed to load dependency entity for procedure AutoSmelterOsaliumHammerQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				OsalysmodMod.LOGGER
						.warn("Failed to load dependency itemstack for procedure AutoSmelterOsaliumHammerQuandLeBlocEstDetruitAvecLoutil!");
			return;
		}

		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");

		boolean removeBlock = false;
		if (entity.rotationPitch > 40 || entity.rotationPitch < -40) {
			{
				ItemStack _ist = itemstack;
				if (_ist.attemptDamageItem((int) 8, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x + 1, y, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z)), (World) world, new BlockPos(x + 1, y, z));

						world.destroyBlock(new BlockPos(x + 1, y, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x - 1, y, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z)), (World) world, new BlockPos(x - 1, y, z));

						world.destroyBlock(new BlockPos(x - 1, y, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z + 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x + 1, y, z + 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z + 1)), (World) world, new BlockPos(x + 1, y, z + 1));

						world.destroyBlock(new BlockPos(x + 1, y, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z - 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x + 1, y, z - 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z - 1)), (World) world, new BlockPos(x + 1, y, z - 1));

						world.destroyBlock(new BlockPos(x + 1, y, z - 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z - 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x - 1, y, z - 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z - 1)), (World) world, new BlockPos(x - 1, y, z - 1));

						world.destroyBlock(new BlockPos(x - 1, y, z - 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z + 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x - 1, y, z + 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z + 1)), (World) world, new BlockPos(x - 1, y, z + 1));

						world.destroyBlock(new BlockPos(x - 1, y, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y, z + 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z + 1)), (World) world, new BlockPos(x, y, z + 1));

						world.destroyBlock(new BlockPos(x, y, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y, z - 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z - 1)), (World) world, new BlockPos(x, y, z - 1));

						world.destroyBlock(new BlockPos(x, y, z - 1), false);
					}
				}
			}
		} else if ((entity.getHorizontalFacing()) == Direction.NORTH || (entity.getHorizontalFacing()) == Direction.SOUTH) {
			{
				ItemStack _ist = itemstack;
				if (_ist.attemptDamageItem((int) 8, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x + 1, y, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x + 1, y, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z)), (World) world, new BlockPos(x + 1, y, z));

						world.destroyBlock(new BlockPos(x + 1, y, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x - 1, y, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x - 1, y, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z)), (World) world, new BlockPos(x - 1, y, z));

						world.destroyBlock(new BlockPos(x - 1, y, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x + 1, y + 1, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x + 1, y + 1, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y + 1, z)), (World) world, new BlockPos(x + 1, y + 1, z));

						world.destroyBlock(new BlockPos(x + 1, y + 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x + 1, y - 1, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x + 1, y - 1, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y - 1, z)), (World) world, new BlockPos(x + 1, y - 1, z));

						world.destroyBlock(new BlockPos(x + 1, y - 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x - 1, y - 1, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x - 1, y - 1, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y - 1, z)), (World) world, new BlockPos(x - 1, y - 1, z));

						world.destroyBlock(new BlockPos(x - 1, y - 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x - 1, y + 1, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x - 1, y + 1, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y + 1, z)), (World) world, new BlockPos(x - 1, y + 1, z));

						world.destroyBlock(new BlockPos(x - 1, y + 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y + 1, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y + 1, z));

						world.destroyBlock(new BlockPos(x, y + 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y - 1, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y - 1, z));

						world.destroyBlock(new BlockPos(x, y - 1, z), false);
					}
				}
			}
		} else if ((entity.getHorizontalFacing()) == Direction.WEST || (entity.getHorizontalFacing()) == Direction.EAST) {
			{
				ItemStack _ist = itemstack;
				if (_ist.attemptDamageItem((int) 8, new Random(), null)) {
					_ist.shrink(1);
					_ist.setDamage(0);
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y, z + 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y, z + 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z + 1)), (World) world, new BlockPos(x, y, z + 1));

						world.destroyBlock(new BlockPos(x, y, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y, z - 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y, z - 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z - 1)), (World) world, new BlockPos(x, y, z - 1));

						world.destroyBlock(new BlockPos(x, y, z - 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z + 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y + 1, z + 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z + 1)), (World) world, new BlockPos(x, y + 1, z + 1));

						world.destroyBlock(new BlockPos(x, y + 1, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z + 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y - 1, z + 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z + 1)), (World) world, new BlockPos(x, y - 1, z + 1));

						world.destroyBlock(new BlockPos(x, y - 1, z + 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z - 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y - 1, z - 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z - 1)), (World) world, new BlockPos(x, y - 1, z - 1));

						world.destroyBlock(new BlockPos(x, y - 1, z - 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING,
								new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))), ((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING, new Inventory(
																(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z - 1))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y + 1, z - 1), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z - 1)), (World) world, new BlockPos(x, y + 1, z - 1));

						world.destroyBlock(new BlockPos(x, y + 1, z - 1), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y + 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y + 1, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y + 1, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y + 1, z));

						world.destroyBlock(new BlockPos(x, y + 1, z), false);
					}
				}
			}
			if ((world.getBlockState(new BlockPos(x, y - 1, z))).getMaterial() == net.minecraft.block.material.Material.ROCK
					&& !((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock() == Blocks.BEDROCK)) {
				if (!(((world instanceof World && ((World) world).getRecipeManager()
						.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
								((World) world))
						.isPresent())
								? ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
												(World) world)
										.get().getRecipeOutput().copy()
								: ItemStack.EMPTY)
						.getItem() == Blocks.AIR.asItem())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								((world instanceof World && ((World) world).getRecipeManager()
										.getRecipe(IRecipeType.SMELTING,
												new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
												((World) world))
										.isPresent())
												? ((World) world).getRecipeManager()
														.getRecipe(IRecipeType.SMELTING,
																new Inventory(
																		(new ItemStack((world.getBlockState(new BlockPos(x, y - 1, z))).getBlock()))),
																(World) world)
														.get().getRecipeOutput().copy()
												: ItemStack.EMPTY));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					removeBlock = (true);
				} else {
					removeBlock = (false);
				}
				if (removeBlock == true) {
					world.destroyBlock(new BlockPos(x, y - 1, z), false);
				} else {
					if (world instanceof World) {
						Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y, z));

						world.destroyBlock(new BlockPos(x, y - 1, z), false);
					}
				}
			}
		}
		if (AntimatterHammerItem.block.canHarvestBlock((world.getBlockState(new BlockPos(x, y, z)))) == true) {
			if (!(((world instanceof World && ((World) world).getRecipeManager()
					.getRecipe(IRecipeType.SMELTING, new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
							((World) world))
					.isPresent())
							? ((World) world).getRecipeManager()
									.getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))), (World) world)
									.get().getRecipeOutput().copy()
							: ItemStack.EMPTY)
					.getItem() == Blocks.AIR.asItem())) {
				if (world instanceof World && !world.isRemote()) {
					ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
							((world instanceof World && ((World) world).getRecipeManager()
									.getRecipe(IRecipeType.SMELTING,
											new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))), ((World) world))
									.isPresent())
											? ((World) world).getRecipeManager()
													.getRecipe(IRecipeType.SMELTING,
															new Inventory((new ItemStack((world.getBlockState(new BlockPos(x, y, z))).getBlock()))),
															(World) world)
													.get().getRecipeOutput().copy()
											: ItemStack.EMPTY));
					entityToSpawn.setPickupDelay((int) 10);
					world.addEntity(entityToSpawn);
				}
				removeBlock = (true);
			} else {
				removeBlock = (false);
			}
			if (removeBlock == true) {
				world.destroyBlock(new BlockPos(x, y, z), false);
			} else {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z)), (World) world, new BlockPos(x, y, z));

					world.destroyBlock(new BlockPos(x, y, z), false);
				}
			}
		}
	}

}
