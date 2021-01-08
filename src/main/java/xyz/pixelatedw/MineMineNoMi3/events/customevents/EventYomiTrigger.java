package xyz.pixelatedw.MineMineNoMi3.events.customevents;

import cpw.mods.fml.common.eventhandler.Cancelable;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.EntityEvent;
import xyz.pixelatedw.MineMineNoMi3.data.ExtendedEntityData;

@Cancelable
public class EventYomiTrigger extends EntityEvent {
  public EntityLivingBase entity;
  
  public ExtendedEntityData oldPlayerData;
  
  public ExtendedEntityData newPlayerData;
  
  public EventYomiTrigger(EntityLivingBase entity, ExtendedEntityData oldPlayerData, ExtendedEntityData newPlayerData) {
    super((Entity)entity);
    this.entity = entity;
    this.oldPlayerData = oldPlayerData;
    this.newPlayerData = newPlayerData;
  }
}
