package com.example.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Queue<Shirt>queue=new ConcurrentLinkedQueue<>(); // atomic
        Semaphore p=new Semaphore(6);
        Semaphore c=new Semaphore(0);
        int max_size=6;
        Producer p1=new Producer(queue,"p1",p,c);
        Thread t1=new Thread(p1);
        t1.start();
        Producer p2=new Producer(queue,"p2",p,c);
        Thread t2=new Thread(p2);
        t2.start();
        Producer p3=new Producer(queue,"p3",p,c);
        Thread t3=new Thread(p3);
        t3.start();
        Producer p4=new Producer(queue,"p4",p,c);
        Thread t4=new Thread(p4);
        t4.start();
        Producer p5=new Producer(queue,"p5",p,c);
        Thread t5=new Thread(p5);
        t5.start();
        Producer p6=new Producer(queue,"p6",p,c);
        Thread t6=new Thread(p6);
        t6.start();

        Cunsumer c1=new Cunsumer(queue,"c1",p,c);
        Thread t7=new Thread(c1);
        t7.start();
        Cunsumer c2=new Cunsumer(queue,"c2",p,c);
        Thread t8=new Thread(c2);
        t8.start();
        Cunsumer c3=new Cunsumer(queue,"c3",p,c);
        Thread t9=new Thread(c3);
        t9.start();
        Cunsumer c4=new Cunsumer(queue,"c4",p,c);
        Thread t10=new Thread(c4);
        t10.start();
        Cunsumer c5=new Cunsumer(queue,"c5",p,c);
        Thread t11=new Thread(c5);
        t11.start();
        Cunsumer c6=new Cunsumer(queue,"c6",p,c);
        Thread t12=new Thread(c6);
        t12.start();
    }
}
