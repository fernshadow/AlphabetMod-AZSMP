
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alphabetmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.alphabetmod.block.DecifradorDeCodigosBlock;
import net.mcreator.alphabetmod.AlphabetModMod;

public class AlphabetModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AlphabetModMod.MODID);
	public static final RegistryObject<Block> DECIFRADOR_DE_CODIGOS = REGISTRY.register("decifrador_de_codigos", () -> new DecifradorDeCodigosBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			DecifradorDeCodigosBlock.registerRenderLayer();
		}
	}
}
