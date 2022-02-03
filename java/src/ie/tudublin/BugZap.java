package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet 
{
    float stepSize = 10;
    float playerX, playerY;
    float playerWidth = 25;

    float bugX, bugY;
    float bugWidth = 20;

    int score = 0;

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

        if((frameCount % 10) == 0)
        {
            moveBug();
        } 
        text("Score: " + score, 50, 50);
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
        bugY += 10;
        bugX += random(-30, 30);

        if(bugX <= 0)
        {
            bugX = 0;
        }
        else if(bugX >= (width - bugWidth))
        {
            bugX = (width - bugWidth);
        }
    }

    public void keyPressed()
    {
        
        if (keyPressed)
        {
            if (keyCode == LEFT)
            {
                playerX -= stepSize;  
                
                if(playerX <= 0)
                {
                    playerX = 0;
                }
            }

            if (keyCode == RIGHT)
            {
                playerX += stepSize;

                if(playerX >= (width - playerWidth))
                {
                    playerX = (width - (playerWidth / 2));
                }
            }

            if (keyCode == ' ')
            {
                float halfW = bugWidth / 2;

                if(playerX > bugX - halfW && playerX < bugX + halfW)
                {
                    score ++;
                    resetBug();
                    line(playerX, playerY-10, playerX, bugY);
                }
                else
                {
                    line(playerX, playerY - 10, playerX, 0);
                }
            }
        }        
    }

}
