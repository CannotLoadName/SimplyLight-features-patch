package io.github.cannotloadname.simplylight.mixin;
import com.flanks255.simplylight.util.RecipeUnlocker;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
@Mixin(RecipeUnlocker.class)
public class RecipeUnlockerMixin{
    @Inject(method="onPlayerLoggedIn(Lnet/neoforged/neoforge/event/entity/player/PlayerEvent$PlayerLoggedInEvent;)V",at=@At("HEAD"),cancellable=true)
    private static void onPlayerLoggedInMixin(PlayerEvent.PlayerLoggedInEvent event,CallbackInfo ci){
        ci.cancel();
    }
}