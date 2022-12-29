import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    private int pause = 0;
    
    public void button()
    {
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-4);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+4);
        }
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-4, getY());
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+4, getY());
        }
        
        if (pause ==0)
        {
            if(Greenfoot.isKeyDown("enter"))
            {
                getWorld().addObject(new Laser1(),getX(), getY());
            }
            pause =10;
        }
    }
    public void act ()
    {
       button();
       if(pause>0)pause--;
       
    }
}