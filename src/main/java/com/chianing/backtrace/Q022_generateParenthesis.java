package com.chianing.backtrace;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 括号生成
 * <a href="https://leetcode-cn.com/problems/generate-parentheses/">https://leetcode-cn.com/problems/generate-parentheses/</a>
 */
public class Q022_generateParenthesis {

    private List<String> resultList;

    public List<String> generateParenthesis(int n) {
        if (n <= 0) {
            return Collections.emptyList();
        }

        resultList = new ArrayList<>();

        backtrace("", n, n);

        return resultList;

    }

    private void backtrace(String str, int leftNum, int rightNum) {
        if (leftNum == 0 && rightNum == 0) {
            resultList.add(str);
            return;
        }

        if (leftNum > rightNum) {
            return;
        }

        if (leftNum > 0) {
            backtrace(str + "(", leftNum - 1, rightNum);
        }

        if (rightNum > 0) {
            backtrace(str + ")", leftNum, rightNum - 1);
        }

    }

}
