package org.example;

public class IntelligentStudent1 implements prototype<IntelligentStudent1>{
    int a;
    int b;
    int c;
    int d;
    public IntelligentStudent1(){}

    public IntelligentStudent1(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        System.out.println("IntelligentStudent1 Object called");
    }

    @Override
    public String toString() {
        return "IntelligentStudent1{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    @Override
    public IntelligentStudent1 Clone() {
        System.out.println("IntelligentStudent1 Object called");
        IntelligentStudent1 intelligentStudent1=new IntelligentStudent1();
        intelligentStudent1.a=a;
        intelligentStudent1.b=b;
        intelligentStudent1.c=c;
        intelligentStudent1.d=d;
        return intelligentStudent1;
    }
}
