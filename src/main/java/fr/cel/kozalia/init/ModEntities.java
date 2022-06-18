package fr.cel.kozalia.init;

import fr.cel.kozalia.Kozalia;
import fr.cel.kozalia.entity.EntityMineralTNTPrimed;
import fr.cel.kozalia.entity.render.RenderMineralTNTPrimed;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModEntities {

    private static int entityID = 0;

    public static void registerEntities() {
        EntityRegistry.registerModEntity(EntityMineralTNTPrimed.class, "mineral_tnt", entityID++, Kozalia.instance, 80, 1, true);
    }

    @SideOnly(Side.CLIENT)
    public static void registerEntitiesRenders() {
        //TODO -> ne fonctionne pas
        RenderingRegistry.registerEntityRenderingHandler(EntityMineralTNTPrimed.class, new RenderMineralTNTPrimed(Minecraft.getMinecraft().getRenderManager()));
    }

}