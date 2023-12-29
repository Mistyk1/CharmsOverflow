package fr.mistyk.charmsoverflow.items.charms.defense;

import fr.mistyk.charmsoverflow.CharmsEffect;
import fr.mistyk.charmsoverflow.items.charms.Charm;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class CharmDefense extends Charm {
    public CharmDefense(){
        super("charm_defense");
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        CharmsEffect.addArmor(player, 20);
    }
    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        CharmsEffect.substractArmor(player, 20);
    }

    @Override
    public void onWornTick(ItemStack stack, EntityLivingBase entity) {
        CharmsEffect.giveEffect(entity, 11);
        CharmsEffect.sendBackdamage(entity, null, 0.1f);
        CharmsEffect.negatedamage(entity, 0.1f);
        CharmsEffect.blockdamage(entity, 0.1f);
        CharmsEffect.experienceRepairTool(entity);
    }
}