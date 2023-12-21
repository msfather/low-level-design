package com.example.consumerproducer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Shirt>queue=new ConcurrentLinkedQueue<>(); // atomic
        int max_size=6;
        Producer p1=new Producer(queue,"p1",max_size);
        Thread t1=new Thread(p1);
        t1.start();
        Producer p2=new Producer(queue,"p2",max_size);
        Thread t2=new Thread(p2);
        t2.start();
        Producer p3=new Producer(queue,"p3",max_size);
        Thread t3=new Thread(p3);
        t3.start();
        Producer p4=new Producer(queue,"p4",max_size);
        Thread t4=new Thread(p4);
        t4.start();
        Producer p5=new Producer(queue,"p5",max_size);
        Thread t5=new Thread(p5);
        t5.start();
        Producer p6=new Producer(queue,"p6",max_size);
        Thread t6=new Thread(p6);
        t6.start();

        Cunsumer c1=new Cunsumer(queue,"c1",max_size);
        Thread t7=new Thread(c1);
        t7.start();
        Cunsumer c2=new Cunsumer(queue,"c2",max_size);
        Thread t8=new Thread(c2);
        t8.start();
        Cunsumer c3=new Cunsumer(queue,"c3",max_size);
        Thread t9=new Thread(c3);
        t9.start();
        Cunsumer c4=new Cunsumer(queue,"c4",max_size);
        Thread t10=new Thread(c4);
        t10.start();
        Cunsumer c5=new Cunsumer(queue,"c5",max_size);
        Thread t11=new Thread(c5);
        t11.start();
        Cunsumer c6=new Cunsumer(queue,"c6",max_size);
        Thread t12=new Thread(c6);
        t12.start();
    }
}
