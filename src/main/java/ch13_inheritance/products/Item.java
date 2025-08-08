package ch13_inheritance.products;

/*
    부모 클래스 Item
    자식 클래스 Product
    실행 클래스 ProductMain 클래스 생성

    Item 클래스에
    1. field 선언 private String name / private String category
    2. AllArgsConstructor
    3. Setter / Getter
    4. Product에 상속시키세요.
 */

public class Item {
    private String name;
    private String category;

    public Item(String category, String name) {
        this.category = category;
        this.name = name;
    }

    public Item() {

    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
