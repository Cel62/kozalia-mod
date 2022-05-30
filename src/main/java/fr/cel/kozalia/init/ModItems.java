package fr.cel.kozalia.init;

import fr.cel.kozalia.util.References;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
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

    // initialisation item
    private void initItems() {
    }

    // add item
    private void registerItems() {
    }

    // add render item
    @SideOnly(Side.CLIENT)
    public static void registerRenders() {
    }

    /*----------------------------------------------------------------------------------------------------------------*/

    // méthode : add l'item
    private void registerItem(Item item) {
        GameRegistry.register(item);
    }

    // méthode : add render de l'item
    public static void registerRender(Item item, int meta) {
        if (meta == 0) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
        } else {
            ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(new ResourceLocation(References.MODID, item.getUnlocalizedName().substring(5) + meta), "inventory"));
        }
    }

    // créer material pour armor
    public static class ArmorMaterials {
        public static final ItemArmor.ArmorMaterial testMat = EnumHelper.addArmorMaterial("testArmorMat", References.MODID + ":testArmor", 230, new int[]{2, 4, 5, 1}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
    }

    // créer material pour outils
    public static class ToolMaterials {
        public static final Item.ToolMaterial diamond = EnumHelper.addToolMaterial("diamond_digger", 3, 1950, 8.0f, 3f, 10);
    }

}