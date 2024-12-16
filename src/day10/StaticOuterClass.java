package day10;

public class StaticOuterClass {

    private int outerField = 10;
    private static int staticOuterField = 20;

    public void outerMethod() {

    }

    static class InnerClass{
        public void innerMethod() {
//            System.out.println(outerField); // 접근불가
            System.out.println(staticOuterField); // 접근가능
        }

        public static void ststicInnerMethod() {
            System.out.println("static");
        }
    }

    public static void main(String[] args) {
        StaticOuterClass.InnerClass inner = new StaticOuterClass.InnerClass();

        StaticOuterClass.InnerClass.ststicInnerMethod();

        }
    }

