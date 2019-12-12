import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class d here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class downr extends tweet
{
    /**
     * Act - do whatever the d wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Random r = new Random();
    public void act() 
    {
        setRotation(45);
        move(r.nextInt(4)+2);
        int x = getX();
        int y = getY();
        if(y==799||x==999){
         getWorld().removeObject( this ); 
        }
    }    
}
