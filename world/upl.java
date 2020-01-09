import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class lup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class upl extends Tweet
{
    /**
     * Act - do whatever the lup wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    Random r = new Random();
    public void act() 
    {
        setRotation(45);
        move(r.nextInt(4)-6);
        int x = getX();
        int y = getY();
        if(x==0||y==0){
         getWorld().removeObject( this ); 
        }
    }    
}
