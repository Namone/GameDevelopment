package com.namone.textureLoader;

import org.newdawn.slick.Image;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.SlickException;
import com.namone.blocks.*;

/*
 * Texture atlas class.
 * 
 * Pass in texture ID you want and it will return selected texture.
 * This is all called from Game.class; modify drawn textures through
 * there.
 * 
 */
public class TextureAtlas{
	
	private int ID; // ID of block
	TextureLoad loadTextureAtlas = new TextureLoad();
	Texture atlas;
	SpriteSheet spriteSheet;
	Image textureAtlas;
	
	// TERRAIN
	Image dirt;
	Image grass;
	Image stone;
	
	public void init(){
		try {
			textureAtlas = new Image("res/gameSprites/atlas.png");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		spriteSheet = new SpriteSheet(textureAtlas, 32, 32, 2);

	}
	
	public Image assignSpriteId(int id){
		ID = id;	
		// NOTE: Images use cell positioning (not X Y)
		// Thus the 0, 0 : 1, 0 : 2, 0 
		switch(id)		
		{
		// BEGIN SWITCH
		case 0: // ID 0 ----- > DIRT
			new Dirt();
			dirt = spriteSheet.getSubImage(0, 0);
			return dirt;
		case 1: // ID 1 ----- > GRASS
			new Grass();
			grass = spriteSheet.getSubImage(1, 0);			
			return grass;	
		case 2: // ID 2 ----- > STONE
			new Stone();
			stone = spriteSheet.getSubImage(2, 0);
			return stone;		
		default:
			try {
				throw new SlickException(">> TEXTURE LOAD FAILED");
			} catch (SlickException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		// END SWITCH
		}
		
		return null; // If, for some reason, no texture is set
		
	}
	
	// Get current ID
	public int getId(){
		return ID;
	}
	

}
