import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Steps here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Steps extends Actor
{
    /**
     * Act - do whatever the Steps wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(subWorld.keyPickup == false)
        {
            setImage("Steps_Locked.png");
        }
    }    
}
