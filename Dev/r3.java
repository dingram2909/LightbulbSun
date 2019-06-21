import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class r3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class r3 extends subWorld
{

    /**
     * Constructor for objects of class r3.
     * 
     */
    public r3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        prepare();
        hud();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Door2 door2 = new Door2();
        addObject(door2, 300, 10);
             
        addObject(bigcrate, 60, 30);
        
        addObject(bigcrate2, 60, 370);
        
        addObject(smallcrate, 30, 90);
        
        addObject(smallcrate2, 30, 150);
        
        addObject(smallcrate3, 30, 210);
        
        addObject(smallcrate4, 30, 270);
        
        addObject(smallcrate5, 30, 320);
        
        addObject(smallcrate6, 120, 250);
        
        if(h5.health < 1)
        {
         
        }
        else
        {
            addObject(h5, 400, 200);
        }    
        
        if(h6.health < 1)
        {
         
        }
        else
        {
            addObject(h6, 200, 300);
        }            
        
        addObject(josh, 300, 20);        
    }
}
