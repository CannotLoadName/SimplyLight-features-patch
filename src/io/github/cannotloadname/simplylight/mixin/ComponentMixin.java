package io.github.cannotloadname.simplylight.mixin;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
@Mixin(Component.class)
public interface ComponentMixin{
    @Inject(method="literal(Ljava/lang/String;)Lnet/minecraft/network/chat/MutableComponent;",at=@At("HEAD"),cancellable=true)
    private static void literalMixin(String arg0,CallbackInfoReturnable<MutableComponent> cir){
        if(arg0.equals("Simply Light")){
            cir.setReturnValue(Component.translatable("itemGroup.simplylight"));
        }
    }
}