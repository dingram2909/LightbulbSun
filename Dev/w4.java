import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w4 extends subWorld
{

    /**
     * Constructor for objects of class w4.
     * 
     */
    public w4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        prepare();
        hud();
    }
    
    public void prepare()
    {
        addObject(wall, 50, 50);

        addObject(wall2, 150, 50);

        addObject(wall3, 250, 50);

        addObject(wall4, 350, 50);

        addObject(wall5, 450, 50);        

        addObject(wall6, 550, 50);

        addObject(wall7, 50, 350);

        addObject(wall8, 150, 350);

        addObject(wall9, 250, 350);

        addObject(wall10, 350, 350);

        addObject(wall11, 450, 350);        

        addObject(wall12, 550, 350);
        
        Door2 door2 = new Door2();
        addObject(door2, 300, 280);
        
        Door door = new Door();
        addObject(door, 10, 200);
             
        if(subWorld.entry == 'e')
        {
            addObject(josh, 580, 200);
        }
        else if(subWorld.entry == 'd')
        {
            addObject(josh, 300, 280);
        }
    }
}
