package xyz.pixelatedw.MineMineNoMi3.models.items;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelWeaponMace extends ModelBase {
  public ModelRenderer handle1;
  
  public ModelRenderer handle2;
  
  public ModelRenderer handle3;
  
  public ModelRenderer handle4;
  
  public ModelRenderer mace1;
  
  public ModelRenderer mace2;
  
  public ModelRenderer mace3;
  
  public ModelRenderer mace4;
  
  public ModelRenderer mace5;
  
  public ModelRenderer mace6;
  
  public ModelRenderer mace7;
  
  public ModelRenderer thorn1a;
  
  public ModelRenderer thorn2a;
  
  public ModelRenderer thorn3a;
  
  public ModelRenderer thorn4a;
  
  public ModelRenderer thorn5a;
  
  public ModelRenderer thorn6a;
  
  public ModelRenderer thorn7a;
  
  public ModelRenderer thorn1b;
  
  public ModelRenderer thorn2b;
  
  public ModelRenderer thorn3b;
  
  public ModelRenderer thorn4b;
  
  public ModelRenderer thorn5b;
  
  public ModelRenderer thorn6b;
  
  public ModelRenderer thorn7b;
  
  public ModelRenderer thorn1c;
  
  public ModelRenderer thorn2c;
  
  public ModelRenderer thorn3c;
  
  public ModelRenderer thorn4c;
  
  public ModelRenderer thorn5c;
  
  public ModelRenderer thorn6c;
  
  public ModelRenderer thorn7c;
  
  public ModelRenderer thorn1d;
  
  public ModelRenderer thorn2d;
  
  public ModelRenderer thorn3d;
  
  public ModelRenderer thorn4d;
  
  public ModelRenderer thorn5d;
  
  public ModelRenderer thorn6d;
  
  public ModelRenderer thorn7d;
  
  public ModelWeaponMace() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.thorn4b = new ModelRenderer(this, 30, 0);
    this.thorn4b.setRotationPoint(-8.5F, 11.0F, -20.5F);
    this.thorn4b.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn4b, 2.1861994F, 0.5235988F, 0.95539325F);
    this.thorn3d = new ModelRenderer(this, 30, 0);
    this.thorn3d.setRotationPoint(-7.5F, 12.0F, -20.5F);
    this.thorn3d.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn3d, 0.7853982F, -0.7853982F, -1.5707964F);
    this.thorn7c = new ModelRenderer(this, 30, 0);
    this.thorn7c.setRotationPoint(-4.0F, 9.5F, -13.5F);
    this.thorn7c.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn7c, -0.95539325F, -0.5235988F, -0.95539325F);
    this.thorn5d = new ModelRenderer(this, 30, 0);
    this.thorn5d.setRotationPoint(-6.0F, 12.0F, -18.5F);
    this.thorn5d.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn5d, 0.7853982F, -0.7853982F, -1.5707964F);
    this.mace3 = new ModelRenderer(this, 0, 23);
    this.mace3.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.mace3.addBox(-2.0F, -9.5F, -2.0F, 4, 3, 4, 0.0F);
    setRotateAngle(this.mace3, 1.5707964F, -0.0F, 0.0F);
    this.mace7 = new ModelRenderer(this, 15, 11);
    this.mace7.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.mace7.addBox(-3.0F, -24.5F, -3.0F, 6, 2, 6, 0.0F);
    setRotateAngle(this.mace7, 1.5707964F, -0.0F, 0.0F);
    this.thorn6c = new ModelRenderer(this, 30, 0);
    this.thorn6c.setRotationPoint(-4.0F, 9.5F, -23.5F);
    this.thorn6c.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn6c, -0.95539325F, -0.5235988F, -0.95539325F);
    this.handle4 = new ModelRenderer(this, 0, 8);
    this.handle4.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.handle4.addBox(-0.5F, 3.3F, -1.2F, 1, 1, 1, 0.0F);
    setRotateAngle(this.handle4, 1.5707964F, -0.0F, 0.0F);
    this.thorn4d = new ModelRenderer(this, 30, 0);
    this.thorn4d.setRotationPoint(-4.5F, 12.0F, -20.5F);
    this.thorn4d.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn4d, 0.7853982F, -0.7853982F, -1.5707964F);
    this.thorn2a = new ModelRenderer(this, 30, 0);
    this.thorn2a.setRotationPoint(-4.5F, 6.6F, -16.5F);
    this.thorn2a.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn2a, -0.7853982F, -0.7853982F, 1.5707964F);
    this.thorn1d = new ModelRenderer(this, 30, 0);
    this.thorn1d.setRotationPoint(-4.5F, 12.0F, -16.5F);
    this.thorn1d.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn1d, 0.7853982F, -0.7853982F, -1.5707964F);
    this.thorn3a = new ModelRenderer(this, 30, 0);
    this.thorn3a.setRotationPoint(-4.5F, 6.6F, -20.5F);
    this.thorn3a.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn3a, -0.7853982F, -0.7853982F, 1.5707964F);
    this.thorn5c = new ModelRenderer(this, 30, 0);
    this.thorn5c.setRotationPoint(-3.5F, 9.5F, -18.5F);
    this.thorn5c.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn5c, -0.95539325F, -0.5235988F, -0.95539325F);
    this.thorn1c = new ModelRenderer(this, 30, 0);
    this.thorn1c.setRotationPoint(-3.5F, 11.0F, -16.5F);
    this.thorn1c.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn1c, -0.95539325F, -0.5235988F, -0.95539325F);
    this.thorn3c = new ModelRenderer(this, 30, 0);
    this.thorn3c.setRotationPoint(-3.5F, 7.5F, -20.5F);
    this.thorn3c.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn3c, -0.95539325F, -0.5235988F, -0.95539325F);
    this.handle2 = new ModelRenderer(this, 0, 8);
    this.handle2.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.handle2.addBox(-0.5F, 3.9F, -0.5F, 1, 1, 1, 0.0F);
    setRotateAngle(this.handle2, 1.5707964F, -0.0F, 0.0F);
    this.thorn1a = new ModelRenderer(this, 30, 0);
    this.thorn1a.setRotationPoint(-7.5F, 6.6F, -16.5F);
    this.thorn1a.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn1a, -0.7853982F, -0.7853982F, 1.5707964F);
    this.mace6 = new ModelRenderer(this, 19, 21);
    this.mace6.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.mace6.addBox(-3.5F, -22.5F, -3.5F, 7, 8, 7, 0.0F);
    setRotateAngle(this.mace6, 1.5707964F, -0.0F, 0.0F);
    this.thorn7a = new ModelRenderer(this, 30, 0);
    this.thorn7a.setRotationPoint(-6.0F, 7.2F, -13.5F);
    this.thorn7a.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn7a, -0.7853982F, -0.7853982F, 1.5707964F);
    this.thorn2b = new ModelRenderer(this, 30, 0);
    this.thorn2b.setRotationPoint(-8.5F, 7.5F, -16.5F);
    this.thorn2b.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn2b, 2.1861994F, 0.5235988F, 0.95539325F);
    this.thorn1b = new ModelRenderer(this, 30, 0);
    this.thorn1b.setRotationPoint(-8.5F, 11.0F, -16.5F);
    this.thorn1b.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn1b, 2.1861994F, 0.5235988F, 0.95539325F);
    this.thorn5b = new ModelRenderer(this, 30, 0);
    this.thorn5b.setRotationPoint(-8.5F, 9.5F, -18.5F);
    this.thorn5b.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn5b, 2.1861994F, 0.5235988F, 0.95539325F);
    this.handle3 = new ModelRenderer(this, 0, 8);
    this.handle3.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.handle3.addBox(-0.5F, 3.3F, 0.2F, 1, 1, 1, 0.0F);
    setRotateAngle(this.handle3, 1.5707964F, -0.0F, 0.0F);
    this.mace5 = new ModelRenderer(this, 7, 0);
    this.mace5.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.mace5.addBox(-3.0F, -14.5F, -3.0F, 6, 3, 6, 0.0F);
    setRotateAngle(this.mace5, 1.5707964F, -0.0F, 0.0F);
    this.thorn6b = new ModelRenderer(this, 30, 0);
    this.thorn6b.setRotationPoint(-8.0F, 9.5F, -23.5F);
    this.thorn6b.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn6b, 2.1861994F, 0.5235988F, 0.95539325F);
    this.thorn6a = new ModelRenderer(this, 30, 0);
    this.thorn6a.setRotationPoint(-6.0F, 7.1F, -23.5F);
    this.thorn6a.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn6a, -0.7853982F, -0.7853982F, 1.5707964F);
    this.thorn5a = new ModelRenderer(this, 30, 0);
    this.thorn5a.setRotationPoint(-6.0F, 6.6F, -18.5F);
    this.thorn5a.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn5a, -0.7853982F, -0.7853982F, 1.5707964F);
    this.thorn7b = new ModelRenderer(this, 30, 0);
    this.thorn7b.setRotationPoint(-8.0F, 9.5F, -13.5F);
    this.thorn7b.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn7b, 2.1861994F, 0.5235988F, 0.95539325F);
    this.thorn6d = new ModelRenderer(this, 30, 0);
    this.thorn6d.setRotationPoint(-6.0F, 11.6F, -23.5F);
    this.thorn6d.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn6d, 0.7853982F, -0.7853982F, -1.5707964F);
    this.thorn4a = new ModelRenderer(this, 30, 0);
    this.thorn4a.setRotationPoint(-7.5F, 6.6F, -20.5F);
    this.thorn4a.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn4a, -0.7853982F, -0.7853982F, 1.5707964F);
    this.thorn2d = new ModelRenderer(this, 30, 0);
    this.thorn2d.setRotationPoint(-7.5F, 12.0F, -16.5F);
    this.thorn2d.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn2d, 0.7853982F, -0.7853982F, -1.5707964F);
    this.thorn2c = new ModelRenderer(this, 30, 0);
    this.thorn2c.setRotationPoint(-3.5F, 7.5F, -16.5F);
    this.thorn2c.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn2c, -0.95539325F, -0.5235988F, -0.95539325F);
    this.thorn4c = new ModelRenderer(this, 30, 0);
    this.thorn4c.setRotationPoint(-3.5F, 11.0F, -20.5F);
    this.thorn4c.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn4c, -0.95539325F, -0.5235988F, -0.95539325F);
    this.handle1 = new ModelRenderer(this, 0, 0);
    this.handle1.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.handle1.addBox(-0.5F, -2.5F, -0.5F, 1, 6, 1, 0.0F);
    setRotateAngle(this.handle1, 1.5707964F, -0.0F, 0.0F);
    this.mace2 = new ModelRenderer(this, 0, 16);
    this.mace2.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.mace2.addBox(-1.5F, -6.5F, -1.5F, 3, 2, 3, 0.0F);
    setRotateAngle(this.mace2, 1.5707964F, -0.0F, 0.0F);
    this.thorn3b = new ModelRenderer(this, 30, 0);
    this.thorn3b.setRotationPoint(-8.5F, 7.5F, -20.5F);
    this.thorn3b.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn3b, 2.1861994F, 0.5235988F, 0.95539325F);
    this.mace4 = new ModelRenderer(this, 0, 32);
    this.mace4.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.mace4.addBox(-2.5F, -11.5F, -2.5F, 5, 2, 5, 0.0F);
    setRotateAngle(this.mace4, 1.5707964F, -0.0F, 0.0F);
    this.mace1 = new ModelRenderer(this, 0, 11);
    this.mace1.setRotationPoint(-6.0F, 9.5F, 0.0F);
    this.mace1.addBox(-1.0F, -4.5F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.mace1, 1.5707964F, -0.0F, 0.0F);
    this.thorn7d = new ModelRenderer(this, 30, 0);
    this.thorn7d.setRotationPoint(-6.0F, 11.6F, -13.5F);
    this.thorn7d.addBox(-1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F);
    setRotateAngle(this.thorn7d, 0.7853982F, -0.7853982F, -1.5707964F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    this.thorn5d.render(f5);
    this.thorn4c.render(f5);
    this.mace4.render(f5);
    this.thorn2d.render(f5);
    this.handle4.render(f5);
    this.thorn2c.render(f5);
    this.mace6.render(f5);
    this.mace7.render(f5);
    this.thorn5a.render(f5);
    this.thorn1a.render(f5);
    this.thorn7b.render(f5);
    this.mace3.render(f5);
    this.handle3.render(f5);
    this.thorn2b.render(f5);
    this.thorn3d.render(f5);
    this.thorn7a.render(f5);
    this.thorn4b.render(f5);
    this.mace2.render(f5);
    this.thorn1d.render(f5);
    this.thorn2a.render(f5);
    this.thorn7c.render(f5);
    this.thorn3b.render(f5);
    this.thorn1c.render(f5);
    this.thorn6d.render(f5);
    this.thorn3a.render(f5);
    this.thorn6b.render(f5);
    this.mace5.render(f5);
    this.thorn6a.render(f5);
    this.handle2.render(f5);
    this.thorn4a.render(f5);
    this.thorn1b.render(f5);
    this.thorn4d.render(f5);
    this.thorn6c.render(f5);
    this.thorn7d.render(f5);
    this.mace1.render(f5);
    this.thorn5b.render(f5);
    this.thorn5c.render(f5);
    this.handle1.render(f5);
    this.thorn3c.render(f5);
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}
