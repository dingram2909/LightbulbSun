import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w14 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w14 extends subWorld
{

    /**
     * Constructor for objects of class w14.
     * 
     */
    public w14()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1);
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        Door door = new Door();
        addObject(door, 10, 50);
        
        addObject(bigcrate, 60, 570);
        
        addObject(bigcrate2, 340, 570);
        
        addObject(bigcrate3, 200, 570);
        
        addObject(bigcrate4, 75, 500);
        
        addObject(bigcrate5, 315, 500);
        
        addObject(smallcrate, 30, 430);
        
        addObject(smallcrate2, 100, 430);
        
        addObject(smallcrate3, 370, 430);
        
        addObject(smallcrate4, 300, 430);     
        
        addObject(smallcrate5, 195, 490);
        
        Hostage hostage = new Hostage();
        addObject(hostage, 200, 450);
        
        addObject(josh, 20, 50);
        
    }
}
