package com.chianing.thread;

/**
 * 按序打印
 * <a href="https://leetcode-cn.com/problems/print-in-order/">https://leetcode-cn.com/problems/print-in-order/</a>
 */
public class Q1114_printInOrder {

    private volatile Integer step = 0;

    public void first(Runnable printFirst) throws InterruptedException {
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        step = 1;
    }

    public void second(Runnable printSecond) throws InterruptedException {
        while (step != 1) ;
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        step = 2;
    }

    public void third(Runnable printThird) throws InterruptedException {
        while (step != 2) ;
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
        step = 3;
    }

}
