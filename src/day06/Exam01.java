package day06;

class Car {
    String name;
    int speed;

    public void 운행하다() {
        System.out.println("운행");
    }
}

class Bus extends Car {
}

public class Exam01 {
    public static void main(String[] args) {
        Car car = new Car();
        car.name = "티코";
        car.speed = 100;
        System.out.println(car.name);
        System.out.println(car.speed);

        Bus bus = new Bus();
        bus.name = "마을버스";
        bus.speed = 80;

        System.out.println(bus.name);
        System.out.println(bus.speed);
        bus.운행하다();

    }
}
