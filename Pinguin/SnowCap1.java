import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnowCap1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowCap1 extends Snow
{
    public SnowCap1()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() - 50, image.getHeight() - 50);
        setImage(image);
    }
    /**
     * Act - do whatever the SnowCap1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
