import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w8 extends subWorld
{

    /**
     * Constructor for objects of class w8.
     * 
     */
    public w8()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1);
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        addObject(wall, 50, 350);
        
        addObject(wall2, 150, 350);
        
        addObject(wall3, 150, 50); 
        
        addObject(wall4, 150, 150); 
        
        addObject(wall5, 250, 50); 
        
        addObject(wall6, 250, 150); 
        
        addObject(wall7, 350, 50); 
        
        addObject(wall8, 350, 150);
        
        if(h20.health < 1)
        {
         
        }
        else
        {
            addObject(h20, 100, 250);
        }         
        
        if(subWorld.entry == 's')
        {
            addObject(josh, 300, 390);    
        }
        else if(subWorld.entry == 'n')
        {
            addObject(josh, 50, 10);
        }
    }
}
