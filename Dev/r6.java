import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class r6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class r6 extends subWorld
{

    /**
     * Constructor for objects of class r6.
     * 
     */
    public r6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        addObject(bigcrate, 60, 30);
        
        addObject(smallcrate, 30, 90);
        
        addObject(bigcrate2, 340, 240);
        
        addObject(bigcrate3, 220, 240);
        
        addObject(bigcrate4, 280, 380);
        
        addObject(smallcrate2, 190, 380);
        
        addObject(smallcrate3, 370, 380);
        
        addObject(bigcrate5, 60, 570);
        
        addObject(smallcrate4, 320, 520);
        
        Door door = new Door();
        addObject(door, 380, 300);
        
        if(h14.health < 1)
        {
         
        }
        else
        {
            addObject(h14, 300, 50);
        }         
        
        
        if(h15.health < 1)
        {
         
        }
        else
        {
            addObject(h15, 100, 300);
        } 
        
        if(h16.health < 1)
        {
         
        }
        else
        {
            addObject(h16, 200, 500);
        }
        
        addObject(josh, 380, 300);
    }
}
