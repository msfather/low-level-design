package com.example.mutexq;

public class Counter {
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public int getCounter() {
        return count;
    }

    public void setCounter(int count) {
        this.count = count;
    }
    public synchronized void incValue(int count){
        this.count+=count;
    }
    public synchronized int getValue(){
        return count;
    }
    public synchronized void decValue(int count){
        this.count-=count;
    }
}