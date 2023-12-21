package com.example.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable{
    Queue<Shirt>queue;
    String name;
    Semaphore p;
    Semaphore c;

    public Producer(Queue<Shirt> queue, String name, Semaphore p, Semaphore c) {
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
                p.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            queue.add(new Shirt());
            c.release();
                }
            }
        }
