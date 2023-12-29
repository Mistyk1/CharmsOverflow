package fr.mistyk.charmsoverflow.items.charms.defense;

import fr.mistyk.charmsoverflow.CharmsEffect;
import fr.mistyk.charmsoverflow.items.charms.Charm;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class CharmGold extends Charm {
    public CharmGold(){
        super("charm_gold");
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        CharmsEffect.addArmor(player, 6);
    }
    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        CharmsEffect.substractArmor(player, 6);
    }

    @Override
    public void onWornTick(ItemStack stack, EntityLivingBase entity) {
        CharmsEffect.experienceRepairTool(entity);
    }
}