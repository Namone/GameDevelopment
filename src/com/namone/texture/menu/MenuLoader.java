package com.namone.texture.menu;

import org.newdawn.slick.opengl.Texture;

import com.namone.textureLoader.TextureLoad;

public class MenuLoader {
	
	TextureLoad loadTexture = new TextureLoad();
	Texture texture;
	
	public Texture loadMenuTexture(){
		texture = loadTexture.loadTexture("res/gameSprites/woodimage.png");
		return texture;
	}
	
}
