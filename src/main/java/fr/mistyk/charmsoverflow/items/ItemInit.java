package fr.mistyk.charmsoverflow.items;

import net.minecraft.item.Item;

import fr.mistyk.charmsoverflow.items.charms.defense.CharmIron;
import fr.mistyk.charmsoverflow.items.charms.defense.CharmLeather;
import fr.mistyk.charmsoverflow.items.charms.defense.CharmChainmail;
import fr.mistyk.charmsoverflow.items.charms.defense.CharmGold;
import fr.mistyk.charmsoverflow.items.charms.defense.CharmDiamond;
import fr.mistyk.charmsoverflow.items.charms.defense.CharmDefense;

import fr.mistyk.charmsoverflow.items.charms.CharmFinal;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {
    public static final List<Item> ITEMS = new ArrayList<>();

    public static final Item CHARM_EMPTY = new CharmEmpty();

    //--- Defense Charm ---
    public static final Item CHARM_LEATHER = new CharmLeather();
    public static final Item CHARM_CHAINMAIL = new CharmChainmail();
    public static final Item CHARM_IRON = new CharmIron();
    public static final Item CHARM_GOLD = new CharmGold();
    public static final Item CHARM_DIAMOND = new CharmDiamond();

    public static final Item CHARM_DEFENSE = new CharmDefense();
    //---------------------

    //--- Movement Charm ---
    //----------------------

    //--- Offense Charm ---
    //---------------------

    //--- Miner Charm ---
    //-------------------

    //--- Dimension Charm ---
    //-----------------------

    //--- Mob Charm ---
    //-----------------

    //--- Powerful Charm ---
    //----------------------

    //public static final Item THE_CHARM = new CharmFinal();
}