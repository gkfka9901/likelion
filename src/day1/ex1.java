package day1;

public class ex1 {
    public static void main(String[] args) {
        ItemForArray item1 = new ItemForArray(3000, "사과");
        ItemForArray item2 = new ItemForArray(4000, "귤");
        ItemForArray item3 = new ItemForArray(5000, "배");

        ItemForArray[] items = new ItemForArray[3];

        items[0] = item1;
        items[1] = item2;
        items[2] = item3;

        printItem(item1);
    }

    static void printItem(ItemForArray items) {
        System.out.println("아이템 이름: " + items.getName() + ", 아이템 가격: " + items.getPrice());

    }
}