package day09;

// 사용자 정의 예외객체를 생성하는 방법: Exception을 상속받으면 된다.
public class MyException extends Exception{
    public MyException() {
    }

    public MyException(String msg) {
        super(msg);
    }
}
