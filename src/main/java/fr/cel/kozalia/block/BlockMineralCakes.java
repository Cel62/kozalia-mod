package fr.cel.kozalia.block;

import fr.cel.kozalia.creativetab.KozaliaCreativeTabs;
import fr.cel.kozalia.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCake;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class BlockMineralCakes extends BlockCake {

    Type type;
    public BlockMineralCakes(String name, Type type) {
        this.type = type;

        this.setHardness(0.5f);
        this.setSoundType(SoundType.CLOTH);
        this.setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        this.disableStats();

        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, @Nullable ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
        eatCake(playerIn);
        return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
    }

    public void onBlockClicked(World worldIn, BlockPos pos, EntityPlayer playerIn) {
        if (!worldIn.isRemote){
            eatCake(playerIn);
        }
        super.onBlockClicked(worldIn, pos, playerIn);
    }

    private void eatCake(EntityPlayer playerIn) {
        if (playerIn.getFoodStats().needFood()){
            playerIn.addPotionEffect(new PotionEffect(type.getEffect(), type.getEffectTime(), type.getEffectAmplifier()));
        }
    }

    @Override
    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state) {
        //return new ItemStack(Items.CAKE);
        return new ItemStack(Item.getItemFromBlock(getBlockCake(type)));
    }

    public static Block getBlockCake(Type type){
        return type == Type.NITRITE ? ModBlocks.nitrite_cake :
                (type == Type.ARTRITE ? ModBlocks.artrite_cake :
                        (type == Type.TERRARIUM ? ModBlocks.terralium_cake :
                                (type == Type.HORIUM ? ModBlocks.horium_cake :
                                        (type == Type.KOZALIUM ? ModBlocks.kozalium_cake : Blocks.CAKE))));
    }

    public enum Type {

        NITRITE(Potion.getPotionById(12), 90 * 20, 1),
        ARTRITE(Potion.getPotionById(10), 60 * 20, 2),
        HORIUM(Potion.getPotionById(13), 120 * 20, 1),
        TERRARIUM(Potion.getPotionById(21), 30 * 20, 2),
        KOZALIUM(Potion.getPotionById(3), 60 * 20, 2);

        private final Potion effect;
        private final int effectTime;
        private final int effectAmplifier;

        Type(Potion effect, int effectTime, int effectAmplifier) {
            this.effectTime = effectTime;
            this.effect = effect;
            this.effectAmplifier = effectAmplifier;
        }

        public Potion getEffect() {
            return effect;
        }

        public int getEffectTime() {
            return effectTime;
        }

        public int getEffectAmplifier() {
            return effectAmplifier;
        }
    }

}