package day08;

public class TVUser {

    //인터페이스 - 기능을 정의
    public static void main(String[] args) {

        TV tv = new LTV();
        tv.togglePower();
        tv.channelUp();
        tv.channelUp();
        tv.volumeDown();
        tv.channelUp();
        tv.volumeUp();
        tv.togglePower();
    }
}