package day1;

public class ItemForArray {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price; // 정의된 price를 인수로 들어온 price로 변경.
    }

    public void setName(String name) {
        this.name = name;
    }

    public ItemForArray(int price, String name) { //생성자
        this.price = price;
        this.name = name;
    }
}
