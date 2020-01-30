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
    private int counter = 50;
    static public int l = 0;
    static public int s = 0;
    private int flag_tama = 0;
    private int flag_skill = 0;
    static public int skil = 0;
    GreenfootImage img  = null;
    GreenfootImage damege  = null;
    public void act(){
        int x = getX();
        int y = getY();
        int e = 195;
        img = new GreenfootImage( "images/baby1.png" );
        damege = new GreenfootImage( "images/dele.jpg" );
        counter ++;
        if( Greenfoot.isKeyDown( "left" ) ){
            setLocation( x-6,y );
        }if( Greenfoot.isKeyDown( "right" ) ){
            setLocation( x+6,y );
        }if( Greenfoot.isKeyDown( "up" ) ){
            setLocation( x,y-6 );
        }if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+6 );
        }if( Greenfoot.isKeyDown( "v" ) && 0 < skil&&flag_skill == 0 ){
                Greenfoot.playSound( "sounds/skil.mp3" );
                s++;
                getWorld().addObject( new skillup(), x+150, y-200 );
                skil--;
                flag_skill = 17;
        }        
        if( flag_tama > 0 ) flag_tama--;
        if( flag_skill > 0 ) flag_skill--;
        if( Greenfoot.isKeyDown( "space" )&&flag_tama == 0 ){
            Greenfoot.playSound( "sounds/shot1.mp3" );
            getWorld().addObject( new Bullet(), getX(), getY() );
            flag_tama = 10;
        }
        if(counter<50 ){
            if(counter==10||counter==30||counter==49){
                setImage(img);
            }else if(counter==1||counter==20||counter==40){
                setImage(damege);
            }
        }
        Actor actor = getOneObjectAtOffset( 0, 0, cab.class );
        Actor mama = getOneObjectAtOffset( 0, 0, Tweet.class );
        if(actor != null|| mama != null){
            if(counter>50 ){
                Greenfoot.playSound( "sounds/damage01.wav" );
                counter = 0;
                l++;
                skil++;
                if(l==1)getWorld().addObject( new skill1(), 140, 780 );
                if(l==2)getWorld().addObject( new skill2(), 85, 780 );
            }
            if(l == 3){
                Greenfoot.playSound( "sounds/metsu.wav" );
                l = 0;
                s = 0;
                cab.count = 0;
                skil = 0;
                World Myworld = new Death();
                Greenfoot.setWorld( Myworld ); 
            }
        }
    }
} 
   

