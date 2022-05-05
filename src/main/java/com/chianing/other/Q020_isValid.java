package com.chianing.other;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 有效的括号
 * <a href="https://leetcode-cn.com/problems/valid-parentheses/">https://leetcode-cn.com/problems/valid-parentheses/</a>
 */
public class Q020_isValid {

    public boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }

        Stack<Character> tmpStack = new Stack<>();
        Map<Character, Character> dictMap = new HashMap<>() {
            {
                put('(', ')');
                put('[', ']');
                put('{', '}');
            }
        };

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (dictMap.containsKey(c)) {
                tmpStack.push(c);
                continue;
            }

            if (tmpStack.isEmpty() || dictMap.get(tmpStack.peek()) != c) {
                return false;
            }

            tmpStack.pop();

        }

        return tmpStack.isEmpty();

    }

}
