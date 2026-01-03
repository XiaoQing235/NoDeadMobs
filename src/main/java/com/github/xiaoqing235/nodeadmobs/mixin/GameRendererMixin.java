package com.github.xiaoqing235.nodeadmobs.mixin;

import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import java.util.function.Predicate;

@Mixin(GameRenderer.class)
public abstract class GameRendererMixin
{
    @ModifyArg(method = "findCrosshairTarget(Lnet/minecraft/entity/Entity;DDF)Lnet/minecraft/util/hit/HitResult;",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/entity/projectile/ProjectileUtil;raycast(Lnet/minecraft/entity/Entity;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Vec3d;Lnet/minecraft/util/math/Box;Ljava/util/function/Predicate;D)Lnet/minecraft/util/hit/EntityHitResult;"))
    private Predicate<Entity> doNotFindDeadTarget(Predicate<Entity> predicate)
    {
        return predicate.and((entityIn) -> !(entityIn instanceof LivingEntity) || ((LivingEntity) entityIn).getHealth() > 0f);
    }
}