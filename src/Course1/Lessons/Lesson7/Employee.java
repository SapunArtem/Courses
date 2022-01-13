package Course1.Lessons.Lesson7;

public class Employee {

    double salary;

     public void dvoinayazp(){

         double  result = salary*2;
        System.out.println("Novaya ZP = "+ result);
    }
     Employee(double salary2){
        salary=salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayazp();
    }
}

    class EmployeeTest{
        public static void main(String[] args) {
            Employee emp = new Employee(500);
            System.out.println(emp.salary);
            emp.dvoinayazp();
        }
    }