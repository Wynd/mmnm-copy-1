package xyz.pixelatedw.MineMineNoMi3.items;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xyz.pixelatedw.MineMineNoMi3.EnumFruitType;
import xyz.pixelatedw.MineMineNoMi3.MainConfig;
import xyz.pixelatedw.MineMineNoMi3.Values;
import xyz.pixelatedw.MineMineNoMi3.api.WyHelper;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.Ability;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.AbilityAttribute;
import xyz.pixelatedw.MineMineNoMi3.api.debug.WyDebug;
import xyz.pixelatedw.MineMineNoMi3.data.ExtendedWorldData;
import xyz.pixelatedw.MineMineNoMi3.helpers.DevilFruitsHelper;
import xyz.pixelatedw.MineMineNoMi3.lists.ListMisc;

public class AkumaNoMiBox extends Item {
  private int tier;
  
  private List<AkumaNoMi> tier1Fruits = new ArrayList<>();
  
  private List<AkumaNoMi> tier2Fruits = new ArrayList<>();
  
  private List<AkumaNoMi> tier3Fruits = new ArrayList<>();
  
  public AkumaNoMiBox(int tier) {
    this.tier = tier;
    for (AkumaNoMi df : Values.devilfruits) {
      double score = 0.0D;
      double typeModifier = 1.0D;
      if (df.getType() == EnumFruitType.PARAMECIA) {
        typeModifier = 0.5D;
      } else if (df.getType() == EnumFruitType.LOGIA) {
        typeModifier = 1.4D;
      } else if (df.getType() == EnumFruitType.ZOAN) {
        typeModifier = 1.1D;
      } else if (df.getType() == EnumFruitType.MYTHICALZOAN || df.getType() == EnumFruitType.ANCIENTZOAN) {
        typeModifier = 1.5D;
      } 
      double totalDamage = 0.0D;
      double totalCooldown = 0.0D;
      double totalPower = 0.0D;
      for (Ability a : df.abilities) {
        AbilityAttribute attr = a.getAttribute();
        totalCooldown += (attr.getAbilityCooldown() - attr.getAbilityCharges());
        totalDamage += (attr.getAbilityExplosionPower() + attr.getProjectileDamage() + attr.getProjectileExplosionPower());
        totalPower += (totalCooldown + totalDamage) / 2.0D;
      } 
      totalPower *= typeModifier;
      if (df.getType() == EnumFruitType.ANCIENTZOAN || df.getType() == EnumFruitType.MYTHICALZOAN || df.getUnlocalizedName().equalsIgnoreCase("item.guraguranomi")) {
        this.tier3Fruits.add(df);
        continue;
      } 
      if (df.getType() == EnumFruitType.PARAMECIA) {
        if (totalPower < 500.0D) {
          this.tier1Fruits.add(df);
          continue;
        } 
        this.tier2Fruits.add(df);
        continue;
      } 
      if (totalPower < 800.0D) {
        this.tier2Fruits.add(df);
        continue;
      } 
      this.tier3Fruits.add(df);
    } 
    if (WyDebug.isDebug())
      if (tier == 1) {
        for (AkumaNoMi df : this.tier1Fruits)
          System.out.print("\"" + (new ItemStack((Item)df)).getDisplayName() + "\", "); 
        System.out.println();
      } else if (tier == 2) {
        for (AkumaNoMi df : this.tier2Fruits)
          System.out.print("\"" + (new ItemStack((Item)df)).getDisplayName() + "\", "); 
        System.out.println();
      } else if (tier == 3) {
        for (AkumaNoMi df : this.tier3Fruits)
          System.out.print("\"" + (new ItemStack((Item)df)).getDisplayName() + "\", "); 
        System.out.println();
      }  
  }
  
  public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
    if (!world.isRemote) {
      for (int i = 0; i < player.inventory.mainInventory.length; i++) {
        if (player.inventory.getStackInSlot(i) != null && player.inventory.getStackInSlot(i).getItem() == ListMisc.Key) {
          player.inventory.decrStackSize(i, 1);
          WyHelper.removeStackFromInventory(player, itemStack);
          AkumaNoMi randomFruit = roulette();
          boolean isAvailable = true;
          if (MainConfig.enableOneFruitPerWorld) {
            ExtendedWorldData worldProps = ExtendedWorldData.get(world);
            int chanceForNewFruit = 0;
            while (DevilFruitsHelper.isDevilFruitInWorld(world, randomFruit)) {
              AkumaNoMi inContextFruit = randomFruit;
              this.tier1Fruits.removeIf(x -> (x == inContextFruit));
              this.tier2Fruits.removeIf(x -> (x == inContextFruit));
              this.tier3Fruits.removeIf(x -> (x == inContextFruit));
              if (chanceForNewFruit >= 10) {
                isAvailable = false;
                break;
              } 
              randomFruit = roulette();
              chanceForNewFruit++;
            } 
            if (isAvailable)
              worldProps.addDevilFruitInWorld(randomFruit); 
          } 
          if (isAvailable)
            return new ItemStack((Item)randomFruit); 
          WyHelper.removeStackFromInventory(player, itemStack);
          return itemStack;
        } 
      } 
      WyHelper.sendMsgToPlayer(player, "You need a key !");
    } 
    return itemStack;
  }
  
  private AkumaNoMi roulette() {
    Random rand = new Random();
    if (rand.nextInt(100) + rand.nextDouble() <= 98.0D)
      if (this.tier == 1) {
        if (rand.nextInt(100) + rand.nextDouble() < 10.0D) {
          if (this.tier2Fruits.size() > 0)
            return this.tier2Fruits.get(rand.nextInt(this.tier2Fruits.size())); 
        } else if (this.tier1Fruits.size() > 0) {
          return this.tier1Fruits.get(rand.nextInt(this.tier1Fruits.size()));
        } 
      } else if (this.tier == 2) {
        if (rand.nextInt(100) + rand.nextDouble() < 10.0D) {
          if (this.tier3Fruits.size() > 0)
            return this.tier3Fruits.get(rand.nextInt(this.tier3Fruits.size())); 
        } else if (this.tier2Fruits.size() > 0) {
          return this.tier2Fruits.get(rand.nextInt(this.tier2Fruits.size()));
        } 
      } else if (this.tier == 3) {
        if (this.tier3Fruits.size() > 0)
          return this.tier3Fruits.get(rand.nextInt(this.tier3Fruits.size())); 
      }  
    return null;
  }
}
