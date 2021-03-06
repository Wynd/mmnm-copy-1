package xyz.pixelatedw.MineMineNoMi3.lists;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import xyz.pixelatedw.MineMineNoMi3.MainConfig;
import xyz.pixelatedw.MineMineNoMi3.MainEnchantment;
import xyz.pixelatedw.MineMineNoMi3.api.WyRegistry;

public class ListEffects {
  public static Enchantment dialImpact;
  
  public static Enchantment dialFlash;
  
  public static Enchantment kairoseki;
  
  public static void init() {
    dialImpact = (Enchantment)new MainEnchantment(MainConfig.enchantmentDialImpactId, 1, EnumEnchantmentType.weapon, "Impact Dial");
    kairoseki = (Enchantment)new MainEnchantment(MainConfig.enchantmentKairosekiId, 1, EnumEnchantmentType.weapon, "Kairoseki");
    dialFlash = (Enchantment)new MainEnchantment(MainConfig.enchantmentDialFlashId, 1, EnumEnchantmentType.weapon, "Breath Dial");
    WyRegistry.registerEnchantment(dialImpact, "Impact Dial");
    WyRegistry.registerEnchantment(kairoseki, "Kairoseki");
    WyRegistry.registerEnchantment(dialFlash, "Flash Dial");
  }
}
