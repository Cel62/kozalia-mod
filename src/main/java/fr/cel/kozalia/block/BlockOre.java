package fr.cel.kozalia.block;

import fr.cel.kozalia.creativetab.KozaliaCreativeTabs;
import fr.cel.kozalia.init.ModBlocks;
import fr.cel.kozalia.init.ModItems;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class BlockOre extends net.minecraft.block.BlockOre {

    public BlockOre(String name) {
        this.setResistance(10.0f);
        this.setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        this.setSoundType(SoundType.STONE);

        this.setRegistryName(name);
        this.setUnlocalizedName(name);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return this == ModBlocks.nitrite_ore ? ModItems.nitrite_fragment :
                (this == ModBlocks.artrite_ore ? ModItems.artrite_fragment :
                        (this == ModBlocks.terralium_ore ? ModItems.terralium_fragment :
                                (this == ModBlocks.horium_ore ? ModItems.horium_fragment :
                                        (this == ModBlocks.kozalium_ore ? ModItems.kozalium_fragment : Item.getItemFromBlock(this)))));
    }

    public int quantityDroppedWithBonus(int fortune, Random random) {
        if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped((IBlockState) this.getBlockState().getValidStates().iterator().next(), random, fortune)) {
            int i = random.nextInt(fortune + 2) - 1;

            if (i < 0) {
                i = 0;
            }

            return this.quantityDropped(random) * (i + 1);
        } else {
            return this.quantityDropped(random);
        }
    }

    @Override
    public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
        super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);

        if (this.getItemDropped(state, worldIn.rand, fortune) != Item.getItemFromBlock(this)) {
            int i = 0;

            if (this == ModBlocks.nitrite_ore) {
                i = MathHelper.getRandomIntegerInRange(worldIn.rand, 0, 5);
            } else if (this == ModBlocks.artrite_ore) {
                i = MathHelper.getRandomIntegerInRange(worldIn.rand, 0, 6);
            } else if (this == ModBlocks.terralium_ore) {
                i = MathHelper.getRandomIntegerInRange(worldIn.rand, 0, 7);
            } else if (this == ModBlocks.horium_ore) {
                i = MathHelper.getRandomIntegerInRange(worldIn.rand, 0, 8);
            } else if (this == ModBlocks.kozalium_ore) {
                i = MathHelper.getRandomIntegerInRange(worldIn.rand, 0, 9);
            }
            this.dropXpOnBlockBreak(worldIn, pos, i);
        }
    }

}