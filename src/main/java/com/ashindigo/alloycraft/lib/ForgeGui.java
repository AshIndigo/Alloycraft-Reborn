package com.ashindigo.alloycraft.lib;

import org.lwjgl.opengl.GL11;

import com.ashindigo.utils.UtilsGui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class ForgeGui extends UtilsGui {
	
	private Container Container;
	private String FileName;
	private String Modid;
	public ResourceLocation texture = new ResourceLocation(Modid + ":" + "textures/gui/" + FileName + ".png");
	public static String Name;

	public ForgeGui(net.minecraft.inventory.Container container, String filename, String modid, int x, int y, InventoryPlayer invplayer, String name) {
		super(container, name, name, y, y, invplayer, name);
		Container = container;
		FileName = filename;
		Modid = modid;
		this.xSize = x;
		this.ySize = y;
		Name = name;
	}

	protected void drawGuiContainerForegroundLayer(int i, int j) {
		try{
			String name = I18n.format(Name);
			this.fontRendererObj.drawString(name, this.xSize / 2 - this.fontRendererObj.getStringWidth(name) / 2, 6, 4210752);
			this.fontRendererObj.drawString(I18n.format("Inventory"), 8, this.ySize - 96 + 5, 4210752);
		}
		catch(NullPointerException e){
			e.printStackTrace();
			String name = "Error";
		}
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float f, int i, int j) {
		
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
        drawTexturedModalRect(guiLeft, guiTop, 0, 0, xSize, ySize);
        }

	}
