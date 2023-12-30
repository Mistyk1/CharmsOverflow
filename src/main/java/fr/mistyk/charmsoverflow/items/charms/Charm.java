package fr.mistyk.charmsoverflow.items.charms;

import baubles.api.BaubleType;
import baubles.api.IBauble;
import fr.mistyk.charmsoverflow.CharmsOverflowMain;
import fr.mistyk.charmsoverflow.items.ItemInit;
import fr.mistyk.charmsoverflow.util.IHasModel;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.translation.I18n;
import net.minecraft.world.World;

import java.util.List;

public abstract class Charm extends Item implements IBauble, IHasModel {
    public Charm(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CharmsOverflowMain.charmsOverflowTabCharms);
        setMaxStackSize(1);
        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels(){
        CharmsOverflowMain.proxy.registerItemRenderer(this, 0, "inventory");
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        if (GuiScreen.isShiftKeyDown()){
            tooltip.add(new TextComponentTranslation("tooltip." + getUnlocalizedName().substring(11)).getUnformattedComponentText());
        } else {
            tooltip.add(new TextComponentTranslation("tooltip.base").getFormattedText());
        }
    }

    @Override
    public BaubleType getBaubleType(ItemStack arg0) {
        return BaubleType.CHARM;
    }
}
