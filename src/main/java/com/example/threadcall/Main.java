package com.example.threadcall;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(100);
        ExecutorService executorService= Executors.newCachedThreadPool();
        TreeSizeCalculator treeSizeCalculator=new TreeSizeCalculator(root,executorService);
        Future<Integer>ans=executorService.submit(treeSizeCalculator);
        Integer x=ans.get();
        System.out.println(x);
    }
}
