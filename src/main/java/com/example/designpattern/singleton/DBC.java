package com.example.designpattern.singleton;

public class DBC {
    private static DBC dbc;

    private DBC() {

    }

    public static DBC GetInsatnce() {
        if (dbc == null) {
            synchronized (DBC.class) {
                if (dbc == null) {
                    dbc = new DBC();
                }
            }
        }
        return dbc;
    }
}
