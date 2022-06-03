package fr.cel.kozalia.block;

import fr.cel.kozalia.creativetab.KozaliaCreativeTabs;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.init.Blocks;

public class BlockStairsObsidian extends BlockStairs {

    public BlockStairsObsidian(String name) {
        super(Blocks.OBSIDIAN.getDefaultState());

        this.setHardness(50.0f);
        this.setResistance(2000.0f);
        this.setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        this.setSoundType(SoundType.METAL);

        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.useNeighborBrightness = true;
    }

}