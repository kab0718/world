import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class life extends Actor
{
    /**
     * Act - do whatever the life wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int b;
    life(int i){
        b = i;
    }
    
    public void act() 
    {
        if(b == Pompei.l){
            getWorld().removeObject( this );
        }
        //getImage().scale( 20,20 );
    } 
}
