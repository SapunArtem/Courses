package Course2.ComparableAndComparator;

import java.util.*;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100,"Zaur","Tregulov",12345);
        Employee emp2 = new Employee(15,"Ivan","Petrov",6542);
        Employee emp3 = new Employee(123,"Ivan","Sidorov",8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Befor sorting\n"+list);
        Collections.sort(list,new IdComparator());
        System.out.println("After sorting\n"+list);
    }
}
class Employee
        implements Comparable<Employee>
{
    int id;
    String name;
    String surname;
    int salaruy;

    public Employee(int id, String name, String surname, int salaruy) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salaruy = salaruy;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salaruy=" + salaruy +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        if (this.id == anotherEmp.id) {
            return 0;
        }else if (this.id< anotherEmp.id){
            return -1;
        }else {
            return 1;
        }
        //return this.id- anotherEmp.id;
        //return  this.id.compareTo(anotherEmp.id);
        //int res  = this.name.compareTo(anotherEmp.name);
       // if (res == 0){
        //    res = this.name.compareTo(anotherEmp.name);
        }
    }
class IdComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.name.compareTo(emp2.name);
    }
}
