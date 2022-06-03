package fr.cel.kozalia.block.slab;

public class BlockDoubleObsidianSlab extends BlockObsidianSlab {
    @Override
    public boolean isDouble() {
        return true;
    }

    public BlockDoubleObsidianSlab(String name) {
        super(name);
    }
}