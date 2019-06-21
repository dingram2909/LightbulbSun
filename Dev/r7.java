import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class r7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class r7 extends subWorld
{
    int count = 0;
    
    /**
     * Constructor for objects of class r7.
     * 
     */
    public r7()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1); 
                
        prepare();
        hud();
        act();
    }
    
    public void act()
    {
        
        if(h17.health < 1 && h18.health < 1 && h19.health < 1 && keyPickup == false && count == 0)
        {
            dropKey();
            count ++;
        }
    }
    
    public void prepare()
    {
        Door2 door = new Door2();
        addObject(door, 200, 10);
        
        addObject(bigcrate, 60, 370);
        
        addObject(bigcrate2, 340, 370);
        
        addObject(bigcrate3, 200, 150);
        
        addObject(smallcrate, 200, 220);
        
        if(h17.health < 1)
        {
        }
        else
        {
            addObject(h17, 50, 100);
        }
        
        if(h18.health < 1)
        {
        }
        else
        {
            addObject(h18, 200, 300);
        }
        
        if(h19.health < 1)
        {
        }
        else
        {
            addObject(h19, 300, 300);
        }
        
        Pack pack = new Pack();
        addObject(pack, 350, 25);
        
        addObject(josh, 200, 20);
    }
    
    public void dropKey()
    {
            Key key = new Key();
            addObject(key, 200, 380);
    }
}
