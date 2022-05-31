package fr.cel.kozalia.init;

import fr.cel.kozalia.creativetab.KozaliaCreativeTabs;
import fr.cel.kozalia.util.References;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    public ModBlocks(){
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

    // initialisation block
    private void initBlocks() {
        nitrite_block = new Block(Material.ROCK).setHardness(2.0f).setResistance(10.0f).setUnlocalizedName("nitrite_block").setRegistryName("nitrite_block").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        artrite_block = new Block(Material.ROCK).setHardness(2.0f).setResistance(10.0f).setUnlocalizedName("artrite_block").setRegistryName("artrite_block").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        terralium_block = new Block(Material.ROCK).setHardness(2.0f).setResistance(10.0f).setUnlocalizedName("terralium_block").setRegistryName("terralium_block").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        horium_block = new Block(Material.ROCK).setHardness(2.0f).setResistance(10.0f).setUnlocalizedName("horium_block").setRegistryName("horium_block").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        kozalium_block = new Block(Material.ROCK).setHardness(2.0f).setResistance(10.0f).setUnlocalizedName("kozalium_block").setRegistryName("kozalium_block").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
    }

    // add item
    private void registersBlocks() {
        register(nitrite_block);
        register(artrite_block);
        register(terralium_block);
        register(horium_block);
        register(kozalium_block);
    }

    // add render du block
    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerRender(nitrite_block, 0);
        registerRender(artrite_block, 0);
        registerRender(terralium_block, 0);
        registerRender(horium_block, 0);
        registerRender(kozalium_block, 0);
    }

    // block -> item
    private void registerItemBlocks() {
        registerItemBlock(nitrite_block);
        registerItemBlock(artrite_block);
        registerItemBlock(terralium_block);
        registerItemBlock(horium_block);
        registerItemBlock(kozalium_block);
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
