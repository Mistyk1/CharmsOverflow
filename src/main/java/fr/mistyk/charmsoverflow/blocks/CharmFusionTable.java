package fr.mistyk.charmsoverflow.blocks;

import fr.mistyk.charmsoverflow.CharmsOverflowMain;
import fr.mistyk.charmsoverflow.items.ItemInit;
import fr.mistyk.charmsoverflow.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class CharmFusionTable extends Block implements IHasModel, ITileEntityProvider {
    public CharmFusionTable(){
        super(Material.IRON);
        setUnlocalizedName("charm_fusion_table");
        setRegistryName("charm_fusion_table");
        setCreativeTab(CharmsOverflowMain.charmsOverflowTabOther);
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels(){
        CharmsOverflowMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }

    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return null;
    }
}
