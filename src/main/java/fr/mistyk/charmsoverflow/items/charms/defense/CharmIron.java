package fr.mistyk.charmsoverflow.items.charms.defense;

import fr.mistyk.charmsoverflow.CharmsEffect;
import fr.mistyk.charmsoverflow.items.charms.Charm;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public class CharmIron extends Charm {

    public CharmIron(){
        super("charm_iron");
    }

    @Override
    public void onEquipped(ItemStack itemstack, EntityLivingBase player) {
        CharmsEffect.addArmor(player, 12);
    }
    @Override
    public void onUnequipped(ItemStack itemstack, EntityLivingBase player) {
        CharmsEffect.substractArmor(player, 12);
    }

    @Override
    public void onWornTick(ItemStack stack, EntityLivingBase entity) {
        CharmsEffect.blockdamage(entity, 0.1f);
    }
}