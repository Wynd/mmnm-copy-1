package xyz.pixelatedw.MineMineNoMi3.abilities;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import xyz.pixelatedw.MineMineNoMi3.MainConfig;
import xyz.pixelatedw.MineMineNoMi3.Values;
import xyz.pixelatedw.MineMineNoMi3.api.WyHelper;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.Ability;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.AbilityProjectile;
import xyz.pixelatedw.MineMineNoMi3.entities.abilityprojectiles.MaguProjectiles;
import xyz.pixelatedw.MineMineNoMi3.lists.ListAttributes;

public class MaguAbilities {
  static {
    Values.abilityWebAppExtraParams.put("daifunka", new String[] { "desc", "The user covers their fist in lava and fires it at the opponent." });
    Values.abilityWebAppExtraParams.put("meigo", new String[] { "desc", "The user transforms their arm into magma and thrusts it at the opponent." });
    Values.abilityWebAppExtraParams.put("ryuseikazan", new String[] { "desc", "Functions like 'Dai Funka', but multiple fists are launched at the opponent." });
    Values.abilityWebAppExtraParams.put("bakuretsukazan", new String[] { "desc", "By spreading magma to the surroundings, the user turns everything into lava." });
  }
  
  public static Ability[] abilitiesArray = new Ability[] { new BakuretsuKazan(), new RyuseiKazan(), new Meigo(), new DaiFunka(), new Inugami() };
  
  public static class Inugami extends Ability {
    public Inugami() {
      super(ListAttributes.Inugami);
    }
    
    public void use(EntityPlayer player) {
      if (!this.isOnCooldown) {
        this.projectile = (AbilityProjectile)new MaguProjectiles.Inugami(player.worldObj, (EntityLivingBase)player, ListAttributes.Inugami);
        super.use(player);
      } 
    }
  }
  
  public static class BakuretsuKazan extends Ability {
    public BakuretsuKazan() {
      super(ListAttributes.BAKURETSU_KAZAN);
    }
    
    public void use(EntityPlayer player) {
      if (!this.isOnCooldown) {
        World world = player.worldObj;
        if (MainConfig.enableGriefing)
          WyHelper.createFilledSphere(player.worldObj, (int)player.posX, (int)player.posY, (int)player.posZ, 10, (Block)Blocks.flowing_lava, new String[] { "core" }); 
        super.use(player);
      } 
    }
  }
  
  public static class RyuseiKazan extends Ability {
    public RyuseiKazan() {
      super(ListAttributes.RYUSEI_KAZAN);
    }
    
    public void use(EntityPlayer player) {
      this.projectile = (AbilityProjectile)new MaguProjectiles.DaiFunka(player.worldObj, (EntityLivingBase)player, this.attr);
      super.use(player);
    }
  }
  
  public static class Meigo extends Ability {
    public Meigo() {
      super(ListAttributes.MEIGO);
    }
    
    public void use(EntityPlayer player) {
      this.projectile = (AbilityProjectile)new MaguProjectiles.Meigo(player.worldObj, (EntityLivingBase)player, this.attr);
      super.use(player);
    }
  }
  
  public static class DaiFunka extends Ability {
    public DaiFunka() {
      super(ListAttributes.DAI_FUNKA);
    }
    
    public void use(EntityPlayer player) {
      this.projectile = (AbilityProjectile)new MaguProjectiles.DaiFunka(player.worldObj, (EntityLivingBase)player, this.attr);
      super.use(player);
    }
  }
}
