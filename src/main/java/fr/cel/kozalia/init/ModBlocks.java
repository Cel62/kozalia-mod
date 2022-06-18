package fr.cel.kozalia.init;

import fr.cel.kozalia.block.*;
import fr.cel.kozalia.block.slab.BlockDoubleObsidianSlab;
import fr.cel.kozalia.block.slab.BlockHalfObsidianSlab;
import fr.cel.kozalia.creativetab.KozaliaCreativeTabs;
import fr.cel.kozalia.util.References;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCake;
import net.minecraft.block.BlockTNT;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.model.ModelManager;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.client.renderer.texture.TextureMap;
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
    public static Block renforced_cobblestone;
    public static Block compressed_tnt;
    public static Block nitrite_cake;
    public static Block artrite_cake;
    public static Block terralium_cake;
    public static Block horium_cake;
    public static Block kozalium_cake;
    public static Block nitrite_tnt;
    public static Block artrite_tnt;
    public static Block terralium_tnt;
    public static Block horium_tnt;
    public static Block kozalium_tnt;
    // TNT
    public static Block basic_furnace;
    public static Block intermediate_furnace;
    public static Block advanced_furnace;
    public static Block supreme_furnace;
    public static Block ultimate_furnace;
    public static Block lit_basic_furnace;
    public static Block lit_intermediate_furnace;
    public static Block lit_advanced_furnace;
    public static Block lit_supreme_furnace;
    public static Block lit_ultimate_furnace;
    // TNT

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

        renforced_cobblestone = new Block(Material.ROCK).setHardness(20.0f).setResistance(25.0f).setUnlocalizedName("renforced_cobblestone").setRegistryName("renforced_cobblestone").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        compressed_tnt = new Block(Material.TNT).setHardness(0.0f).setUnlocalizedName("compressed_tnt").setRegistryName("compressed_tnt").setCreativeTab(KozaliaCreativeTabs.KOZALIA);

        nitrite_cake = new BlockMineralCakes("nitrite_cake", BlockMineralCakes.Type.NITRITE);
        artrite_cake = new BlockMineralCakes("artrite_cake", BlockMineralCakes.Type.ARTRITE);
        terralium_cake = new BlockMineralCakes("terralium_cake", BlockMineralCakes.Type.TERRARIUM);
        horium_cake = new BlockMineralCakes("horium_cake", BlockMineralCakes.Type.HORIUM);
        kozalium_cake = new BlockMineralCakes("kozalium_cake", BlockMineralCakes.Type.KOZALIUM);

        nitrite_tnt = new BlockMineralTNT("nitrite_tnt", BlockMineralTNT.TntMaterial.NITRITE);
        artrite_tnt = new BlockMineralTNT("artrite_tnt", BlockMineralTNT.TntMaterial.ARTRITE);
        terralium_tnt = new BlockMineralTNT("terralium_tnt", BlockMineralTNT.TntMaterial.TERRALIUM);
        horium_tnt = new BlockMineralTNT("horium_tnt", BlockMineralTNT.TntMaterial.HORIUM);
        kozalium_tnt = new BlockMineralTNT("kozalium_tnt", BlockMineralTNT.TntMaterial.KOZALIUM);

        basic_furnace = new BlockMineralFurnace("basic_furnace", "basic_furnace", false, BlockMineralFurnace.Level.BASIC).setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        lit_basic_furnace = new BlockMineralFurnace("lit_basic_furnace", "basic_furnace", true, BlockMineralFurnace.Level.BASIC).setLightLevel(0.875f);

        intermediate_furnace = new BlockMineralFurnace("intermediate_furnace", "intermediate_furnace", false, BlockMineralFurnace.Level.INTERMEDIATE).setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        lit_intermediate_furnace = new BlockMineralFurnace("lit_intermediate_furnace", "intermediate_furnace",true, BlockMineralFurnace.Level.INTERMEDIATE).setLightLevel(0.875f);

        advanced_furnace = new BlockMineralFurnace("advanced_furnace", "advanced_furnace", false, BlockMineralFurnace.Level.ADVANCED).setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        lit_advanced_furnace = new BlockMineralFurnace("lit_advanced_furnace", "advanced_furnace", true, BlockMineralFurnace.Level.ADVANCED).setLightLevel(0.875f);

        supreme_furnace = new BlockMineralFurnace("supreme_furnace", "supreme_furnace",false, BlockMineralFurnace.Level.SUPREME).setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        lit_supreme_furnace = new BlockMineralFurnace("lit_supreme_furnace", "supreme_furnace",true, BlockMineralFurnace.Level.SUPREME).setLightLevel(0.875f);

        ultimate_furnace = new BlockMineralFurnace("ultimate_furnace", "ultimate_furnace",false, BlockMineralFurnace.Level.ULTIMATE).setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        lit_ultimate_furnace = new BlockMineralFurnace("lit_ultimate_furnace", "ultimate_furnace",true, BlockMineralFurnace.Level.ULTIMATE).setLightLevel(0.875f);

    }

    // add block + item
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

        register(renforced_cobblestone);
        register(compressed_tnt);

        register(nitrite_cake, (ItemBlock) new ItemBlock(nitrite_cake).setMaxStackSize(1));
        register(artrite_cake, (ItemBlock) new ItemBlock(artrite_cake).setMaxStackSize(1));
        register(terralium_cake, (ItemBlock) new ItemBlock(terralium_cake).setMaxStackSize(1));
        register(horium_cake, (ItemBlock) new ItemBlock(horium_cake).setMaxStackSize(1));
        register(kozalium_cake, (ItemBlock) new ItemBlock(kozalium_cake).setMaxStackSize(1));

        register(nitrite_tnt);
        register(artrite_tnt);
        register(terralium_tnt);
        register(horium_tnt);
        register(kozalium_tnt);

        register(basic_furnace);
        register(lit_basic_furnace);

        register(intermediate_furnace);
        register(lit_intermediate_furnace);

        register(advanced_furnace);
        register(lit_advanced_furnace);

        register(supreme_furnace);
        register(lit_supreme_furnace);

        register(ultimate_furnace);
        register(lit_ultimate_furnace);
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

        registerRender(renforced_cobblestone);
        registerRender(compressed_tnt);

        registerRender(nitrite_cake);
        registerRender(artrite_cake);
        registerRender(terralium_cake);
        registerRender(horium_cake);
        registerRender(kozalium_cake);

        registerRender(nitrite_tnt);
        registerRender(artrite_tnt);
        registerRender(terralium_tnt);
        registerRender(horium_tnt);
        registerRender(kozalium_tnt);

        registerRender(basic_furnace);
        registerRender(lit_basic_furnace);

        registerRender(intermediate_furnace);
        registerRender(lit_intermediate_furnace);

        registerRender(advanced_furnace);
        registerRender(lit_advanced_furnace);

        registerRender(supreme_furnace);
        registerRender(lit_supreme_furnace);

        registerRender(ultimate_furnace);
        registerRender(lit_ultimate_furnace);
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

    // méthode : add render block avec meta
    public static void registerRender(Block block, int meta) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }

}
