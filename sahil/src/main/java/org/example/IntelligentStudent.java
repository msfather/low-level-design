package org.example;

public class IntelligentStudent implements prototype<IntelligentStudent> {
    int p;
    int q;
    int r;
    public IntelligentStudent(){}
    public IntelligentStudent(int p, int q,int r) {
        this.p=p;
        this.q=q;
        this.r=r;
    }
    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "p=" + p +
                ", q=" + q +
                ", r=" + r +
                '}';
    }

    @Override
    public IntelligentStudent Clone() {
        System.out.println("IntelligentStudent Object called");
        IntelligentStudent intelligentStudent=new IntelligentStudent();
        intelligentStudent.p=p;
        intelligentStudent.q=q;
        intelligentStudent.r=r;
        return intelligentStudent;
    }
}
