package xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.moku;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.ID;
import xyz.pixelatedw.MineMineNoMi3.MainMod;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.EntityParticleFX;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.ParticleEffect;

public class ParticleEffectWhiteLauncher extends ParticleEffect {
  public void spawn(EntityPlayer player, double posX, double posY, double posZ) {
    for (int i = 0; i < 20; i++) {
      double offsetX = ((new Random()).nextInt(20) + 1.0D - 10.0D) / 15.0D;
      double offsetY = ((new Random()).nextInt(20) + 1.0D - 10.0D) / 10.0D;
      double offsetZ = ((new Random()).nextInt(20) + 1.0D - 10.0D) / 15.0D;
      MainMod.proxy.spawnCustomParticles((Entity)player, (new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_MOKU, posX + offsetX, posY + 1.0D + offsetY, posZ + offsetZ, 0.0D, 0.0D, 0.0D))
          
          .setParticleScale(1.3F).setParticleGravity(0.0F).setParticleAge(20));
    } 
  }
}
