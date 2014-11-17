package com.namone.gameState;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.Texture;

import static org.lwjgl.opengl.GL11.*;

import com.namone.input.InputListener;
import com.namone.player.Player;
import com.namone.textureLoader.WorldTextureLoad;

public class Game extends GameState{
	
	Player player;
	InputListener menuSel = new InputListener();
	WorldTextureLoad atlas = new WorldTextureLoad();
	Texture playerTexture;
	public int ID = 0; // CHANGE THIS TO CHANGE TEXTURE
	// Returned image from sprite sheet
	Image spriteTexture;
	// Location for sprites (dirt, stone, etc)
	private int X = 60, Y = 60; // Default location
	// -2 places it right against window border

	// Initialize the world and player
	public void init(Texture texture) {		
		player = new Player("Jenkins", texture); // Create player - Temporary arguments for player	
		atlas.init();
	}	
	// Update the player & the world
	public void update() {		// Updates player position
			menuSel.keyboardClickListener(player);        // uses keyboard input to move player and 
														 //will eventually handle inputs of all kind? 		
	}	
	// Draw the player & the world
	public void draw(Graphics g, Graphics graphics, GameStateManager gsm) {
		glClearColor(0, 50, 0, 1);
		// Draw world
		drawWorld(ID, X, Y);
		// Draw the player to the screen (60, 60)
		player.draw();
		
	}
	
	public void drawWorld(int id, int x, int y){
		atlas.createBlock(id, x, y); // Get texture		
		
	}

}
