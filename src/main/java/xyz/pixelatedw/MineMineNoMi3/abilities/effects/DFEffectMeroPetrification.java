package xyz.pixelatedw.MineMineNoMi3.abilities.effects;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class DFEffectMeroPetrification extends DFEffect {
  public DFEffectMeroPetrification(EntityLivingBase entity, int timer) {
    super(entity, timer, "mero");
  }
  
  public void onEffectStart(EntityLivingBase entity) {
    entity.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, this.timer, 1));
    entity.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, this.timer, 1));
    entity.addPotionEffect(new PotionEffect(Potion.jump.id, this.timer, -5));
  }
  
  public void onEffectEnd(EntityLivingBase entity) {}
}
