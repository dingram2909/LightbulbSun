import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w2 extends subWorld
{

    /**
     * Constructor for objects of class w2.
     * 
     */
    public w2()
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
        addObject(wall, 50, 50);

        addObject(wall2, 50, 350);

        addObject(wall3, 350, 50);

        addObject(wall4, 350, 150);

        addObject(wall5, 350, 250);

        addObject(wall6, 350, 350);
        
        Pack pack = new Pack();
        addObject(pack, 75, 275);
       
        if(subWorld.entry == 's')
        {
            addObject(josh, 200, 390); 
        }
        else if(subWorld.entry == 'n')
        {
            addObject(josh, 200, 10);
        }        
        else if(subWorld.entry == 'w')
        {
            addObject(josh, 10, 200);
        }
        else if(subWorld.entry == 'd')
        {
            addObject(josh, 290, 200);
        }
        
        Door door2 = new Door();
        addObject(door2, 280, 195);
    }
}
