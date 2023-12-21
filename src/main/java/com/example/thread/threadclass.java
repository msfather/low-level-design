package com.example.thread;

import java.util.HashMap;

public class threadclass extends Thread {
    public static HashMap<String, String> map = new HashMap<>();
    private String target;

    threadclass(Runnable r) {
        super(r);
        target = r.getClass().getName();
    }
    @Override
    public void start() {
        super.start();
        map.put(target, this.getName());
    }
}


