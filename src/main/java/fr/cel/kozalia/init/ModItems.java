package fr.cel.kozalia.init;

import fr.cel.kozalia.creativetab.KozaliaCreativeTabs;
import fr.cel.kozalia.util.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlockSpecial;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    public ModItems() {
        initItems();
        registerItems();
    }

    /**
     * Pour add des items :
     * l'ajouter comme ci-dessous,
     * le mettre dans initItems(),
     * le mettre dans registersItems()
     * et le mettre dans registerRenders(),
     * faire son json dans models/item
     * et faire sa texture dans textures/items
     */
    public static Item nitrite_fragment;
    public static Item artrite_fragment;
    public static Item terralium_fragment;
    public static Item horium_fragment;
    public static Item kozalium_fragment;
    public static Item xray_fragment;

    // initialisation item
    private void initItems() {
        nitrite_fragment = new Item().setRegistryName("nitrite_fragment").setUnlocalizedName("nitrite_fragment").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        artrite_fragment = new Item().setRegistryName("artrite_fragment").setUnlocalizedName("artrite_fragment").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        terralium_fragment = new Item().setRegistryName("terralium_fragment").setUnlocalizedName("terralium_fragment").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        horium_fragment = new Item().setRegistryName("horium_fragment").setUnlocalizedName("horium_fragment").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        kozalium_fragment = new Item().setRegistryName("kozalium_fragment").setUnlocalizedName("kozalium_fragment").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
        xray_fragment = new Item().setRegistryName("xray_fragment").setUnlocalizedName("xray_fragment").setCreativeTab(KozaliaCreativeTabs.KOZALIA);
    }

    // add item
    private void registerItems() {
        registerItem(nitrite_fragment);
        registerItem(artrite_fragment);
        registerItem(terralium_fragment);
        registerItem(horium_fragment);
        registerItem(kozalium_fragment);
        registerItem(xray_fragment);
    }

    // add render item
    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
        registerRender(nitrite_fragment);
        registerRender(artrite_fragment);
        registerRender(terralium_fragment);
        registerRender(horium_fragment);
        registerRender(kozalium_fragment);
        registerRender(xray_fragment);
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    // méthode : add l'item
    private void registerItem(Item item) {
        GameRegistry.register(item);
    }

    // méthode : add render de l'item
    public static void registerRender(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5) + meta), "inventory"));
    }

    public static void registerRender(Item item){
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }

    // créer material pour armor
    public static class ArmorMaterials {
        //public static final ItemArmor.ArmorMaterial testMat = EnumHelper.addArmorMaterial("testArmorMat", References.MODID + ":testArmor", 230, new int[]{2, 4, 5, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    }

    // créer material pour outils
    public static class ToolMaterials {
        //public static final Item.ToolMaterial diamond = EnumHelper.addToolMaterial("diamond_digger", 3, 1950, 8.0f, 3f, 10);
    }

}