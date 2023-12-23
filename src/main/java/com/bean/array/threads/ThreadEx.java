package com.bean.array.threads;

public class ThreadEx extends Thread {
    public void run()
    {
        System.out.println(" Thread running");
        a++;
    }
    static int a;
    public static void main(String[] args) {
        Thread t = new ThreadEx();
                    t.start();
        System.out.println(a);
        a++;
        System.out.println(a);
    }
}
