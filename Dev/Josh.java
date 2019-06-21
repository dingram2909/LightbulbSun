import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Josh here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Josh extends Actor
{
    int goToAngle = 0;  
    int mseX = 0, mseY = 0;
    int tgX, tgY = 0;
    int count = 100;

    /**
     * Act - do whatever the Josh wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(subWorld.h == 0)
        {
            ((subWorld)getWorld()).go = 'd';         
            Greenfoot.setWorld(new gameOver()); 
        }
        else
        {
            move();
            if(Greenfoot.mouseClicked(null))
            {
                tgX = mseX;
                tgY = mseY;
                shoot();
            }
        }
    }    
    
    public void move()
    {
       if((Greenfoot.isKeyDown("r") || Greenfoot.isKeyDown("space")) && count > 100)
       {
           reload();
       }
       count++;
       if(Greenfoot.isKeyDown("down") || Greenfoot.isKeyDown("s"))
                {
                        moveS();
                        if(seeDown(Wall.class) || (seeDown(smallCrate.class)) || (seeDown(bigCrate.class)))
                        {

                        }
                        else
                        {
                            setLocation(getX(), getY()+1);
                            ((subWorld)getWorld()).joshX = getX();
                            ((subWorld)getWorld()).joshY = getY();                            
                        }
                }
        
       if(Greenfoot.isKeyDown("up") || Greenfoot.isKeyDown("w"))
            {
                moveN();
                 if(seeUp(Wall.class) || (seeUp(smallCrate.class)) || (seeUp(bigCrate.class)))
                        {

                        }
                        else
                        {
                            setLocation(getX(), getY()-1);
                            ((subWorld)getWorld()).joshX = getX();
                            ((subWorld)getWorld()).joshY = getY();                            
                        }
            }
        
       if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a"))
            {
                    moveW();
                    if(seeLeft(Wall.class) || (seeLeft(smallCrate.class)) || (seeLeft(bigCrate.class)))
                        {
                      
                        }
                        else
                        {
                            setLocation(getX()-1, getY());
                            ((subWorld)getWorld()).joshX = getX();
                            ((subWorld)getWorld()).joshY = getY();                            
                        }
            }
        
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d"))
            {
                    moveE();
                    if(seeRight(Wall.class) || (seeRight(smallCrate.class)) || (seeRight(bigCrate.class)))
                        {
                      
                        }
                        else
                        {
                            setLocation(getX()+1, getY());
                            ((subWorld)getWorld()).joshX = getX();
                            ((subWorld)getWorld()).joshY = getY();                            
                        }
            }
        
        findMouse();
           
        int r = getRotation();  
        setRotation(goToAngle);
        
    }
  
    public void findMouse()  
    {  
        if (Greenfoot.mouseMoved(null))  
        {  
            MouseInfo mi = Greenfoot.getMouseInfo();  
            mseX = mi.getX();  
            mseY = mi.getY();  
        }  
        goToAngle = (int) Math.toDegrees(Math.atan2(mseY - getY(), mseX - getX()));  
    }
    
    public void shoot()
    {
            if(subWorld.a == 0)
            {
                reload();
            }
            else
            {
            ((subWorld)getWorld()).a --;
            GreenfootSound shot = new GreenfootSound ("Gunshot.wav");
            shot.play();
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet, getX(), getY());
            bullet.setRotation(getRotation());
        }
    }
    
    public void reload()
    {
        GreenfootSound reload = new GreenfootSound ("reload.wav");
        reload.play();
        ((subWorld)getWorld()).a = 6; 
        count = 0;
    }
    
    public void moveS()
    {
                ((subWorld)getWorld()).entry = 'n';                     
                    if(getY() == (getWorld().getHeight()-1))
                    {
                        if (getWorld() instanceof w2)
                        {
                            Greenfoot.setWorld(new w1());
                        }
                        else if (getWorld() instanceof w5)
                        {
                            Greenfoot.setWorld(new w2());
                        }
                        else if (getWorld() instanceof w8)
                        {
                            Greenfoot.setWorld(new w7());
                        }
                        else if (getWorld() instanceof w9)
                        {
                            Greenfoot.setWorld(new w8());
                        }             
                    }
                    else
                    {
                    if(getWorld() instanceof w3)
                    {
                        if(getX() > 280 && getX() < 320 && getY() > 260)
                        {
                            Greenfoot.setWorld(new r3());
                        }
                    }
                    else if(getWorld() instanceof r4)
                    {
                        if(getX() > 280 && getX() < 320 && getY() > 380)
                        {
                            ((subWorld)getWorld()).entry = 'n'; 
                            Greenfoot.setWorld(new w3());
                        }
                    }
                    else if(getWorld() instanceof w4)
                    {
                        if(getX() > 280 && getX() < 320 && getY() > 260)
                        {
                            Greenfoot.setWorld(new r5());
                        }
                    }
                    else if(getWorld() instanceof w9)
                    {
                        if(getX() > 230 && getX() < 270 && getY() > 170)
                        {
                            Greenfoot.setWorld(new r7());
                        }
                    }                    
                    else if (getWorld() instanceof w11)
                    {
                        if(getX() > 120 && getX() < 170 && getY() > 170)
                        {
                            ((subWorld)getWorld()).entry = 'n';                             
                            Greenfoot.setWorld(new w12());
                        }
                    }
                }
            }

            public void moveN()
    {
            if(getY() == 1)
                {
                    ((subWorld)getWorld()).entry = 's';   
                    if(getWorld() instanceof w1)
                    {
                        Greenfoot.setWorld(new w2());
                    }
                    else if (getWorld() instanceof w2)
                    {
                        Greenfoot.setWorld(new w5());
                    }
                    else if (getWorld() instanceof w7)
                    {
                        Greenfoot.setWorld(new w8());
                    }   
                    else if (getWorld() instanceof w8)
                    {
                        Greenfoot.setWorld(new w9());
                    }              
                }
                else
                {
                    if(getWorld() instanceof w3)
                    {
                        if(getX() > 280 && getX() < 320 && getY() < 120)
                        {
                            Greenfoot.setWorld(new r4());
                        }
                    }
                    else if(getWorld() instanceof r3)
                    {
                        if(getX() > 280 && getX() < 320 && getY() < 20)
                        {
                            ((subWorld)getWorld()).entry = 's';                             
                            Greenfoot.setWorld(new w3());
                        }
                    }
                    else if(getWorld() instanceof r5)
                    {
                        if(getX() > 180 && getX() < 220 && getY() < 20)
                        {
                            ((subWorld)getWorld()).entry = 'd';                             
                            Greenfoot.setWorld(new w4());
                        }
                    }
                    else if(getWorld() instanceof r7)
                    {
                        if(getX() > 180 && getX() < 220 && getY() < 20)
                        {
                            ((subWorld)getWorld()).entry = 'd';                             
                            Greenfoot.setWorld(new w9());
                        }
                    }
                    else if (getWorld() instanceof w12)
                    {
                        if(getX() > 230 && getX() < 270 && getY() < 10)
                        {
                            ((subWorld)getWorld()).entry = 'd';                             
                            Greenfoot.setWorld(new w11());
                        }
                    }
                }
    }
    public void moveW()
    {
                 if(getX() == 1)
                {
                    ((subWorld)getWorld()).entry = 'e';                       
                    if (getWorld() instanceof w2)
                    {
                        Greenfoot.setWorld(new w3());
                    }
                    else if (getWorld() instanceof w3)
                    {
                        Greenfoot.setWorld(new w4());
                    }               
                    else if (getWorld() instanceof w5)
                    {
                        Greenfoot.setWorld(new w6());
                    }
                    else if (getWorld() instanceof w6)
                    {
                        Greenfoot.setWorld(new w7());
                    }   
                    else if (getWorld() instanceof w10)
                    {
                        Greenfoot.setWorld(new w11());
                    }                
                }
                else
                {   
                    if(getWorld() instanceof r1)
                    {
                        if(getX() < 20 && getY() < 190 && getY() > 140)
                        {
                            ((subWorld)getWorld()).entry = 'd';                             
                            Greenfoot.setWorld(new w1());
                        }
                    }
                    else if(getWorld() instanceof r2)
                    {
                        if(getX() < 20 && getY() < 225 && getY() > 175)
                        {
                            ((subWorld)getWorld()).entry = 'd';                             
                            Greenfoot.setWorld(new w2());
                        }
                    }
                    else if(getWorld() instanceof w7)
                    {
                        if(getX() < 220 && getY() > 280 && getY() < 320)
                        {
                            Greenfoot.setWorld(new r6());
                        }
                    }
                    else if (getWorld() instanceof w13)
                    {
                        if(getX() < 10 && getY() > 480 && getY() < 520)
                        {
                            ((subWorld)getWorld()).entry = 'e'; 
                            Greenfoot.setWorld(new w12());
                        }
                    }
                    else if (getWorld() instanceof w14)
                    {
                        if(getX() < 10 && getY() > 30 && getY() < 70)
                        {
                            ((subWorld)getWorld()).entry = 'e';                             
                            Greenfoot.setWorld(new w13());
                        }
                    }                        
                    
                }
            }
            
    public void moveE()
            {
              if(getX() == (getWorld().getWidth()-1))
                {
                    ((subWorld)getWorld()).entry = 'w';                       
                    if (getWorld() instanceof w4)
                    {
                        Greenfoot.setWorld(new w3());
                    }          
                    else if (getWorld() instanceof w3)
                    {
                        Greenfoot.setWorld(new w2());
                    }
                    else if (getWorld() instanceof w6)
                    {
                        Greenfoot.setWorld(new w5());
                    }                  
                    else if (getWorld() instanceof w7)
                    {
                        Greenfoot.setWorld(new w6());
                    }                  
                    else if (getWorld() instanceof w11)
                    {
                        Greenfoot.setWorld(new w10());
                    }                                 
                }
                else
                {
                    if(getWorld() instanceof w1)
                    {
                        if(getX() > 275 && getY() > 270 && getY() < 350)
                        {
                            Greenfoot.setWorld(new r1());
                        }
                    }
                    else if(getWorld() instanceof w2)
                    {
                        if(getX() > 270 && getY() > 180 && getY() < 220)
                        {
                            Greenfoot.setWorld(new r2());
                        }
                    }
                    else if(getWorld() instanceof r6)
                    {
                        if(getX() > 390 && getY() > 280 && getY() < 320)
                        {
                            ((subWorld)getWorld()).entry = 'd';                             
                            Greenfoot.setWorld(new w7());
                        }
                    }
                    else if (getWorld() instanceof w12)
                    {
                        if(getX() > 390 && getY() > 480 && getY() < 520)
                        {
                            ((subWorld)getWorld()).entry = 'w';  
                            Greenfoot.setWorld(new w13());
                        }
                    }               
                    else if (getWorld() instanceof w13)
                    {
                        if(getX() > 390 && getY() > 30 && getY() < 70)
                        {                              
                            Greenfoot.setWorld(new w14());
                        }
                    }
                    else if (getWorld() instanceof w5 && subWorld.keyPickup == true)
                    {
                        if(getX() > 300 && getY() > 0 && getY() < 50)
                        {
                            ((subWorld)getWorld()).entry = 'x';
                            Greenfoot.setWorld(new w10());
                        }
                    }
                }
            }
             public boolean seeLeft(Class clss)  
             {  
                 Actor actor = getOneObjectAtOffset(-20, 0, clss);  
                 return actor != null;          
             } 
                          public boolean seeUp(Class clss)  
             {  
                 Actor actor = getOneObjectAtOffset(0, -20, clss);  
                 return actor != null;          
             } 
                          public boolean seeDown(Class clss)  
             {  
                 Actor actor = getOneObjectAtOffset(0, 20, clss);  
                 return actor != null;          
             } 
                          public boolean seeRight(Class clss)  
             {  
                 Actor actor = getOneObjectAtOffset(20, 0, clss);  
                 return actor != null;          
             } 
        }
