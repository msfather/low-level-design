package com.example.threadfrom1to100exccutorfromework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(10);
        for(int i=1;i<=100;i++){
            Numberprinter numberprinter=new Numberprinter(i);
            executorService.submit(numberprinter);
        }
    }
}
