package fr.cel.kozalia.block;

import fr.cel.kozalia.creativetab.KozaliaCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockColor extends Block {

    public BlockColor(String name) {
        super(Material.ROCK);

        this.setLightLevel(0.9375f);
        this.setHardness(2.0f);
        this.setResistance(10.0f);
        this.setSoundType(SoundType.GLASS);
        this.setCreativeTab(KozaliaCreativeTabs.KOZALIA);

        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

}