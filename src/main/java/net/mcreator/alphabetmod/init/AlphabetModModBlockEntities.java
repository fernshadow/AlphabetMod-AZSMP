
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alphabetmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.alphabetmod.block.entity.DecifradorDeCodigosBlockEntity;
import net.mcreator.alphabetmod.AlphabetModMod;

public class AlphabetModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, AlphabetModMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> DECIFRADOR_DE_CODIGOS = register("decifrador_de_codigos", AlphabetModModBlocks.DECIFRADOR_DE_CODIGOS, DecifradorDeCodigosBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
