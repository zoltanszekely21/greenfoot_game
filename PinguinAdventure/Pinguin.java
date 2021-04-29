import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pinguin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pinguin extends Actor
{
    private final int gravity = 1;
    private int velocity;
    
    GreenfootSound eating = new GreenfootSound("Eat.mp3");
   
    public void act() 
    {
       fall();
       walk(); 
       checkCollision();
       Point();
       
    }
    public void Point()
    {
        getWorld().showText("Point: "+Points.counterpinguin,826,48);
    }
    public void fall()
    {
        setLocation(getX(), getY()+ velocity);
        if(isTouchLand())
        {
            velocity = 0;
            while (isTouchLand())
            {
                setLocation(getX(), getY()-1);
            }
            setLocation(getX(), getY()+1);
        }
        else if(velocity<0 && bumpHead()) velocity=0;
        else velocity += gravity;
    }
    
    public void jump()
    {
        velocity = -10;
    }
    
    public void walk()
    {
        int y= getY();
        int x= getX();
        if(Greenfoot.isKeyDown("RIGHT")) 
         {
             x+=3;
         }
        if(Greenfoot.isKeyDown("LEFT")) 
         {
             x-=3;
         }
        if(Greenfoot.isKeyDown("UP") && isTouchLand()) jump();
        setLocation(x, y);
    }
    
    public boolean isTouchLand()
    {
        boolean TouchLand= false;
        
        if (getY() > getWorld().getHeight()-20)TouchLand=true;
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/3,SnowCap1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/3,SnowCap1.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/3,SnowCap2.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/3,SnowCap2.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/4, imageHeight/3,SnowCap3.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/3,SnowCap3.class) !=null)
            TouchLand=true;
            
        if (getOneObjectAtOffset(imageWidth/1, imageHeight/1,Land1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-1, imageHeight/1,Land1.class) !=null)
            TouchLand=true;
        if (getOneObjectAtOffset(imageWidth/1, imageHeight/2,Land2.class)!=null ||
            getOneObjectAtOffset(imageWidth/-1, imageHeight/2,Land2.class) !=null)
            TouchLand=true;
        
            
        if (getOneObjectAtOffset(imageWidth/5, imageHeight/5,Bush1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-5, imageHeight/5,Bush1.class) !=null)
            TouchLand=true;
       
            return TouchLand;
    }
    
    public boolean bumpHead()
    {
        boolean bumpHead = false;
        int imageWidth = getImage().getWidth();
        int imageHeight = getImage().getHeight();
        if(getOneObjectAtOffset(imageWidth/4, imageHeight/-3,SnowCap1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-4, imageHeight/-3,SnowCap1.class) !=null)
        bumpHead = true;
        if (getOneObjectAtOffset(imageWidth/5, imageHeight/-5,Bush1.class)!=null ||
            getOneObjectAtOffset(imageWidth/-5, imageHeight/-5,Bush1.class) !=null)
        bumpHead=true;
        return bumpHead;
    }
    
    private void checkCollision()
    {
         if (isTouching(Fish.class)) 
        {
            removeTouching(Fish.class);
            Points.counterpinguin+=10;
            eating.play();
            
        }
    }
   
}
