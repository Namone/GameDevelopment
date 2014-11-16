package com.namone.player;

import static org.lwjgl.opengl.GL11.*;

import org.newdawn.slick.Image;
import org.newdawn.slick.opengl.Texture;

import com.namone.textureLoader.*;

public class LoadPlayer {
	
	TextureLoad load = new TextureLoad();
	Texture playerTexture;
	Image Atlas;
	TextureAtlas atlas = new TextureAtlas();
	
	public Texture loadPlayerTexture(){
		playerTexture = load.loadTexture("/res/playerSprites/testsprite.png");
		//atlas.init();
		//atlas.assignSpriteId(0);
		return playerTexture;
	}
	// Initialize OpenGL properties necessary for 
	// sprite transparency (alpha)
	public void initGL(){
		//glEnable(GL_BLEND);
		//glBlendFunc(GL_SRC_ALPHA, GL_ONE_MINUS_SRC_ALPHA); // Allows alpha on image
	}
	
}
