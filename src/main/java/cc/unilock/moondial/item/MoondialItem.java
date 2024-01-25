package cc.unilock.moondial.item;

import cc.unilock.moondial.polymer.PolymerTextures;
import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class MoondialItem extends Item implements PolymerItem {
	public MoondialItem(Settings settings) {
		super(settings);
	}

	@Override
	public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
		user.sendMessage(Text.translatable("moondial.phase", Text.translatable("moondial.phase." + world.getMoonPhase())), true);
		return TypedActionResult.consume(this.getDefaultStack());
	}

	@Override
	public Item getPolymerItem(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
		return Items.AMETHYST_SHARD;
	}

	@Override
	public int getPolymerCustomModelData(ItemStack itemStack, @Nullable ServerPlayerEntity player) {
		return PolymerTextures.MODELS.get(this).value();
	}
}
