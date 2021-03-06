import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    static GreenfootSound sound = new GreenfootSound("sounds/bgm.mp3" );
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1);
        addObject( new cab(), 500,150 );
        addObject( new Pompei(), 500,700 );
        //addObject( new Tweet(), 500,500 );
        sound.play();
        for(int i=20;i<641;i+=32){
            addObject( new hato(20-(i-20)/32), i,16 );        
        } 
        for(int i=30;i<150;i+=55){
            addObject( new life(3-(i-30)/55), i,776 );        
        } 

    }
    
}
