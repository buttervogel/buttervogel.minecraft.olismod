package buttervogel.minecraft.olismod.item;

import buttervogel.minecraft.olismod.init.ItemGroups;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Burger extends Item {

    private static final Food.Builder FOODBUILDER_BURGER = new Food.Builder().hunger(5).saturation(0.7F).meat();

    public Burger() {
        super(new Properties().group(ItemGroups.OLIS_ITEM_GROUP).food(FOODBUILDER_BURGER.build()));
    }

}
