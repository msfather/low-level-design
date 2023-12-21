package com.example.syncronized;

public class Substract implements Runnable{
    Count count;

    public Substract(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=1;i<=10000;i++){
            count.value-=i;
        }
    }
}
