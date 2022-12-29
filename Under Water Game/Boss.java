import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    public int move = 1;
    
    public void act()
    {
        setLocation(getX(), getY()+move);
        if(getY()<110){
            move=1;
        }
        if(getY()>440){
            move=-1;
        }
    }
}
