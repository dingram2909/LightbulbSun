import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w12 extends subWorld
{

    /**
     * Constructor for objects of class w12.
     * 
     */
    public w12()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1); 
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        Door2 door = new Door2();
        addObject(door, 250, 10);
        
        Door door2 = new Door();
        addObject(door2, 380, 500);
        
        addObject(bigcrate, 340, 200);
        
        addObject(bigcrate2, 220, 200);
        
        addObject(smallcrate, 130, 200);
        
        addObject(bigcrate3, 160, 260);
        
        addObject(smallcrate2, 130, 320);
        
        addObject(smallcrate3, 60, 60);
        
        addObject(bigcrate4, 80, 540);
        
        addObject(smallcrate4, 160, 230);
        
        if(h25.health < 1)
        {
         
        }
        else
        {
            addObject(h25, 300, 100);
        }     
        
        if(h26.health < 1)
        {
         
        }
        else
        {
            addObject(h26, 350, 500);
        }     
        
        if(h27.health < 1)
        {
         
        }
        else
        {
            addObject(h27, 250, 450);
        }             
        
        Pack pack = new Pack();
        addObject(pack, 310, 250);
        
        if(subWorld.entry == 'n')
        {
            addObject(josh, 250, 20);
        }
        else if(subWorld.entry == 'e')
        {
            addObject(josh, 380, 500);
        }
    }
}