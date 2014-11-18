package com.namone.worldGen;

import java.util.Random;

import com.namone.textureLoader.WorldTextureLoad;


public class WorldGen {

	Random random = new Random();
	WorldTextureLoad atlas = new WorldTextureLoad();
	
<<<<<<< HEAD
	public int ScreenWidthPX = 800; 
	public int ScreenHeightPX = 600;
	public int ScreenWidthBlocks = ScreenWidthPX / 32; // Divide screen into equal 'blocks'
	public int ScreenHeightBlocks = ScreenHeightPX / 32; // Same as above
	public boolean isGenerating = true;
	
	// 2D array to hold map
	private int[][] gameBlocks = new int[ScreenWidthBlocks][ScreenHeightBlocks];
	
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
	
	public void worldGenerator() {
		
		for(int i = 0; i <= ScreenWidthBlocks; i++){
			for(int ii = 0; ii <= ScreenHeightBlocks; ii++){				
				int id, x, y; // Variables	
				id = random.nextInt(3); //Generate random block type
				x = i * 32; // Allows location of block to be placed correctly -
				// based on size and height of block (32 x 32)
				y = ii * 32; // At [0][0] block is at 0, 0, etc.
				atlas.createBlock(id, x, y); // Create the actual block
				//DEBGUGGING - System.out.println(i + " - " + ii); // 2D array seems to be working
					
			}
				
		}
			
	}
		
		//System.out.println("FORLOOP STOP"); // Debugging purposes
}

=======
	public int ScreenWidthPX = 800;
	public int ScreenHeightPX = 600;
	public int ScreenWidthBlocks = ScreenWidthPX / 32;
	public int ScreenHeightBlocks = ScreenHeightPX / 32;
	
	private int[][] gameBlocks = new int[ScreenWidthBlocks][ScreenHeightBlocks];
	
	//Having a problem going throught he whole 2d array. Thoughts?    Run the program and you will see the issus there. Need anything ask me?
	
	public void worldGenerator() {
		for(int i = 0; i < ScreenWidthBlocks; i++){
			for(int ii = 0; ii < ScreenHeightBlocks; ii++){
				int id, x, y;
				id = random.nextInt(3);
				gameBlocks[i][ii] = id;
				x = i * 32;
				y = ii * 32;
				atlas.createBlock(id, x, y);
			}
		}
	}
}
>>>>>>> origin/master
