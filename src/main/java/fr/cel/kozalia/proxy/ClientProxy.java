package fr.cel.kozalia.proxy;

import fr.cel.kozalia.init.ModBlocks;
import fr.cel.kozalia.init.ModItems;

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
    }

}
