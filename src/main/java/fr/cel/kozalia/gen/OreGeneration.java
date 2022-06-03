package fr.cel.kozalia.gen;

import fr.cel.kozalia.init.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class OreGeneration implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        switch (world.provider.getDimensionType()) {
            case OVERWORLD:
                generateSurface(world, random, chunkX * 16, chunkZ * 16);

            case NETHER:
                generateNether(world, random, chunkX * 16, chunkZ * 16);

            case THE_END:
                generateEnd(world, random, chunkX * 16, chunkZ * 16);

        }

    }

    /*----------------------------------------------------------------------------------------------------------------*/

    // méthode pour l'Overworld
    private void generateSurface(World world, Random random, int x, int z) {
        generateOre(ModBlocks.nitrite_ore.getDefaultState(), world, random, x, z, 5, 16, 4, 14, BlockMatcher.forBlock(Blocks.STONE));
        generateOre(ModBlocks.artrite_ore.getDefaultState(), world, random, x, z, 5, 16, 3, 12, BlockMatcher.forBlock(Blocks.STONE));
        generateOre(ModBlocks.terralium_ore.getDefaultState(), world, random, x, z, 5, 16, 4, 10, BlockMatcher.forBlock(Blocks.STONE));
        generateOre(ModBlocks.horium_ore.getDefaultState(), world, random, x, z, 5, 16, 3, 8, BlockMatcher.forBlock(Blocks.STONE));
        generateOre(ModBlocks.kozalium_ore.getDefaultState(), world, random, x, z, 5, 16, 3, 5, BlockMatcher.forBlock(Blocks.STONE));
        generateOre(ModBlocks.xray_ore.getDefaultState(), world, random, x, z, 5, 16, 4, 10, BlockMatcher.forBlock(Blocks.STONE));
    }

    // méthode pour le Nether
    private void generateNether(World world, Random random, int x, int z) {

    }

    // méthode pour l'End
    private void generateEnd(World world, Random random, int x, int z) {

    }

    // méthode pour générer le minerai
    private void generateOre(IBlockState ore, World world, Random random, int x, int z, int minY, int maxY, int maxVeinSize, int chances, BlockMatcher blockChanging) {
        int deltaY = maxY - minY;
        int veinSize = random.nextInt(maxVeinSize + 1);

        for (int i = 0; i < chances; i++) {
            BlockPos pos = new BlockPos(x + random.nextInt(16), minY + random.nextInt(deltaY), z + random.nextInt(16));

            WorldGenMinable generator = new WorldGenMinable(ore, veinSize, blockChanging);
            generator.generate(world, random, pos);
        }
    }

}
