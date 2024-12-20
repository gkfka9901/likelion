package day11.ShoppingMallProject;

public class Clothing extends Product {
    public Clothing(String id, String name, int price) {
        super(id, name, price);
    }

    @Override
    String getCategory() {
        return "";
    }
}
