package com.chianing.array;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class Q075_sortColorsTest {

    Q075_sortColors solution = new Q075_sortColors();

    @Test
    void sortColors() {
        int[] arr = {2, 0, 2, 1, 1, 0};
        solution.sortColors(arr);
        LogUtil.printAfterLog(arr);

        arr = new int[]{2, 0, 1};
        solution.sortColors(arr);
        LogUtil.printAfterLog(arr);
    }
}