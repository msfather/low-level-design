package com.example.P;

public class Adder implements Runnable{
    int x,y;
    Adder(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public void run() {
        System.out.println(this.x+this.y);
    }
}
