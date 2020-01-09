import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class c here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class r extends Tweet
{
    /**
     * Act - do whatever the c wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Random r = new Random();
    public void act() 
    {
        move(r.nextInt(4)+2);
        int x = getX();
        if(x==999){
         getWorld().removeObject( this ); 
        }
    }    
}
