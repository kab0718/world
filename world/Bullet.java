import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
     setLocation( x,y-6 );
     Actor actor = getOneObjectAtOffset( 0, 0, cab.class );
     Actor mama = getOneObjectAtOffset( 0, 0, tweet.class );
     if(y==0 || mama != null){
         getWorld().removeObject( this ); 
        }   
    }
}
//|| actor != nul