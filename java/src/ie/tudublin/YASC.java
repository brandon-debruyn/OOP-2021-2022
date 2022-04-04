package ie.tudublin;

import processing.core.PApplet;

public class YASC extends PApplet{

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
        colorMode(RGB);
        x = width / 2;      // center screen 
        y = height / 2;
        w = 100;            // player width
        halfW = w / 2.0f;
    }

    public void settings()
    {
        size(500, 500);
    }

    public void draw()
    {
        background(0);
        drawPlayer(x, y, w);
    }    
}
