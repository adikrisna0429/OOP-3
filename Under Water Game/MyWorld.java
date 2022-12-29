import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int time=1500;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(1100, 550, 1); 
        prepare();
        
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        Hero hero = new Hero();
        addObject(hero,71,266);

        Enemy enemy = new Enemy();
        addObject(enemy,414,440);
        
        enemy.setLocation(426,443);
        removeObject(enemy);
    }
    
    private void countTime()
    {
        time--;
        if (time==0){
            Boss boss = new Boss();
            addObject(boss,950,300);
        }
    }
    
    public void act()
    {
       if(time!=0){
            if(Greenfoot.getRandomNumber (100) < 2)
            {
                 addObject(new Enemy(), 1099 ,Greenfoot.getRandomNumber (549));
            }
            countTime();
        }
    }
    }
