import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class down here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class down extends tweet
{
    /**
     * Act - do whatever the down wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setRotation(90);
       move(3);
       int y = getY();
       if(y==799){
         getWorld().removeObject( this ); 
       }  
    }    
}
