package fr.cel.kozalia.block.slab;

public class BlockHalfObsidianSlab extends BlockObsidianSlab {
    @Override
    public boolean isDouble() {
        return false;
    }

    public BlockHalfObsidianSlab(String name) {
        super(name);
    }
}