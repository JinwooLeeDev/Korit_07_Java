package month_test;

public class Factory_Main {
    public static void main(String[] args) {
        Factory factory1 = Factory.getInstance();
        Factory factory2 = Factory.getInstance();
        Factory factory3 = Factory.getInstance();

        System.out.println(factory1);
        System.out.println(factory2);
        System.out.println(factory3);

        System.out.println();
    }
}
