package com.example.designpattern.prototype;

import java.security.PrivateKey;
import java.util.HashMap;
import java.util.Map;

public class StudentRegistry{
    private Map<String,Student>mp=new HashMap<>();
    public void set(String key,Student student){
        mp.put(key,student);
    }
    public Student get(String key){
        return mp.get(key);
    }
}
