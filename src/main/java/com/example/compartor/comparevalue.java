package com.example.compartor;

import java.util.Comparator;

public class comparevalue implements Comparator<comp> {
    @Override
    public int compare(comp o1, comp o2) {
        if(o1.price<o2.price)return -1;
        else if(o1.price>o2.price)return 1;
        return 0;
    }
}
