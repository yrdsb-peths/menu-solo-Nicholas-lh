import greenfoot. *;

public class InstructionScreen extends World {
    //maintings a reference to the MenuScreen instance that was created.
    //menu is a variable name
    private String[] instructions;
    private System.Logger.Level instructionLabel;
    private int currentIndex; 
    private Button nextButton;
    private Button prevButton;
    public InstructionScreen(MenuScreen menu)
    {
        super(600,400,1);
        
        instructions = new String[]
        {
            ""
        }
    }

}
