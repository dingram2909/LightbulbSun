import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends HUD
{
    /**
     * Act - do whatever the Health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(subWorld.h == 5)
       {
           setImage("HB5.png");    
       }
       else if(subWorld.h == 4)
       {
           setImage("HB4.png");
       }
       else if(subWorld.h == 3)
       {
           setImage("HB3.png");
       }
       else if(subWorld.h == 2)
       {
           setImage("HB2.png");
       }
       else if(subWorld.h == 1)
       {
           setImage("HB1.png");
       }
       else
       {
           setImage("HB0.png");
        }
    }    
}
