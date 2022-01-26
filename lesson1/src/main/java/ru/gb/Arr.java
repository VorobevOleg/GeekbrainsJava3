package ru.gb;

public class Arr <T> {
    private T[] arr;

    public Arr(T[] arr) {
        this.arr = arr;
    }

    public void swap(T[] arr, int first, int second) {
        T temp;
        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    
}
