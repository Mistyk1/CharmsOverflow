package fr.mistyk.charmsoverflow.blocks.recipes;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

import net.minecraft.item.ItemStack;

public class CharmTableRecipes {
    private static final CharmTableRecipes INSTANCE = new CharmTableRecipes();
    private final Table<ItemStack, ItemStack, ItemStack> charmList = HashBasedTable.create();

    public static CharmTableRecipes getInstance(){
        return INSTANCE;
    }

    private CharmTableRecipes(){
        //addCharmRecipe(new ItemStack(Blocks.ACACIA_FENCE), new ItemStack(Blocks.ACACIA_FENCE_GATE), new ItemStack(BlockInit.COPPER_CHEST), 5.0F);
    }


    public void addCharmRecipe(ItemStack input1, ItemStack input2, ItemStack input3, ItemStack input4,
                               ItemStack input5, ItemStack input6, ItemStack input7, ItemStack input8, ItemStack result){
        if(getCharmResult(input1, input2, input3, input4, input5, input6, input7, input8) != ItemStack.EMPTY) return;
        //this.charmList.put(input1, input2, input3, input4, input5, input6, input7, input8, result);
    }

    public ItemStack getCharmResult(ItemStack input1, ItemStack input2, ItemStack input3, ItemStack input4,
                                    ItemStack input5, ItemStack input6, ItemStack input7, ItemStack input8){
        for(Entry<ItemStack, Map<ItemStack, ItemStack>> entry : this.charmList.columnMap().entrySet())
        {
            if(this.compareItemStacks(input1, (ItemStack)entry.getKey()))
            {
                for(Entry<ItemStack, ItemStack> ent : entry.getValue().entrySet())
                {
                    if(this.compareItemStacks(input2, (ItemStack)ent.getKey()))
                    {
                        return (ItemStack)ent.getValue();
                    }
                }
            }
        }
        return ItemStack.EMPTY;
    }

    private boolean compareItemStacks(ItemStack stack1, ItemStack stack2){
        return stack2.getItem() == stack1.getItem() && (stack2.getMetadata() == 32767 || stack2.getMetadata() == stack1.getMetadata());
    }
}