import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class r2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class r2 extends subWorld
{

    /**
     * Constructor for objects of class r2.
     * 
     */
    public r2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 

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
        addObject(door, 10, 200);
        
        addObject(bigcrate, 180, 170);
        
        addObject(bigcrate2, 180, 230);
        
        addObject(smallcrate, 180, 200);
        
        addObject(smallcrate2, 150, 110);
        
        addObject(smallcrate3, 150, 290);
        
        if(h4.health < 1)
        {
         
        }
        else
        {
            addObject(h4, 350, 200);
        }        
        
        addObject(josh, 20, 200);
    }
}
