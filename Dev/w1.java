import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w1 extends subWorld
{

    /**
     * Constructor for objects of class w1.
     * 
     */
    public w1()
    {    
        // Create a new world with 400x600 cells with a cell size of 1x1 pixels.
        super(400, 600, 1);

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

        addObject(wall2, 50, 150);

        addObject(wall3, 50, 250);

        addObject(wall4, 50, 350);

        addObject(wall5, 50, 450);

        addObject(wall6, 50, 550);    

        addObject(wall7, 350, 50);    

        addObject(wall8, 350, 150);    

        addObject(wall9, 350, 250);   

        addObject(wall10, 350, 350);

        addObject(wall11, 350, 450);   

        addObject(wall12, 350, 550);
                     
        if(subWorld.entry == 'x')
        {
            addObject(josh, 200, 590); 
        }
        else if(subWorld.entry == 'n')
        {
            addObject(josh, 200, 10);
        }
        else if(subWorld.entry == 'd')
        {
            addObject(josh, 290, 300);
        }
        Door door = new Door();
        addObject(door, 285, 310);
    }
}
