package com.example.Multipthreadingmergesort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer>ans=List.of(2,1,6,4,4,32,2,1,3,4,5,6,7,8,5,4,4,9);
        ExecutorService executorService= Executors.newCachedThreadPool();
        mergesorter mergesorter=new mergesorter(ans,executorService);
       Future<List<Integer>>mergelist=executorService.submit(mergesorter);
       List<Integer>t=mergelist.get();
       System.out.println(t);
    }
}
