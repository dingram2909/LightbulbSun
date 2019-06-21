import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class subWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class subWorld extends World
{
    /*Char identifies the entry point to the world.
     * x - default entry point (For start locations, stairs, doors etc.)
     * n - North
     * s - South
     * e - East
     * w - West
     * d - Door (For the main world doors, not rooms.)
     */

    public static char entry = 'x';
    public static int ffh = 0;
    public static int sfh = 0;
    public static int toth = ffh + sfh;
    public static int h = 5;
    public static int a = 6;
    public static char go;
    public static int joshX, joshY;
    
    public static Hostile h1 = new Hostile();
    public static Hostile h2 = new Hostile();
    public static Hostile h3 = new Hostile();
    public static Hostile h4 = new Hostile();
    public static Hostile h5 = new Hostile();
    public static Hostile h6 = new Hostile();
    public static Hostile h7 = new Hostile();
    public static Hostile h8 = new Hostile();
    public static Hostile h9 = new Hostile();
    public static Hostile h10 = new Hostile();
    public static Hostile h11 = new Hostile();
    public static Hostile h12 = new Hostile();
    public static Hostile h13 = new Hostile();
    public static Hostile h14 = new Hostile();
    public static Hostile h15 = new Hostile();
    public static Hostile h16 = new Hostile();
    public static Hostile h17 = new Hostile();
    public static Hostile h18 = new Hostile();
    public static Hostile h19 = new Hostile();
    public static Hostile h20 = new Hostile();
    public static Hostile h21 = new Hostile();
    public static Hostile h22 = new Hostile();
    public static Hostile h23 = new Hostile();
    public static Hostile h24 = new Hostile();
    public static Hostile h25 = new Hostile();
    public static Hostile h26 = new Hostile();
    public static Hostile h27 = new Hostile();
    public static Hostile h28 = new Hostile();
    public static Hostile h29 = new Hostile();
    
    public Josh josh = new Josh();
    
    public Wall wall = new Wall();
    public Wall wall2 = new Wall();
    public Wall wall3 = new Wall();
    public Wall wall4 = new Wall();
    public Wall wall5 = new Wall();
    public Wall wall6 = new Wall();
    public Wall wall7 = new Wall();
    public Wall wall8 = new Wall();
    public Wall wall9 = new Wall();
    public Wall wall10 = new Wall();
    public Wall wall11 = new Wall();
    public Wall wall12 = new Wall();
    public Wall wall13 = new Wall();    
    public Wall wall14 = new Wall();
    public Wall wall15 = new Wall();
    public Wall wall16 = new Wall();
    public Wall wall17 = new Wall();
    public Wall wall18 = new Wall();
    
    public smallCrate smallcrate = new smallCrate();
    public smallCrate smallcrate2 = new smallCrate();
    public smallCrate smallcrate3 = new smallCrate();
    public smallCrate smallcrate4 = new smallCrate();
    public smallCrate smallcrate5 = new smallCrate();
    public smallCrate smallcrate6 = new smallCrate();
    public smallCrate smallcrate7 = new smallCrate();
    public smallCrate smallcrate8 = new smallCrate();
    
    public bigCrate bigcrate = new bigCrate();
    public bigCrate bigcrate2 = new bigCrate();
    public bigCrate bigcrate3 = new bigCrate();
    public bigCrate bigcrate4 = new bigCrate();
    public bigCrate bigcrate5 = new bigCrate();
    public bigCrate bigcrate6 = new bigCrate();
    public bigCrate bigcrate7 = new bigCrate();
    public bigCrate bigcrate8 = new bigCrate();
    
    public static boolean keyPickup = false;
    
    /**
     * Constructor for objects of class subWorld.
     * 
     */
    public subWorld(int width, int height, int cellSize)
    {
         super(width, height, cellSize);
    }
    
    public void hud()
    {        
        Health health = new Health();
        addObject(health, 75, (getHeight() - 25));
        
        Ammo ammo = new Ammo();
        addObject(ammo, (getWidth() - 75), (getHeight() - 25));
        
        Target target = new Target();
        addObject(target, 50, 50);
    }
}