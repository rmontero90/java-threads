package org.devtalles.proyecto.runnable;

public class RunnableExample implements Runnable {

    private final String name;
    public RunnableExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + " Message: " + i + " Executing in: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new RunnableExample("T1"));
        Thread t2 = new Thread(new RunnableExample("T2"));

        t1.start();
        t2.start();
        System.out.println("T1: " + t1.getName() + " T2: " + t2.getName());
    }

}
