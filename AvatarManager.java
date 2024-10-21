import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;

public class AvatarManager extends Actor
{
    private LinkedList<Avatar> avatars = new LinkedList<>();
    private Avatar current;
    public AvatarManager()
    {
        //puting avatar images to queue
        avatars.add(new Avatar("face_a.png"));
        avatars.add(new Avatar("face_b.png"));
        avatars.add(new Avatar("face_c.png"));
        
        current = avatars.remove();
    }
}
