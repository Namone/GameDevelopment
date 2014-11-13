package com.namone.textureLoader;

import java.io.IOException;

import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureLoader;
import org.newdawn.slick.util.ResourceLoader;

public class TextureLoad {
	
	public Texture loadedTexture;
	
	// Load texture for player
		public Texture loadTexture(String PATH){
			try {
				// Load the player texture; needs OpenGL context (that's why it's in draw() in Game.class)
				loadedTexture = TextureLoader.getTexture("PNG", ResourceLoader.getResourceAsStream(PATH));
				// Tell us it's loaded
				System.out.println("Texture Loaded >> " + PATH);
				return loadedTexture; // Return texture loaded to calling variable
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null; // Hopefully this won't run!
		}

}
