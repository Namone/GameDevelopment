package com.namone.gameState;

<<<<<<< HEAD
import static org.lwjgl.opengl.GL11.*;
import java.awt.Font;
=======
import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glClearColor;
import static org.lwjgl.opengl.GL11.glColor3f;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

>>>>>>> origin/master
import org.lwjgl.opengl.Display;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.opengl.Texture;
import com.namone.input.InputListener;

public class TitleScreen extends GameState{
	
	InputListener menuSel = new InputListener();
	Texture Texture;
	
	public TitleScreen(){}
	
	public void init(Texture texture){
		Texture = texture; 
	}
	
	
	public void update(){
		
	}
	// Draw button
	public void draw(Graphics g, Graphics graphics, GameStateManager gsm){
		//Color.white.bind();
		//Texture.bind();		
		glClearColor(50, 50, 50, 0);
		
		glColor3f(0.1f, 0.5f, 0.9f);
		glBegin(GL_QUADS);
		{
			//glTexCoord2f(0, 1);
			glVertex2f(Display.getWidth() / 4, Display.getHeight() / 2);
			//glTexCoord2f(1, 1);
			glVertex2f(Display.getWidth() / 4 + 415, Display.getHeight() / 2);
			//glTexCoord2f(1, 0);
			glVertex2f(Display.getWidth() / 4 + 415, Display.getHeight() / 2 + 50);
			//glTexCoord2f(0, 0);
			glVertex2f(Display.getWidth() / 4, Display.getHeight() / 2 + 50);
			
		}
		glEnd();
		if(menuSel.mouseClickListener()){
//			TODO add code to execute after mouse click
			glClearColor(0, 0, 25, 1);  // check to see if methods work.  CAN REMOVE AFTER TESTING
			gsm.setCurrent(1); // After click, set current state to 1 (GAME_STATE)
			System.out.println("Enter GAME_STATE ");
			gsm.init(Texture); // Pass texture object back for player to use
			
			
		}
	}
	
}
