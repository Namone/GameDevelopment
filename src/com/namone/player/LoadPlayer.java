package com.namone.player;

import org.newdawn.slick.opengl.Texture;

import com.namone.textureLoader.*;

public class LoadPlayer {
	
	TextureLoad load = new TextureLoad();
	Texture playerTexture;
	
	public Texture loadPlayerTexture(){
		playerTexture = load.loadTexture("/res/testsprite.png");
		return playerTexture;
	}

}
