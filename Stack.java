import greenfoot.World;
import java.util.List;
import java.util.ArrayList;

public class Stack {
    private List<World> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(World screen) {
        stack.add(screen);
    }

    public World pop() {
        if (!stack.isEmpty()) {
            return stack.remove(stack.size() - 1);
        }
        return null;
    }
}