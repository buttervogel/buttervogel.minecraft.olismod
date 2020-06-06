package buttervogel.minecraft.olismod.init;

import buttervogel.minecraft.olismod.OlisMod;
import buttervogel.minecraft.olismod.item.ItemOlisMod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Items {

    public static final ItemOlisMod item = new ItemOlisMod();

    @SubscribeEvent
    public static void register(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        item.setRegistryName(OlisMod.MOD_ID,"bimbam");
        registry.register(item);
    }
}
