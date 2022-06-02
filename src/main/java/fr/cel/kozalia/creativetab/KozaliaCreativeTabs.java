package fr.cel.kozalia.creativetab;

import fr.cel.kozalia.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class KozaliaCreativeTabs {

    public static final CreativeTabs KOZALIA = new CreativeTabs(CreativeTabs.getNextID(), "kozalia") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.kozalium_block);
        }
    };

    public static final CreativeTabs SKYFACTION = new CreativeTabs(CreativeTabs.getNextID(), "skyfaction") {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(ModBlocks.kozalium_block);
        }
    };

}