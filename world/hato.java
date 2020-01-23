import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hato here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hato extends Actor
{
    /**
     * Act - do whatever the hato wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int t;
    
    hato(int i){
        t = i;
    }
    
    public void act() 
    {
        if(t == cab.count){
            getWorld().removeObject( this );
        }
        //getImage().scale( 20,20 );
    }  
    
    
}
