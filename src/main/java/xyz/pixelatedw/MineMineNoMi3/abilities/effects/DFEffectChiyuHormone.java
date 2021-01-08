package xyz.pixelatedw.MineMineNoMi3.abilities.effects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class DFEffectChiyuHormone extends DFEffect {
  public DFEffectChiyuHormone(EntityLivingBase entity, int timer) {
    super(entity, timer, "chiyuHormone");
  }
  
  public void onEffectStart(EntityLivingBase entity) {
    entity.addPotionEffect(new PotionEffect(Potion.regeneration.id, 100, 2));
  }
  
  public void onEffectEnd(EntityLivingBase entity) {
    entity.addPotionEffect(new PotionEffect(Potion.hunger.id, 300, 1));
  }
}
