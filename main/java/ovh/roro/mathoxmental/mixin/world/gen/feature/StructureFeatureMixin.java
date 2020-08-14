package ovh.roro.mathoxmental.mixin.world.gen.feature;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.gen.ChunkRandom;
import net.minecraft.world.gen.chunk.StructureConfig;
import net.minecraft.world.gen.feature.NetherFortressFeature;
import net.minecraft.world.gen.feature.StructureFeature;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(StructureFeature.class)
public abstract class StructureFeatureMixin {

    @Inject(method = "method_27218", at = @At("HEAD"), cancellable = true)
    public void onCanGenerate(StructureConfig structureConfig, long l, ChunkRandom chunkRandom, int i, int j, CallbackInfoReturnable<ChunkPos> cir) {
        if ((Object) this instanceof NetherFortressFeature) {
            cir.setReturnValue(new ChunkPos(i, j));
        }
    }
}
