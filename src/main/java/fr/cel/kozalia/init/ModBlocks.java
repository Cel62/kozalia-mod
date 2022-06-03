package fr.cel.kozalia.init;

import fr.cel.kozalia.block.*;
import fr.cel.kozalia.block.slab.BlockDoubleObsidianSlab;
import fr.cel.kozalia.block.slab.BlockHalfObsidianSlab;
import fr.cel.kozalia.util.References;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    public ModBlocks() {
        initBlocks();
        registersBlocks();
    }

    /**
     * Pour add des blocks :
     * l'ajouter comme ci-dessous
     * le mettre dans les méthodes ci-dessous
     * faire son json dans models/block et models/item
     * et faire sa texture dans textures/blocks
     */
    public static Block nitrite_block;
    public static Block artrite_block;
    public static Block terralium_block;
    public static Block horium_block;
    public static Block kozalium_block;
    public static Block nitrite_ore;
    public static Block artrite_ore;
    public static Block terralium_ore;
    public static Block horium_ore;
    public static Block kozalium_ore;
    public static Block cave_block;
    public static Block xray_ore;
    public static Block obsidian_stairs;
    public static BlockHalfObsidianSlab obsidian_slab;
    public static BlockDoubleObsidianSlab obsidian_double_slab;
    public static Block white_block;
    public static Block black_block;
    public static Block red_block;
    public static Block green_block;
    public static Block blue_block;
    public static Block light_blue_block;
    public static Block pink_block;
    public static Block purple_block;
    public static Block yellow_block;
    public static Block orange_block;

    // initialisation block
    private void initBlocks() {
        nitrite_block = new BlockMineral("nitrite_block");
        artrite_block = new BlockMineral("artrite_block");
        terralium_block = new BlockMineral("terralium_block");
        horium_block = new BlockMineral("horium_block");
        kozalium_block = new BlockMineral("kozalium_block");

        nitrite_ore = new BlockOre("nitrite_ore").setHardness(4.0F);
        artrite_ore = new BlockOre("artrite_ore").setHardness(5.0F);
        terralium_ore = new BlockOre("terralium_ore").setHardness(6.0F);
        horium_ore = new BlockOre("horium_ore").setHardness(7.0F);
        kozalium_ore = new BlockOre("kozalium_ore").setHardness(8.0F);

        cave_block = new BlockCaveBlock("cave_block");
        xray_ore = new BlockXrayOre("xray_ore");

        obsidian_stairs = new BlockStairsObsidian("obsidian_stairs");
        obsidian_slab = new BlockHalfObsidianSlab("obsidian_slab");
        obsidian_double_slab = new BlockDoubleObsidianSlab("obsidian_double_slab");

        white_block = new BlockColor("white_block");
        black_block = new BlockColor("black_block");
        red_block = new BlockColor("red_block");
        green_block = new BlockColor("green_block");
        blue_block = new BlockColor("blue_block");
        light_blue_block = new BlockColor("light_blue_block");
        pink_block = new BlockColor("pink_block");
        purple_block = new BlockColor("purple_block");
        yellow_block = new BlockColor("yellow_block");
        orange_block = new BlockColor("orange_block");
    }

    // add item
    private void registersBlocks() {
        register(nitrite_block);
        register(artrite_block);
        register(terralium_block);
        register(horium_block);
        register(kozalium_block);

        register(nitrite_ore);
        register(artrite_ore);
        register(terralium_ore);
        register(horium_ore);
        register(kozalium_ore);

        register(cave_block);
        register(xray_ore);

        register(obsidian_stairs);
        register(obsidian_slab, new ItemSlab(obsidian_slab, obsidian_slab, obsidian_double_slab));
        GameRegistry.register(obsidian_double_slab);

        register(white_block);
        register(black_block);
        register(red_block);
        register(green_block);
        register(blue_block);
        register(light_blue_block);
        register(pink_block);
        register(purple_block);
        register(yellow_block);
        register(orange_block);
    }

    // add render du block
    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerRender(nitrite_block);
        registerRender(artrite_block);
        registerRender(terralium_block);
        registerRender(horium_block);
        registerRender(kozalium_block);

        registerRender(nitrite_ore);
        registerRender(artrite_ore);
        registerRender(terralium_ore);
        registerRender(horium_ore);
        registerRender(kozalium_ore);

        registerRender(cave_block);
        registerRender(xray_ore);

        registerRender(obsidian_stairs);
        registerRender(obsidian_slab);

        registerRender(white_block);
        registerRender(black_block);
        registerRender(red_block);
        registerRender(green_block);
        registerRender(blue_block);
        registerRender(light_blue_block);
        registerRender(pink_block);
        registerRender(purple_block);
        registerRender(yellow_block);
        registerRender(orange_block);
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    // méthode pour add le block
    private void register(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }

    private void register(Block block, ItemBlock itemBlock) {
        GameRegistry.register(block);
        GameRegistry.register(itemBlock.setRegistryName(block.getRegistryName()));
    }

    // méthode : add render du block
    public static void registerRender(Block block) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }

    public static void registerRender(Block block, int meta) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }

}
