package com.example.Multipthreadingmergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class mergesorter implements Callable<List<Integer>> {
    List<Integer>sortlist;
    ExecutorService executorService;
    public mergesorter(List<Integer> sortlist,ExecutorService executorService) {
        this.sortlist = sortlist;
        this.executorService=executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        System.out.println("Name of thread"+Thread.currentThread().getName());
        int n=sortlist.size();
        if(n<=1)return sortlist;
        List<Integer>leftarray=new ArrayList<>();
        for(int i=0;i<n/2;i++)leftarray.add(sortlist.get(i)); //2
        List<Integer>rightarray=new ArrayList<>();
        for(int i=n/2;i<n;i++)rightarray.add(sortlist.get(i));  // 1 6
        mergesorter left=new mergesorter(leftarray,executorService);
        mergesorter right=new mergesorter(rightarray,executorService);
        Future<List<Integer>>ansleftfuture=executorService.submit(left); // this is not a blocking condition
        Future<List<Integer>>ansrightfuture=executorService.submit(right);// this is not a blocking condition
        List<Integer>ansleft=ansleftfuture.get(); // this is  a blocking call
        List<Integer>ansright=ansrightfuture.get();// this is a blocking call
        List<Integer>ans=new ArrayList<>();
        int i=0,j=0;
        while (i<ansleft.size() && j<ansright.size()){
            if(ansleft.get(i)<=ansright.get(j)){
                ans.add(ansleft.get(i));
                i++;
            }
            else{
                ans.add(ansright.get(j));
                j++;
            }
        }
        while (i<ansleft.size()){
            ans.add(ansleft.get(i));
            i++;
        }
        while (j<ansright.size()){
            ans.add(ansright.get(j));
            j++;
        }
        return ans;
    }
}
