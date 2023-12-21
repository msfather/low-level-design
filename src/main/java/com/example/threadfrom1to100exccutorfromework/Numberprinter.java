package com.example.threadfrom1to100exccutorfromework;

public class Numberprinter implements Runnable{
        int num;

    public Numberprinter(int num) {
        this.num = num;
    }

    @Override
        public void run() {
            System.out.println(num+" Name of thread "+Thread.currentThread().getName());
        }
}
