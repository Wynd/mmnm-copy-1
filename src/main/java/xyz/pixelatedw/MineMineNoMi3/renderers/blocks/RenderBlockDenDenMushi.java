package xyz.pixelatedw.MineMineNoMi3.renderers.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;
import xyz.pixelatedw.MineMineNoMi3.blocks.tileentities.TileEntityDenDenMushi;
import xyz.pixelatedw.MineMineNoMi3.models.blocks.ModelBlockDenDenMushi;

@SideOnly(Side.CLIENT)
public class RenderBlockDenDenMushi extends TileEntitySpecialRenderer {
  private static final ResourceLocation texture = new ResourceLocation("mineminenomi:textures/models/denden2.png");
  
  private ModelBlockDenDenMushi model = new ModelBlockDenDenMushi();
  
  public void renderTileEntityAt(TileEntity te, double posX, double posY, double posZ, float timeSinceLastTick) {
    TileEntityDenDenMushi te2 = (TileEntityDenDenMushi)te;
    int rotation = 0;
    if (te2.getWorldObj() != null)
      rotation = te2.getBlockMetadata(); 
    bindTexture(texture);
    GL11.glPushMatrix();
    GL11.glTranslated(posX + 0.5D, posY + 1.5D, posZ + 0.5D);
    GL11.glScalef(1.0F, 1.0F, 1.0F);
    GL11.glRotatef(180.0F, 0.0F, 0.0F, 1.0F);
    GL11.glPushMatrix();
    GL11.glRotatef((rotation * 90), 0.0F, 1.0F, 0.0F);
    this.model.render();
    GL11.glPopMatrix();
    GL11.glPopMatrix();
  }
}
