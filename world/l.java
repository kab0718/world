import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class l here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class l extends tweet
{
    /**
     * Act - do whatever the l wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Random r = new Random();
    public void act() 
    {
        move(r.nextInt(4)-6);
        int x = getX();
        if(x==0){
         getWorld().removeObject( this ); 
        }
    }    
}
