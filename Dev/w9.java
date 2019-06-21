import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w9 extends subWorld
{

    /**
     * Constructor for objects of class w9.
     * 
     */
    public w9()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1);
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        addObject(wall, 150, 250);
        
        addObject(wall2, 250, 250);        
        
        addObject(wall3, 350, 250);  
        
        addObject(wall4, 150, 350);
        
        addObject(wall5, 250, 350);        
        
        addObject(wall6, 350, 350);
        
        addObject(bigcrate, 340, 30);
        
        addObject(smallcrate, 250, 30);
        
        addObject(smallcrate2, 360, 100);
        
        addObject(smallcrate3, 40, 50);
        
        addObject(bigcrate2, 150, 30);
        
        Door2 door = new Door2();
        addObject(door, 250, 180);
        
        if(h21.health < 1)
        {
         
        }
        else
        {
            addObject(h21, 100, 100);
        }         
        
        if(subWorld.entry == 's')
        {
            addObject(josh, 50, 390);
        }
        else if(subWorld.entry == 'd')
        {
            addObject(josh, 250, 180);
        }
    }
}
