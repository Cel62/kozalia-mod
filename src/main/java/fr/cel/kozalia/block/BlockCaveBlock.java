package fr.cel.kozalia.block;

import fr.cel.kozalia.creativetab.KozaliaCreativeTabs;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockCaveBlock extends Block {

    public BlockCaveBlock(String name){
        super(Material.GLASS);

        this.setHardness(1.0f);
        this.setResistance(5.0f);
        this.setSoundType(SoundType.GLASS);
        this.setCreativeTab(KozaliaCreativeTabs.KOZALIA);

        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return true;
    }

    @Override
    public boolean isFullCube(IBlockState state) {
        return true;
    }

    @SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }

}