package ru.gb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrConv <T> {

    public List<T> arrConvert (T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }

}
