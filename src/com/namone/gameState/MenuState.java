package com.namone.gameState;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.opengl.Texture;

public class MenuState extends GameState{
	
	public MenuState(){}
	
	public void init(Texture texture){

	}
	
	public void update(){
		
	}
	
	public void draw(Graphics g, Graphics graphics, GameStateManager gsm){
		graphics.setBackground(Color.white);
		g.setColor(Color.black);
		g.drawString("TITLE", 50, 50);
	}
	
}
