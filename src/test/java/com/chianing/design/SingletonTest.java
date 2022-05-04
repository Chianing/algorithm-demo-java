package com.chianing.design;

import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void getInstance() {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                Singleton instance = Singleton.getInstance();
                System.out.println("index: " + finalI + ", addr: " + instance);
            });
            thread.start();
        }

    }
}