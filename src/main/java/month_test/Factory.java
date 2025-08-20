package month_test;

public class Factory {
    private String factoryName;

    private static Factory factoryObject;

    public Factory() {
    }

    public static Factory getInstance() {
        if (factoryObject==null) {
            factoryObject = new Factory();
        }

        return factoryObject;
    }
}
