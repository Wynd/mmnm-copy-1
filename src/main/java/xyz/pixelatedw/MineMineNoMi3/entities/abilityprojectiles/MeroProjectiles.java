package xyz.pixelatedw.MineMineNoMi3.entities.abilityprojectiles;

import java.util.ArrayList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xyz.pixelatedw.MineMineNoMi3.ID;
import xyz.pixelatedw.MineMineNoMi3.MainMod;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.AbilityAttribute;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.AbilityProjectile;
import xyz.pixelatedw.MineMineNoMi3.entities.particles.EntityParticleFX;
import xyz.pixelatedw.MineMineNoMi3.helpers.DevilFruitsHelper;
import xyz.pixelatedw.MineMineNoMi3.lists.ListAttributes;

public class MeroProjectiles {
  public static ArrayList<Object[]> abilitiesClassesArray = new ArrayList();
  
  static {
    abilitiesClassesArray.add(new Object[] { MeroMeroMellow.class, ListAttributes.MERO_MERO_MELLOW });
    abilitiesClassesArray.add(new Object[] { PistolKiss.class, ListAttributes.PISTOL_KISS });
    abilitiesClassesArray.add(new Object[] { SlaveArrow.class, ListAttributes.SLAVE_ARROW });
  }
  
  public static class SlaveArrow extends AbilityProjectile {
    public SlaveArrow(World world) {
      super(world);
    }
    
    public SlaveArrow(World world, double x, double y, double z) {
      super(world, x, y, z);
    }
    
    public SlaveArrow(World world, EntityLivingBase player, AbilityAttribute attr) {
      super(world, player, attr);
    }
    
    public void tasksImapct(MovingObjectPosition hit) {
      if (hit.entityHit instanceof EntityLivingBase) {
        ((EntityLivingBase)hit.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600));
        ((EntityLivingBase)hit.entityHit).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 600));
      } 
    }
    
    public void onUpdate() {
      if (this.worldObj.isRemote && this.ticksExisted > 5)
        for (int i = 0; i < DevilFruitsHelper.getParticleSettingModifier(2); i++) {
          EntityParticleFX particle = (new EntityParticleFX(this.worldObj, ID.PARTICLE_ICON_MERO, this.posX, this.posY, this.posZ, 0.0D, 0.0D, 0.0D)).setParticleAge(1).setParticleScale(1.3F);
          MainMod.proxy.spawnCustomParticles((Entity)this, particle);
        }  
      super.onUpdate();
    }
  }
  
  public static class PistolKiss extends AbilityProjectile {
    public PistolKiss(World world) {
      super(world);
    }
    
    public PistolKiss(World world, double x, double y, double z) {
      super(world, x, y, z);
    }
    
    public PistolKiss(World world, EntityLivingBase player, AbilityAttribute attr) {
      super(world, player, attr);
    }
    
    public void tasksImapct(MovingObjectPosition hit) {
      if (hit.entityHit instanceof EntityLivingBase) {
        ((EntityLivingBase)hit.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600));
        ((EntityLivingBase)hit.entityHit).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 600));
      } 
    }
  }
  
  public static class MeroMeroMellow extends AbilityProjectile {
    public MeroMeroMellow(World world) {
      super(world);
    }
    
    public MeroMeroMellow(World world, double x, double y, double z) {
      super(world, x, y, z);
    }
    
    public MeroMeroMellow(World world, EntityLivingBase player, AbilityAttribute attr) {
      super(world, player, attr);
    }
    
    public void tasksImapct(MovingObjectPosition hit) {
      if (hit.entityHit instanceof EntityLivingBase) {
        ((EntityLivingBase)hit.entityHit).addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 600));
        ((EntityLivingBase)hit.entityHit).addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 600));
      } 
    }
  }
}
