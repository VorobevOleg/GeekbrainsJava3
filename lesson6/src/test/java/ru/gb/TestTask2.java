package ru.gb;
import org.junit.jupiter.api.*;

public class TestTask2 {

    private Main task2;

    @BeforeEach
    public void init() {
        task2 = new Main();
    }

    @Test
    public void test1(){
        Assertions.assertEquals(true,task2.task2(new int[]{1, 1, 1, 4, 4, 1, 4, 4}));
    }

    @Test
    public void test2(){
        Assertions.assertEquals(false,task2.task2(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    public void test3(){
        Assertions.assertEquals(false,task2.task2(new int[]{4, 4, 4, 4}));
    }

    @Test
    public void test4(){
        Assertions.assertEquals(false,task2.task2(new int[]{1, 4, 4, 1, 1, 4, 3}));
    }

    @Test
    public void test5(){
        Assertions.assertEquals(false,task2.task2(new int[]{14, 41, 11, 44}));
    }

}
