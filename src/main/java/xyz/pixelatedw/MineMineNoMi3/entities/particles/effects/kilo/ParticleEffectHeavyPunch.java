package xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.kilo;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.ID;
import xyz.pixelatedw.MineMineNoMi3.MainMod;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.EntityParticleFX;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.ParticleEffect;

public class ParticleEffectHeavyPunch extends ParticleEffect {
  public void spawn(EntityPlayer player, double posX, double posY, double posZ) {
    for (int i = 0; i < 20; i++) {
      double offsetX = ((new Random()).nextInt(10) + 1.0D - 10.0D) / 10.0D;
      double offsetY = ((new Random()).nextInt(30) + 1.0D - 10.0D) / 10.0D;
      double offsetZ = ((new Random()).nextInt(10) + 1.0D - 10.0D) / 10.0D;
      MainMod.proxy.spawnCustomParticles((Entity)player, (new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_KILO, posX + offsetX, posY + offsetY, posZ + offsetZ, 0.0D, 0.0D, 0.0D))
          
          .setParticleScale(3.0F).setParticleGravity(0.0F).setParticleAge(1));
    } 
  }
}
