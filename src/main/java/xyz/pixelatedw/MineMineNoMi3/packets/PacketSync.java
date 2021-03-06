package xyz.pixelatedw.MineMineNoMi3.packets;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import xyz.pixelatedw.MineMineNoMi3.MainMod;
import xyz.pixelatedw.MineMineNoMi3.api.debug.WyDebug;
import xyz.pixelatedw.MineMineNoMi3.data.ExtendedEntityData;

public class PacketSync implements IMessage {
  public NBTTagCompound data;
  
  public PacketSync() {}
  
  public PacketSync(ExtendedEntityData props) {
    this.data = new NBTTagCompound();
    props.saveNBTData(this.data);
  }
  
  public void fromBytes(ByteBuf buffer) {
    this.data = ByteBufUtils.readTag(buffer);
  }
  
  public void toBytes(ByteBuf buffer) {
    ByteBufUtils.writeTag(buffer, this.data);
  }
  
  public static class ClientHandler implements IMessageHandler<PacketSync, IMessage> {
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(PacketSync message, MessageContext ctx) {
      EntityClientPlayerMP entityClientPlayerMP = (Minecraft.getMinecraft()).thePlayer;
      ExtendedEntityData props = ExtendedEntityData.get((EntityLivingBase)entityClientPlayerMP);
      WyDebug.debug("[CLIENT] Sync for Entity : " + entityClientPlayerMP);
      props.loadNBTData(message.data);
      return null;
    }
  }
  
  public static class ServerHandler implements IMessageHandler<PacketSync, IMessage> {
    public IMessage onMessage(PacketSync message, MessageContext ctx) {
      EntityPlayer player = MainMod.proxy.getPlayerEntity(ctx);
      ExtendedEntityData props = ExtendedEntityData.get((EntityLivingBase)player);
      WyDebug.debug("[SERVER] Sync for Entity : " + player);
      props.loadNBTData(message.data);
      return null;
    }
  }
}
