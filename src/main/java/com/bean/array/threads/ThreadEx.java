package com.bean.array.threads;

public class ThreadEx extends Thread {
    public void run()
    {
        System.out.println("\n Thread,");
    }

    public static void main(String[] args) {
        ThreadEx t = new ThreadEx();
                    t.start();
        System.out.println("\n Main method,");
    }
}
