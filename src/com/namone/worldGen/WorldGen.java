package com.namone.worldGen;

import java.util.Random;

import com.namone.textureLoader.WorldTextureLoad;


public class WorldGen {

	Random random = new Random();
	WorldTextureLoad atlas = new WorldTextureLoad();
	
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