package buttervogel.minecraft.olismod;

import buttervogel.minecraft.olismod.init.ModFeatures;
import buttervogel.minecraft.olismod.proxy.ClientProxy;
import buttervogel.minecraft.olismod.proxy.CommonProxy;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(OlisMod.MOD_ID)
public class OlisMod {

    public static final String MOD_ID = "olismod";
    private static final Logger LOGGER = LogManager.getLogger();        // Directly reference a log4j logger.
    public static final CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public OlisMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::setup);
        modEventBus.addListener(this::ready);
        MinecraftForge.EVENT_BUS.register(this);
        proxy.construct();
    }

    public void setup(final FMLCommonSetupEvent event) {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModFeatures.FEATURES.register(modEventBus);
        proxy.setup();
    }

    public void ready(final FMLLoadCompleteEvent event) {
        proxy.complete();
    }

    @SubscribeEvent
    public void biomeGeneration(final BiomeLoadingEvent event) {
        event.getGeneration().getFeatures(GenerationStage.Decoration.UNDERGROUND_ORES).add(() -> ModFeatures.ORE_KLUMEN);
    }

}
