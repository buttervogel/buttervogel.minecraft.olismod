package buttervogel.minecraft.olismod.item;

import buttervogel.minecraft.olismod.init.ItemGroups;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Rarity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class Bimbam extends Item {

    public Bimbam() {
        super(new Properties().group(ItemGroups.group).defaultMaxDamage(20).rarity(Rarity.UNCOMMON));
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, PlayerEntity player, Hand hand) {
        ItemStack stack = player.getHeldItem(hand);
        if (world.isRemote) {
            world.setBlockState(player.getPosition().down(), Blocks.DIAMOND_BLOCK.getDefaultState());
            stack.damageItem(1, player, onBroken -> {
            });
        }
        player.jump();
        player.fallDistance = 0;

        return new ActionResult<ItemStack>(ActionResultType.SUCCESS, stack);

    }
}
