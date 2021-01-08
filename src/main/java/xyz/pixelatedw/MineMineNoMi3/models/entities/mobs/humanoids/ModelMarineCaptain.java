package xyz.pixelatedw.MineMineNoMi3.models.entities.mobs.humanoids;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import xyz.pixelatedw.MineMineNoMi3.ID;
import xyz.pixelatedw.MineMineNoMi3.data.ExtendedEntityData;

public class ModelMarineCaptain extends ModelBiped {
  public ModelRenderer capeback;
  
  public ModelRenderer caperight;
  
  public ModelRenderer caperightsholder;
  
  public ModelRenderer caperightarm;
  
  public ModelRenderer caperightsholderpad1;
  
  public ModelRenderer caperightsholderpad2;
  
  public ModelRenderer capeleft;
  
  public ModelRenderer capeleftsholder;
  
  public ModelRenderer capeleftarm;
  
  public ModelRenderer capeleftsholderpad1;
  
  public ModelRenderer capeleftsholderpad2;
  
  public ModelRenderer capefrontright;
  
  public ModelRenderer capefrontleft;
  
  public ModelRenderer capeleftcollar1;
  
  public ModelRenderer capeleftcollar2;
  
  public ModelRenderer caperightcollar1;
  
  public ModelRenderer caperightcollar2;
  
