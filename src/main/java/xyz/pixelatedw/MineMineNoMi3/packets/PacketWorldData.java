package xyz.pixelatedw.MineMineNoMi3.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.data.ExtendedWorldData;

public class PacketWorldData implements IMessage {
  private boolean isSwordsmanDojoSpawned;
  
  private int totalDojosSpawned;
  
  public PacketWorldData() {}
  
  public PacketWorldData(ExtendedWorldData data) {
    this.isSwordsmanDojoSpawned = data.isSwordsmanDojoSpawned();
    this.totalDojosSpawned = data.getTotalDojosSpawned();
  }
  
  public void fromBytes(ByteBuf buf) {
    this.isSwordsmanDojoSpawned = buf.readBoolean();
    this.totalDojosSpawned = buf.readInt();
  }
  
  public void toBytes(ByteBuf buf) {
    buf.writeBoolean(this.isSwordsmanDojoSpawned);
    buf.writeInt(this.totalDojosSpawned);
  }
  
  public static class ClientHandler implements IMessageHandler<PacketWorldData, IMessage> {
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(PacketWorldData message, MessageContext ctx) {
      EntityClientPlayerMP entityClientPlayerMP = (Minecraft.getMinecraft()).thePlayer;
      ExtendedWorldData worldData = ExtendedWorldData.get(((EntityPlayer)entityClientPlayerMP).worldObj);
      worldData.setSwordsmanDojoSpawned(message.isSwordsmanDojoSpawned);
      worldData.setDojoSpawned(message.totalDojosSpawned);
      return null;
    }
  }
}
