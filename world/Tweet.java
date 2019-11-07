import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Write a description of class Tweet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tweet extends Actor
{
    /**
     * Act - do whatever the Tweet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int flag = 0;
    int count = 0;
    Random r = new Random();
    public void act() 
    {
        int x = getX();
        int y = getY();
        setLocation( x-6,y );
        if(x < 1000 && x > 950){
            flag = 1;
        }else if(x == 20){
            flag = 0;
        }
        
        if(flag == 1){
            setLocation(x-1, y+r.nextInt(5)-r.nextInt(5));
        }else if(flag == 0){
            setLocation(x+1, y+r.nextInt(5)-r.nextInt(5));
        }
    }    
}
