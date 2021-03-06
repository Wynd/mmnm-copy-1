package xyz.pixelatedw.MineMineNoMi3.packets;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.common.network.simpleimpl.IMessageHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import io.netty.buffer.ByteBuf;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import xyz.pixelatedw.MineMineNoMi3.data.ExtendedEntityData;

public class PacketWorld implements IMessage {
  protected int posX = 0, posY = 0, posZ = 0, blockId = -1;
  
  public PacketWorld() {}
  
  public PacketWorld(int posX, int posY, int posZ, int blockId) {
    this.posX = posX;
    this.posY = posY;
    this.posZ = posZ;
    this.blockId = blockId;
  }
  
  public void fromBytes(ByteBuf buf) {
    this.posX = buf.readInt();
    this.posY = buf.readInt();
    this.posZ = buf.readInt();
    this.blockId = buf.readInt();
  }
  
  public void toBytes(ByteBuf buf) {
    buf.writeInt(this.posX);
    buf.writeInt(this.posY);
    buf.writeInt(this.posZ);
    buf.writeInt(this.blockId);
  }
  
  public static class ServerHandler implements IMessageHandler<PacketWorld, IMessage> {
    public IMessage onMessage(PacketWorld message, MessageContext ctx) {
      EntityPlayerMP entityPlayerMP = (ctx.getServerHandler()).playerEntity;
      ExtendedEntityData props = ExtendedEntityData.get((EntityLivingBase)entityPlayerMP);
      if (message.blockId != -1)
        ((EntityPlayer)entityPlayerMP).worldObj.setBlock(message.posX, message.posY, message.posZ, Block.getBlockById(message.blockId)); 
      return null;
    }
  }
}
