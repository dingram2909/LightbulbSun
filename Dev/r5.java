import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class r5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class r5 extends subWorld
{

    /**
     * Constructor for objects of class r5.
     * 
     */
    public r5()
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
        addObject(smallcrate, 30, 30);
        
        addObject(smallcrate2, 370, 30);
        
        addObject(smallcrate3, 30, 370);        
        
        addObject(smallcrate4, 370, 370);
        
        Door2 door2 = new Door2();
        addObject(door2, 200, 10);
        
        if(h9.health < 1)
        {
         
        }
        else
        {
            addObject(h9, 100, 100);
        }    
        
        if(h10.health < 1)
        {
         
        }
        else
        {
            addObject(h10, 300, 100);
        }    
        
        if(h11.health < 1)
        {
         
        }
        else
        {
            addObject(h11, 300, 300);
        }    
        
        if(h12.health < 1)
        {
         
        }
        else
        {
            addObject(h12, 100, 300);
        }            
        
        Pack pack = new Pack();
        addObject(pack, 200, 350);
        
        addObject(josh, 200, 20);
    }
}
