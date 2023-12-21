package com.example.compartor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<comp>a=new ArrayList<>();
        a.add(new comp(1,1));
        a.add(new comp(3,2));
        a.add(new comp(4,3));
        a.add(new comp(2,4));
        Collections.sort(a,new Comparator<comp>() {
        @Override
        public int compare(comp o1, comp o2) {
            if(o1.price<o2.price)return -1;
            else if(o1.price>o2.price)return 1;
            return 0;
        }});
        System.out.println(a);
    }
}
