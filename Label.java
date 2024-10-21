import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Label extends Actor
{
    private GreenfootImage image;
    public void Label(String text, int fontSize)
    {
        image = new GreenfootImage("buttonLong_blue.png");
        setImage(image);
    }
    
    public void setValue(String text)
    {
        image.clear();
        image = new GreenfootImage(text, 24, Color.BLACK, new Color(0,0,0,0));
        setImage(image);
    }
}
