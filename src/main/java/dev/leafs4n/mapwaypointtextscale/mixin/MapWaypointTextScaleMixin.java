package dev.leafs4n.mapwaypointtextscale.mixin;

import dev.leafs4n.mapwaypointtextscale.MapWaypointTextScale;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Mixin(targets = "net.minecraft.client.render.MapRenderer$MapTexture")
public abstract class MapWaypointTextScaleMixin implements AutoCloseable{

    @ModifyVariable(method = "draw", at = @At("STORE"), ordinal = 7)
    private float injected(float p) {
        return (float) MapWaypointTextScale.CONFIG.scale()/10;
    }
}
