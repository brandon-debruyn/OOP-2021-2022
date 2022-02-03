package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet 
{
    float stepSize = 10;
    float playerX, playerY;
    float playerWidth = 25;

    float bugX, bugY;
    float bugWidth = 10;

    public void settings() 
    {
        size(500, 500);
    }
    
    public void setup()
    {
        colorMode(RGB);
        background(0);

        playerX = width/2;
        playerY = height - 50;
        noStroke();
        
        resetBug();
    }

    public void draw()
    {
        background(0);
        strokeWeight(2);
        drawPlayer(playerX, playerY, playerWidth);
        drawBug(bugX, bugY, bugWidth);
        
        if((frameCount % 20) == 0)
        {
            moveBug();
        } 
    }

    private void resetBug()
    {
        bugX = random(bugWidth / 2, width - (bugWidth / 2));
        bugY = 50;
    }

    void drawBug(float x, float y, float w)
    {
        float halfWidth = w / 2;

        stroke(255);
        noFill();
        triangle(x - halfWidth, y + halfWidth, x, y - halfWidth, x + halfWidth, y + halfWidth);
    }

    public void drawPlayer(float x, float y, float w)
    {
        
        stroke(255);   
        noFill();
        rect(x, y, w, playerWidth);
        line(x, y-10, x, y-20);   
    }

    public void moveBug()
    {
        bugY ++;
        bugX += random(-20, 20);
    }

    public void keyPressed()
    {
        
        if (keyPressed)
        {
            if (keyCode == LEFT)
            {
                playerX -= stepSize;  
            }
            else if (keyCode == RIGHT)
            {
                playerX += stepSize;
            }
            else if (keyCode == ' ')
            {
                System.out.println("Space");
            }
        }        
    }

}
