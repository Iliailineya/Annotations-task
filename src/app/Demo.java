package app;

import java.lang.reflect.Method;

import static app.Util.displayAnnotations;

public class Demo {
    static void classAnnotation(Class<ProductInfo> infoClass) {
        System.out.println("Class Annotations:");
        displayAnnotations(infoClass);
        System.out.println();
    }

    static void methodAnnotations(Class<ProductInfo> infoClass) {
        System.out.println("Method Annotations:");

        Method[] methods = infoClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
            displayAnnotations(method);
            System.out.println();
        }
    }
}
