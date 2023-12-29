package fr.mistyk.charmsoverflow.items.charms.defense;

import fr.mistyk.charmsoverflow.CharmsEffect;
import fr.mistyk.charmsoverflow.items.charms.Charm;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class CharmLeather extends Charm {

    public CharmLeather(){
        super("charm_leather");
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        CharmsEffect.addArmor(player, 4);
    }
    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        CharmsEffect.substractArmor(player, 4);
    }
}