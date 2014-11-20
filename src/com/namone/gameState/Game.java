package com.namone.gameState;

import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glViewport;

import java.util.ArrayList;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.Texture;

import com.namone.blocks.Block;
import com.namone.input.InputListener;
import com.namone.mainEngine.Application;
import com.namone.player.Player;
import com.namone.textureLoader.WorldTextureLoad;
import com.namone.worldGen.WorldGen;

public class Game extends GameState{
	
	Player player;
	InputListener menuSel = new InputListener();
	WorldTextureLoad atlas = new WorldTextureLoad();
	WorldGen worldGen = new WorldGen();
	Texture playerTexture;
	public int viewX = 0, viewY = 0;
	public int ID = 0; // CHANGE THIS TO CHANGE TEXTURE
	// Returned image from sprite sheet
	Image spriteTexture;
	// Location for sprites (dirt, stone, etc)
	private int X = 60, Y = 60; // Default location

	// Initialize the world and player
	public void init(Texture texture) {		
		player = new Player("Jenkins", texture); // Create player - Temporary arguments for player
		atlas.init();
		
	}	
	// Update the player & the world
	public void update() {	
			// Updates player position
			menuSel.keyboardClickListener(player); 
			player.update();// uses keyboard input to move player and 
			glViewport(viewX, viewY, Display.getWidth(), Display.getHeight());	
			
			// -10 because that's the edge of the screen (not sure why)
			if(player.X <= -10){
				viewX += 50;
				player.X = 0; // New origin (so it doesn't just move the map forever)
			} else if(player.X >= 790){
				viewX -= 50;
				player.X = 0; // New origin
			} else if(player.Y <= -10){
				viewY += 50;
				player.Y = 0; // New origin
			} else if(player.Y >= 590){
				viewY -= 50;
				player.Y = 0;
			}
	}	
	// Draw the player & the world
	public void draw(Graphics g, Graphics graphics, GameStateManager gsm) {
		glClearColor(0, 0, 0, 1);
		// Draw world
		
		worldGen.worldGenerator();
		// Draw the player to the screen (60, 60)
		player.draw();
		
	}

}
