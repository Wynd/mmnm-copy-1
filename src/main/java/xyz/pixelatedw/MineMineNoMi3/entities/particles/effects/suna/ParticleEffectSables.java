package xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.suna;

import java.util.Timer;
import java.util.TimerTask;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.ID;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.EntityParticleFX;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.effects.ParticleEffect;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.tasks.ParticleTaskTornado;

public class ParticleEffectSables extends ParticleEffect {
  public void spawn(EntityPlayer player, double posX, double posY, double posZ) {
    Timer timer = new Timer(true);
    EntityParticleFX particle = new EntityParticleFX(player.worldObj, ID.PARTICLE_ICON_SUNA2, posX, posY - 1.0D, posZ, 0.0D, 0.0D, 0.0D);
    timer.schedule((TimerTask)ParticleTaskTornado.Create((EntityLivingBase)player, particle.posX, particle.posY, particle.posZ, particle, 2.0D, 2, 0.35D, 0.7D), 0L);
  }
}
