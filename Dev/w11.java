import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w11 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w11 extends subWorld
{

    /**
     * Constructor for objects of class w11.
     * 
     */
    public w11()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 300, 1); 
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        addObject(wall, 50, 250);
        
        addObject(wall2, 150, 250);
        
        addObject(wall3, 250, 250);
        
        addObject(wall4, 350, 250);
        
        addObject(wall5, 450, 250);        
        
        addObject(wall6, 550, 250);
        
        Door2 door = new Door2();
        addObject(door, 150, 180);
        
        if(h22.health < 1)
        {
         
        }
        else
        {
            addObject(h22, 100, 170);
        }         
        
        if(h23.health < 1)
        {
         
        }
        else
        {
            addObject(h23, 50, 100);
        } 
        
        if(h24.health < 1)
        {
         
        }
        else
        {
            addObject(h24, 400, 100);
        }         
        
        if(subWorld.entry == 'e')
        {
            addObject(josh, 590, 100);
        }
        else if(subWorld.entry == 'd')
        {
            addObject(josh, 150, 180);
        }
    }
}
