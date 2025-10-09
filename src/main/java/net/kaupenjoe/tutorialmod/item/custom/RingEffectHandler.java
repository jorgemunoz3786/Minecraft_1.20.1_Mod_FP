package net.kaupenjoe.tutorialmod.item.custom;

import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class RingEffectHandler {

    public RingEffectHandler() {
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.phase != TickEvent.Phase.START || event.player.level().isClientSide) return;
        Player player = event.player;


        // Mano secundaria
        player.getInventory().offhand.stream()
                .filter(stack -> stack.getItem() instanceof ModRingItem)
                .map(stack -> (ModRingItem) stack.getItem())
                .forEach(ring -> ring.applyRingEffect(player));

        // Armadura
        player.getInventory().armor.stream()
                .filter(stack -> stack.getItem() instanceof ModRingItem)
                .map(stack -> (ModRingItem) stack.getItem())
                .forEach(ring -> ring.applyRingEffect(player));
    }
}
