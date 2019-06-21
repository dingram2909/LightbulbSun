import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class r4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class r4 extends subWorld
{

    /**
     * Constructor for objects of class r4.
     * 
     */
    public r4()
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
        addObject(door2, 300, 380);
        
        addObject(bigcrate, 60, 30);
        
        addObject(bigcrate2, 180, 30);
        
        addObject(bigcrate3, 300, 30);
        
        addObject(bigcrate4, 420, 30);
        
        addObject(bigcrate5, 540, 30);
        
        addObject(smallcrate, 240, 90);
        
        addObject(bigcrate6, 335, 95);
        
        if(h7.health < 1)
        {
         
        }
        else
        {
            addObject(h7, 100, 200);
        }    
        
        if(h8.health < 1)
        {
         
        }
        else
        {
            addObject(h8, 500, 300);
        }            
        
        addObject(josh, 300, 380);
    }
}
