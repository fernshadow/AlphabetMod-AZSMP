
package net.mcreator.alphabetmod.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.alphabetmod.world.inventory.AlphabetMenu;
import net.mcreator.alphabetmod.network.AlphabetButtonMessage;
import net.mcreator.alphabetmod.AlphabetModMod;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AlphabetScreen extends AbstractContainerScreen<AlphabetMenu> {
	private final static HashMap<String, Object> guistate = AlphabetMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_testar;

	public AlphabetScreen(AlphabetMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 200;
		this.imageHeight = 180;
	}

	private static final ResourceLocation texture = new ResourceLocation("alphabet_mod:textures/screens/alphabet.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, new TranslatableComponent("gui.alphabet_mod.alphabet.label_decifrador_de_codigos"), 45, 5, -12829636);
		this.font.draw(poseStack, new TranslatableComponent("gui.alphabet_mod.alphabet.label_output"), 36, 71, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_testar = new Button(this.leftPos + 126, this.topPos + 68, 56, 20, new TranslatableComponent("gui.alphabet_mod.alphabet.button_testar"), e -> {
			if (true) {
				AlphabetModMod.PACKET_HANDLER.sendToServer(new AlphabetButtonMessage(0, x, y, z));
				AlphabetButtonMessage.handleButtonAction(entity, 0, x, y, z);
			}
		});
		guistate.put("button:button_testar", button_testar);
		this.addRenderableWidget(button_testar);
	}
}
