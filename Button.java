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
        image.setFont(new Font("Arial", true, false, 20));
        setImage (image);
        image.drawString(label, image.getWidth() / 2 - 50, image.getHeight() / 2);
        setImage(image);
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
