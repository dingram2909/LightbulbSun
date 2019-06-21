import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w7 extends subWorld
{

    /**
     * Constructor for objects of class w7.
     * 
     */
    public w7()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        addObject(wall, 50, 50);

        addObject(wall2, 50, 150);

        addObject(wall3, 50, 250);

        addObject(wall4, 50, 350);
        
        addObject(wall5, 150, 50);
        
        addObject(wall6, 150, 150);
        
        addObject(wall7, 150, 250);
        
        addObject(wall8, 350, 150);

        addObject(wall9, 350, 250);

        addObject(wall10, 350, 350);

        addObject(wall11, 150, 350);
        
        Door door = new Door();
        addObject(door, 210, 300);
        
        if(subWorld.entry == 'e')
        {
            addObject(josh, 390, 50);
        }
        else if(subWorld.entry == 'n')
        {
            addObject(josh, 250, 10);
        }
        else if(subWorld.entry == 'd')
        {
            addObject(josh, 220, 300);
        }
    }
}
