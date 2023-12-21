package com.example.comprator1;

import java.util.Iterator;

public class own implements Iterator<comp> {
    comp comp;
    public own(comp comp) {
        this.comp=comp;
    }

    @Override
    public boolean hasNext() {
        return comp!=null;
    }

    @Override
    public comp next() {
        return null;
    }
}
