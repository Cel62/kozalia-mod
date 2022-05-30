package fr.cel.kozalia.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class KozaliaCreativeTabs {

    public static final CreativeTabs KOZALIA = new CreativeTabs(CreativeTabs.getNextID(), "kozalia") {
        @SideOnly(Side.CLIENT)
        @Override
        public Item getTabIconItem() {
            return Items.APPLE;
        }
    };

}