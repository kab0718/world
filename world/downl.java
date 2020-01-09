import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class ldown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class downl extends Tweet
{
    /**
     * Act - do whatever the ldown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    Random r = new Random();
    public void act() 
    {
        setRotation(-45);
       move(r.nextInt(4)-5);
        int x = getX();
        int y = getY();
        if(x==0||y==799){
         getWorld().removeObject( this ); 
        }  
    }    
}
