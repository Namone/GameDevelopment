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
public class WorldTextureLoad{
	
	private int ID; // ID of block
	TextureLoad loadTextureAtlas = new TextureLoad();
	Texture atlas;
	SpriteSheet spriteSheet;
	Image textureAtlas;
	
	public void init(){
		Block block = new Block();

	}
	
	// Get the spriteSheet
	public SpriteSheet getAtlas(){
		return spriteSheet;
	}
	
	public void createBlock(int id , int x, int y){
		ID = id;	
		// NOTE: Images use cell positioning (not X Y)
		// Thus the 0, 0 : 1, 0 : 2, 0 
		switch(id)		
		{
		// BEGIN SWITCH
		case 0: // ID 0 ----- > DIRT
			new Dirt(x, y);		
			break;
		case 1: // ID 1 ----- > GRASS
			new Grass(x, y);
			break;
		case 2: // ID 2 ----- > STONE
			new Stone(x, y);
			break;
		default:
			try {
				throw new SlickException(">> TEXTURE LOAD FAILED");
			} catch (SlickException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			
		// END SWITCH
		}
		
	}
	
	// Get current ID
	public int getId(){
		return ID;
	}
	

}
