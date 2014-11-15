package com.namone.player;

import java.io.IOException;
import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;
import static org.lwjgl.opengl.GL11.*;

public class Player {
	// General statistics for the player
	private int playerHealth = 100;
	private int playerStamina = 25;
	private int playerStrength = 10;
	private String playerName; // Input by user on player creation
	//public Vector2f playerPosition; // Player position
	public float x = 10, y = 50; // Player position
	public Texture playerTexture; // Player texture
	
	// Create player
	public Player(String pName, Texture pTexture){
		playerName = pName; // Name of player
		//playerPosition = new Vector2f(playerX, playerY); // Place player at random location
		// Tell us the player is created
		System.out.println("Player Created!"); // Player is created when you add it to the ArrayList<>() in 
		// GameStateManager
		playerTexture = pTexture; // Set player texture equal to the loaded texture passed in
		
	}
	// Draw the player
	public void draw(){		
		Color.white.bind(); // Make the color of it white (transparent)
		playerTexture.bind(); // Bind texture to object
		
		glBegin(GL_QUADS);
		{
			glTexCoord2f(0, 1); // Give orientation to the texture placed on object
			glVertex2f(x, y); // Object coordinates
			glTexCoord2f(1, 1);
			glVertex2f(x + playerTexture.getTextureWidth() / 4, y);
			glTexCoord2f(1, 0);
			glVertex2f(x + playerTexture.getTextureWidth() / 4, y + playerTexture.getTextureHeight() / 4);
			glTexCoord2f(0, 0);
			glVertex2f(x, y + playerTexture.getTextureHeight() / 4);
		}
		glEnd(); 
	}
	// Update the player
	public void update(){
		
	}
	
	public float getPlayerX(){
		return x;
	}
	
	public float getPlayerY(){
		return y;
	}
	
	public void setPlayerCoor(float x, float y){
		x = x;
		y = y;
	}


}
