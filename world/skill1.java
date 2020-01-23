import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skill here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skill1 extends Actor
{
    /**
     * Act - do whatever the skill wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale( 40,40 );
        if(Pompei.s == 1)getWorld().removeObject( this );
    }    
}
