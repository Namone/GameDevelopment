package com.namone.input;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;

import com.namone.player.Player;

public class InputListener {
	
	private boolean isRunning = false; // Is the player running?
	private int normalSpeed = 3;
	private int runningSpeed = 6;
	
	public InputListener(){
		init();
	}
	// Initializes necessary things for input
	public void init(){
		Keyboard.enableRepeatEvents(true); // Enables repeat events (holding a button down)
	}
	
//	listen for a mouse click and returns true if the mouse click is inside the given area passed to clickAnalyzer
	public boolean mouseClickListener(){
		while(Mouse.next()){
			if(Mouse.isButtonDown(0)){
				int mouseX = Mouse.getX();
				int mouseY = Mouse.getY();
				if(clickAnalyzer(Display.getWidth() / 2, Display.getWidth() / 2 + 300, Display.getHeight() / 2, Display.getHeight() / 2 + 50, mouseX, mouseY)){
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}
	
	public void keyboardClickListener(Player player){ // Changes player position
		while(Keyboard.next()){
			if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)){
				isRunning = true;	
			} 
			
			if(Keyboard.isKeyDown(Keyboard.KEY_W) && Keyboard.isKeyDown(Keyboard.KEY_D)){            // Moves UP and RIGHT
				player.y += normalSpeed;
				player.x += normalSpeed;
				if(isRunning){
					player.y += runningSpeed;
					player.x += runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_W) && Keyboard.isKeyDown(Keyboard.KEY_A)){            // Moves UP and LEFT
				player.y += normalSpeed;
				player.x -= normalSpeed;
				if(isRunning){
					player.y += runningSpeed;
					player.x -= runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_UP) && Keyboard.isKeyDown(Keyboard.KEY_RIGHT)){            // Moves UP and RIGHT
				player.y += normalSpeed;
				player.x += normalSpeed;
				if(isRunning){
					player.y += runningSpeed;
					player.x += runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_UP) && Keyboard.isKeyDown(Keyboard.KEY_LEFT)){             // Moves UP and LEFT
				player.y += normalSpeed;
				player.x -= normalSpeed;
				if(isRunning){
					player.y += runningSpeed;
					player.x -= runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_S) && Keyboard.isKeyDown(Keyboard.KEY_D)){            // Moves DOWN and RIGHT
				player.y -= normalSpeed;
				player.x += normalSpeed;
				if(isRunning){
					player.y -= runningSpeed;
					player.x += runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_S) && Keyboard.isKeyDown(Keyboard.KEY_A)){            // Moves DOWN and LEFT 
				player.y -= normalSpeed;
				player.x -= normalSpeed;
				if(isRunning){
					player.y -= runningSpeed;
					player.x -= runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_DOWN) && Keyboard.isKeyDown(Keyboard.KEY_RIGHT)){            // Moves DOWN and RIGHT
				player.y -= normalSpeed;
				player.x += normalSpeed;
				if(isRunning){
					player.y -= runningSpeed;
					player.x += runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_DOWN) && Keyboard.isKeyDown(Keyboard.KEY_LEFT)){        // Moves  DOWN and LEFT
				player.y -= normalSpeed;
				player.x -= normalSpeed;
				if(isRunning){
					player.y -= runningSpeed;
					player.x -= runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_W) || Keyboard.isKeyDown(Keyboard.KEY_UP)){            // Moves Up
				player.y += normalSpeed;
				// If the player is running; move faster
				if(isRunning){
					player.y += runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_A) || Keyboard.isKeyDown(Keyboard.KEY_LEFT)){   // Moves Left
				player.x -= normalSpeed;
				if(isRunning){
					player.x -= runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_S) || Keyboard.isKeyDown(Keyboard.KEY_DOWN)){   // Moves Down
				player.y -= normalSpeed;
				if(isRunning){
					player.y -= runningSpeed;
				}
			} else if(Keyboard.isKeyDown(Keyboard.KEY_D) || Keyboard.isKeyDown(Keyboard.KEY_RIGHT)){  // Moves Right 
				player.x += normalSpeed;
				if(isRunning){
					player.x += runningSpeed;
				}
			} else if(!Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)){
				isRunning = false;
			}	

		}
		
		
	}
	
//	checks to see if the mouse click is inside of the specific area
//	return true if the mouse click is inside area, returns false if it is not
//	
//	@param lX = left X, rX = right X, bY = bottom Y, tY = Top Y; all of the target area
	public boolean clickAnalyzer(double lX, double rX, double bY, double tY, double mouseX, double mouseY){	
		if(mouseX >= lX && mouseX <= rX && mouseY >= bY && mouseY <= tY){
			return true;
		} else {
			return false;
		}	
	}	
	
	
}
