package buttervogel.minecraft.olismod.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraftforge.common.ToolType;


public class Klumpen extends Block {

    public Klumpen() {
        super(Properties.create(Material.ROCK).slipperiness(1).hardnessAndResistance(5).sound(SoundType.GLASS));

    }

    /**
     * Abbauen nur mit Spitzhacke
     *
     * @param state
     * @return
     */
    @Override
    public ToolType getHarvestTool(BlockState state) {
        return ToolType.PICKAXE;
    }

    /**
     * mindestens Eisen-Spitzhacke (oder Diamand-Spitzhacke) benötigt
     *
     * @param state
     * @return
     */
    @Override
    public int getHarvestLevel(BlockState state) {
        return 2;
    }



    /*
     * API Change!
     *
     * Blocks use loot tables now. You can set it by overriding getLootTable in your block class or it will
     * default to [modid]:blocks/[block registry name]. This translates to the following location
     * of the loot table: /assets/[modid]/loot_tables/blocks/[block registry name].json.
     *
     * @see "https://www.minecraftforge.net/forum/topic/71815-solved1142-custom-blocks-not-dropping-items/?tab=comments#comment-346848"
     *
     * @return
     */

}
