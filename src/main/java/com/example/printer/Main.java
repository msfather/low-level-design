package com.example.printer;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String x="java.lang.";
        Class<?>c=Class.forName(x);
        System.out.println(c.toString());
    }
}
