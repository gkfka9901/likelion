package day06;

class Child extends Parent{
    Child() {
        System.out.println("Child 생성자 실행");
    }
    int i = 10;

    public int getI() {
        return i;
    }

    public  void print() {
        System.out.println(i);
    }
}
