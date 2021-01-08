package xyz.pixelatedw.MineMineNoMi3.abilities;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import xyz.pixelatedw.MineMineNoMi3.Values;
import xyz.pixelatedw.MineMineNoMi3.api.WyHelper;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.Ability;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.AbilityProjectile;
import xyz.pixelatedw.MineMineNoMi3.entities.abilityprojectiles.GasuProjectiles;
import xyz.pixelatedw.MineMineNoMi3.lists.ListAttributes;
import xyz.pixelatedw.MineMineNoMi3.lists.ListMisc;

public class GasuAbilities {
  static {
    Values.abilityWebAppExtraParams.put("karakuni", new String[] { "desc", "Removes the oxygen around the user, suffocating everyone in the vicinity." });
    Values.abilityWebAppExtraParams.put("gastanet", new String[] { "desc", "The user fills castanets with unstable gas, which causes an explosion when slammed together." });
    Values.abilityWebAppExtraParams.put("gastille", new String[] { "desc", "Shoots a beam of poisonous gas from the user's mouth, that explodes on impact." });
    Values.abilityWebAppExtraParams.put("gasrobe", new String[] { "desc", "Launches a cloud of poison at the opponent." });
    Values.abilityWebAppExtraParams.put("bluesword", new String[] { "desc", "The user fills a hilt with lamable gas, them sets it on fire to create a sword." });
  }
  
  public static Ability[] abilitiesArray = new Ability[] { new GasRobe(), new BlueSword(), new Gastille(), new Gastanet(), new Karakuni() };
  
  public static class BlueSword extends Ability {
    public BlueSword() {
      super(ListAttributes.BLUE_SWORD);
    }
    
    public void startPassive(EntityPlayer player) {
      if (player.inventory.getCurrentItem() == null) {
        player.inventory.setInventorySlotContents(player.inventory.currentItem, new ItemStack((Item)ListMisc.BlueSword));
      } else {
        WyHelper.sendMsgToPlayer(player, "Cannot equip " + getAttribute().getAttributeName() + " while holding another item in hand !");
        passive(player);
      } 
    }
    
    public void endPassive(EntityPlayer player) {
      player.inventory.clearInventory((Item)ListMisc.BlueSword, -1);
    }
  }
  
  public static class Karakuni extends Ability {
    public Karakuni() {
      super(ListAttributes.KARAKUNI);
    }
    
    public void use(EntityPlayer player) {
      if (!player.worldObj.isRemote)
        if (!this.isOnCooldown) {
          for (EntityLivingBase e : WyHelper.getEntitiesNear((Entity)player, 25.0D)) {
            e.attackEntityFrom(DamageSource.causePlayerDamage(player), 45.0F);
            e.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 1000, 2));
          } 
          super.use(player);
        }  
    }
  }
  
  public static class Gastanet extends Ability {
    public Gastanet() {
      super(ListAttributes.GASTANET);
    }
    
    public void use(EntityPlayer player) {
      super.use(player);
    }
  }
  
  public static class Gastille extends Ability {
    public Gastille() {
      super(ListAttributes.GASTILLE);
    }
    
    public void use(EntityPlayer player) {
      this.projectile = (AbilityProjectile)new GasuProjectiles.Gastille(player.worldObj, (EntityLivingBase)player, this.attr);
      super.use(player);
    }
  }
  
  public static class GasRobe extends Ability {
    public GasRobe() {
      super(ListAttributes.GAS_ROBE);
    }
    
    public void use(EntityPlayer player) {
      this.projectile = (AbilityProjectile)new GasuProjectiles.GasRobe(player.worldObj, (EntityLivingBase)player, this.attr);
      super.use(player);
    }
  }
}
