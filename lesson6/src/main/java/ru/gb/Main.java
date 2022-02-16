package ru.gb;

public class Main {

    public int[] task1(int[] arr) {
        int[] resultArr;
        int indexLastFour = -1;
        for (int i = arr.length-1; i >= 0 ; i--) {
            if (arr[i] == 4) {
                indexLastFour = i;
                break;
            }
        }
        if (indexLastFour == -1) {
            throw new RuntimeException("В массиве нет ни одной 4");
        } else if (arr.length == 1 || indexLastFour == arr.length - 1) {
            return new int[]{};
        } else {
            resultArr = new int[arr.length - (indexLastFour+1)];
            System.arraycopy(arr,indexLastFour+1, resultArr,0,arr.length - (indexLastFour+1));
        }
        return resultArr;
    }

    public boolean task2 (int[] arr) {
        boolean checkOne = false;
        boolean checkFour = false;
        boolean checkAnother = false;
        for (int a : arr) {
            if (a == 1) {
                checkOne = true;
            } else if (a == 4) {
                checkFour = true;
            } else {
                checkAnother = true;
            }
        }
        if (checkOne && checkFour && !checkAnother) {
            return true;
        } else {
            return false;
        }
    }

}
