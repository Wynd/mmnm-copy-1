package xyz.pixelatedw.MineMineNoMi3.entities.mobs;

import net.minecraft.nbt.NBTTagCompound;

public interface INBTEntity {
  void readEntityFromExtraNBT(NBTTagCompound paramNBTTagCompound);
}
