package Course1.Homework.Lesson7;


public class Employee {
    int Id;
    public String surname;
    int age;
    private double salary;
    String department;

    public void salaryZnach(){
        System.out.println("Zarplata ="+salary);
    }
    public void surnameZnach(){
        System.out.println("Zarplata ="+surname);
    }
    public void idZnach(){
        System.out.println("Zarplata ="+Id);
    }

    public Employee(int Id1) {
        Id=Id1;
    }
    Employee(String surname2) {
        surname=surname2;

    }
    private Employee(double salary3) {
        salary=salary3;
    }

    double yvelichenieZp() {
        salary *=2;
        return salary;
    }
}
class  EmployeeTest{
    public static void main(String[] args) {
        Employee empl1 = new Employee(12);
        Employee empl2 = new Employee("Ivanov");
       // Employee empl3 = new Employee(555.55);
        System.out.println("Id1 = "+empl1.Id);
        System.out.println("Surname1 = " + empl1.surname);
       // System.out.println("salary1 = " + empl1.salary);

        System.out.println("Id2 = "+empl2.Id);
        System.out.println("Surname2 = " + empl2.surname);
        //System.out.println("salary2 = " + empl2.salary);

        empl1.idZnach();
        empl1.surnameZnach();
        empl1.salaryZnach();

        empl2.idZnach();
        empl2.surnameZnach();
        empl2.salaryZnach();

    }
}



