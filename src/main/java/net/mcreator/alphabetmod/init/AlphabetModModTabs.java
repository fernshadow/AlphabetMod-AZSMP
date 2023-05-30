
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alphabetmod.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AlphabetModModTabs {
	public static CreativeModeTab TAB_LETRAS_ALPHABET;

	public static void load() {
		TAB_LETRAS_ALPHABET = new CreativeModeTab("tabletras_alphabet") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AlphabetModModItems.LETRA_A.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
