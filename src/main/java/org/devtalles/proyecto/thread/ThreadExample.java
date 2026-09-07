package org.devtalles.proyecto.thread;

public class ThreadExample extends Thread {

    private String name;
    public ThreadExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
//        for (int i = 0; i < 5; i++) {
//            System.out.println(name + " Message: " + i + " Executing in: " + Thread.currentThread().getName());
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                System.out.println(e.getMessage());
//            }
//        }
    }

    public static void main(String[] args) {
//        System.out.println("Starting "+Thread.currentThread().getName());
//        ThreadExample threadExampleA = new ThreadExample("ThreadExampleA");
//        ThreadExample threadExampleB = new ThreadExample("ThreadExampleB");
//        threadExampleA.start();
//        threadExampleB.start();
    }
}
