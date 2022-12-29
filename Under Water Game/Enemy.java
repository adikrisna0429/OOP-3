import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public void move()
    {
        setLocation(getX()-2, getY());
        if(getX()<20){
            getWorld().removeObject(this);
        }
        else{
            check_posible();
        }
    }
    
    public void check_posible()
    {
        if(isTouching(Laser1.class))
        {
            getWorld().removeObject(this);
        }
    }
    
    public void act()
    {
        move();
    }
}
