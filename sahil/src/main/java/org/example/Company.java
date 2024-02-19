package org.example;

public class Company {
    String name;
    int age;
    String University;
    int gradYear;
    double psp;
    String batch;
    String company;
    private Company(Employee employee){
        this.name=employee.getName();
        this.age=employee.getAge();
        this.University=employee.getUniversity();
        this.gradYear=employee.getGradYear();
        this.psp=employee.getPsp();
        this.batch=employee.getBatch();
        this.company=employee.getCompany();
    }
    public static Employee detail(){
        return new Employee();
    }
   static public class Employee {
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
        public Employee setName(String name) {
            this.name = name;
            return this;
        }
        public int getAge() {
            return age;
        }
        public Employee setAge(int age) {
            this.age = age;
            return this;
        }
        public String getUniversity() {
            return University;
        }
        public Employee setUniversity(String university) {
            University = university;
            return this;
        }
        public int getGradYear() {
            return gradYear;
        }
        public Employee setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public double getPsp() {
            return psp;
        }
        public Employee setPsp(double psp) {
            this.psp = psp;
            return this;
        }
        public String getBatch() {
            return batch;
        }
        public Employee setBatch(String batch) {
            this.batch = batch;
            return this;
        }
        public String getCompany() {
            return company;
        }
        public Employee setCompany(String company) {
            this.company = company;
            return this;
        }

       public Company build() {
            return new Company(this);
       }
   }

}
