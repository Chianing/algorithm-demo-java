package com.chianing.thread;

import com.chianing.util.LogUtil;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Q1114_printInOrderTest {

    Q1114_printInOrder solution = new Q1114_printInOrder();

    @Test
    void printInOrderTest() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Thread firstThread = new Thread(() -> LogUtil.printAfterLog(Thread.currentThread().getName() + ": print first"));
        Thread secondThread = new Thread(() -> LogUtil.printAfterLog(Thread.currentThread().getName() + ": print second"));
        Thread thirdThread = new Thread(() -> LogUtil.printAfterLog(Thread.currentThread().getName() + ": print third"));

        executorService.execute(() -> {
            try {
                solution.second(secondThread);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.execute(() -> {
            try {
                solution.third(thirdThread);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.execute(() -> {
            try {
                solution.first(firstThread);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread.sleep(1000);

    }

}