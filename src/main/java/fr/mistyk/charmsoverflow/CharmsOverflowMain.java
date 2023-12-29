package fr.mistyk.charmsoverflow;

import fr.mistyk.charmsoverflow.items.ItemInit;
import fr.mistyk.charmsoverflow.proxy.CommonProxy;
import fr.mistyk.charmsoverflow.util.References;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION)
public class CharmsOverflowMain {
    @Mod.Instance(References.MODID)
    public static CharmsOverflowMain instance;

    public static final CreativeTabs charmsOverflowTabCharms = new CreativeTabs("charmsOverflow.charms") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemInit.CHARM_LEATHER);
        }
    };
    public static final CreativeTabs charmsOverflowTabOther = new CreativeTabs("charmsOverflow.other") {
        @Override
        @SideOnly(Side.CLIENT)
        public ItemStack getTabIconItem() {
            return new ItemStack(ItemInit.CHARM_EMPTY);
        }
    };

    @SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e){
        proxy.preInit();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent e){
        proxy.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e){
        proxy.postInit();
    }
}
