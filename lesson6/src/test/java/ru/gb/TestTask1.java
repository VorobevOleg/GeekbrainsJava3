package ru.gb;
import org.junit.jupiter.api.*;

public class TestTask1 {

    private Main task1;

    @BeforeEach
    public void init() {
        task1 = new Main();
    }

    @Test
    public void test1(){
        Assertions.assertArrayEquals(new int[]{1, 7},task1.task1(new int[]{1, 2, 4, 4, 2, 3, 4, 1, 7}));
    }

    @Test
    public void test2(){
        Assertions.assertArrayEquals(new int[]{1, 7, 5, 3, 2},task1.task1(new int[]{1, 2, 4, 1, 7, 5, 3, 2}));
    }

    @Test
    public void test3(){
        Assertions.assertArrayEquals(new int[]{},task1.task1(new int[]{1, 2, 4}));
    }

    @Test
    @Disabled("Не понятно")
    public void test4(){
        Assertions.assertEquals(new RuntimeException("В массиве нет ни одной 4"),task1.task1(new int[]{1, 2, 5, 6}));
    }

}
