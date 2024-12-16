package day06;

class Shape {
    public void draw() {
        System.out.println("도형을 그립니다.");
    }
}

class Circle extends Shape{
    public void draw() {
        System.out.println("원을 그립니다");
    }
}

class Rectangle extends Shape{
    public void draw() {
        System.out.println("사각형을 그립니다");
    }
}

public class ShapeExam {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[22];
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        shapes[0] = circle;
        shapes[1] = rectangle;

        for (Shape shape : shapes) {
            shape.draw();
        }
    }

}
