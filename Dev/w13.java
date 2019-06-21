import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w13 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w13 extends subWorld
{

    /**
     * Constructor for objects of class w13.
     * 
     */
    public w13()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        Door door = new Door();
        addObject(door, 10, 500);
        
        Door door2 = new Door();
        addObject(door2, 380, 50);
        
        addObject(bigcrate, 200, 300);
        
        addObject(bigcrate2, 330, 560);
        
        addObject(smallcrate, 40, 40);
        
        addObject(smallcrate2, 100, 40);
        
        addObject(smallcrate3, 70, 100);
        
        if(h28.health < 1)
        {
         
        }
        else
        {
            addObject(h28, 180, 200);
        }     
        
        if(h29.health < 1)
        {
         
        }
        else
        {
            addObject(h29, 230, 500);
        }             
        
        if(subWorld.entry == 'w')
        {
            addObject(josh, 20, 500);
        }
        else if(subWorld.entry == 'e')
        {
            addObject(josh, 380, 50);
        }
    }
}
