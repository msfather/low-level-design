package com.example.designpattern.singleton;



public class Main {
    public static void main(String[] args) {
        Runnable runnable1=()->{
            DBC dbc1=DBC.GetInsatnce();
        };
        Thread thread1=new Thread(runnable1);

        Runnable runnable2=()->{
            DBC dbc2=DBC.GetInsatnce();
        };
        Thread thread2=new Thread(runnable2);

        Runnable runnable3=()->{
            DBC dbc1=DBC.GetInsatnce();
        };
        Thread thread3=new Thread(runnable3);
        System.out.println("Hello");
    }
}

