package org.example;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String,Student>mp=new HashMap<>();
    public void register(String key,Student student){
        mp.put(key,student);
    }
    public Student get(String key){
        return mp.get(key);
    }
}
