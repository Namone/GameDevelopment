package com.namone.player;

import java.util.ArrayList;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;

import com.namone.mainEngine.Application;

import static org.lwjgl.opengl.GL11.*;

public class Player {
	// General statistics for the player
	private int playerHealth = 100;
	private int playerStamina = 25;
	private int playerStrength = 10;
	private String playerName; // Input by user on player creation
	//public Vector2f playerPosition; // Player position
	
	public int viewX = 0, viewY = 0; // Changes viewport position
	
	public boolean isMovingLeft = false; // Is the player moving left?
	public boolean isMovingRight = false; // Is the player moving right?
	public boolean isMovingUp = false; // Is the player moving up?
	public boolean isMovingDown = false; // Is the player moving down?
	
	public float X = 60, Y = 60; // Player position
	public Texture playerTexture; // Player texture
	
	public ArrayList<Integer> xStore = new ArrayList<Integer>();
	public ArrayList<Integer> yStore = new ArrayList<Integer>();
	
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
			glVertex2f(X, Y); // Object coordinates
			glTexCoord2f(1, 1);
			glVertex2f(X + playerTexture.getTextureWidth() / 4, Y);
			glTexCoord2f(1, 0);
			glVertex2f(X + playerTexture.getTextureWidth() / 4, Y + playerTexture.getTextureHeight() / 4);
			glTexCoord2f(0, 0);
			glVertex2f(X, Y + playerTexture.getTextureHeight() / 4);
		}
		glEnd(); 
	}
	// Update the player
	public void update(){
		
	} 
	
	public float getPlayerX(){
		return X;
	}
	
	public float getPlayerY(){
		return Y;
	}
	
	public void setPlayerCoor(float x, float y){
		X = x;
		Y = y;
	}


}
