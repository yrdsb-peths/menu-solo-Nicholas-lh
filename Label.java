import greenfoot.*;

public class Label extends Actor {
    private GreenfootImage image;
    private String text;           
    private int fontSize;       

    // Constructor to initialize label with text and font size
    public Label(String text, int fontSize) {
        this.text = text;
        this.fontSize = fontSize;
        updateImage();  
    }

    public void setValue(String text) {
        this.text = text;
        updateImage();  
    }

    // Method to update the label's image based on the current text and font size
    private void updateImage() {
        image = new GreenfootImage(text, fontSize, Color.BLUE, new Color(0, 0, 0, 0));
        setImage(image);  // Set the updated image to the actor
    }
}
