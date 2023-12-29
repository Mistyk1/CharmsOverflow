package fr.mistyk.charmsoverflow.items.charms.defense;

import fr.mistyk.charmsoverflow.CharmsEffect;
import fr.mistyk.charmsoverflow.items.charms.Charm;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class CharmChainmail extends Charm {

    public CharmChainmail(){
        super("charm_chainmail");
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
        CharmsEffect.sendBackdamage(entity, null, 0.1f);
    }
}