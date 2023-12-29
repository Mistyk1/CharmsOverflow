package fr.mistyk.charmsoverflow.items.charms;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.item.ItemStack;

public class CharmFinal extends Charm {
    public CharmFinal(){
        super("charm_final");
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        player.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(player.getTotalArmorValue() + 20);
    }
    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        player.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(player.getTotalArmorValue() - 20);
    }

    @Override
    public void onWornTick(ItemStack stack, EntityLivingBase entity) {
        //
    }
}