package cc.unilock.moondial.registry;

import cc.unilock.moondial.Moondial;
import cc.unilock.moondial.item.MoondialItem;
import cc.unilock.moondial.polymer.PolymerTextures;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {
	public static final MoondialItem MOONDIAL = register("moondial", new MoondialItem(new FabricItemSettings().maxCount(1)));

	public static void init() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> entries.add(MOONDIAL));
	}

	private static <T extends Item> T register(String path, T item) {
		Registry.register(Registries.ITEM, Moondial.id(path), item);
		PolymerTextures.requestModel(Moondial.id("item/" + path), item);
		return item;
	}
}
