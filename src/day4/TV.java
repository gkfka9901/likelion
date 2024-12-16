package day4;

public class TV {
    // 속성 - 전원, 소리, 채널
    private boolean power;
    private int volume;
    private int channel;

    public TV(boolean power, int volume, int channel) {
        this.power = power;
        this.volume = volume;
        this.channel = channel;
    }

    public TV(boolean power, int channel) {
        this.power = power;
        this.channel = channel;
    }

    public TV(boolean power) {
        this(power,0,0);
        this.power = power;

    }

    public TV() {}

    // 메소드 - 전원 켜다끄다, 소리 키우다줄이다, 채널 변경
    public void toglePower() {
        power = !power;
        if (power == true) {
            System.out.println("전원 ON");
        } else {
            System.out.println("전원 OFF");
        }
    }


    public void volumeUp() {
        volume++;
        System.out.println("볼륨을 키웁니다." + volume);
    }
    public void volumeDown() {
        volume--;
        System.out.println("볼륨을 줄입니다." + volume);
    }

    public void channelUp() {
        channel++;
        System.out.println("채널을 키웁니다." + channel);
    }
    public void channelDown() {
        channel--;
        System.out.println("채널을 줄입니다." + channel);
    }



    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("채널을 돌립니다." + channel);
    }


}
