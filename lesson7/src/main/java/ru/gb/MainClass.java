package ru.gb;

import java.lang.reflect.Method;

public class MainClass {
    public static void main(String[] args) {
        try {
            start(MyTest.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start(Class myTest) throws Exception {

        byte checkBeforeSuite = 0;
        int indexBeforeSuite = -1;
        byte checkAfterSuite = 0;
        int indexAfterSuite = -1;

        Method[] methods = myTest.getDeclaredMethods();

        for (int i = 0; i < methods.length; i++) {
            if (methods[i].isAnnotationPresent(BeforeSuite.class)) {
                checkBeforeSuite++;
                indexBeforeSuite = i;
            }
            if (methods[i].isAnnotationPresent(AfterSuite.class)) {
                checkAfterSuite++;
                indexAfterSuite = i;
            }
            if (checkBeforeSuite > 1 || checkAfterSuite > 1) {
                throw new RuntimeException("Количество @BeforeSuite или @AfterSuite больше 1");
            }
        }

        if (indexBeforeSuite > -1) {
            methods[indexBeforeSuite].invoke(null);
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < methods.length; j++) {
                if (methods[j].isAnnotationPresent(Test.class) && methods[j].getAnnotation(Test.class).priority() == i) {
                    methods[j].invoke(null);
                }
            }
        }

        if (indexAfterSuite > -1) {
            methods[indexAfterSuite].invoke(null);
        }
    }
}
