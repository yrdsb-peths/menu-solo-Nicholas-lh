import greenfoot. *;
//import que and linkedlist
import java.util.Queue; 
import java.util.LinkedList;

public class MenuScreen extends World {
    
    public MenuScreen()
    {
        super(600, 400, 1);
        
        addObject(new Button(this::goInstructions), 300, 340);
    }
    
    public void goInstructions()
    {
        Greenfoot.setWorld(new InstructionScreen(this));
    }
}
