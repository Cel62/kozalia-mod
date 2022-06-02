package fr.cel.kozalia.init;

import fr.cel.kozalia.block.*;
import fr.cel.kozalia.util.References;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    public ModBlocks() {
        initBlocks();
        registersBlocks();
        registerItemBlocks();
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
    }

    // add render du block
    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerRender(nitrite_block, 0);
        registerRender(artrite_block, 0);
        registerRender(terralium_block, 0);
        registerRender(horium_block, 0);
        registerRender(kozalium_block, 0);

        registerRender(nitrite_ore, 0);
        registerRender(artrite_ore, 0);
        registerRender(terralium_ore, 0);
        registerRender(horium_ore, 0);
        registerRender(kozalium_ore, 0);

        registerRender(cave_block, 0);
        registerRender(xray_ore, 0);

        registerRender(obsidian_stairs, 0);
    }

    // block -> item
    private void registerItemBlocks() {
        registerItemBlock(nitrite_block);
        registerItemBlock(artrite_block);
        registerItemBlock(terralium_block);
        registerItemBlock(horium_block);
        registerItemBlock(kozalium_block);

        registerItemBlock(nitrite_ore);
        registerItemBlock(artrite_ore);
        registerItemBlock(terralium_ore);
        registerItemBlock(horium_ore);
        registerItemBlock(kozalium_ore);

        registerItemBlock(cave_block);
        registerItemBlock(xray_ore);

        registerItemBlock(obsidian_stairs);
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    // méthode pour add le block
    private void register(Block block) {
        GameRegistry.register(block);
    }

    // méthode : add render du block
    public static void registerRender(Block block, int meta) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), meta, new ModelResourceLocation(new ResourceLocation(References.MODID, block.getUnlocalizedName().substring(5)), "inventory"));
    }

    // méthode : add block -> item
    private void registerItemBlock(Block block) {
        ItemBlock itemBlock = new ItemBlock(block);
        itemBlock.setRegistryName(block.getRegistryName());
        GameRegistry.register(itemBlock);
    }

}
