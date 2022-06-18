package fr.cel.kozalia.proxy;

import fr.cel.kozalia.Kozalia;
import fr.cel.kozalia.entity.render.RenderMineralTNTPrimed;
import fr.cel.kozalia.entity.EntityMineralTNTPrimed;
import fr.cel.kozalia.init.ModBlocks;
import fr.cel.kozalia.init.ModEntities;
import fr.cel.kozalia.init.ModItems;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit() {
        super.preInit();
        ModItems.registerRenders();
        ModBlocks.registerRenders();
    }

    @Override
    public void init() {
        super.init();
    }

    @Override
    public void postInit(){
        super.postInit();
        ModEntities.registerEntitiesRenders();
    }

}