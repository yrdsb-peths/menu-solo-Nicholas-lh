import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;
import java.util.Map;
public class HighScore extends World
{
    private Map<String, Integer> highScores;
    
    public HighScore()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //high scores with 3 names
        highScores = new HashMap<>();
        highScores.put("Nic", 2000);
        highScores.put("Joe", 1000);
        highScores.put("Wick", 4000);
        
        displayScores();
    }
    private void displayScores()
    {
        int yPosition = 100;
        
        for (Map.Entry<String, Integer> entry : highScores.entrySet()) 
        {
          String text = entry.getKey() + ": " + entry.getValue();
          Label scoreLabel = new Label(text, 24);
          addObject(scoreLabel, 300, yPosition);
          yPosition += 50;
        }
    }
}
