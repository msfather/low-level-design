package com.example.threadcall;

import java.util.concurrent.*;

public class TreeSizeCalculator implements Callable<Integer> {
    Node root;
    ExecutorService executorService;
    public TreeSizeCalculator(Node root, ExecutorService executorService) {
        this.root = root;
        this.executorService=executorService;
    }

    @Override
    public Integer call() throws Exception {
        if(root==null)return 0;
       Node left=root.left;
       TreeSizeCalculator t1=new TreeSizeCalculator(left,executorService);
     Future<Integer>l=executorService.submit(t1);
     Integer val1=l.get();
       Node right=root.right;
       TreeSizeCalculator t2=new TreeSizeCalculator(right,executorService);
     Future<Integer>r=executorService.submit(t2);
     Integer val2=r.get();
     return val1+val2+1;
    }
}
