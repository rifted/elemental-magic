package com.gravirift.riftes.magica;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class Overlay {
	private Minecraft mc;

	public Overlay(Minecraft mc) {
		super();
		this.mc = mc;
	}
	  @SubscribeEvent(priority = EventPriority.NORMAL)
	  public void onRenderExperienceBar(RenderGameOverlayEvent event){
		  FontRenderer fontRender = this.mc.fontRenderer;
			ScaledResolution sclRes = new ScaledResolution(this.mc.gameSettings, this.mc.displayWidth, this.mc.displayHeight);
			
			//GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			
			int count = 0;
			fontRender.drawStringWithShadow(MagicaMain.overlayText1, 16, 16, 0xffffffff);
			fontRender.drawStringWithShadow(MagicaMain.overlayText2, 16, 20+fontRender.FONT_HEIGHT, 0xffffffff);
			fontRender.drawStringWithShadow(MagicaMain.overlayText3, 16, 24+(fontRender.FONT_HEIGHT*2), 0xffffffff);
			count++;
			
	  }
}
