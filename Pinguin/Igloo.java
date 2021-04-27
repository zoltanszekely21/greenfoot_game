import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Igloo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Igloo extends Snow
{
    public Igloo()
    {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() /7, image.getHeight() /7);
        setImage(image);
    }
    public void OverIgloo()
    {
        Actor Igloo = this.getOneIntersectingObject(Pinguin.class);
        if( Igloo != null)
        {
          this.getWorld().removeObject(Igloo);
          World myWorld = getWorld();
          Complete complete = new Complete();
          Next2 next2 = new Next2();
          Back back = new Back();
          myWorld.addObject(complete,myWorld.getWidth()/2, myWorld.getHeight()/2);
          myWorld.addObject(next2,727,541);
          myWorld.addObject(back,74,48);
        }
    }

    public void EndGame()
    {
       if (getWorld().getObjects(Fish.class).isEmpty())
       {
           OverIgloo();
       } 
    }
    /**
     * Act - do whatever the Stealth wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        EndGame();// Add your action code here.
    }    
}
