package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class YASC extends PApplet
{

    Player p;
    Player p1;
    Health h;

<<<<<<< HEAD
    ArrayList<GameObject> gameobjects = new ArrayList<GameObject>();
=======
    ArrayList<GameObject> gameObjects = new ArrayList<GameObject>();

>>>>>>> fbc20091f843f47ca9de294d4f7e0ee3d98ec6c7

    public void setup()
    {
        p = new Player(250, 250, 50, this);
        p1 = new Player(50, 50, 100, this);
        h = new Health(50, this);

        
    }

    public void settings()
    {
        size(500,500);
    }

    public void draw()
    {
        background(0);
<<<<<<< HEAD
        for(GameObject go : gameobjects){
=======
        p.update();        
        p.render();
        
        p1.update();
        p1.render();

        h.update();
        h.render();

        for(GameObject go: gameObjects)
        {
>>>>>>> fbc20091f843f47ca9de294d4f7e0ee3d98ec6c7
            go.update();
            go.render();
        }
    }    
}
