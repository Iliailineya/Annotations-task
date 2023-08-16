package app;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

public class Util {

    // Метод для вывода информации об аннотациях на элементе
    static void displayAnnotations(AnnotatedElement element) {
        try {
            Annotation[] annotations = element.getAnnotations();
            if (annotations.length == 0) {
                System.out.println("Annotation not found for the element");
            } else {
                for (Annotation annotation : annotations) {
                    if (annotation instanceof Product product) {
                        System.out.printf("Product: %s, quota: %d%n", product.name(), product.quota());
                    } else {
                        System.out.println("Annotation: " + annotation.annotationType().getSimpleName());
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
