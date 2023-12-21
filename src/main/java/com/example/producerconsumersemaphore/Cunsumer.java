package com.example.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Cunsumer implements Runnable{
    Queue<Shirt>queue;
    String name;
    Semaphore p;
    Semaphore c;

    public Cunsumer(Queue<Shirt> queue, String name, Semaphore p, Semaphore c) {
        this.queue = queue;
        this.name = name;
        this.p = p;
        this.c = c;
    }

    @Override
    public void run() {
        while (true) {
                    System.out.println("Thread name:"+name+" "+ queue.size());
            try {
                c.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            queue.remove();
                    p.release();
                }
            }
}
