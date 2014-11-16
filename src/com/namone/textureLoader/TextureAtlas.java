package com.namone.textureLoader;

import org.newdawn.slick.Image;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.SlickException;

/*
 * STILL BEING WORKED ON - 
 * 
 * Right now I am testing this class by loading it in the Loadplayer.class. 
 * I found it most convenient there. 
 * 
 * I am getting the textures of the dirt, grass, and stone, to load onto the screen...
 * But not individually like I want them too.
 * 
 */
public class TextureAtlas {
	
	TextureLoad loadTextureAtlas = new TextureLoad();
	SpriteSheet spriteSheet; // The sprite-sheet
	Image atlas;
	Texture Atlas;
	private int ID;
	private final int SPRITEW = 32; // Width of each sprite on sprite-sheet
	private final int SPRITEH = 32; // Height of each sprite on sprite-sheet;
	
	public void init(){
		Atlas = loadTextureAtlas.loadTexture("res/gameSprites/atlas.png");		
		atlas = new Image(Atlas); // Create new image using texture atlas as texture
		spriteSheet = new SpriteSheet(atlas, SPRITEW, SPRITEH, 2); // Load up the sprite sheet
	}
	
	public Image assignSpriteId(int id){
		ID = id;	
		spriteSheet.startUse();
		switch(id)		
		{
		// BEGIN SWITCH
		case 0: // ID 0 ----- > DIRT			
			return spriteSheet.getSubImage(0, 0);	
		case 1: // ID 1 ----- > GRASS
			return spriteSheet.getSubImage(32, 32);			
		case 2: // ID 2 ----- > STONE
			return spriteSheet.getSubImage(64, 64);			
		default:
			try {
				throw new SlickException("Failed to load texture");
			} catch (SlickException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		// END SWITCH
		}
		spriteSheet.endUse();
		return null; // If, for some reason, no texture is set
		
	}
	
	// Get current ID
	public int getId(){
		return ID;
	}
	

}
