package com.chianing.thread;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Q1115_printFooBarTest {

    Q1115_printFooBar solution = new Q1115_printFooBar(10);

    @Test
    void printFooBarTest() throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Thread fooThread = new Thread(() -> System.out.print("Foo"));
        Thread barThread = new Thread(() -> System.out.println("Bar"));

        executorService.execute(() -> {
            try {
                solution.foo(fooThread);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        executorService.execute(() -> {
            try {
                solution.bar(barThread);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread.sleep(1000);

    }

}