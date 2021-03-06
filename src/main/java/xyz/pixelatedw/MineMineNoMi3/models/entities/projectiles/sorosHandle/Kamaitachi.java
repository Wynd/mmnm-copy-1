package xyz.pixelatedw.MineMineNoMi3.models.entities.projectiles.sorosHandle;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Kamaitachi extends ModelBase {
  private final ModelRenderer bone;
  
  private final ModelRenderer cube_r1;
  
  private final ModelRenderer cube_r2;
  
  public Kamaitachi() {
    this.textureWidth = 4096;
    this.textureHeight = 4096;
    this.bone = new ModelRenderer(this);
    this.bone.setRotationPoint(-4.0F, 10.0F, -10.0F);
    setRotationAngle(this.bone, 0.0F, 0.0F, -0.2182F);
    this.bone.setTextureOffset(0, 0).addBox(-1.0F, -11.0F, 4.0F, 1, 16, 1, 0.0F);
    this.cube_r1 = new ModelRenderer(this);
    this.cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bone.addChild(this.cube_r1);
    setRotationAngle(this.cube_r1, -2.3562F, 0.0F, 0.0F);
    this.cube_r1.setTextureOffset(0, 0).addBox(-1.0F, -13.0F, 0.0F, 1, 7, 1, 0.0F);
    this.cube_r2 = new ModelRenderer(this);
    this.cube_r2.setRotationPoint(0.0F, -5.0F, 1.0F);
    this.bone.addChild(this.cube_r2);
    setRotationAngle(this.cube_r2, -0.48F, 0.0F, 0.0F);
    this.cube_r2.setTextureOffset(0, 0).addBox(-1.0F, -13.0F, 0.0F, 1, 7, 1, 0.0F);
    this.bone.offsetY--;
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    this.bone.render(f5);
  }
  
  public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}
