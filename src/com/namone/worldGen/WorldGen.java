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
	public int ScreenWidthBlocks = (ScreenWidthPX / 32) + 1; // Divide screen into equal 'blocks'
	public int ScreenHeightBlocks = (ScreenHeightPX / 32) + 1;  // Same as above
	
	public int id;
	public int x;
	public int y;
	
	public boolean isGenerating = true;
	
	// 2D array to hold map
	private Block[][] gameBlocks = new Block[ScreenWidthBlocks][ScreenHeightBlocks];
	
	public void worldGenerator() {
		
		for(int i = 0; i < ScreenWidthBlocks; i++){         //changed these to var names used to create the array
			for(int ii = 0; ii < ScreenHeightBlocks; ii++){					
				id = random.nextInt(3);
				x = i * 32;
				y = ii * 32;
				// If the array is empty create new array elements
				// with random id, etc.
				if(gameBlocks[i][ii] == null){
					gameBlocks[i][ii] = atlas.createBlock(id, x, y);
				} else {
					// If the array isn't empty assign the array values 
					// previously generated to it & draw
					Block block = gameBlocks[i][ii];
					gameBlocks[i][ii] = atlas.createBlock(block.getID(), block.getX(), block.getY());
					
				}

					
			}
		}
		
		
					
	}
	
			
}
		

				


