package fr.cel.kozalia.block;

import fr.cel.kozalia.creativetab.KozaliaCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockMineral extends Block {

    public BlockMineral(String name) {
        super(Material.ROCK);

        this.setHardness(2.0f);
        this.setResistance(10.0f);
        this.setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        this.setSoundType(SoundType.METAL);

        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }
}