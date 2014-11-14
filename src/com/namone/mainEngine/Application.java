package com.namone.mainEngine;

import static org.lwjgl.opengl.GL11.GL_BLEND;
import static org.lwjgl.opengl.GL11.GL_COLOR_BUFFER_BIT;
import static org.lwjgl.opengl.GL11.GL_DEPTH_TEST;
import static org.lwjgl.opengl.GL11.GL_MODELVIEW;
import static org.lwjgl.opengl.GL11.GL_ONE_MINUS_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_PROJECTION;
import static org.lwjgl.opengl.GL11.GL_SRC_ALPHA;
import static org.lwjgl.opengl.GL11.GL_TEXTURE_2D;
import static org.lwjgl.opengl.GL11.glBlendFunc;
import static org.lwjgl.opengl.GL11.glClear;
import static org.lwjgl.opengl.GL11.glDisable;
import static org.lwjgl.opengl.GL11.glEnable;
import static org.lwjgl.opengl.GL11.glLoadIdentity;
import static org.lwjgl.opengl.GL11.glMatrixMode;
import static org.lwjgl.opengl.GL11.glOrtho;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.Graphics;

import com.namone.gameState.GameStateManager;
import com.namone.player.LoadPlayer;
import com.namone.textureLoader.TextureLoad;

public class Application {
	
	boolean isRunning = false;	// Not really used; figured 
	// it would be good to have
	public GameStateManager gsm = new GameStateManager();
	public Graphics g; // New graphics context
	public Graphics graphics;
	public TextureLoad loadGraphics = new TextureLoad();
	public LoadPlayer playerLoad = new LoadPlayer();
	public Texture texture; 

	public Application(){
		run();
	}	
	// Start the game
	public void run(){
		isRunning = true;
		init();
	}	
	// Create the display
	public void init(){
		try {
			Display.setDisplayMode(new DisplayMode(800, 600));
			Display.setTitle("JavaRPG");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		g = new Graphics(800, 600); // New Graphic context
		graphics = new Graphics();
			
		initGL();
		loadGraphics();
		gameLoop();		
		
	}
	// Load graphic related items
	public void loadGraphics(){
		// Set it equal to returned texture
		gsm.init(texture);

	}
	// Loop through the game
	public void gameLoop(){		
		while(!Display.isCloseRequested()){	
			// Clear the screen
			glClear(GL_COLOR_BUFFER_BIT);
			//Update the screen
			update();
			// Render the screen
			render(g, graphics, gsm);
			// Update the screen
			Display.update();
			Display.sync(60);
	}
		
		Display.destroy();
	}	
	// Initialize OpenGL
	public void initGL(){
		glEnable(GL_TEXTURE_2D); // Enables texture drawing !IMPORTANT!
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, 800, 0, 600, -1, 1);		
		glMatrixMode(GL_MODELVIEW);
		glDisable(GL_DEPTH_TEST); // Since it is not a 3D game
	}
	// Update code
	public void update(){
		//TODO: Update code goes here
		gsm.update(); // -----> Updates current game state; whether it's the Menu or Game
	}	
	// Render the game (Draw)
	public void render(Graphics g, Graphics graphics, GameStateManager gsm){
		// TODO: Drawing code goes here
		gsm.draw(g, graphics, gsm);
	}
	
}
