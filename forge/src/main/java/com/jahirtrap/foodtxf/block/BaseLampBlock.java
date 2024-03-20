package com.jahirtrap.foodtxf.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BaseLampBlock extends Block implements SimpleWaterloggedBlock {
    public BaseLampBlock() {
        super(BlockBehaviour.Properties.of(Material.DECORATION).sound(SoundType.METAL).strength(0.5f).lightLevel($ -> 15));
        this.registerDefaultState((this.stateDefinition.any()).setValue(BlockStateProperties.WATERLOGGED, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter getter, BlockPos pos, CollisionContext context) {
        return Shapes.or(Block.box(4.0, 14.0, 4.0, 12.0, 16.0, 12.0));
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        final FluidState fluidstate = context.getLevel().getFluidState(context.getClickedPos());
        for (Direction direction : context.getNearestLookingDirections()) {
            if (direction.getAxis() == Direction.Axis.Y) {
                final BlockState state = this.defaultBlockState();
                if (state.canSurvive(context.getLevel(), context.getClickedPos())) {
                    return state.setValue(BlockStateProperties.WATERLOGGED, (fluidstate.getType() == Fluids.WATER));
                }
            }
        }
        return null;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor accesor, BlockPos currentPos, BlockPos facingPos) {
        return (facing == Direction.UP && !this.canSurvive(state, accesor, currentPos)) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, facing, facingState, accesor, currentPos, facingPos);
    }

    @Override
    public boolean canSurvive(final BlockState state, final LevelReader level, final BlockPos pos) {
        return canSupportCenter(level, pos.above(), Direction.DOWN);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> state) {
        state.add(BlockStateProperties.WATERLOGGED);
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : super.getFluidState(state);
    }
}
