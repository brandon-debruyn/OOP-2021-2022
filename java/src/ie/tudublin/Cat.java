package ie.tudublin;

public class Cat extends Animal
{
    private int numLives;
    
    public Cat(String name)
    {
        super(name);
        numLives = 9;
    }

    public int getLives()
    {
        return numLives;
    }
    
    public void kill()
    {
        this.numLives -= 1;

        if(numLives > 0)
        {
            System.out.println("Ouch!");
        }
        else
        {
            System.out.println("Dead");
        }
    }
}

