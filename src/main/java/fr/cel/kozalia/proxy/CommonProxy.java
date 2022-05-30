package fr.cel.kozalia.proxy;

import fr.cel.kozalia.gen.OreGeneration;
import fr.cel.kozalia.init.*;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CommonProxy {

    public void preInit() {
        new ModItems();
        new ModBlocks();
    }

    public void init() {
        new ModRecipes();
        GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
    }

    public void postInit(){

    }

}