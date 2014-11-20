package com.namone.blocks;
 
import org.newdawn.slick.Image;
import org.newdawn.slick.SpriteSheet;
import com.namone.player.Player;
import static org.lwjgl.opengl.GL11.*;
 
public class Dirt extends Block{
 
        private Image dirt;
       
        public Dirt(int x, int y){
                dirt = spriteSheet.getSubImage(0, 0);
                ID = 0;
                X = x;
                Y = y;
                draw(x, y);
        }
       
        public void update(){
               
        }
       
        public void draw(int x, int y){
               
                dirt.drawEmbedded(x, y, BLOCK_WIDTH, BLOCK_HEIGHT);
                dirt.bind();
                // Draw the actual object
                glBegin(GL_QUADS);
                {
                        glVertex2f(x, y);
                        glVertex2f(x + 32, y);
                        glVertex2f(x + 32, y + 32);
                        glVertex2f(x, y + 32);
                }
                glEnd();
        }
 
}