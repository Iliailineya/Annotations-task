package app;

public class ProductHandler {

    public static void main(String[] args) {
        runDemo();
    }

    static void runDemo() {
        Class<ProductInfo> infoClass = ProductInfo.class;

        // Демонстрация аннотации на классе
        Demo.classAnnotation(infoClass);

        // Демонстрация аннотаций на методах класса
        Demo.methodAnnotations(infoClass);
    }

}

