package day06;

public class Pen {
    private String color;
    private String name;
    private int price;

    public Pen(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

}
