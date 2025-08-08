package ch06_condition;

import java.util.Scanner;
// 바이크 뺑소니 물피도주 당해서 경찰에 조사받고옴 전 내용 모름
public class Condition07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        String grade = "";
        System.out.print("점수를 입력하세요 >>>");
        score = scanner.nextInt();

        // 중첩 if문을 활용한 grade 대입
        if (score > 100 || score < 0) {
            System.out.println("불가능한 점수 영역입니다.");
            grade = "X";
        } else {
            if (score > 89) {
                grade = "A";
            } else if (score > 79) {
                grade = "B";
            } else if (score > 69) {
                grade = "C";
            } else if (score > 59) {
                grade = "D";
            } else {
                grade = "F";
            }
        }
        System.out.println(" 당신의 점수는 " + score + "점이고, 등급은" + grade + "입니다.");
        //Condition07
    }
}
