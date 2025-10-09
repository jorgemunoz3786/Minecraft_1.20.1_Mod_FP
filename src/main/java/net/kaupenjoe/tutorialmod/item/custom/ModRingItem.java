package net.kaupenjoe.tutorialmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class ModRingItem extends Item {
    private final RingType ringType;
    private final boolean isGold;

    // Duración de los efectos en ticks
    private static final int EFFECT_DURATION = 100;

    public ModRingItem(Properties properties, RingType ringType, boolean isGold) {
        super(properties);
        this.ringType = ringType;
        this.isGold = isGold;
    }

    public void inventoryTick(ItemStack stack, Level level, LivingEntity entity, int slot, boolean selected) {
        if (level.isClientSide) return; // Solo en servidor
        if (!(entity instanceof Player player)) return;

        // Activar efecto si el anillo está en cualquier ranura, mano o armadura
        boolean hasRing = player.getInventory().items.stream().anyMatch(s -> s.is(this))
                || player.getInventory().armor.stream().anyMatch(s -> s.is(this))
                || player.getInventory().offhand.stream().anyMatch(s -> s.is(this));

        if (hasRing) {
            applyRingEffect(player);
        }
    }

    private void applyRingEffect(Player player) {
        switch (ringType) {
            case GELIDA -> {
                if (isGold) player.setDeltaMovement(player.getDeltaMovement().multiply(1.05, 1.0, 1.05));
                else player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, EFFECT_DURATION, 0, true, false));
            }
            case ANTIGUA -> {
                if (isGold) {
                    player.level().getEntitiesOfClass(LivingEntity.class, player.getBoundingBox().inflate(8))
                            .forEach(e -> { if (e != player) e.setDeltaMovement(Vec3.ZERO); });
                } else player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, EFFECT_DURATION, 0, true, false));
            }
            case MUSGOSA -> {
                if (isGold) player.addEffect(new MobEffectInstance(MobEffects.NIGHT_VISION, EFFECT_DURATION * 2, 0, true, false));
                else if (player.isShiftKeyDown()) player.addEffect(new MobEffectInstance(MobEffects.INVISIBILITY, EFFECT_DURATION, 0, true, false));
            }
            case FUNGICA -> {
                if (isGold) {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, EFFECT_DURATION, 1, true, false));
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, EFFECT_DURATION, 0, true, false));
                } else player.addEffect(new MobEffectInstance(MobEffects.JUMP, EFFECT_DURATION, 0, true, false));
            }
            case CRISTAL -> {
                if (isGold) player.addEffect(new MobEffectInstance(MobEffects.LUCK, EFFECT_DURATION, 2, true, false));
                else player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, EFFECT_DURATION, 1, true, false));
            }
            case TRANSLUCIDA -> {
                player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, EFFECT_DURATION, isGold ? 1 : 0, true, false));
            }
            case CORAL -> {
                player.addEffect(new MobEffectInstance(isGold ? MobEffects.CONDUIT_POWER : MobEffects.DOLPHINS_GRACE, EFFECT_DURATION, 0, true, false));
            }
            case BRUTA -> {
                if (isGold) {
                    player.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, EFFECT_DURATION, 1, true, false));
                    player.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, EFFECT_DURATION, 0, true, false));
                } else player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, EFFECT_DURATION, 0, true, false));
            }
            case DIVIDIDA -> {
                if (isGold) player.getFoodData().eat(1, 0.2f);
                else player.addEffect(new MobEffectInstance(MobEffects.HEALTH_BOOST, EFFECT_DURATION, 1, true, false));
            }
            case ALMAS -> {
                player.addEffect(new MobEffectInstance(isGold ? MobEffects.LUCK : MobEffects.MOVEMENT_SPEED, EFFECT_DURATION, 1, true, false));
            }
            case PURPURA -> {
                if (isGold && !player.onGround() && player.getDeltaMovement().y < 0) {
                    player.setDeltaMovement(player.getDeltaMovement().x, player.getDeltaMovement().y * 0.6, player.getDeltaMovement().z);
                } else if (!isGold && !player.onGround() && !player.hasEffect(MobEffects.SLOW_FALLING)) {
                    player.addEffect(new MobEffectInstance(MobEffects.JUMP, EFFECT_DURATION, 1, true, false));
                }
            }
        }
    }

    public enum RingType {
        GELIDA, ANTIGUA, MUSGOSA, FUNGICA, CRISTAL, TRANSLUCIDA, CORAL, BRUTA, DIVIDIDA, ALMAS, PURPURA
    }
}
