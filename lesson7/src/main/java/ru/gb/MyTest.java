package ru.gb;

public class MyTest {

    @BeforeSuite
    public static void beforeSuit() {
        System.out.println("beforeSuit запущен");
    }

    @AfterSuite
    public static void afterSuit() {
        System.out.println("afterSuit запущен");
    }

    @Test (priority = 6)
    public static void test1() {
        System.out.println("Тест 1 запущен : приоритет - 6");
    }

    @Test (priority = 3)
    public static void test2() {
        System.out.println("Тест 2 запущен : приоритет - 3");
    }

    @Test (priority = 1)
    public static void test3() {
        System.out.println("Тест 3 запущен : приоритет - 1");
    }

}
