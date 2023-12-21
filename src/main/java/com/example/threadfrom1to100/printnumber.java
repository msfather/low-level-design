package com.example.threadfrom1to100;

public class printnumber implements Runnable{
    int num;
    public printnumber(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println(num+" Name of thread "+Thread.currentThread().getName());
    }
}