  public ModelMarineCaptain() {
    super(0.0F, 0.0F, 128, 128);
    this.bipedHeadwear.showModel = false;
    this.textureWidth = 128;
    this.textureHeight = 128;
    this.capeleftsholderpad1 = new ModelRenderer((ModelBase)this, 5, 98);
    this.capeleftsholderpad1.setRotationPoint(6.0F, -0.75F, -3.0F);
    this.capeleftsholderpad1.addBox(0.0F, 0.0F, 1.9F, 5, 1, 6, 0.0F);
    setRotateAngle(this.capeleftsholderpad1, 0.0F, 0.0F, 0.17453292F);
    this.caperightcollar2 = new ModelRenderer((ModelBase)this, 51, 90);
    this.caperightcollar2.setRotationPoint(-5.2F, -3.0F, -2.3F);
    this.caperightcollar2.addBox(0.0F, 0.0F, 1.9F, 0, 2, 5, 0.0F);
    setRotateAngle(this.caperightcollar2, 0.02031548F, 0.19092149F, 0.10666507F);
    this.capeleftsholderpad2 = new ModelRenderer((ModelBase)this, 5, 106);
    this.capeleftsholderpad2.setRotationPoint(5.9F, 0.2F, -3.0F);
    this.capeleftsholderpad2.addBox(0.0F, 0.0F, 1.9F, 5, 3, 6, 0.0F);
    this.capefrontright = new ModelRenderer((ModelBase)this, 28, 98);
    this.capefrontright.setRotationPoint(-8.5F, 0.0F, -2.5F);
    this.capefrontright.addBox(0.0F, 0.0F, 1.9F, 3, 22, 0, 0.0F);
    this.caperightarm = new ModelRenderer((ModelBase)this, 35, 98);
    this.caperightarm.setRotationPoint(-8.5F, 1.0F, -2.0F);
    this.caperightarm.addBox(-2.0F, 0.0F, 1.9F, 2, 12, 4, 0.0F);
    this.capeleftsholder = new ModelRenderer((ModelBase)this, 51, 75);
    this.capeleftsholder.setRotationPoint(3.5F, -0.01F, -2.5F);
    this.capeleftsholder.addBox(0.0F, 0.0F, 1.9F, 6, 0, 5, 0.0F);
    this.capeleftcollar1 = new ModelRenderer((ModelBase)this, 51, 81);
    this.capeleftcollar1.setRotationPoint(5.2F, -3.0F, -2.3F);
    this.capeleftcollar1.addBox(0.0F, 0.0F, 1.9F, 0, 3, 5, 0.0F);
    setRotateAngle(this.capeleftcollar1, -0.016939739F, -0.1912466F, 0.08889129F);
    this.capeleftcollar2 = new ModelRenderer((ModelBase)this, 51, 90);
    this.capeleftcollar2.setRotationPoint(5.2F, -3.0F, -2.3F);
    this.capeleftcollar2.addBox(0.0F, 0.0F, 1.9F, 0, 2, 5, 0.0F);
    setRotateAngle(this.capeleftcollar2, 0.02031548F, -0.19092149F, -0.10666507F);
    this.caperightsholderpad1 = new ModelRenderer((ModelBase)this, 5, 98);
    this.caperightsholderpad1.setRotationPoint(-6.0F, -0.75F, -3.0F);
    this.caperightsholderpad1.addBox(-5.0F, 0.0F, 1.9F, 5, 1, 6, 0.0F);
    setRotateAngle(this.caperightsholderpad1, 0.0F, 0.0F, -0.17453292F);
    this.capeback = new ModelRenderer((ModelBase)this, 5, 75);
    this.capeback.setRotationPoint(-8.5F, 0.0F, 2.5F);
    this.capeback.addBox(0.0F, 0.0F, 1.9F, 17, 22, 0, 0.0F);
    this.capefrontleft = new ModelRenderer((ModelBase)this, 28, 98);
    this.capefrontleft.setRotationPoint(8.5F, 0.0F, -2.5F);
    this.capefrontleft.addBox(-3.0F, 0.0F, 1.9F, 3, 22, 0, 0.0F);
    this.caperightcollar1 = new ModelRenderer((ModelBase)this, 51, 81);
    this.caperightcollar1.setRotationPoint(-5.2F, -3.0F, -2.3F);
    this.caperightcollar1.addBox(0.0F, 0.0F, 1.9F, 0, 3, 5, 0.0F);
    setRotateAngle(this.caperightcollar1, -0.016939739F, 0.1912466F, -0.08889129F);
    this.caperightsholder = new ModelRenderer((ModelBase)this, 51, 75);
    this.caperightsholder.setRotationPoint(-3.5F, -0.01F, -2.5F);
    this.caperightsholder.addBox(-6.0F, 0.0F, 1.9F, 6, 0, 5, 0.0F);
    this.caperight = new ModelRenderer((ModelBase)this, 40, 70);
    this.caperight.setRotationPoint(-8.5F, 0.0F, -2.5F);
    this.caperight.addBox(0.0F, 0.0F, 1.9F, 0, 22, 5, 0.0F);
    this.caperightsholderpad2 = new ModelRenderer((ModelBase)this, 5, 106);
    this.caperightsholderpad2.setRotationPoint(-5.9F, 0.15F, -3.0F);
    this.caperightsholderpad2.addBox(-5.0F, 0.0F, 1.9F, 5, 3, 6, 0.0F);
    this.capeleft = new ModelRenderer((ModelBase)this, 40, 70);
    this.capeleft.setRotationPoint(8.5F, 0.0F, -2.5F);
    this.capeleft.addBox(0.0F, 0.0F, 1.9F, 0, 22, 5, 0.0F);
    this.capeleftarm = new ModelRenderer((ModelBase)this, 35, 98);
    this.capeleftarm.setRotationPoint(8.5F, 1.0F, -2.0F);
    this.capeleftarm.addBox(0.0F, 0.0F, 1.9F, 2, 12, 4, 0.0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    ExtendedEntityData props = ExtendedEntityData.get((EntityLivingBase)entity);
    boolean hasHaki = props.hasBusoHakiActive();
    this.bipedHead.render(f5);
    this.bipedBody.render(f5);
    this.bipedRightLeg.render(f5);
    this.bipedLeftLeg.render(f5);
    this.bipedHeadwear.render(f5);
    this.bipedLeftArm.render(f5);
    this.capeleftsholderpad1.render(f5);
    this.caperightcollar2.render(f5);
    this.capeleftsholderpad2.render(f5);
    this.capefrontright.render(f5);
    this.caperightarm.render(f5);
    this.capeleftsholder.render(f5);
    this.capeleftcollar1.render(f5);
    this.capeleftcollar2.render(f5);
    this.caperightsholderpad1.render(f5);
    this.capeback.render(f5);
    this.capefrontleft.render(f5);
    this.caperightcollar1.render(f5);
    this.caperightsholder.render(f5);
    this.caperight.render(f5);
    this.caperightsholderpad2.render(f5);
    this.capeleft.render(f5);
    this.capeleftarm.render(f5);
    if (hasHaki) {
      (Minecraft.getMinecraft()).renderEngine.bindTexture(ID.HANDTEXTURE_ZOANMORPH_BUSO);
      this.bipedRightArm.render(f5);
    } else {
      this.bipedRightArm.render(f5);
    } 
  }
  
  public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
    modelRenderer.rotateAngleX = x;
    modelRenderer.rotateAngleY = y;
    modelRenderer.rotateAngleZ = z;
  }
}
