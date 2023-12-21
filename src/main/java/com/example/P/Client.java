package com.example.P;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Adder obj=new Adder(x,y);
        Thread t=new Thread(obj);
        t.start();
        System.out.println(x+" times "+y+" is "+x*y);
    }
}
