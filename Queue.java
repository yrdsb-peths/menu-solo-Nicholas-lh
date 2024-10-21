import java.util.LinkedList;

public class Queue {
    private LinkedList<String> avatars;

    public Queue() {
        avatars = new LinkedList<>();
    }

    public void enqueue(String avatar) {
        avatars.add(avatar);
    }

    public String dequeue() {
        if (!avatars.isEmpty()) {
            return avatars.remove();
        }
        return null;
    }

    public String peek() {
        return avatars.peek();
    }

    public int size() {
        return avatars.size();
    }
}
