package Course1.Lessons.Lesson6;

public class Employee {
    Employee(int id2,String surname2,int age2){
        this(id2,surname2,age2,0.0,null);

    }

   public Employee(String surname3,int age3){
        this(0,surname3,age3,0.0,null);

    }
    Employee(int id4,String surname4,int age4,double salary4,String department4){
        Id=id4;
        surname=surname4;
        age=age4;
        salary=salary4;
        department=department4;

    }

    int Id;
    String surname;
    int age;
    double salary;
    String department;
}
class employeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Ivanov",26);
        System.out.println(emp1.Id);
        Employee emp2 = new Employee("Petroc",30);
        System.out.println(emp2.surname);
        Employee emp3 = new Employee(3,"Sidorov",40,100.5,"it");
        System.out.println(emp3.department);

    }
}
