package ie.tudublin;

import processing.core.PApplet;

public class YASC extends PApplet
{

   Player p;
   Player p2;

    float x, y, w;
    float halfW;
    
    void drawPlayer(float x, float y, float w) {

        float halfW = w / 2.0f;
        stroke(255);
        line(x - halfW, y + halfW, x, y - halfW);
        line(x, y - halfW, x + halfW, y + halfW);
        line(x + halfW, y + halfW, x, y);
        line(x, y, x - halfW, y + halfW);
    }

    public void setup()
    {
        p = new Player(100, 100, 50, this);
        p2 = new Player(200, 200, 50, this);
    }

    public void settings()
    {
        size(500,500);
    }

    public void draw()
    {
        background(0);

        p.update();
        p.render();
        p2.update();	
        p2.render();
    }    
}
