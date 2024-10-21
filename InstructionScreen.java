import greenfoot. *;

public class InstructionScreen extends World {
    //maintings a reference to the MenuScreen instance that was created.
    //menu is a variable name
    private String[] instructions;
    private Label instructionLabel;
    private int currentIndex; 
    private Button nextButton;
    private Button prevButton;
    public InstructionScreen(MenuScreen menu)
    {
        super(600,400,1);
        
        instructions = new String[]
        {
            "Welcome to the game",
            "click to change avatars"
        };
        currentIndex = 0;
        
        instructionLabel = new Label(instructions[currentIndex], 24);
        addObject(instructionLabel, 300, 200);
        
        nextButton = new Button(this::nextInstruction, "Next");
        prevButton = new Button(this::previousInstruction, "Previous");
        addObject(nextButton, 500, 350);
        addObject(prevButton, 100, 350);
    }
    
    private void nextInstruction()
    {
        currentIndex = (currentIndex + 1) % instructions.length;
        instructionLabel.setValue(instructions[currentIndex]);
    }
    
    private void previousInstruction()
    {
        currentIndex = (currentIndex - 1) % instructions.length;
        instructionLabel.setValue(instructions[currentIndex]);
    }
}
