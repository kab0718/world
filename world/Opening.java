import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Opening here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Opening extends World
{

    /**
     * Constructor for objects of class Opening.
     * 
     */
    public Opening()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        addObject( new rogo(), 500,400 );
        showText( "PUSH ENTER TO START", 500, 680 );
    }
    
    public void act()
    {
        started();
        if( Greenfoot.isKeyDown( "Enter" ) ){
            World Myworld = new MyWorld();
            Greenfoot.setWorld( Myworld );
        }

    }
}
