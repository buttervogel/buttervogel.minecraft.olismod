package buttervogel.minecraft.olismod.init;

import buttervogel.minecraft.olismod.OlisMod;
import buttervogel.minecraft.olismod.block.Klumpen;
import buttervogel.minecraft.olismod.item.ItemBlockDefault;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Blocks {

    public static final Klumpen klumpen = new Klumpen();

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        klumpen.setRegistryName(OlisMod.MOD_ID,"klumpen");
        registry.register(klumpen);
    }
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlockDefault(klumpen));

    }
}
