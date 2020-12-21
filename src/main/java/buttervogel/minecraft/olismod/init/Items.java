package buttervogel.minecraft.olismod.init;

import buttervogel.minecraft.olismod.item.Bimbam;
import buttervogel.minecraft.olismod.item.Burger;
import buttervogel.minecraft.olismod.item.Doing;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Items {

    /*
     * statics
     */

    public static final String REGNAME_ITEM_BIMBAM = "bimbam";
    public static final String REGNAME_ITEM_BURGER = "burger";
    public static final String REGNAME_ITEM_DOING = "doing";

    /*
     * Items
     */
    public static final Bimbam ITEM_BIMBAM = new Bimbam();
    public static final Burger ITEM_BURGER = new Burger();
    public static final Doing ITEM_DOING = new Doing();

    /*
     * Foods
     */

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(ITEM_BIMBAM.setRegistryName(REGNAME_ITEM_BIMBAM));
        registry.register(ITEM_BURGER.setRegistryName(REGNAME_ITEM_BURGER));
        registry.register(ITEM_DOING.setRegistryName(REGNAME_ITEM_DOING));
    }
}
