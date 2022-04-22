package com.chianing.algorithm;

import com.chianing.util.ArrayUtil;
import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

class SortBubbleTest {

    SortBubble solution = new SortBubble();

    @Test
    void bubbleSort() {
        LogUtil.printAfterLog(solution.bubbleSort(ArrayUtil.getArray(3, 4, 2, 1)));
        LogUtil.printAfterLog(solution.bubbleSort(ArrayUtil.getArray(2, 2, 4, 1, 5)));
    }
}