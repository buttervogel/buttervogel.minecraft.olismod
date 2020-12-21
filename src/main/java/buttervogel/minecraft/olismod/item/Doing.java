package buttervogel.minecraft.olismod.item;

import buttervogel.minecraft.olismod.init.ItemGroups;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.Rarity;

public class Doing extends Item {

    private static final Food.Builder FOODBUILDER_BURGER = new Food.Builder().hunger(5).saturation(0.7F).meat();

    public Doing() {

        super(new Properties().group(ItemGroups.OLIS_ITEM_GROUP).defaultMaxDamage(20).rarity(Rarity.UNCOMMON));
    }

}
