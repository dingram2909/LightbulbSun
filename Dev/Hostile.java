import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Hostile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hostile extends NPC
{
    public int health = 2;
    int count = 0;
    int goToAngle = 0;      
    int rnd = (Greenfoot.getRandomNumber(10));
    
    /**
     * Act - do whatever the Hostile wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        if(shot())
        {
            health--;
            Actor bullet = getOneIntersectingObject(Bullet.class);
            getWorld().removeObject(bullet);
        }
        
        if(health < 1)
        {
           setImage("hostile_dead.png");
        }
        else
        {
            if(!getObjectsInRange(200, Josh.class).isEmpty())
            {
                if(see(Wall.class) || see(smallCrate.class) || see(bigCrate.class))
                {   
                    move(-1);
                }
                else
                {
                findJosh();
                
                int r = getRotation();  
                setRotation(goToAngle);
                
                if(count<100)
                {
                    move(1);
                    count++;
                }
                else
                {
                    shoot();
                    count = 0;
                }
            }
           
                
            }
            else
            {
                if(getWorld() instanceof w6)
                    {
                        if(count<400)
                        {
                            move(1);
                            count++;
                        }
                        else
                        {
                            turn(180);
                            count = 0;
                        }
                    }
                else if(getWorld() instanceof r7 || getWorld() instanceof r5 || getWorld() instanceof r6 || getWorld() instanceof w11 || getWorld() instanceof w12 ||  getWorld() instanceof w13)
                {
                    
                }
                    else
                    {
                        if(count<100)
                        {
                            move(1);
                            count++;
                        }
                        else
                        {
                            turn(90);
                            count = 0;
                        }
                
                    }
            }
        }
    }
        
    public void shoot()
        {
            GreenfootSound shot = new GreenfootSound ("Gunshot.wav");
            shot.play();
            hBull hBull = new hBull();
            getWorld().addObject(hBull, getX(), getY());
            hBull.setRotation((getRotation()-5)+rnd);
        }
        
    public void findJosh()  
    {          
        goToAngle = (int) Math.toDegrees(Math.atan2(subWorld.joshY - getY(), subWorld.joshX - getX()));  
    }
    
    public boolean see(Class clss)
    {
        Actor actor = getOneIntersectingObject(clss);
        return actor != null;
    }
    
    public boolean shot()
    {
        Actor bullet = getOneIntersectingObject(Bullet.class);
        return bullet != null;
    }
}