package day10;

public class GenericBox<I> { //꺽쇠 안에는 가상의 타입

    I item;

    public I getItem() {
        return item;
    }

    public void setItem(I item) {
        this.item = item;
    }

    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<String>(); // I 타입을 생성 시 String으로
        genericBox.getItem().toUpperCase();

        GenericBox<Pen> penGenericBox = new GenericBox<Pen>();
        penGenericBox.setItem(new Pen());
        penGenericBox.getItem().쓰다();

    }
}
