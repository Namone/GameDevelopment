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


	}
	
	// Get the spriteSheet
	public SpriteSheet getAtlas(){
		return spriteSheet;
	}
	
	public Block createBlock(int id , int x, int y){
		ID = id;	
		// NOTE: Images use cell positioning (not X Y)
		// Thus the 0, 0 : 1, 0 : 2, 0 
		switch(id)		
		{
		// BEGIN SWITCH
		case 0: // ID 0 ----- > DIRT
			Dirt dirt = new Dirt(x, y);		
			return dirt;
		case 1: // ID 1 ----- > GRASS
			Grass grass = new Grass(x, y);
			return grass;
		case 2: // ID 2 ----- > STONE
			Stone stone =  new Stone(x, y);
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
		
		return null;
		
	}
	
	// Get current ID
	public int getId(){
		return ID;
	}
	

}
