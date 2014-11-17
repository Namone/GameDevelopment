package com.namone.blocks;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import com.namone.textureLoader.WorldTextureLoad;

public class Block {
	
	public final int BLOCK_WIDTH = 32;
	public final int BLOCK_HEIGHT = 32;
	public boolean isSlick = false; // For ice, etc.
	public boolean isBreakable = true;
	public WorldTextureLoad atlas = new WorldTextureLoad();
	public SpriteSheet spriteSheet;
	public Image textureAtlas;
	
	public Block(){
		init();
	}
	
	public void init(){
		try {
			textureAtlas = new Image("res/gameSprites/atlas.png");
			//System.out.println("LOADED");
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		spriteSheet = new SpriteSheet(textureAtlas, 32, 32, 2);
	}
	
	public void breakBlock(){
		
	}


}
