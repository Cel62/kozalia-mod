package fr.cel.kozalia.init;

import fr.cel.kozalia.block.tileentity.TileEntityMineralFurnace;
import fr.cel.kozalia.util.References;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTileEntity {

    public static void registerTileEntities(){
        GameRegistry.registerTileEntity(TileEntityMineralFurnace.class, References.MODID + ":mineral_furnace");
    }

}
