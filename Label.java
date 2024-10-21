import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Label extends Actor
{
    private GreenfootImage image;
    private String text;
    private int fontSize;
    //Constructor with parameters to set lavel text and font size
    public void Label(String text, int fontSize)
    {
        this.text = text;
        this.fontSize = fontSize;
        updateImage();
    }
    
    public void setValue(String text)
    {
        this.text = text;
        updateImage();
    }
    
    private void updateImage()
    {
        image = new GreenfootImage(text, fontSize, Color.BLUE, new Color(0,0,0,0));
        setImage(image);
    }
}
