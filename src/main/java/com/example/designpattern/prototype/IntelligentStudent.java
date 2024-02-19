package com.example.designpattern.prototype;

public class IntelligentStudent extends Student{
    private int iq;
    public IntelligentStudent(){}
    public IntelligentStudent(IntelligentStudent intelligentStudent){
        super(intelligentStudent);
        this.iq=intelligentStudent.iq;
    }
    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent copy() {
        IntelligentStudent copy=new IntelligentStudent(this);

//        copy.setName(this.getName());
//        copy.setAge(this.getAge());
//        copy.setPsp(this.getPsp());
//        copy.setBatch(this.getBatch());
//        copy.setAvgBatchPsp(this.getAvgBatchPsp());

        return copy;
    }
}
