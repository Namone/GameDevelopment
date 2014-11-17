package com.namone.blocks;

import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;

import org.newdawn.slick.Image;

public class Stone extends Block {
	
	private Image stone;
	
	public Stone(int x, int y){
		stone = spriteSheet.getSubImage(2, 0);
		draw(x, y);
	}
	
	public void update(){
		
	}
	
	public void draw(int x, int y){
		
		stone.draw(x, y);
		stone.bind();
		// Draw the actual object
		glBegin(GL_QUADS);
		{

			glVertex2f(x, y);
			glVertex2f(x + 32, y);
			glVertex2f(x + 32, y + 32);
			glVertex2f(x, y + 32);
		}
		glEnd();
	}

}



