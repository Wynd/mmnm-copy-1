package xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.doku;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.ID;
import xyz.pixelatedw.MineMineNoMi3.MainMod;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.EntityParticleFX;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.ParticleEffect;

public class ParticleEffectDokuGumo extends ParticleEffect {
  public void spawn(EntityPlayer player, double posX, double posY, double posZ) {
    for (int i = 0; i < 30; i++) {
      double offsetX = ((new Random()).nextInt(20) - 10.0D) / 3.0D;
      double offsetY = ((new Random()).nextInt(20) - 10.0D) / 35.0D;
      double offsetZ = ((new Random()).nextInt(20) - 10.0D) / 3.0D;
      MainMod.proxy.spawnCustomParticles((Entity)player, (new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_DOKU, posX - 1.0D + offsetX + (new Random())
            
            .nextInt(5), posY + offsetY, posZ - 1.0D + offsetZ + (new Random())
            
            .nextInt(5), 0.0D, 0.0D, 0.0D))
          
          .setParticleScale(1.0F).setParticleGravity(0.0F).setParticleAge(1 + player.worldObj.rand.nextInt(2)));
      MainMod.proxy.spawnCustomParticles((Entity)player, (new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_DOKU, posX - 1.0D + offsetX + (new Random())
            
            .nextInt(5), posY + 1.5D + offsetY, posZ - 1.0D + offsetZ + (new Random())
            
            .nextInt(5), 0.0D, 0.0D, 0.0D))
          
          .setParticleScale(1.0F).setParticleGravity(0.0F).setParticleAge(1 + player.worldObj.rand.nextInt(2)));
      MainMod.proxy.spawnCustomParticles((Entity)player, (new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_DOKU, posX - 1.0D + offsetX + (new Random())
            
            .nextInt(5), posY + 2.5D + offsetY, posZ - 1.0D + offsetZ + (new Random())
            
            .nextInt(5), 0.0D, 0.0D, 0.0D))
          
          .setParticleScale(1.0F).setParticleGravity(0.0F).setParticleAge(1 + player.worldObj.rand.nextInt(2)));
    } 
  }
}
