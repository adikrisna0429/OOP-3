import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explotion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explotion extends Actor
{
    public int time =0;
    public void act()
    {
        time++;
        if(time==10)
        {
            getWorld().removeObject(this);
            time=0;
        }
    }
}
