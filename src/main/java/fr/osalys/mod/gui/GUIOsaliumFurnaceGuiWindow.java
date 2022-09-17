
package fr.osalys.mod.gui;

import fr.osalys.mod.OsalysmodMod;

@OnlyIn(Dist.CLIENT)
public class GUIOsaliumFurnaceGuiWindow extends ContainerScreen<GUIOsaliumFurnaceGui.GuiContainerMod> {

	private World world;
	private int x, y, z;
	private PlayerEntity entity;

	private final static HashMap guistate = GUIOsaliumFurnaceGui.guistate;

	public GUIOsaliumFurnaceGuiWindow(GUIOsaliumFurnaceGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 182;
		this.ySize = 191;
	}

	private static final ResourceLocation texture = new ResourceLocation("osalysmod:textures/screens/gui_osalium_furnace.png");

	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);

	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();

		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("osalysmod:textures/screens/nonhotfurnace.png"));
		this.blit(ms, this.guiLeft + 29, this.guiTop + 63, 0, 0, 14, 14, 14, 14);

		if (

		Feu1Procedure.executeProcedure(Collections.emptyMap())) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("osalysmod:textures/screens/hotfurnace.png"));
			this.blit(ms, this.guiLeft + 29, this.guiTop + 63, 0, 0, 14, 14, 14, 14);
		}
		if (

		Feu2Procedure.executeProcedure(Collections.emptyMap())) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("osalysmod:textures/screens/hotfurnace2.png"));
			this.blit(ms, this.guiLeft + 29, this.guiTop + 63, 0, 0, 14, 14, 14, 14);
		}
		if (

		Feu3Procedure.executeProcedure(Collections.emptyMap())) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("osalysmod:textures/screens/hotfurnace3.png"));
			this.blit(ms, this.guiLeft + 29, this.guiTop + 63, 0, 0, 14, 14, 14, 14);
		}
		if (

		Barre0ProcedureProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("osalysmod:textures/screens/barre0.png"));
			this.blit(ms, this.guiLeft + 59, this.guiTop + 35, 0, 0, 64, 8, 64, 8);
		}
		if (

		Barre4ProcedureProcedure.executeProcedure(Collections.emptyMap())) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("osalysmod:textures/screens/barre1.png"));
			this.blit(ms, this.guiLeft + 59, this.guiTop + 35, 0, 0, 64, 8, 64, 8);
		}
		if (

		Barre3ProcedureProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("osalysmod:textures/screens/barre2.png"));
			this.blit(ms, this.guiLeft + 59, this.guiTop + 35, 0, 0, 64, 8, 64, 8);
		}
		if (

		Barre2ProcedureProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("osalysmod:textures/screens/barre3.png"));
			this.blit(ms, this.guiLeft + 59, this.guiTop + 35, 0, 0, 64, 8, 64, 8);
		}
		if (

		Barre1ProcedureProcedure
				.executeProcedure(Stream
						.of(new AbstractMap.SimpleEntry<>("world", world), new AbstractMap.SimpleEntry<>("x", x),
								new AbstractMap.SimpleEntry<>("y", y), new AbstractMap.SimpleEntry<>("z", z))
						.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("osalysmod:textures/screens/barre4.png"));
			this.blit(ms, this.guiLeft + 59, this.guiTop + 35, 0, 0, 64, 8, 64, 8);
		}

		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("osalysmod:textures/screens/combustiblegui4.png"));
		this.blit(ms, this.guiLeft + 28, this.guiTop + 77, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}

		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Osalium Furnace", 51, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);

	}

}
