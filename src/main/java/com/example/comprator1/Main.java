package com.example.comprator1;

import com.example.interfecclass.A;

import java.util.*;

public class Main {
    public static void main(String[] args) {

      comp obj1=new comp(1,3);
//        comp obj2=new comp(1,3);
//        System.out.println(obj1.compareTo(obj2));
        Iterator<?>it=obj1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}