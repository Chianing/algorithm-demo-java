package com.chianing.thread;

/**
 * 交替打印FooBar
 * <a href="https://leetcode-cn.com/problems/print-foobar-alternately/">https://leetcode-cn.com/problems/print-foobar-alternately/</a>
 */
public class Q1115_printFooBar {

    private final int n;

    private volatile boolean stepFlg = false;

    public Q1115_printFooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {
        for (int i = 0; i < n; i++) {
            while (stepFlg) {
                Thread.yield();
            }
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            stepFlg = true;
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            while (!stepFlg) {
                Thread.yield();
            }
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            stepFlg = false;
        }
    }

}
