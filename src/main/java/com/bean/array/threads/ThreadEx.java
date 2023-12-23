package com.bean.array.threads;

public class ThreadEx extends Thread {
    public void run()
    {
        System.out.println(" Thread running");
        for (int i=0; i<=5;i++)
            System.out.println("Thread pool,"+i);
    }

    public static void main(String[] args) {
        Thread t = new ThreadEx();
                    t.start();
        System.out.println("\n Main method,");
    }
}
