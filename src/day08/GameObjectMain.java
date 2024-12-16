package day08;

public class GameObjectMain {
    public static void main(String[] args) {
        GameObject gameObject = new GameObject();
        gameObject.draw();
        gameObject.move(3, 9);
        gameObject.draw();
    }
}
