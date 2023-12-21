package com.example.threadcallable;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    public ArrayCreator(){}
    @Override
    public List<Integer> call() throws Exception {
        List<Integer>ans=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)ans.add(i);
        return ans;
    }
}
