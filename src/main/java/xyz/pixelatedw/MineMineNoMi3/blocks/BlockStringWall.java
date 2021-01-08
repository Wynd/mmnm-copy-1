package xyz.pixelatedw.MineMineNoMi3.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class BlockStringWall extends Block {
  public BlockStringWall() {
    super(Material.cactus);
  }
  
  public boolean isOpaqueCube() {
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public int getRenderBlockPass() {
    return 1;
  }
  
  public boolean renderAsNormalBlock() {
    return false;
  }
  
  public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z) {
    float f = 0.0625F;
    return AxisAlignedBB.getBoundingBox((x + f), y, (z + f), ((x + 1) - f), ((y + 1) - f), ((z + 1) - f));
  }
  
  @SideOnly(Side.CLIENT)
  public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z) {
    float f = 0.0625F;
    return AxisAlignedBB.getBoundingBox((x + f), y, (z + f), ((x + 1) - f), (y + 1), ((z + 1) - f));
  }
  
  public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity) {
    entity.setInWeb();
    entity.attackEntityFrom(DamageSource.inWall, 4.0F);
  }
  
  public int getRenderType() {
    return 1;
  }
}
