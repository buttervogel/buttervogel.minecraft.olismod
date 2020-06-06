package buttervogel.minecraft.olismod.itemgroup;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class OlisItemGroup extends ItemGroup {

    public OlisItemGroup() {
        super("olismod");
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public ItemStack createIcon() {
        return new ItemStack(Blocks.CHISELED_RED_SANDSTONE);
    }
}
