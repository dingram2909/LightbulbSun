import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends subWorld
{

    /**
     * Constructor for objects of class gameOver.
     * 
     */
    public gameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 400, 1);
        
        prepare();
        act();
    }
    
    public void prepare()
    {
        if(subWorld.go == 'd')
        {
            setBackground("G_O.png");
        }
        else if(subWorld.go == 'h')
        {
            setBackground("Win.png");
        }
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
            {
               Greenfoot.setWorld(new w1());                
            }
    }
}