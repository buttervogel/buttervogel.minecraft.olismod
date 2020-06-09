package buttervogel.minecraft.olismod.init;

import buttervogel.minecraft.olismod.item.Bimbam;
import buttervogel.minecraft.olismod.item.Burger;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Items {

    /*
     * Items
     */
    public static final Bimbam BIMBAM = new Bimbam();
    public static final Burger BURGER = new Burger();

    /*
     * Foods
     */

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();

        registry.register(BIMBAM.setRegistryName("bimbam"));
        registry.register(BURGER.setRegistryName("burger"));
    }
}
