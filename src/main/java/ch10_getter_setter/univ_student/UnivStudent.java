package ch10_getter_setter.univ_student;

import java.util.Scanner;

/*
    1. 클래스 설계
        name / grade(1,2,3) / score(double)로 필드를 정의하시오.
    2. 생성자
        1) 기본 생성자
        2) 이름만 받는 생성자
        3) 학년만 받는 생성자
        4) 이름과 학년을 받는 생성자
        5) 이름, 학년, 점수를 받는 생성자
        를 정의하시오.
    3. Setter / Getter 메서드를 정의하시오. -> alt + ins를 사용할 수 있습니다.
        각각의 필드에 대한 setter / getter를 정의합니다.
        setter 3개 / getter 3개가 되겠네요.
        1) setGrade의 범위 1 ~ 4학년
        2) setScore의 범위 0.0 ~ 4.5까지
        범위를 벗어날 경우 불가능한 입력입니다. 가 출력되도록 비지니스 로직을 작성
    4. UnivStudentMain에서
        student1 -> 기본생성자 김일 / 1 / 3.3
        student2 -> 기본생성자 김이 / 3 / -30 -> 실패하고 4.0 입력
        student3 -> 기본생성자 김삼 / 5 -> 실패하고 2 / 2.7
        student4 -> 기본생성자 김사 / 4 / 3.8
        student5 -> 기본생성자 김오 / 2 / 1.0
        으로 객체 생성하시오.
    5. 콘솔창에
        이름 : 김일
        학년 : 1학년
        점수 : 3.3
    으로 출력될 수 있도록 showInfo(); 메서드를 call1() 유형으로 작성하시오.
 */
public class UnivStudent {
    String name;
    int grade;
    double score;
    Scanner scanner = new Scanner(System.in);

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        if (grade>4) {
            System.out.println("잘못된 입력입니다. 다시 입력하세요");
            int a = scanner.nextInt();
            this.grade = a;
        }
        if (grade<1) {
            System.out.println("잘못된 입력입니다. 다시 입력하세요 ");
            int a = scanner.nextInt();
            this.grade = a;
        } else {
            this.grade = grade;
        }
    }

    public void setScore(double score) {
        if (score > 4.5) {
            System.out.println("잘못된 입력입니다. 다시 입력하세요");
            double a = scanner.nextDouble();
            this.score = a;
        }
        if (score < 0.0) {
            System.out.println("잘못된 입력입니다. 다시 입력하세요");
            double a = scanner.nextDouble();
            this.score = a;
        }
        else {
            this.score = score;
        }
    }

    public double getScore() {
        return score;
    }

    public int getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public UnivStudent() {
    }

    public UnivStudent(String name, int grade, double score) {
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    public UnivStudent(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public UnivStudent(double score) {
        this.score = score;
    }

    public UnivStudent(int grade) {
        this.grade = grade;
    }

    public UnivStudent(String name) {
        this.name = name;
    }

    public void showInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("학년 : " + this.grade);
        System.out.println("점수 : " + this.score);
    }
}
