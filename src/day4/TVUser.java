package day4;

public class TVUser {
    public static void main(String[] args) {
        TV tv = new TV(false, 3, 4);
        tv.toglePower();
        tv.volumeDown();
        tv.volumeUp();
        tv.setChannel(10);
    }

}
