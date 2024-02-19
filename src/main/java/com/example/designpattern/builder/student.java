package com.example.designpattern.builder;

public class student {
    String name;
    int age;
    String University;
    int gradYear;
    double psp;
    String batch;
    String company;

    private student(studentbuilder studentbuilder) throws IllegalAccessException {
        // validation start
        if(studentbuilder.gradYear>2022)throw  new IllegalAccessException("grade year is not greater then 2022");
        // validation end
        this.name=studentbuilder.name;
        this.age=studentbuilder.age;
        this.University=studentbuilder.University;
        this.gradYear=studentbuilder.gradYear;
        this.psp=studentbuilder.psp;
        this.batch=studentbuilder.batch;
        this.company=studentbuilder.company;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String university) {University = university;}

    public double getPsp() {
        return psp;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public static studentbuilder builder(){
        return new studentbuilder();
    }
   static class studentbuilder {
        String name;
        int age;
        String University;
        int gradYear;
        double psp;
        String batch;
        String company;

        public String getName() {
            return name;
        }

        public studentbuilder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public studentbuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getUniversity() {
            return University;
        }

        public studentbuilder setUniversity(String university) {
            University = university;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public studentbuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public studentbuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public studentbuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getCompany() {
            return company;
        }

        public studentbuilder setCompany(String company) {
            this.company = company;
            return this;
        }
        public student studentfun() throws IllegalAccessException {
            return new student(this);
        }
    }
}
