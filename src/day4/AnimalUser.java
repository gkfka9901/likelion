package day4;

public class AnimalUser {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.initAnimal("나비", "호랑이");

        Animal animal2 = new Animal();
        animal2.initAnimal("바둑이", "강아지");

        Animal animal3 = new Animal();
        animal3.initAnimal("치즈", "고양이");


        printAnimal(animal1);
        printAnimal(animal2);
        printAnimal(animal3);
    }

    static void printAnimal(Animal animal) {
        System.out.println("이름: " + animal.name + ", 타입: " + animal.type );

    }
}