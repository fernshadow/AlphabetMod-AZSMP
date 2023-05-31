package net.mcreator.alphabetmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Supplier;
import java.util.Map;

public class CodeCraftingTableInventoryWhileThisGUISOpenTickProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
			((Slot) _slots.get(26)).remove(1);
			_player.containerMenu.broadcastChanges();
		}
		RecipeLoveProcedure.execute(world, entity);
		RecipeTestProcedure.execute(entity);
	}
}
