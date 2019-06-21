import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class w6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class w6 extends subWorld
{

    /**
     * Constructor for objects of class w6.
     * 
     */
    public w6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        prepare();
        hud();

    }
    
    public void act()
    {
        
    }
    
    public void prepare()
    {
        addObject(wall, 50, 250);

        addObject(wall2, 150, 250);

        addObject(wall3, 250, 250);

        addObject(wall4, 350, 250);

        addObject(wall5, 450, 250);        

        addObject(wall6, 550, 250);
        
        addObject(wall7, 50, 350);

        addObject(wall8, 150, 350);

        addObject(wall9, 250, 350);

        addObject(wall10, 350, 350);

        addObject(wall11, 450, 350);        

        addObject(wall12, 550, 350);
        
        addObject(wall13, 50, 150);

        addObject(wall14, 150, 150);

        addObject(wall15, 250, 150);

        addObject(wall16, 350, 150);

        addObject(wall17, 450, 150);        

        addObject(wall18, 550, 150);
        
        if(h13.health < 1)
        {
         
        }
        else
        {
            addObject(h13, 100, 50);
        }
        
        if(subWorld.entry == 'e')
        {
            addObject(josh, 590, 50);
        }
        else if(subWorld.entry == 'w')
        {
            addObject(josh, 10, 50);
        }
    }
}
