
package fr.osalys.mod.potion;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WriteOffsPotionEffect {

	@ObjectHolder("osalysmod:write_offs")
	public static final Effect potion = null;

	@SubscribeEvent
	public static void registerEffect(RegistryEvent.Register<Effect> event) {
		event.getRegistry().register(new EffectCustom());
	}

	public static class EffectCustom extends Effect {

		public EffectCustom() {
			super(EffectType.HARMFUL, -6291456);
			setRegistryName("write_offs");
		}

		@Override
		public String getName() {
			return "effect.write_offs";
		}

		@Override
		public boolean isBeneficial() {
			return false;
		}

		@Override
		public boolean isInstant() {
			return true;
		}

		@Override
		public boolean shouldRenderInvText(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRender(EffectInstance effect) {
			return true;
		}

		@Override
		public boolean shouldRenderHUD(EffectInstance effect) {
			return true;
		}

		@Override
		public void performEffect(LivingEntity entity, int amplifier) {
			World world = entity.world;
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();

			WriteOffsProcedureProcedure.executeProcedure(Collections.emptyMap());
		}

		@Override
		public boolean isReady(int duration, int amplifier) {
			return true;
		}

	}

}
