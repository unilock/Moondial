package cc.unilock.moondial;

import cc.unilock.moondial.polymer.PolymerTextures;
import cc.unilock.moondial.registry.ModItems;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;

public class Moondial implements ModInitializer {
	public static final String MOD_ID = "moondial";
    //public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		PolymerTextures.init(MOD_ID);
		ModItems.init();
	}

	public static Identifier id(String path) {
		return new Identifier(MOD_ID, path);
	}
}
