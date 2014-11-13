package com.namone.gameState;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.opengl.Texture;
import static org.lwjgl.opengl.GL11.*;
import com.namone.input.InputListener;
import com.namone.player.Player;

public class Game extends GameState{
	
	Player player;
	InputListener menuSel = new InputListener();
	Texture playerTexture;

	// Initialize the world and player
	public void init(Texture texture) {		
		player = new Player("N/A", 60, 60, texture); // Create player - Temporary arguments for player		
	}	
	// Update the player & the world
	public void update() {		// Updates player position
			menuSel.keyboardClickListener(player);        // uses keyboard input to move player and 
														 //will eventually handle inputs of all kind? 		
	}	
	// Draw the player & the world
	public void draw(Graphics g, Graphics graphics, GameStateManager gsm) {
		glClearColor(0, 50, 0, 1);
		// Draw the player to the screen (60, 60)
		player.draw();
	}

}
