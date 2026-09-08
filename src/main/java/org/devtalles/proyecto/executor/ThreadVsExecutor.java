package org.devtalles.proyecto.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadVsExecutor {

    public static void main(String[] args) {
        System.out.println("Initializing Thread");
        for (int i =1; i < 4; i++) {
            new Thread(()->{
                System.out.println("Task A Thread" + Thread.currentThread().getName());
            }).start();
        }

        System.out.println("Initializing Executor");
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i =1; i < 8; i++) {
            executor.execute(()->{
                System.out.println("Task A Executor " + Thread.currentThread().getName());
            });
        }

        executor.shutdown();

    }
}
