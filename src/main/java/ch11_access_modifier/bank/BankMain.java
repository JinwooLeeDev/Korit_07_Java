package ch11_access_modifier.bank;
import java.util.*;
public class BankMain {

    public static void main(String[] args) {
        Bank account1 = new Bank();
        Bank account2 = new Bank();

        account1.setAccountHolder("홍길동");
        account1.setAccountNum(123456);
        account1.setBalance(100000);
        account1.setPinNumber(1234);

        account2.setAccountHolder("신사임당");
        account2.setAccountNum(987654);
        account2.setBalance(500000);
        account2.setPinNumber(1234);

        account1.showAccount();
        System.out.println();
        account2.showAccount();

        account1.deposit(50000, 1234);
        System.out.println();
        account1.withdraw(200000, 1234);
        System.out.println();
        account1.withdraw(100000, 1234);
        System.out.println();
        account2.withdraw(100000, 1234);
        System.out.println();
        account2.deposit(200000, 1234);

        System.out.println();

        System.out.println("최종 계좌 정보");
        account1.showAccount();
        System.out.println();
        account2.showAccount();

        Bank bank4 = new Bank(13579, "김사", -3000, 123456);
        bank4.showAccount();
    }
}
