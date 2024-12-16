package day09;

public class ExceptionExam04 {
    // 심부름()  -- 예외가 발생했을 때 내가 직접 처리하는 방식으로
    public static void 심부름() {
        try {
            System.out.println("두부 구매");
        } catch (Exception e) {
            System.out.println("다른 마트에 간다");
        }
    }


    // 심부름2()  -- 예외가 발생했을 때 throws 하는 방식으로 메서드를 만들어 보세요.
    public static void 심부름2() throws Exception{  // 엄마한테 전화
        System.out.println("두부를 산다");
    }

    public static void main(String[] args) {
        try {
            심부름2();
        } catch (Exception e) {
            System.out.println("퇴근길에 아빠보고 사오라고 한다");
        }
    }
}
