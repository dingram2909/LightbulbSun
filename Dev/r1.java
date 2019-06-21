import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class r1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class r1 extends subWorld
{

    /**
     * Constructor for objects of class r1.
     * 
     */
    public r1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(300, 600, 1); 

        prepare();
        hud();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Door door = new Door();
        addObject(door, 10, 170);

        addObject(bigcrate, 207, 363);

        addObject(smallcrate, 48, 283);

        addObject(smallcrate2, 30, 30);

        addObject(bigcrate2, 120, 30);

        addObject(smallcrate3, 150, 90);

        addObject(bigcrate4, 60, 90);

        addObject(bigcrate3, 90, 60);

        addObject(smallcrate4, 51, 459);
        
        if(h1.health < 1)
        {
         
        }
        else
        {
            addObject(h1, 250, 50);
        }
        
        if(h2.health < 1)
        {
         
        }
        else
        {
            addObject(h2, 250, 550);
        }
        
        if(h3.health < 1)
        {
         
        }
        else
        {
            addObject(h3, 200, 200);
        }        
        
        addObject(josh, 20, 170);
    }
}
