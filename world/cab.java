
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
    static public int count = 0;
    int shoot = 0;
    int mutek = 10;
    GreenfootImage img  = null;
    GreenfootImage damege  = null;
    Random r = new Random();
    public void act() 
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        int e = 692;
        int tate=0,yoko=0,n=0,hou=0,a=0;
        shoot++;
        mutek++;
        img = new GreenfootImage( "images/icon.jpg" );
        damege = new GreenfootImage( "images/dele.jpg" );
        if(x < 1000 && x > 950){
            flag = 1;
        }else if(x == 20){
            flag = 0;
        }
        if(shoot==100){
            shoot=0;
            yoko = r.nextInt(1001);
            tate = 0;
            tw(yoko,tate);
        }    
        if(flag == 1){
            if(y < 750){
                setLocation(x-1, y+r.nextInt(20)-r.nextInt(20));
            }else{
                setLocation(x-1, y+r.nextInt(20)+r.nextInt(20));
            }
        }else if(flag == 0){
            if(y < 750){
                setLocation(x+1, y+r.nextInt(20)-r.nextInt(20));
            }else{
                setLocation(x+1, y+r.nextInt(20)+r.nextInt(20));
            }
        }
        Actor actor = getOneObjectAtOffset(0,0, Bullet.class);
        Actor hato = getOneObjectAtOffset(0,0, hato.class);
        Actor skil = getOneObjectAtOffset(0,0, skillup.class);
        if((actor != null||skil != null)&&mutek>8){
            count++;
            mutek = 0;
            e = e - (count*32);
            getWorld().removeObject( actor );
            //getWorld().addObject( new dele(), e, 17 );
            if(r.nextInt(2)==0){
                yoko = r.nextInt(2);
                tate = r.nextInt(801); 
                yoko = yoko * 1000;    
                tw(yoko,tate);
            }else{
                yoko = r.nextInt(1001);
                tate = 0;
                tw(yoko,tate);
            }
        }
        if(count == 20){
            count = 0;
            Pompei.l = 0;
            Pompei.skil = 0;
            World Myworld = new Ending();
            Greenfoot.setWorld( Myworld );
        }
        if(mutek<10 ){
            if(mutek==4){
                setImage(img);
            }else if(mutek==1){
                setImage(damege);
            }
        }
    }

    public void tw(int yoko,int tate)
    {
        int hou=0;
        if(yoko==0){
            hou = r.nextInt(5);
        }else if(yoko == 1000){
            hou = r.nextInt(5)+4;
        }else if(tate == 0){
            hou = r.nextInt(5)+2;
        }else if(tate == 800){
            hou = r.nextInt(5);
            if(hou!=0&&hou!=1&&hou!=2){
                hou += 3;
            }
        }
        if(hou==0){
            getWorld().addObject( new up(), yoko, tate );
        }else if(hou==1){
            getWorld().addObject( new upr(), yoko, tate );
        }else if(hou==2){
            getWorld().addObject( new r(), yoko, tate );
        }else if(hou==3){
            getWorld().addObject( new downr(), yoko, tate );    
        }else if(hou==4){
            getWorld().addObject( new down(), yoko, tate );
        }else if(hou==5){
            getWorld().addObject( new downl(), yoko, tate );
        }else if(hou==6){
            getWorld().addObject( new l(), yoko, tate );    
        }else if(hou==7){
            getWorld().addObject( new upl(), yoko, tate );    
        }
    }
}