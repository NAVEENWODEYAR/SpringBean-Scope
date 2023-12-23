package com.bean.array.threads;

public class ThreadEx1 implements Runnable{
    @Override
    public void run() {
        System.out.println("Inside the thread,");
    }

    public static void main(String[] args) {
        ThreadEx1 t1 = new ThreadEx1();
        Thread t = new Thread(t1);
                t.start();
    }
}
