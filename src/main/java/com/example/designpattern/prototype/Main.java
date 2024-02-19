package com.example.designpattern.prototype;

public class Main {
    private static void filRegistry(StudentRegistry studentRegistry) {
        Student march2023morning=new Student();
        march2023morning.setBatch("morning");
        march2023morning.setAvgBatchPsp(87.8);
        studentRegistry.set("march2023morning",march2023morning);

        IntelligentStudent april2023evening=new IntelligentStudent();
        april2023evening.setBatch("evening");
        april2023evening.setAvgBatchPsp(87.8);
        april2023evening.setIq(1678);
        studentRegistry.set("april2023evening",april2023evening);
    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry=new StudentRegistry();
        filRegistry(studentRegistry);
        Student sahil=studentRegistry.get("march2023morning").copy();
        sahil.setName("sahil");
        sahil.setAge(23);
        sahil.setPsp(92);

        Student sandeep= studentRegistry.get("april2023evening").copy();
        sandeep.setName("Sandeep");
        sandeep.setAge(22);
        sandeep.setPsp(90);
        System.out.println("kldjcbhgdhycd");
    }
}
