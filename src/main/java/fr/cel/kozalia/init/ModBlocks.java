package fr.cel.kozalia.init;

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

    public ModBlocks(){
        initBlocks();
        registersBlocks();
        registerItemBlocks();
    }

    /**
     * Pour add des blocks :
     * l'ajouter comme ci-dessous
     * le mettre dans initBlocks()
     * le mettre dans registersBlocks()
     * le mettre dans registerRenders()
     * et le mettre dans registerItemBlocks()
     * faire son json dans models/block et models/item
     * et faire sa texture dans textures/blocks
     */

    // initialisation block
    private void initBlocks() {

    }

    // add item
    private void registersBlocks() {
    }

    // add render du block
    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
    }

    // block -> item
    private void registerItemBlocks() {
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
