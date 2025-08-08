package ch07_loops;

import java.util.Scanner;

/*
    중첩 for문도 가능합니다.
    for (int i=0; i<100; i++) {
        반복실행문1-a
        for(int j=0; j<100; j++) {
            반복실행문2
        }
    }
    for문을 활용하여 1일차 1교시입니다. ~ 5일차 3교시 입니다. 까지 출력하시오.
    구구단 for문 활용하여 출력하시오.
 */
public class Loop05 {
    public static void main(String[] args) {
//        for (int i=1; i<6; i++) {
//            for (int j=1; j<4; j++) {
//                System.out.println(i + "일차 " + j + "교시입니다.");
//            }
//        }
//
//        for(int i=2; i<10; i++) {
//            for(int j=1; j<10; j++) {
//                System.out.println(i + " x " + j + " = " + (i*j));
//            }
//        }

        /*
            1 2 3 4 5 ... 10
            11 ... 20
            91 ... 100
         */

//        for (int i=1; i<101; i++) {
//            System.out.print(i+" ");
//            if (i%10==0) {
//                System.out.print("\n");
//            }
//        }
//
//        for (int i=0; i<91; i+=10) {
//            System.out.print(i+1+" ");
//            System.out.print(i+2+" ");
//            System.out.print(i+3+" ");
//            System.out.print(i+4+" ");
//            System.out.print(i+5+" ");
//            System.out.print(i+6+" ");
//            System.out.print(i+7+" ");
//            System.out.print(i+8+" ");
//            System.out.print(i+9+" ");
//            System.out.print(i+10+"\n");
//        }

        /*
            숫자를 입력받아서 n까지 더하는 반복문을 for문으로 작성하시오.
            실행 예
            1부터 몇 까지 더하시겠습니까? >>> 10
            1부터 10까지의 합은 55입니다.

            위에거 다 하신 분들은
            1부터 10까지의 숫자 중 짝수의 합도 도출하시오.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("1부터 몇 까지 더하시겠습니까? >>> ");
        int n = scanner.nextInt();
        int sum=0;
        int sum2=0;
        int sum3=0;

        for (int i=1; i<n+1; i++) {
            sum += i;
            if (i%2==0) {
                sum2 += i;
            }

            if (i%2!=0) {
                sum3 += i;
            }
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
        System.out.println("1부터 " + n + "까지의 짝수의 합은 " + sum2 + "입니다.");
        System.out.println("1부터 " + n + "까지의 홀수의 합은 " + sum3 + "입니다.");
    }
}
