package buttervogel.minecraft.olismod.init;

import buttervogel.minecraft.olismod.OlisMod;
import buttervogel.minecraft.olismod.block.Klumpen;
import buttervogel.minecraft.olismod.item.ItemBlockDefault;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Blocks {

    public static final String REGNAME_BLOCK_KLUMPEN = "klumpen";
    public static final Klumpen BLOCK_KLUMPEN = new Klumpen();

    @SubscribeEvent
    public static void registerBlock(RegistryEvent.Register<Block> event) {
        BLOCK_KLUMPEN.setRegistryName(OlisMod.MOD_ID, REGNAME_BLOCK_KLUMPEN);
        event.getRegistry().register(BLOCK_KLUMPEN);
    }

    @SubscribeEvent
    public static void registerItem(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlockDefault(BLOCK_KLUMPEN));
    }
}
