package com.example.addersubstractsync;


public class Main {
    public static void main(String[] args) throws InterruptedException {
        Count count=new Count();
        Adder adder=new Adder(count);
        Substract substract=new Substract(count);
        Thread t1=new Thread(adder);
        Thread t2=new Thread(substract);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count.value);
    }
}
