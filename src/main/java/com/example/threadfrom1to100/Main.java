package com.example.threadfrom1to100;

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            printnumber obj=new printnumber(i);
            Thread t=new Thread(obj);
            t.start();
        }
    }
}
