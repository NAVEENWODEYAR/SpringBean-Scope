package com.bean.array.threads;

public class ThreadEx extends Thread {
    public void run()
    {
        System.out.println(" Thread running");
    }
    public static void main(String[] args) {
        Thread t = new ThreadEx();
                    t.start();
    }
}
