package ovh.roro.mathoxmental.mixin.world.gen.feature;

import com.google.common.collect.ImmutableMap;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.chunk.StructuresConfig;
import net.minecraft.world.gen.feature.StructureFeature;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(StructuresConfig.class)
public abstract class StructuresConfigMixin {

    @Shadow
    @Final
    public static ImmutableMap<StructureFeature<?>, StructureConfig> DEFAULT_STRUCTURES = ImmutableMap.<StructureFeature<?>, StructureConfig>builder()
            .put(StructureFeature.VILLAGE, new StructureConfig(8, 2, 10387312))
            .put(StructureFeature.DESERT_PYRAMID, new StructureConfig(32, 8, 14357617))
            .put(StructureFeature.IGLOO, new StructureConfig(32, 8, 14357618))
            .put(StructureFeature.JUNGLE_PYRAMID, new StructureConfig(32, 8, 14357619))
            .put(StructureFeature.SWAMP_HUT, new StructureConfig(32, 8, 14357620))
            .put(StructureFeature.PILLAGER_OUTPOST, new StructureConfig(32, 8, 165745296))
            .put(StructureFeature.STRONGHOLD, new StructureConfig(1, 0, 0))
            .put(StructureFeature.MONUMENT, new StructureConfig(32, 5, 10387313))
            .put(StructureFeature.END_CITY, new StructureConfig(20, 11, 10387313))
            .put(StructureFeature.MANSION, new StructureConfig(80, 20, 10387319))
            .put(StructureFeature.BURIED_TREASURE, new StructureConfig(1, 0, 0))
            .put(StructureFeature.MINESHAFT, new StructureConfig(1, 0, 0))
            .put(StructureFeature.RUINED_PORTAL, new StructureConfig(40, 15, 34222645))
            .put(StructureFeature.SHIPWRECK, new StructureConfig(24, 4, 165745295))
            .put(StructureFeature.OCEAN_RUIN, new StructureConfig(20, 8, 14357621))
            .put(StructureFeature.BASTION_REMNANT, new StructureConfig(27, 4, 30084232))
            .put(StructureFeature.FORTRESS, new StructureConfig(27, 4, 30084232))
            .put(StructureFeature.NETHER_FOSSIL, new StructureConfig(2, 1, 14357921))
            .build();

}
