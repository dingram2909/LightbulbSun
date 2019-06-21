import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Target here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target extends Actor
{
    public int x = 300;
    public int y = 300;
    /**
     * Act - do whatever the Target wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseMoved(null))
        {
            getXandY();
            setLocation(x,y);
        }
    }
    public void getXandY()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        x = mi.getX();
        y = mi.getY(); 
    }
}
