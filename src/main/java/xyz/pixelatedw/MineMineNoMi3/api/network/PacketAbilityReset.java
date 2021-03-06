package xyz.pixelatedw.MineMineNoMi3.api.network;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.MainMod;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.extra.AbilityProperties;

public class PacketAbilityReset implements IMessage {
  public boolean resetOnCooldownOnly;
  
  public PacketAbilityReset() {}
  
  public PacketAbilityReset(boolean resetOnCooldownOnly) {
    this.resetOnCooldownOnly = resetOnCooldownOnly;
  }
  
  public void fromBytes(ByteBuf buffer) {
    this.resetOnCooldownOnly = buffer.readBoolean();
  }
  
  public void toBytes(ByteBuf buffer) {
    buffer.writeBoolean(this.resetOnCooldownOnly);
  }
  
  public static class ClientHandler implements IMessageHandler<PacketAbilityReset, IMessage> {
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(PacketAbilityReset message, MessageContext ctx) {
      EntityClientPlayerMP entityClientPlayerMP = (Minecraft.getMinecraft()).thePlayer;
      AbilityProperties props = AbilityProperties.get((EntityPlayer)entityClientPlayerMP);
      for (int i = 0; i < 8; i++) {
        if ((props.getAbilityFromSlot(i) != null && props.getAbilityFromSlot(i).getAttribute().getAbilityCooldown() > 0) || (message.resetOnCooldownOnly && props.getAbilityFromSlot(i) != null && props.getAbilityFromSlot(i).isOnCooldown()))
          props.getAbilityFromSlot(i).startUpdate((EntityPlayer)entityClientPlayerMP); 
      } 
      return null;
    }
  }
  
  public static class ServerHandler implements IMessageHandler<PacketAbilityReset, IMessage> {
    public IMessage onMessage(PacketAbilityReset message, MessageContext ctx) {
      EntityPlayer player = MainMod.proxy.getPlayerEntity(ctx);
      AbilityProperties props = AbilityProperties.get(player);
      for (int i = 0; i < 8; i++) {
        if ((props.getAbilityFromSlot(i) != null && props.getAbilityFromSlot(i).getAttribute().getAbilityCooldown() > 0) || (message.resetOnCooldownOnly && props.getAbilityFromSlot(i) != null && props.getAbilityFromSlot(i).isOnCooldown()))
          props.getAbilityFromSlot(i).startUpdate(player); 
      } 
      return new PacketAbilityReset(true);
    }
  }
}
