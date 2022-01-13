package Course1.Homework.Lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;
    Employee(String name,String department,double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee{
    void printEmployee(Employee e){
        System.out.println("Имя работника: "+ e.name + " департамент: "+ e.department + " зарплата: "+e.salary);
    }
    void filtraciyaRabotnikov(ArrayList<Employee> aE,Predicate<Employee> p){
        for (Employee emp: aE){
            if (p.test(emp)){
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Employee> list = new ArrayList<>();
        Employee emp1 = new Employee("Ivan","IT",500);
        Employee emp2 = new Employee("Elena","Engineer",250);
        Employee emp3 = new Employee("Egor","IT",250);
        Employee emp4 = new Employee("IT","IT",200);
        Employee emp5 = new Employee("Ela","IT",550);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        TestEmployee te = new TestEmployee();
        te.filtraciyaRabotnikov(list,x->{return x.department=="IT" && x.salary>200;});
        System.out.println("---------------------------------------------------------------");
        te.filtraciyaRabotnikov(list,x->{return x.name.startsWith("E") && x.salary!=450;});

        te.filtraciyaRabotnikov(list,x->x.name== x.department);
    }
}
