package com.namone.gameState;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.opengl.Texture;

import com.namone.mainEngine.Application;

//@GENERAL BLUE-PRINT FOR ALL GAMESTATES

public abstract class GameState {
	
	public abstract void init(Texture texture); // So init can load in textures
	public abstract void update();
	public abstract void draw(Graphics g, Graphics graphics, GameStateManager gsm);

}
