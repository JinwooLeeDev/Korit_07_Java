package ch09_classes.products;
/*
Product.java에 여러 가지 생성자를 정의하세요. 필드는

int productNum; String productName;

메서드

showInfo() -> productNum과 productName 정보가 콘솔에 출력되도록 작성

필드가 두개 이기 때문에 생성자가 만들어질 경우의 수는 네 가지

기본 생성자를 사용하여 객체를 생성하세요 product1 productNum 123456 productName LG엘패드

시리얼 넘버를 기본으로 입력하는 매개변수 생성자를 통해 객체를 생성하시오. product2 productNum 9876564 productName 다이소충전기

제품명을 기본으로 입력하는 매개변수 생성자를 통해 객체를 생성하시오 product3 productNum 159357 productName USB-C 케이블

AllArgsConsrtuctor를 이용하여 객체 생성하시오. product4 productNum 951753 productName GFlip6

정보를 출력하는 showInfo()(call1타입으로 정의할것)의 콘솔창 결과는 다음과 같습니다.

실행 예 시리얼 넘버 : 951753 제품 타이틀 : GFlip6
 */
public class Product {
    int productNum;
    String productName;

    public Product() {
    }

    public Product(int productNum, String productName) {
        this.productNum = productNum;
        this.productName = productName;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public Product(int productNum) {
        this.productNum = productNum;
    }

    void showInfo() {
        System.out.println("시리얼 넘버 : " + this.productNum);
        System.out.println("제품 타이틀 : " + this.productName);
    }
}
