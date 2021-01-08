package xyz.pixelatedw.MineMineNoMi3.entities.mobs.ai.abilities;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.UUID;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import xyz.pixelatedw.MineMineNoMi3.api.network.WyNetworkHelper;
import xyz.pixelatedw.MineMineNoMi3.data.ExtendedEntityData;
import xyz.pixelatedw.MineMineNoMi3.entities.mobs.EntityNewMob;
import xyz.pixelatedw.MineMineNoMi3.packets.PacketSyncInfo;

public class EntityAIHakiCombat extends EntityAIBase {
  private EntityNewMob entity;
  
  private EntityNewMob target;
  
  private UUID hakiDamageUUID = UUID.fromString("79e4f166-dcd8-4295-8b28-d7dbe2e07ad4");
  
  private AttributeModifier hakiDamageModifier = new AttributeModifier(this.hakiDamageUUID, "Extra Haki Damage", 2.0D, 2);
  
  public EntityAIHakiCombat(EntityNewMob entity) {
    this.entity = entity;
  }
  
  public boolean shouldExecute() {
    ExtendedEntityData props = ExtendedEntityData.get((EntityLivingBase)this.entity);
    if (!this.entity.hasBusoHaki())
      return false; 
    if (!props.hasBusoHakiActive() && this.entity.getAttackTarget() != null) {
      props.triggerBusoHaki(true);
      this.entity.getEntityAttribute(SharedMonsterAttributes.attackDamage).applyModifier(this.hakiDamageModifier);
      WyNetworkHelper.sendToAllAround((IMessage)new PacketSyncInfo(this.entity.getEntityId(), props), this.entity.dimension, this.entity.posX, this.entity.posY, this.entity.posZ, 256.0D);
      ItemStack itemStack = this.entity.getHeldItem();
      if (itemStack != null) {
        if (itemStack.getTagCompound() == null)
          itemStack.setTagCompound(new NBTTagCompound()); 
        itemStack.getTagCompound().setInteger("metadata", 2);
      } 
      return true;
    } 
    if (props.hasBusoHakiActive() && this.entity.getAttackTarget() == null) {
      props.triggerBusoHaki(false);
      this.entity.getEntityAttribute(SharedMonsterAttributes.attackDamage).removeModifier(this.hakiDamageModifier);
      WyNetworkHelper.sendToAllAround((IMessage)new PacketSyncInfo(this.entity.getEntityId(), props), this.entity.dimension, this.entity.posX, this.entity.posY, this.entity.posZ, 256.0D);
      ItemStack itemStack = this.entity.getHeldItem();
      if (itemStack != null) {
        if (itemStack.getTagCompound() == null)
          itemStack.setTagCompound(new NBTTagCompound()); 
        itemStack.getTagCompound().setInteger("metadata", 0);
      } 
      return false;
    } 
    return false;
  }
}
