package com.chianing.util;

import java.util.Arrays;

public class ArrayUtil {

    public static int[] getArray(int... nums) {
        if (nums.length == 0) {
            return new int[]{};
        }

        return Arrays.stream(nums).toArray();

    }

    public static void swap(int[] arr, int i1, int i2) {
        int length = arr.length;
        if (length == 0 || i1 >= length || i2 >= length) {
            return;
        }

        int tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }

    public static <T> void swap(T[] arr, int i1, int i2) {
        int length = arr.length;
        if (length == 0 || i1 >= length || i2 >= length) {
            return;
        }

        T tmp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = tmp;
    }

}
