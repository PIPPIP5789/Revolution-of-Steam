package xyz.brassgoggledcoders.steamagerevolution.multiblocks.tank.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import xyz.brassgoggledcoders.steamagerevolution.machinesystem.multiblock.BlockMultiblockBase;
import xyz.brassgoggledcoders.steamagerevolution.multiblocks.tank.tileentities.TileEntityTankCasing;

public class BlockTankCasing extends BlockMultiblockBase<TileEntityTankCasing> {

    public BlockTankCasing(Material material, String name) {
        super(material, name);
    }

    @Override
    public Class<? extends TileEntity> getTileEntityClass() {
        return TileEntityTankCasing.class;
    }

    @Override
    public TileEntity createTileEntity(World world, IBlockState blockState) {
        return new TileEntityTankCasing();
    }

}
