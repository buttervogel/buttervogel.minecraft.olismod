package buttervogel.minecraft.olismod.item;

import buttervogel.minecraft.olismod.OlisMod;
import buttervogel.minecraft.olismod.init.ItemGroups;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

/*
 * API Change!
 *
 * Achtung: ItemBlock (wie im Tutorial verwendet) heisst nun BlockItem
 */
public class ItemBlockDefault extends BlockItem {

    public ItemBlockDefault(Block block) {
        super(block, new Properties().group(ItemGroups.group));
        setRegistryName(block.getRegistryName());
    }
}
