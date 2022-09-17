
package fr.osalys.mod.potion;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WriteOffsPotionPotion {

	@ObjectHolder("osalysmod:write_offs_potion")
	public static final Potion potionType = null;

	@SubscribeEvent
	public static void registerPotion(RegistryEvent.Register<Potion> event) {
		event.getRegistry().register(new PotionCustom());
	}

	public static class PotionCustom extends Potion {

		public PotionCustom() {
			super(new EffectInstance(WhiteOffsPotionEffectPotionEffect.potion, 9600, 0, false, true));
			setRegistryName("write_offs_potion");
		}

	}
}