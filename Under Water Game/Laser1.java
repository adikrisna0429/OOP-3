import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser1 extends Actor
{
    public void move()
    {
        setLocation(getX()+3, getY());
        if(getX()>1080){
            getWorld().removeObject(this);
        }
        else{
            check_posible();
        }
    }
    
    public void check_posible()
    {
        if(isTouching(Enemy.class))
        {
            getWorld().addObject(new Explotion(),getX(),getY());
            MyWorld m= (MyWorld)getWorld();
            getWorld().removeObject(this);
        }
    }
    public void act()
    {
        move();
    }
}
