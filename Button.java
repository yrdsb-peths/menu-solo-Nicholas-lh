import greenfoot.*;

public class Button extends Actor
{
    private Runnable action;
    private String label;
    private GreenfootImage buttonImage;
    public Button(Runnable action, String label, String imageFile)
    {
        this.action = action;
        this.label = label;
        GreenfootImage image = new GreenfootImage(imageFile);
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
