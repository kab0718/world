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
    private int count = 50;
    private int l = 0;
    private int flag_tama = 0;
    private int skil = 0;
    GreenfootImage img  = null;
    GreenfootImage damege  = null;
    public void act() 
    {
        int x = getX();
        int y = getY();
        int e = 195;
        img = new GreenfootImage( "images/baby1.png" );
        damege = new GreenfootImage( "images/dele.jpg" );
        count ++;
        if( Greenfoot.isKeyDown( "left" ) ){
            setLocation( x-6,y );
        }if( Greenfoot.isKeyDown( "right" ) ){
            setLocation( x+6,y );
        }if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-6 );
        }if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+6 );
        }if( Greenfoot.isKeyDown( "v" ) && 0 < skil&&flag_tama == 0 ){
                getWorld().addObject( new skillup(), x+150, y-200 );
                skil--;
        }        
        if( flag_tama > 0 ) flag_tama--;
        if( Greenfoot.isKeyDown( "space" ) ){
            if( flag_tama == 0 ){
                getWorld().addObject( new Bullet(), getX(), getY() );
                flag_tama = 10;
            }
        }
        if(count<50 ){
            if(count==10||count==30||count==49){
                setImage(img);
            }else if(count==1||count==20||count==40){
                setImage(damege);
            }
        }
        Actor actor = getOneObjectAtOffset( 0, 0, cab.class );
        Actor mama = getOneObjectAtOffset( 0, 0, Tweet.class );
        if(actor != null|| mama != null){
            if(count>50 ){
                count = 0;
                l++;
                skil++;
                getWorld().addObject( new delete(), e-(l*55), 780 );
                getWorld().addObject( new skill(), e-(l*55), 780 );
            }if(l == 3){
            //getWorld().removeObject( this );
            World Myworld = new Death();
            Greenfoot.setWorld( Myworld );
            }
            
        }
    }
        

} 
   

