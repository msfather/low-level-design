package com.example.consumerproducer;

import java.util.Queue;

public class Producer implements Runnable{
    Queue<Shirt>queue;
    String name;
    int Max_size;

    public Producer(Queue<Shirt> queue, String name, int max_size) {
        this.queue = queue;
        this.name = name;
        Max_size = max_size;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                if (queue.size() < 6) {
                    System.out.println("Thread name:"+name+" "+ queue.size());
                    queue.add(new Shirt());
                }
            }
        }
    }
}
