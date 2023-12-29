package fr.mistyk.charmsoverflow.items;

import fr.mistyk.charmsoverflow.CharmsOverflowMain;
import fr.mistyk.charmsoverflow.util.IHasModel;
import net.minecraft.item.Item;

public class CharmEmpty extends Item implements IHasModel {
    public CharmEmpty(){
        setUnlocalizedName("charm_empty");
        setRegistryName("charm_empty");
        setCreativeTab(CharmsOverflowMain.charmsOverflowTabOther);
        setMaxStackSize(16);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        CharmsOverflowMain.proxy.registerItemRenderer(this, 0, "inventory");
    }
}