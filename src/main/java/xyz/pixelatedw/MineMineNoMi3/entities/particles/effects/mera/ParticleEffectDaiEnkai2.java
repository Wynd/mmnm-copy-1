package xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.mera;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.ID;
import xyz.pixelatedw.MineMineNoMi3.MainMod;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.EntityParticleFX;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.ParticleEffect;

public class ParticleEffectDaiEnkai2 extends ParticleEffect {
  public void spawn(EntityPlayer player, double posX, double posY, double posZ) {
    double t = 0.0D;
    Random rand = player.getRNG();
    while (t < 1.0D) {
      t += 1.5707963267948966D;
      double theta;
      for (theta = 0.0D; theta <= 12.566370614359172D; theta += 0.09817477042468103D) {
        double x = t * Math.cos(theta);
        double y = rand.nextInt(1);
        double z = t * Math.sin(theta);
        double motionX = x / 10.0D;
        double motionY = 0.05D + player.worldObj.rand.nextDouble() / 10.0D;
        double motionZ = z / 10.0D;
        MainMod.proxy.spawnCustomParticles((Entity)player, (new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_MERA, posX + x * 1.25D, posY + y, posZ + z * 1.25D, motionX, motionY, motionZ))
            
            .setParticleScale(1.3F).setParticleAge(-3));
        MainMod.proxy.spawnCustomParticles((Entity)player, (new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_MERA, posX + x * 2.0D, posY + y, posZ + z * 2.0D, motionX, motionY, motionZ))
            
            .setParticleScale(1.3F).setParticleAge(1));
        MainMod.proxy.spawnCustomParticles((Entity)player, (new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_MERA, posX + x * 3.25D, posY + y, posZ + z * 3.25D, motionX, motionY * 2.25D, motionZ))
            
            .setParticleScale(1.3F).setParticleAge(3));
      } 
    } 
  }
}
