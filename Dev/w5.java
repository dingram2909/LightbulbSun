import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w5 extends subWorld
{

    /**
     * Constructor for objects of class w5.
     * 
     */
    public w5()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1);
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        addObject(wall, 50, 350);

        addObject(wall2, 50, 250);
        
        addObject(wall7, 50, 150);

        addObject(wall3, 350, 100);

        addObject(wall4, 350, 150);

        addObject(wall5, 350, 250);

        addObject(wall6, 350, 350);

        Steps steps = new Steps();
        addObject(steps, 350, 25);

        Door door = new Door();
        addObject(door, 275, 25);
        
        if(subWorld.entry == 's')
        {
            addObject(josh, 200, 390);    
        }
        else if(subWorld.entry == 'w')
        {
            addObject(josh, 10, 50);
        }
        else if(subWorld.entry == 'd')
        {
            addObject(josh, 290, 25);
        }
    }
}
