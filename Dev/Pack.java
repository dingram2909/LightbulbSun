import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pack extends Actor
{
    /**
     * Act - do whatever the Pack wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(collide(Josh.class))
            {
                ((subWorld)getWorld()).h = 5;
                getWorld().removeObject(this);
            }
    }
    
    public boolean collide(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;
    }
}
