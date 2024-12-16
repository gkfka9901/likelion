package day10;

import java.util.ArrayList;

public class CollectionExam {
    public static void main(String[] args) {

        // 가장 많이 사용되는 자료구조중 하나로.. 약간 배열과 비슷하게 생각할 수 있다.
        ArrayList<String> strList = new ArrayList<>();
        System.out.println(strList.size());

        strList.add("abc");
        strList.add("bcd");
        strList.add("efd");
        System.out.println(strList.size());

        System.out.println(strList.get(1)); //인덱스로
        System.out.println(strList.getFirst()); //첫번째 값

        for (String s : strList) { //다 꺼내
            System.out.println(s);
        }


    }
}
