package xyz.pixelatedw.MineMineNoMi3.entities.abilityprojectiles;

import cpw.mods.fml.common.network.simpleimpl.IMessage;
import java.util.ArrayList;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import xyz.pixelatedw.MineMineNoMi3.MainConfig;
import xyz.pixelatedw.MineMineNoMi3.api.WyHelper;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.AbilityAttribute;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.AbilityProjectile;
import xyz.pixelatedw.MineMineNoMi3.api.network.WyNetworkHelper;
import xyz.pixelatedw.MineMineNoMi3.lists.ListAttributes;
import xyz.pixelatedw.MineMineNoMi3.lists.ListExtraAttributes;
import xyz.pixelatedw.MineMineNoMi3.lists.ListMisc;
import xyz.pixelatedw.MineMineNoMi3.packets.PacketParticles;

public class YamiProjectiles {
  public static ArrayList<Object[]> abilitiesClassesArray = new ArrayList();
  
  static {
    abilitiesClassesArray.add(new Object[] { Liberation.class, ListExtraAttributes.LIBERATION_BLOCK });
    abilitiesClassesArray.add(new Object[] { DarkMatter.class, ListAttributes.DARK_MATTER });
  }
  
  public static class Liberation extends AbilityProjectile {
    private Block[] randomBlocks = new Block[] { Blocks.stone, (Block)Blocks.sand, (Block)Blocks.grass, Blocks.dirt, Blocks.gravel, Blocks.clay, Blocks.cobblestone };
    
    public Liberation(World world) {
      super(world);
    }
    
    public Liberation(World world, double x, double y, double z) {
      super(world, x, y, z);
    }
    
    public Liberation(World world, EntityLivingBase player, AbilityAttribute attr) {
      super(world, player, attr);
    }
    
    public void tasksImapct(MovingObjectPosition hit) {
      this.worldObj.setBlock((int)this.posX, (int)this.posY, (int)this.posZ, this.randomBlocks[this.rand.nextInt(this.randomBlocks.length)]);
    }
  }
  
  public static class DarkMatter extends AbilityProjectile {
    public DarkMatter(World world) {
      super(world);
    }
    
    public DarkMatter(World world, double x, double y, double z) {
      super(world, x, y, z);
    }
    
    public DarkMatter(World world, EntityLivingBase player, AbilityAttribute attr) {
      super(world, player, attr);
    }
    
    public void tasksImapct(MovingObjectPosition hit) {
      if (MainConfig.enableGriefing) {
        WyHelper.createFilledSphere(this.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ, 3, ListMisc.Darkness, new String[] { "air" });
        WyNetworkHelper.sendToAllAround((IMessage)new PacketParticles("darkMatter", this.posX, this.posY, this.posZ), this.dimension, this.posX, this.posY, this.posZ, 128.0D);
      } 
    }
  }
}
