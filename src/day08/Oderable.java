package day08;

public interface Oderable {
    void order();

    void prepare();

    default void deliver() {
        System.out.println("기본 배달 방법: 일반 배달원으로 배달 중..");
    }

    static void printOrderGuide() {
        System.out.println("===주문 안내===");
        System.out.println("1. order() 메서드로ㅈ주문을 접수합니다.");
        System.out.println("2. prepare() 메서드로 음식을 준비합니다.");
        System.out.println("3. deliver() 메서드로 음식 배달을 진행합니다.");
        System.out.println();
    }
}
