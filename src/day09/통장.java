package day09;

public class 통장 {
    private int 잔고;

    public void withdraw(int 금액) throws AccountException{
        if (잔고 >= 금액) {
            잔고 -= 금액;
            System.out.println("현재 잔고: " + 잔고);
        } else {
            throw new AccountException("잔고가 부족합니다.");
        }
    }

    public void deposit(int 금액) {
        잔고 += 금액;
        System.out.println("현재 잔고: " + 잔고);
    }

}
