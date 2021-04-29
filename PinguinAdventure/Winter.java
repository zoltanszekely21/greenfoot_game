import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Winter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Winter extends World
{
    //GreenfootSound backgroundSummer = new GreenfootSound("Summer.mp3");
    /**
     * Constructor for objects of class Winter.
     * 
     */
    public Winter()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1);
        prepare();
    }
    
    public void Start()
    {
       if (Greenfoot.isKeyDown("SPACE")) 
       {
           Greenfoot.setWorld(new MyWorld());
           //backgroundSummer.play();
           Points.counterpinguin=0;
       }
    }
    
    public void act()
    {
        Start();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PSpace pspace = new PSpace();
        addObject(pspace,460,555);
        pspace.setLocation(450,568);
        Next2 next = new Next2();
        addObject(next,770,479);
        next.setLocation(627,533);
        next.setLocation(727,541);
        removeObject(next);

    }
}
