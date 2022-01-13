package Course1.Lessons.Lesson11;

public class Employee {
    public String name;
    public double salary;
    Employee(String name, double salary){
        this.name=name;
        this.salary=salary;

    }

    public double uvelechitel(double a){
        a=a*2;
        return a;
    }
    public double zp2(){
        salary=salary*2;
        return salary;
    }
}

    class EmployeeTest{
        public static void main(String[] args) {
            Employee mp1 = new Employee("Ivan",100.55);
            double d = mp1.uvelechitel(mp1.salary);
            System.out.println(mp1.salary);
            System.out.println(d);
            mp1.zp2();
            System.out.println(mp1.salary);

        }
    }
