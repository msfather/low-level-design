package org.example;

import com.example.bansal;

public class Main extends bansal{
    public static void main(String[] args) {

        System.out.println("Hello world!");
        sahil obj1=new sahil();
        obj1.firstName="sahil"; // public
      //   obj1.lastName="bansal"; private
        obj1.age=22;  // protected
        obj1.mark=90; // default
    }
    void fun(){
        firstName="sahil";
       // lastName="bansal";
        age=22;
        //   mark=90;
    }
}