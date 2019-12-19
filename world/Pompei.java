import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pompei here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pompei extends Actor
{
    /**
     * Act - do whatever the Pompei wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int count = 0;
    private int life = 0;
    private int flag_tama = 0;
    public void act() 
    {
        int x = getX();
        int y = getY();
        int e = 195;
        count ++;
        if( Greenfoot.isKeyDown( "left" ) ){
            setLocation( x-6,y );
        }if( Greenfoot.isKeyDown( "right" ) ){
            setLocation( x+6,y );
        }if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-6 );
        }if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+6 );
        }        
        if( flag_tama > 0 ) flag_tama--;
        if( Greenfoot.isKeyDown( "space" ) ){
            if( flag_tama == 0 ){
                getWorld().addObject( new Bullet(), getX(), getY() );
                flag_tama = 10;
            }
        }
        Actor actor = getOneObjectAtOffset( 0, 0, cab.class );
        Actor mama = getOneObjectAtOffset( 0, 0, tweet.class );
        if(actor != null|| mama != null){
            if(count>50 ){
                count = 0;
                life++;
                getWorld().addObject( new delete(), e-(life*55), 780 );
            }if(life == 3){
            getWorld().showText( "GAME OVER", 100, 150 );
            getWorld().removeObject( this );
            Greenfoot.stop();
            }
            
        }
    }
        

} 
   

