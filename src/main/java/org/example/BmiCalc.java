package org.example;

import java.util.Scanner;

public class BmiCalc {

    //call1() 형태로 메서드화 시키는 게 그 다음 task
    public void calcBmi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.println("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble();
        System.out.println("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();

        double bmi = weight / ((height / 100) * (height / 100));

        if (bmi >= 35) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 3단계 비만입니다.");
        }
        else if (bmi >= 30) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 2단계 비만입니다.");
        }
        else if (bmi >= 25) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 1단계 비만입니다.");
        }
        else if (bmi >= 23) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 비만 전 단계입니다.");
        }
        else if (bmi >= 18.5) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 정상입니다.");
        }
        else if (bmi < 18.5) {
            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 저체중입니다.");
        }
    }

    //call3() 형태로 메서드화 시킬 겁니다.
    public static String calcBmi(String name, double height, double weight) {
        double bmi = weight / ((height / 100) * (height / 100));
        String result = "";

        if (bmi >= 35) {
            result += "3단계 비만";
        }
        else if (bmi >= 30) {
            result += "2단계 비만";
        }
        else if (bmi >= 25) {
            result += "1단계 비만";
        }
        else if (bmi >= 23) {
            result += "비만 전 단계";
        }
        else if (bmi >= 18.5) {
            result += "정상";
        }
        else if (bmi < 18.5) {
            result += "저체중";
        }

        return name + "님의 BMI 지수는" + bmi + "으로 " + result + "입니다.";
    }

    // call3() 형태 메서드기는 한데 매개변수가 객체인 경우
    public static void calcBmi(Person person) {
        String name = person.getName();
        double height = person.getHeight();
        double weight = person.getWeight();

        double bmi = weight / ((height / 100) * (height / 100));

        if (bmi >= 35) {
            System.out.println(name + "님의 BMI 지수는" + bmi + "으로 3단계 비만 입니다.");
        }
        else if (bmi >= 30) {
            System.out.println(name + "님의 BMI 지수는" + bmi + "으로 2단계 비만 입니다.");
        }
        else if (bmi >= 25) {
            System.out.println(name + "님의 BMI 지수는" + bmi + "으로 1단계 비만 입니다.");
        }
        else if (bmi >= 23) {
            System.out.println(name + "님의 BMI 지수는" + bmi + "으로 비만 전 단계입니다.");
        }
        else if (bmi >= 18.5) {
            System.out.println(name + "님의 BMI 지수는" + bmi + "으로 정상입니다.");
        }
        else if (bmi < 18.5) {
            System.out.println(name + "님의 BMI 지수는" + bmi + "으로 저체중입니다.");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 >>> ");
        String name = scanner.nextLine();
        System.out.println("키(cm)를 입력하세요 >>> ");
        double height = scanner.nextDouble();
        System.out.println("몸무게(kg)를 입력하세요 >>> ");
        double weight = scanner.nextDouble();
//        /*
//            실행 예
//            이름을 입력하세요 >>> 김일
//            키(cm)를 입력하세요 >>> 172
//            몸무게(kg)를 입력하세요 >>> 68
//            김일 님의 BMI 지수는 23.0으로 과체중입니다.
//         */
//        double bmi = weight / ((height/100) * (height/100));
//
//        if (bmi >= 35) {
//            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 3단계 비만입니다.");
//        }
//        if (bmi >= 30) {
//            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 2단계 비만입니다.");
//        }
//        if (bmi >= 25) {
//            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 1단계 비만입니다.");
//        }
//        if (bmi >= 23) {
//            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 비만 전 단계입니다.");
//        }
//        if (bmi >= 18.5) {
//            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 정상입니다.");
//        }
//        if (bmi < 18.5) {
//            System.out.println(name + "님의 BMI 지수는 " + bmi + "으로 저체중입니다.");
//        }

        System.out.println("=====================================");

        BmiCalc bmiCalc = new BmiCalc();
//        bmiCalc.calcBmi();

        System.out.println("=====================================");

        Person person = Person.builder()
                        .name(name).weight(weight).height(height).build();


        bmiCalc.calcBmi(person);
    }
}
