import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robber here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Robber extends Actor
{
    private int delay;
    private int delayCounter;
    
    public Robber()
    {
        this.delay = 3;
        this.delayCounter = 0;
   }
    /**
     * Act - do whatever the Robber wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (this.delayCounter == this.delay){
            this.movement();
            this.delayCounter=0;
        } else {
            this.delayCounter++;
        }
    }
    
    public void movement()
    {
        this.setRotation(90*Greenfoot.getRandomNumber(4));
        this.move(1);
    }
}
