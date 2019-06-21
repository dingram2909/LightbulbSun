import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hBull here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hBull extends Hostile
{
    /**
     * Act - do whatever the hBull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(20);
        if(collide(Josh.class))
            {
                ((subWorld)getWorld()).h--;
                getWorld().removeObject(this);
            }
    }
    public boolean collide(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;
    }
}
