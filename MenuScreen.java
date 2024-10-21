import greenfoot. *;
//import que and linkedlist
import java.util.Queue; 
import java.util.LinkedList;

public class MenuScreen extends World {
    private AvatarManager avatarManager;
    public MenuScreen()
    {
        super(600, 400, 1);
        
        Button instructionButton = new Button (this:: goInstructions, "Instructions", "buttonLong_blue.png");
        addObject(instructionButton, 300, 200);
        avatarManager = new AvatarManager();
        addObject(avatarManager, 300, 200); 
    }
    
    
    public void goInstructions()
    {
        Greenfoot.setWorld(new InstructionScreen(this));
    }
}
