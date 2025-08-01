package ch09_classes.students;

public class Student2 {
    int studentCode;
    String name;
    double score;

    public Student2() {
        System.out.println("기본 생성자로 객체를 생성했습니다.");
    }

    // 좌상단 햄버거(메뉴바) -> 코드(Code) -> 생성(Generate)
    // alt + insert

    public Student2(int studentCode) {
        this.studentCode = studentCode;
        System.out.println("int 매개변수로 객체를 생성했습니다.");
    }

    // 자동완성으로 알아서 생성자 만드시고,
    // 거기에 sout 문구 전부 다 집어넣으세요.

    public Student2(String name) {
        this.name = name;
        System.out.println("String 매개변수 객체를 생성했습니다.");
    }

    public Student2(double score) {
        this.score = score;
        System.out.println("double 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(int studentCode, String name) {
        this.studentCode = studentCode;
        this.name = name;
        System.out.println("int, String 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(String name, double score) {
        this.name = name;
        this.score = score;
        System.out.println("String, double 매개변수 생성자로 객체를 생성했습니다.");
    }

    public Student2(int studentCode, String name, double score) {
        this.studentCode = studentCode;
        this.name = name;
        this.score = score;
        System.out.println("int, String, double 매개변수 생성자로 객체를 생성했습니다.");
    }
}
