package day08;

public class GameObject implements Movable, Drawable{
    int x=0;
    int y=0;

    @Override
    public void draw() {
        System.out.println("객체가 (" + x + "," + y + ")에 그려졌습니다.");
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
