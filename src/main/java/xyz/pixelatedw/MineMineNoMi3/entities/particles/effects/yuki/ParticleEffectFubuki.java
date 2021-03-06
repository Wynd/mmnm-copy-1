package xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.yuki;

import java.util.Random;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.ID;
import xyz.pixelatedw.MineMineNoMi3.MainMod;
import xyz.pixelatedw.MineMineNoMi3.api.math.WyMathHelper;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.EntityParticleFX;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.ParticleEffect;

public class ParticleEffectFubuki extends ParticleEffect {
  public void spawn(EntityPlayer player, double posX, double posY, double posZ) {
    for (int i = 0; i < 15360; i++) {
      double offsetX = ((new Random()).nextInt(50) + 1.0D - 25.0D) / 1.0D;
      double offsetY = ((new Random()).nextInt(50) + 1.0D - 25.0D) / 1.0D;
      double offsetZ = ((new Random()).nextInt(50) + 1.0D - 25.0D) / 1.0D;
      double motionX = WyMathHelper.randomWithRange(-1, 1) + player.worldObj.rand.nextDouble();
      double motionY = WyMathHelper.randomWithRange(-1, 1) + player.worldObj.rand.nextDouble();
      double motionZ = WyMathHelper.randomWithRange(-1, 1) + player.worldObj.rand.nextDouble();
      double middlePoint = 0.2D;
      middlePoint *= (player.worldObj.rand.nextFloat() * player.worldObj.rand.nextFloat() + 0.3F);
      motionX *= middlePoint / 2.0D;
      motionY *= middlePoint / 2.0D;
      motionZ *= middlePoint / 2.0D;
      MainMod.proxy.spawnCustomParticles((Entity)player, (new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_YUKI, posX + offsetX, posY + offsetY, posZ + offsetZ, motionX, motionY, motionZ))
          
          .setParticleScale((player.worldObj.rand.nextInt(2) + 1)).setParticleGravity(3.0F).setParticleAge(300));
    } 
  }
}
