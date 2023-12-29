package fr.mistyk.charmsoverflow;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

import java.util.Random;

public abstract class CharmsEffect{
    private static Random r = new Random();

    public static void addArmor(EntityLivingBase player, int amount){
        player.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(player.getTotalArmorValue() + amount);
    }
    public static void substractArmor(EntityLivingBase player, int amount){
        player.getEntityAttribute(SharedMonsterAttributes.ARMOR).setBaseValue(player.getTotalArmorValue() - amount);
    }

    public static void sendBackdamage(EntityLivingBase receiver, EntityPlayer attacker, float amount){
        //
    }

    public static void blockdamage(EntityLivingBase player, float amount){
        if (false){
            //
        }
    }

    public static void experienceRepairTool(EntityLivingBase player){
        if (false){
            if (!player.getHeldItemMainhand().isEmpty()){
                player.getHeldItemMainhand().damageItem(-4, player);
            }
            if (!player.getHeldItemOffhand().isEmpty()){
                player.getHeldItemOffhand().damageItem(-4, player);
            }
        }
    }

    public static void giveEffect(EntityLivingBase player, int effect, int amplifier){
        if (Potion.getPotionById(effect) != null) {
            PotionEffect res = new PotionEffect(Potion.getPotionById(effect), 10, amplifier, false, false);
            if (player.isPotionApplicable(res)){
                player.addPotionEffect(res);
            }
        }
    }

    public static void giveEffect(EntityLivingBase player, int effect){
        giveEffect(player, effect, 0);
    }

    public static void negatedamage(EntityLivingBase player, float amount){
        //
    }
}
