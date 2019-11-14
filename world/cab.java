import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class cab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cab extends Actor
{
    /**
     * Act - do whatever the cab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int flag = 0;
    int count = 0;
    Random r = new Random();
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        if(x < 1000 && x > 950){
            flag = 1;
        }else if(x == 20){
            flag = 0;
        }
        
        if(flag == 1){
            setLocation(x-1, y+r.nextInt(15)-r.nextInt(15));
        }else if(flag == 0){
            setLocation(x+1, y+r.nextInt(15)-r.nextInt(15));
        }
        Actor actor = getOneObjectAtOffset(0,0, Bullet.class);
        if(actor != null){
            count++;
            getWorld().removeObject( actor );

        }
        if(count == 5){
            getWorld().showText("CLEAR", 500, 700);
            getWorld().removeObject( this );
            Greenfoot.stop();
        }
    }
    
}
