package com.example.consumerproducer;

import java.util.Queue;

public class Cunsumer implements Runnable{
    Queue<Shirt> queue;
    String name;
    int Max_size;

    public Cunsumer(Queue<Shirt> queue, String name, int max_size) {
        this.queue = queue;
        this.name = name;
        Max_size = max_size;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                if (queue.size() > 0) {
                    System.out.println("Thread name:"+name+" "+ queue.size());
                    queue.remove();
                }
            }
        }
    }
}
