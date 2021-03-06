import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ending here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ending extends World
{

    /**
     * Constructor for objects of class Ending.
     * 
     */
    public Ending()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        showText( "GANE CLEAR", 500, 400 );
        showText( "PUSH Q TO RESTART", 500, 420 );
        MyWorld.sound.stop();
    }
    
    public void act()
    {
        if( Greenfoot.isKeyDown( "Q" ) ){
            World Myworld = new Opening();
            Greenfoot.setWorld( Myworld );
        }
    }
}