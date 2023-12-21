package com.example.comprator1;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class comp implements Iterable<comp> {
    int price;
    int speed;
    comp comp1;

    public comp(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }


    @Override
    public Iterator<comp> iterator() {
        return new own(this);
    }
}
