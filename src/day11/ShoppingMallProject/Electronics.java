package day11.ShoppingMallProject;

public class Electronics extends Product {
    private Electronics(String id, String name, int price) {
        super(id, name, price);
    }

    @Override
    String getCategory() {
        return "Electronics";
    }
}
