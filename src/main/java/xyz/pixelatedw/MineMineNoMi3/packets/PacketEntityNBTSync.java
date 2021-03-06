package xyz.pixelatedw.MineMineNoMi3.packets;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import xyz.pixelatedw.MineMineNoMi3.entities.mobs.INBTEntity;

public class PacketEntityNBTSync implements IMessage {
  private int entityId;
  
  private NBTTagCompound data;
  
  public PacketEntityNBTSync() {}
  
  public PacketEntityNBTSync(int entityId, NBTTagCompound nbt) {
    this.entityId = entityId;
    this.data = nbt;
  }
  
  public void toBytes(ByteBuf buffer) {
    buffer.writeInt(this.entityId);
    ByteBufUtils.writeTag(buffer, this.data);
  }
  
  public void fromBytes(ByteBuf buffer) {
    this.entityId = buffer.readInt();
    this.data = ByteBufUtils.readTag(buffer);
  }
  
  public static class ClientHandler implements IMessageHandler<PacketEntityNBTSync, IMessage> {
    @SideOnly(Side.CLIENT)
    public IMessage onMessage(PacketEntityNBTSync message, MessageContext ctx) {
      WorldClient worldClient = (Minecraft.getMinecraft()).theWorld;
      if (message.entityId > 0) {
        Entity entity = FMLClientHandler.instance().getWorldClient().getEntityByID(message.entityId);
        if (entity instanceof INBTEntity)
          ((INBTEntity)entity).readEntityFromExtraNBT(message.data); 
      } 
      return null;
    }
  }
}
