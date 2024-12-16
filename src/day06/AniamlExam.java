package day06;

public class AniamlExam {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        Dog dog = new Dog();
        Cat cat = new Cat();

        animals[0] = dog;
        animals[1] = cat;

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

}
