package fr.mistyk.charmsoverflow.blocks;

import net.minecraft.block.Block;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block CHARM_TABLE = new CharmTable();
    public static final Block CHARM_FUSION_TABLE = new CharmFusionTable();
    public static final Block ADVANCED_CHARM_TABLE = new AdvancedCharmTable();
    /*public static final Block FINAL_CHARM_TABLE = new FinalCharmTable();
    public static final Block POWERFUL_CHARM_TABLE = new PowerfulCharmTable();*/
}
