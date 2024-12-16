package day10;

import day08.Pizza;

public class OuterClass {
    private int outerField = 10;
    private InnerClass innerClass;

    public void  outterMethod() {
        InnerClass inner = new InnerClass();
        inner.innerMethod();
    }

    public class InnerClass{
        public void innerMethod(){
            System.out.println("outerFiled" + outerField);
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.outterMethod();
    }
}
