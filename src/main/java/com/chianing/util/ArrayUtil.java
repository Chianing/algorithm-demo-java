package com.chianing.util;

import java.util.Arrays;

public class ArrayUtil {

    public static int[] getArray(int... nums) {
        if (nums.length == 0) {
            return new int[]{};
        }

        return Arrays.stream(nums).toArray();

    }

}
