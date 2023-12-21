package com.example.Mutex;

import java.util.concurrent.locks.Lock;

public class Substract implements Runnable{
    Count count;
    Lock lock;
    public Substract(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }
    public Substract(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            lock.lock();
            count.value-=i;
            lock.unlock();
        }
    }
}
