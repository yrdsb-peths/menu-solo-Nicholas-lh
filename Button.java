import greenfoot.*;

public class Button extends Actor
{
    private Runnable action;
    private String label;
    public Button(Runnable action, String label)
    {
        this.action = action;
        this.label = label;
        GreenfootImage image = new GreenfootImage("buttonLong_beige.png");
        setImage (image);
    }
    
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            if (action != null)
            {
                action.run();
            }
        }
    }
}
