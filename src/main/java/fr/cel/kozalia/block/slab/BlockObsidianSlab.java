package fr.cel.kozalia.block.slab;

import fr.cel.kozalia.creativetab.KozaliaCreativeTabs;
import fr.cel.kozalia.init.ModBlocks;
import fr.cel.kozalia.util.DummyBlockProperty;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;
import java.util.Random;

public abstract class BlockObsidianSlab extends BlockSlab {

    public static final DummyBlockProperty DUMMY_VARIANT = DummyBlockProperty.create("dummy");

    public BlockObsidianSlab (String name){
        super(Material.ROCK);

        this.setHardness(50.0f);
        this.setResistance(2000.0f);
        this.setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        this.setSoundType(SoundType.METAL);

        this.setUnlocalizedName(name);
        this.setRegistryName(name);

        IBlockState state = this.blockState.getBaseState();
        if(!this.isDouble()){
            state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }
        setDefaultState(state);
        this.useNeighborBrightness = true;
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return this.getUnlocalizedName();
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return DUMMY_VARIANT;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return false;
    }

    @Override
    public int damageDropped(IBlockState state) {
        return 0;
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        if(!this.isDouble()) return this.getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
        return this.getDefaultState();
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        if(this.isDouble()) return 0;
        return ((EnumBlockHalf) state.getValue(HALF)).ordinal() + 1;
    }

    @Nullable
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(ModBlocks.obsidian_slab);
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {HALF, DUMMY_VARIANT});
    }
}