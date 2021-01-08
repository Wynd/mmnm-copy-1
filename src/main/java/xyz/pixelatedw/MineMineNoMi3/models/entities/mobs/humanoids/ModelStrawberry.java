package xyz.pixelatedw.MineMineNoMi3.models.entities.mobs.humanoids;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelStrawberry extends ModelBiped {
  ModelRenderer hair3;
  
  ModelRenderer hair1;
  
  ModelRenderer sword2;
  
  ModelRenderer sword1;
  
  ModelRenderer head;
  
  ModelRenderer body;
  
  ModelRenderer rightarm;
  
  ModelRenderer leftarm;
  
  ModelRenderer rightleg;
  
  ModelRenderer leftleg;
  
  ModelRenderer sword3;
  
  ModelRenderer sword4;
  
  ModelRenderer sword5;
  
  ModelRenderer sword6;
  
  ModelRenderer hair2;
  
  ModelRenderer hair4;
  
  public ModelStrawberry() {
    this.textureWidth = 64;
    this.textureHeight = 64;
    this.bipedHeadwear = new ModelRenderer((ModelBase)this, 1, 1);
    this.bipedHeadwear.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0);
    this.bipedHeadwear.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bipedHeadwear.setTextureSize(64, 32);
    this.bipedHeadwear.mirror = true;
    setRotation(this.bipedHeadwear, 0.0F, 0.0F, 0.0F);
    this.bipedHead = new ModelRenderer((ModelBase)this, 1, 1);
    this.bipedHead.addBox(0.0F, 0.0F, 0.0F, 0, 0, 0);
    this.bipedHead.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.bipedHead.setTextureSize(64, 32);
    this.bipedHead.mirror = true;
    setRotation(this.bipedHead, 0.0F, 0.0F, 0.0F);
    this.hair3 = new ModelRenderer((ModelBase)this, 29, 34);
    this.hair3.addBox(0.0F, 0.0F, 0.0F, 4, 5, 1);
    this.hair3.setRotationPoint(-2.0F, 0.0F, -4.0F);
    this.hair3.setTextureSize(64, 32);
    this.hair3.mirror = true;
    setRotation(this.hair3, 0.0F, 0.0F, 0.0F);
    this.hair1 = new ModelRenderer((ModelBase)this, 32, 0);
    this.hair1.addBox(0.0F, 0.0F, 0.0F, 5, 5, 5);
    this.hair1.setRotationPoint(-2.5F, -13.0F, -2.5F);
    this.hair1.setTextureSize(64, 32);
    this.hair1.mirror = true;
    setRotation(this.hair1, 0.0F, 0.0F, 0.0F);
    this.sword2 = new ModelRenderer((ModelBase)this, 19, 34);
    this.sword2.addBox(-2.5F, 7.5F, -4.0F, 3, 3, 1);
    this.sword2.setRotationPoint(-5.0F, 2.0F, 0.0F);
    this.sword2.setTextureSize(64, 32);
    this.sword2.mirror = true;
    setRotation(this.sword2, 0.0F, 0.0F, 0.0F);
    this.sword1 = new ModelRenderer((ModelBase)this, 0, 33);
    this.sword1.addBox(-2.0F, 8.0F, -3.0F, 2, 2, 6);
    this.sword1.setRotationPoint(-5.0F, 2.0F, 0.0F);
    this.sword1.setTextureSize(64, 32);
    this.sword1.mirror = true;
    setRotation(this.sword1, 0.0F, 0.0F, 0.0F);
    this.head = new ModelRenderer((ModelBase)this, 0, 0);
    this.head.addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8);
    this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.head.setTextureSize(64, 32);
    this.head.mirror = true;
    setRotation(this.head, 0.0F, 0.0F, 0.0F);
    this.body = new ModelRenderer((ModelBase)this, 16, 16);
    this.body.addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4);
    this.body.setRotationPoint(0.0F, 0.0F, 0.0F);
    this.body.setTextureSize(64, 32);
    this.body.mirror = true;
    setRotation(this.body, 0.0F, 0.0F, 0.0F);
    this.rightarm = new ModelRenderer((ModelBase)this, 40, 16);
    this.rightarm.addBox(-3.0F, -2.0F, -2.0F, 4, 12, 4);
    this.rightarm.setRotationPoint(-5.0F, 2.0F, 0.0F);
    this.rightarm.setTextureSize(64, 32);
    this.rightarm.mirror = true;
    setRotation(this.rightarm, 0.0F, 0.0F, 0.0F);
    this.leftarm = new ModelRenderer((ModelBase)this, 40, 16);
    this.leftarm.addBox(-1.0F, -2.0F, -2.0F, 4, 12, 4);
    this.leftarm.setRotationPoint(5.0F, 2.0F, 0.0F);
    this.leftarm.setTextureSize(64, 32);
    this.leftarm.mirror = true;
    setRotation(this.leftarm, 0.0F, 0.0F, 0.0F);
    this.rightleg = new ModelRenderer((ModelBase)this, 0, 16);
    this.rightleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
    this.rightleg.setRotationPoint(-2.0F, 12.0F, 0.0F);
    this.rightleg.setTextureSize(64, 32);
    this.rightleg.mirror = true;
    setRotation(this.rightleg, 0.0F, 0.0F, 0.0F);
    this.leftleg = new ModelRenderer((ModelBase)this, 0, 16);
    this.leftleg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4);
    this.leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
    this.leftleg.setTextureSize(64, 32);
    this.leftleg.mirror = true;
    setRotation(this.leftleg, 0.0F, 0.0F, 0.0F);
    this.sword3 = new ModelRenderer((ModelBase)this, 0, 42);
    this.sword3.addBox(-1.5F, 8.5F, -16.0F, 1, 1, 12);
    this.sword3.setRotationPoint(-5.0F, 2.0F, 0.0F);
    this.sword3.setTextureSize(64, 32);
    this.sword3.mirror = true;
    setRotation(this.sword3, 0.0F, 0.0F, 0.0F);
    this.sword4 = new ModelRenderer((ModelBase)this, 0, 33);
    this.sword4.addBox(0.0F, 8.0F, -3.0F, 2, 2, 6);
    this.sword4.setRotationPoint(5.0F, 2.0F, 0.0F);
    this.sword4.setTextureSize(64, 32);
    this.sword4.mirror = true;
    setRotation(this.sword4, 0.0F, 0.0F, 0.0F);
    this.sword5 = new ModelRenderer((ModelBase)this, 19, 34);
    this.sword5.addBox(-0.5F, 7.5F, -4.0F, 3, 3, 1);
    this.sword5.setRotationPoint(5.0F, 2.0F, 0.0F);
    this.sword5.setTextureSize(64, 32);
    this.sword5.mirror = true;
    setRotation(this.sword5, 0.0F, 0.0F, 0.0F);
    this.sword6 = new ModelRenderer((ModelBase)this, 0, 42);
    this.sword6.addBox(0.5F, 8.5F, -16.0F, 1, 1, 12);
    this.sword6.setRotationPoint(5.0F, 2.0F, 0.0F);
    this.sword6.setTextureSize(64, 32);
    this.sword6.mirror = true;
    setRotation(this.sword6, 0.0F, 0.0F, 0.0F);
    this.hair2 = new ModelRenderer((ModelBase)this, 51, 33);
    this.hair2.addBox(0.0F, 0.0F, 0.0F, 3, 7, 3);
    this.hair2.setRotationPoint(-1.5F, -20.0F, -1.5F);
    this.hair2.setTextureSize(64, 32);
    this.hair2.mirror = true;
    setRotation(this.hair2, 0.0F, 0.0F, 0.0F);
    this.hair4 = new ModelRenderer((ModelBase)this, 41, 34);
    this.hair4.addBox(0.0F, 0.0F, 0.0F, 2, 5, 1);
    this.hair4.setRotationPoint(-1.0F, 5.0F, -4.0F);
    this.hair4.setTextureSize(64, 32);
    this.hair4.mirror = true;
    setRotation(this.hair4, 0.0F, 0.0F, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    this.hair3.render(f5);
    this.hair1.render(f5);
    this.sword2.render(f5);
    this.sword1.render(f5);
    this.head.render(f5);
    this.body.render(f5);
    this.rightarm.render(f5);
    this.leftarm.render(f5);
    this.rightleg.render(f5);
    this.leftleg.render(f5);
    this.sword3.render(f5);
    this.sword4.render(f5);
    this.sword5.render(f5);
    this.sword6.render(f5);
    this.hair2.render(f5);
    this.hair4.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z) {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
    setRotationAngles(f, f1, f2, f3, f4, f5, null);
    this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
    this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.0F * f1;
    this.leftarm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
    this.sword4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
    this.sword5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
    this.sword6.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.0F * f1;
    this.rightarm.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.0F * f1;
    this.sword1.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.0F * f1;
    this.sword2.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.0F * f1;
    this.sword3.rotateAngleX = MathHelper.cos(f * 0.6662F + 3.1415927F) * 1.0F * f1;
  }
}
