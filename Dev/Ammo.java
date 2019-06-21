import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ammo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ammo extends HUD
{
    /**
     * Act - do whatever the Ammo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if(subWorld.a == 6)
       {
           setImage("Weapon6.png");
       }
       else if(subWorld.a == 5)
       {
           setImage("Weapon5.png");    
       }
       else if(subWorld.a == 4)
       {
           setImage("Weapon4.png");
       }
       else if(subWorld.a == 3)
       {
           setImage("Weapon3.png");
       }
       else if(subWorld.a == 2)
       {
           setImage("Weapon2.png");
       }
       else if(subWorld.a == 1)
       {
           setImage("Weapon1.png");
       }
       else
       {
           setImage("Weapon0.png");
        }
    }    
}
