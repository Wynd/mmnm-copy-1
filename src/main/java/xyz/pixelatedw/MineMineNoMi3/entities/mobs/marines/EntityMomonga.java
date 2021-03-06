package xyz.pixelatedw.MineMineNoMi3.entities.mobs.marines;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import xyz.pixelatedw.MineMineNoMi3.api.WyHelper;

public class EntityMomonga extends MarineData {
  private int ticksBeforeSoru = 50;
  
  public EntityMomonga(World world) {
    super(world);
  }
  
  public void applyEntityAttributes() {
    super.applyEntityAttributes();
    getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(35.0D);
    getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.23000000417232513D);
    getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(10.0D);
    getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(12.0D);
    getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(140.0D);
  }
  
  protected void entityInit() {
    super.entityInit();
  }
  
  public void onUpdate() {
    WyHelper.Direction dir = WyHelper.get4Directions((Entity)this);
    if (getAttackTarget() != null) {
      if (getHealth() < getMaxHealth() / 2.0F)
        getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(10.0D); 
      if (this.ticksBeforeSoru <= 0 && getDistanceSqToEntity((Entity)getAttackTarget()) < 250.0D && this.onGround) {
        if (getHealth() < getMaxHealth() / 2.0F) {
          if (dir == WyHelper.Direction.NORTH)
            this.motionZ -= 2.8D; 
          if (dir == WyHelper.Direction.SOUTH)
            this.motionZ += 2.8D; 
          if (dir == WyHelper.Direction.EAST)
            this.motionX += 2.8D; 
          if (dir == WyHelper.Direction.WEST)
            this.motionX -= 2.8D; 
          this.rotationPitch += 180.0F;
        } else {
          if (dir == WyHelper.Direction.NORTH)
            this.motionZ -= 3.3D; 
          if (dir == WyHelper.Direction.SOUTH)
            this.motionZ += 3.3D; 
          if (dir == WyHelper.Direction.EAST)
            this.motionX += 3.3D; 
          if (dir == WyHelper.Direction.WEST)
            this.motionX -= 3.3D; 
          this.rotationPitch += 180.0F;
        } 
        this.ticksBeforeSoru = 40;
      } else {
        this.ticksBeforeSoru--;
      } 
    } 
    super.onUpdate();
  }
}
