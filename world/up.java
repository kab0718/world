import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class a here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class up extends tweet
{
    /**
     * Act - do whatever the a wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Random r = new Random();
    public void act() 
    {
        setRotation(-90);
        move(r.nextInt(4)+2);
        int y = getY();
        if(y==0){
         getWorld().removeObject( this ); 
        }
    }    
}
