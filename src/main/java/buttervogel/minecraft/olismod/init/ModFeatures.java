package buttervogel.minecraft.olismod.init;

import buttervogel.minecraft.olismod.OlisMod;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModFeatures {

    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, OlisMod.MOD_ID);

    public static final ConfiguredFeature<?, ?> ORE_KLUMEN = register("ore_klumpen",
            Feature.ORE.withConfiguration(
                    new OreFeatureConfig(
                            OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD,
                            Blocks.BLOCK_KLUMPEN.getDefaultState(), 9
                    )).range(64).square().func_242731_b(20)
    );

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }
}
