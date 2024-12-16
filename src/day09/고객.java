package day09;

public class 고객 {
    public static void main(String[] args) {
        통장 통장 = new 통장();
        통장.deposit(10000);

        try {
            통장.withdraw(3000);
            통장.withdraw(10000);
        } catch (AccountException e) {
            System.out.println(e.getMessage());
        }
    }
}
