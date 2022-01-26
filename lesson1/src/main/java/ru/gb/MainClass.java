package ru.gb;

public class MainClass {
    public static void main(String[] args) {

        Integer[] arr1 = {1,2,3,4,5};
        String[] arr2 = {"one","two","three","four","five"};

        // task 1_1
        Arr<Integer> task1_1 = new Arr<>(arr1);
        task1_1.swap(arr1,1,3);
        for (Integer a: arr1) {
            System.out.println(a);
        }

        // task 1_2
        Arr<String> task1_2 = new Arr<>(arr2);
        task1_2.swap(arr2,1,3);
        for (String a: arr2) {
            System.out.println(a);
        }




    }

}
