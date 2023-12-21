package com.example.threadcallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayCreator arrayCreator=new ArrayCreator();
        ExecutorService executorService= Executors.newCachedThreadPool();
        Future<List<Integer>>ans=executorService.submit(arrayCreator);
        List<Integer>x=ans.get();
        System.out.println(x);
    }
}
