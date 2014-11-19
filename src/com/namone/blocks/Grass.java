package com.namone.blocks;
 
import static org.lwjgl.opengl.GL11.GL_QUADS;
import static org.lwjgl.opengl.GL11.glBegin;
import static org.lwjgl.opengl.GL11.glEnd;
import static org.lwjgl.opengl.GL11.glVertex2f;
 
import org.newdawn.slick.Image;
 
public class Grass extends Block {
       
private Image grass;
       
        public Grass(int x, int y){
                grass = spriteSheet.getSubImage(1, 0);
                ID = 1;
                X = x;
                Y = y;
                draw(x, y);
        }
       
        public void update(){
               
        }
       
        public void draw(int x, int y){
               
                grass.drawEmbedded(x, y, BLOCK_WIDTH, BLOCK_HEIGHT);
                grass.bind();
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