package buttervogel.minecraft.olismod.penguin.init;

import buttervogel.minecraft.olismod.OlisMod;
import com.google.common.collect.Lists;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.List;

@Mod.EventBusSubscriber(modid = OlisMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(OlisMod.MOD_ID)
public class WaddlesSounds {
    private static List<SoundEvent> sounds = Lists.newArrayList();
    public static final SoundEvent ADELIE_AMBIENT = createSound("adelie.ambient");
    public static final SoundEvent ADELIE_BABY_AMBIENT = createSound("adelie.baby.ambient");
    public static final SoundEvent ADELIE_DEATH = createSound("adelie.death");
    public static final SoundEvent ADELIE_HURT = createSound("adelie.hurt");

    private static SoundEvent createSound(String name) {
        ResourceLocation resourceLocation = new ResourceLocation(OlisMod.MOD_ID, name);
        SoundEvent sound = new SoundEvent(resourceLocation);
        sound.setRegistryName(resourceLocation);
        sounds.add(sound);
        return sound;
    }

    @SubscribeEvent
    public static void registerSound(RegistryEvent.Register<SoundEvent> event) {
        for (SoundEvent sound : sounds) {
            event.getRegistry().register(sound);
        }
    }
}
