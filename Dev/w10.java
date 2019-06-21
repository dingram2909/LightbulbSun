import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w10 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w10 extends subWorld
{

    /**
     * Constructor for objects of class w10.
     * 
     */
    public w10()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1);
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        Steps steps = new Steps();
        addObject(steps, 550, 25);
        
        addObject(wall, 50, 250);
        
        addObject(wall2, 150, 250);
        
        addObject(wall3, 250, 250);
        
        addObject(wall4, 350, 250);
        
        addObject(wall5, 450, 250);        
        
        addObject(wall6, 550, 250);
        
        addObject(smallcrate, 570, 90);
        
        addObject(bigcrate, 540, 150);
        
        Pack pack = new Pack();
        addObject(pack, 425, 175);
        
        if(subWorld.entry == 'x' || subWorld.entry == 'd')
        {
            addObject(josh, 490, 25);
        }
        else if(subWorld.entry == 'w')
        {
            addObject(josh, 10, 100);
        }
    }
}
