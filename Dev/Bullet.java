import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Josh
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(20);
        if(getX() < 1 || getY() < 1 || getX() == getWorld().getWidth() - 1 || getY() == getWorld().getHeight() - 1)
        {
            getWorld().removeObject(this);
        }
        else
        {
            if((collide(Wall.class)) || (collide(smallCrate.class)) || (collide(bigCrate.class)))
            {
                getWorld().removeObject(this);
            }
            else if(collide(Hostage.class))
            {
                
            }
        }
    } 
    
    public boolean collide(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;
    }
   }
