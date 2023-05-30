
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alphabetmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.alphabetmod.item.LetraZItem;
import net.mcreator.alphabetmod.item.LetraYItem;
import net.mcreator.alphabetmod.item.LetraXItem;
import net.mcreator.alphabetmod.item.LetraWItem;
import net.mcreator.alphabetmod.item.LetraVItem;
import net.mcreator.alphabetmod.item.LetraUItem;
import net.mcreator.alphabetmod.item.LetraTItem;
import net.mcreator.alphabetmod.item.LetraSItem;
import net.mcreator.alphabetmod.item.LetraRItem;
import net.mcreator.alphabetmod.item.LetraQItem;
import net.mcreator.alphabetmod.item.LetraPItem;
import net.mcreator.alphabetmod.item.LetraOItem;
import net.mcreator.alphabetmod.item.LetraNItem;
import net.mcreator.alphabetmod.item.LetraMItem;
import net.mcreator.alphabetmod.item.LetraLItem;
import net.mcreator.alphabetmod.item.LetraKItem;
import net.mcreator.alphabetmod.item.LetraJItem;
import net.mcreator.alphabetmod.item.LetraIItem;
import net.mcreator.alphabetmod.item.LetraHItem;
import net.mcreator.alphabetmod.item.LetraGItem;
import net.mcreator.alphabetmod.item.LetraFItem;
import net.mcreator.alphabetmod.item.LetraEItem;
import net.mcreator.alphabetmod.item.LetraDItem;
import net.mcreator.alphabetmod.item.LetraCItem;
import net.mcreator.alphabetmod.item.LetraBItem;
import net.mcreator.alphabetmod.item.LetraAItem;
import net.mcreator.alphabetmod.item.AzSmpItemItem;
import net.mcreator.alphabetmod.AlphabetModMod;

public class AlphabetModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlphabetModMod.MODID);
	public static final RegistryObject<Item> DECIFRADOR_DE_CODIGOS = block(AlphabetModModBlocks.DECIFRADOR_DE_CODIGOS, CreativeModeTab.TAB_BREWING);
	public static final RegistryObject<Item> LETRA_A = REGISTRY.register("letra_a", () -> new LetraAItem());
	public static final RegistryObject<Item> LETRA_B = REGISTRY.register("letra_b", () -> new LetraBItem());
	public static final RegistryObject<Item> LETRA_C = REGISTRY.register("letra_c", () -> new LetraCItem());
	public static final RegistryObject<Item> LETRA_D = REGISTRY.register("letra_d", () -> new LetraDItem());
	public static final RegistryObject<Item> LETRA_E = REGISTRY.register("letra_e", () -> new LetraEItem());
	public static final RegistryObject<Item> LETRA_F = REGISTRY.register("letra_f", () -> new LetraFItem());
	public static final RegistryObject<Item> LETRA_G = REGISTRY.register("letra_g", () -> new LetraGItem());
	public static final RegistryObject<Item> LETRA_H = REGISTRY.register("letra_h", () -> new LetraHItem());
	public static final RegistryObject<Item> LETRA_I = REGISTRY.register("letra_i", () -> new LetraIItem());
	public static final RegistryObject<Item> LETRA_J = REGISTRY.register("letra_j", () -> new LetraJItem());
	public static final RegistryObject<Item> LETRA_K = REGISTRY.register("letra_k", () -> new LetraKItem());
	public static final RegistryObject<Item> LETRA_L = REGISTRY.register("letra_l", () -> new LetraLItem());
	public static final RegistryObject<Item> LETRA_M = REGISTRY.register("letra_m", () -> new LetraMItem());
	public static final RegistryObject<Item> LETRA_N = REGISTRY.register("letra_n", () -> new LetraNItem());
	public static final RegistryObject<Item> LETRA_O = REGISTRY.register("letra_o", () -> new LetraOItem());
	public static final RegistryObject<Item> LETRA_P = REGISTRY.register("letra_p", () -> new LetraPItem());
	public static final RegistryObject<Item> LETRA_Q = REGISTRY.register("letra_q", () -> new LetraQItem());
	public static final RegistryObject<Item> LETRA_R = REGISTRY.register("letra_r", () -> new LetraRItem());
	public static final RegistryObject<Item> LETRA_S = REGISTRY.register("letra_s", () -> new LetraSItem());
	public static final RegistryObject<Item> LETRA_T = REGISTRY.register("letra_t", () -> new LetraTItem());
	public static final RegistryObject<Item> LETRA_U = REGISTRY.register("letra_u", () -> new LetraUItem());
	public static final RegistryObject<Item> LETRA_V = REGISTRY.register("letra_v", () -> new LetraVItem());
	public static final RegistryObject<Item> LETRA_W = REGISTRY.register("letra_w", () -> new LetraWItem());
	public static final RegistryObject<Item> LETRA_X = REGISTRY.register("letra_x", () -> new LetraXItem());
	public static final RegistryObject<Item> LETRA_Y = REGISTRY.register("letra_y", () -> new LetraYItem());
	public static final RegistryObject<Item> LETRA_Z = REGISTRY.register("letra_z", () -> new LetraZItem());
	public static final RegistryObject<Item> AZ_SMP_ITEM = REGISTRY.register("az_smp_item", () -> new AzSmpItemItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
