package xyz.pixelatedw.MineMineNoMi3.entities.particles.effects;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.ID;
import xyz.pixelatedw.MineMineNoMi3.MainMod;
import xyz.pixelatedw.MineMineNoMi3.api.math.WyMathHelper;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.EntityParticleFX;

public class ParticleNuma extends ParticleEffect {
  public void spawn(EntityPlayer player, double posX, double posY, double posZ) {
    for (int i = 0; i < 256; i++) {
      double motionX = WyMathHelper.randomWithRange(-7, 7) + player.worldObj.rand.nextDouble();
      double motionY = WyMathHelper.randomWithRange(-7, 7) + player.worldObj.rand.nextDouble();
      double motionZ = WyMathHelper.randomWithRange(-7, 7) + player.worldObj.rand.nextDouble();
      double middlePoint = 0.05D;
      middlePoint *= (player.worldObj.rand.nextFloat() * player.worldObj.rand.nextFloat() + 2.2F);
      motionX *= middlePoint / 2.0D;
      motionY *= middlePoint / 2.0D;
      motionZ *= middlePoint / 2.0D;
      MainMod.proxy.spawnCustomParticles((Entity)player, (new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_SWAMP, posX, posY + 1.0D, posZ, motionX, motionY, motionZ))
          
          .setParticleScale(2.0F).setParticleAge(1));
    } 
  }
}
