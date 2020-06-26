package buttervogel.minecraft.olismod;

import buttervogel.minecraft.olismod.proxy.ClientProxy;
import buttervogel.minecraft.olismod.proxy.CommonProxy;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(OlisMod.MOD_ID)
public class OlisMod {

    public static final String MOD_ID = "olismod";
    private static final Logger LOGGER = LogManager.getLogger();        // Directly reference a log4j logger.
    public static final CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public OlisMod() {
        FMLJavaModLoadingContext.get().getModEventBus().register(this);
        proxy.construct();
    }

    @SubscribeEvent
    public void setup(final FMLCommonSetupEvent event) {
        proxy.setup();
    }

    @SubscribeEvent
    public void ready(final FMLLoadCompleteEvent event) {
        proxy.complete();
    }

}
