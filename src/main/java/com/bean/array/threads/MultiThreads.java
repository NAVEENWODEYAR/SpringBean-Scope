package com.bean.array.threads;

public class MultiThreads extends Thread {
    public void run()
    {
        try{
            System.out.println("\n Thread "+Thread.currentThread().getId());
        }catch (Exception e){
            System.out.println(e.getCause());
        }
    }
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n Multithreading is a Java feature that allows concurrent execution of two or more parts of a program for maximum utilization of CPU");
        for (int i=0; i<10; i++)
        {
            MultiThreads ml = new MultiThreads();
            MultiThreads ml1 = new MultiThreads();
                        ml.start();
                        ml.wait(100);
                        ml1.start();

        }
    }
}
