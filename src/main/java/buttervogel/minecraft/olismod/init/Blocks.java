package buttervogel.minecraft.olismod.init;

import buttervogel.minecraft.olismod.OlisMod;
import buttervogel.minecraft.olismod.block.BlockKlumpen;
import buttervogel.minecraft.olismod.item.ItemBlockDefault;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Blocks {

    public static final BlockKlumpen blockKlumpen = new BlockKlumpen();

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
        IForgeRegistry<Block> registry = event.getRegistry();
        blockKlumpen.setRegistryName(OlisMod.MOD_ID,"blockklumpen");
        registry.register(blockKlumpen);
    }
    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        IForgeRegistry<Item> registry = event.getRegistry();
        registry.register(new ItemBlockDefault(blockKlumpen));

    }
}
