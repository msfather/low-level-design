package com.example.designpattern.builder;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {

        student s1=student.builder()
                .setAge(23)
                .setBatch("jan2023")
                .setCompany("techmojo")
                .setName("sahil")
                .setUniversity("ABES")
                .setPsp(92.98)
                .setGradYear(2022).studentfun();
    }
}
