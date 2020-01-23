import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skill2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skill2 extends Actor
{
    /**
     * Act - do whatever the skill2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale( 40,40 );
        if(Pompei.s == 2)getWorld().removeObject( this );
    }    
}
