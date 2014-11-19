package com.namone.worldGen;

import java.util.Random;

import com.namone.blocks.Block;
import com.namone.gameState.Game;
import com.namone.textureLoader.WorldTextureLoad;


public class WorldGen {

	Random random = new Random();
	WorldTextureLoad atlas = new WorldTextureLoad();
	
	public int ScreenWidthPX = 800; 
	public int ScreenHeightPX = 600;
	public int ScreenWidthBlocks = ScreenWidthPX / 32; // Divide screen into equal 'blocks'
	public int ScreenHeightBlocks = ScreenHeightPX / 32; // Same as above
	
	public int id;
	public int x;
	public int y;
	
	public boolean isGenerating = true;
	
	// 2D array to hold map
	private Block[][] gameBlocks = new Block[ScreenWidthBlocks][ScreenHeightBlocks];
	
	//Having a problem going through he whole 2d array. Thoughts?    
	// Run the program and you will see the issue there. Need anything ask me?
	
	/*
	 * Using System.out.println("FORLOOP STOP"); I was able to determine
	 * the for loops do not ever stop; causing the id's to never stop
	 * resetting/changing.
	 * 
	 * I don't know how we want to handle this.
	 * 
	 * I left some comments below just for me to remember. I think I 
	 * figured out what each thing does, if they're incorrect let me know.
	 */
	
	public void assignBlocks(){
		
	}
	
	public void drawWorld(){
		
	}
	
	public void worldGenerator() {
		
		for(int i = 0; i <= gameBlocks.length; i++){
			for(int ii = 0; ii <= gameBlocks.length; ii++){					
				id = random.nextInt(3);
				x = i * 32;
				y = ii * 32;
				if(gameBlocks[i][ii] == null){
					gameBlocks[i][ii] = atlas.createBlock(id, x, y);
				}
				

					
			}
		}
		
		
					
	}
			
}
		

				


