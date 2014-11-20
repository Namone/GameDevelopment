package com.namone.mainEngine;

import static org.lwjgl.opengl.GL11.*;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.opengl.Texture;

import com.namone.gameState.GameStateManager;
import com.namone.player.LoadPlayer;
import com.namone.texture.menu.MenuLoader;
import com.namone.textureLoader.*;

public class Application {
	
	boolean isRunning = false;	// Not really used; figured 
	// it would be good to have
	public GameStateManager gsm = new GameStateManager();
	public Graphics g; // New graphics context
	public Graphics graphics;
	public TextureLoad loadGraphics = new TextureLoad();
	public LoadPlayer playerLoad = new LoadPlayer();
	public Texture texture;
	
	public int ScreenWidthPX = 800;
	public int ScreenHeightPX = 600;

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
			Display.setDisplayMode(new DisplayMode(ScreenWidthPX, 600));
			Display.setTitle("JavaRPG");
			Display.create();
		} catch (LWJGLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		g = new Graphics(ScreenWidthPX, ScreenHeightPX); // New Graphic context
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
		glEnable(GL_BLEND);
		glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA); // Allows alpha on image
		glEnable(GL_TEXTURE_2D); // Enables texture drawing !IMPORTANT!
		glMatrixMode(GL_PROJECTION);
		glLoadIdentity();
		glOrtho(0, ScreenWidthPX, 0, ScreenHeightPX, -1, 1);		
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
