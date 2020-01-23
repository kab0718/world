import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class skillup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skillup extends Actor
{
    /**
     * Act - do whatever the skillup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Random r = new Random();
    public void act() 
    {
        setRotation(-90);
        move(r.nextInt(4)+8);
        int y = getY();
        if(y==0){
         getWorld().removeObject( this ); 
        }
    }  
}
