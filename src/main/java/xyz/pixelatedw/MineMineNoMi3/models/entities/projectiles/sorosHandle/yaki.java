package xyz.pixelatedw.MineMineNoMi3.models.entities.projectiles.sorosHandle;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class yaki extends ModelBase {
  private final ModelRenderer bb_main;
  
  public yaki() {
    this.textureWidth = 256;
    this.textureHeight = 256;
    this.bb_main = new ModelRenderer(this);
    this.bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
    this.bb_main.cubeList.add(new ModelBox(this.bb_main, 0, 0, -5.0F, -17.0F, -3.0F, 9, 9, 9, 0.0F));
    this.bb_main.cubeList.add(new ModelBox(this.bb_main, 0, 0, -2.0F, -14.0F, -6.0F, 3, 3, 3, 0.0F));
    this.bb_main.cubeList.add(new ModelBox(this.bb_main, 0, 0, 1.0F, -13.0F, -6.0F, 1, 1, 2, 0.0F));
    this.bb_main.offsetY--;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    this.bb_main.render(f5);
  }
  
  public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}
