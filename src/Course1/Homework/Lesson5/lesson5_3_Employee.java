package Course1.Homework.Lesson5;

public class lesson5_3_Employee {

        int Id;
        String surname;
        int age;
        double salary;
        String department;

        lesson5_3_Employee(int Id1, String surname2, int age1, double salary1, String department1) {
            surname=surname2;
            Id = Id1;
            age=age1;
            salary=salary1;
            department=department1;
        }

        double yvelichenieZp() {
            salary *=2;
            return salary;
        }
}
    class  EmployeeTest{
        public static void main(String[] args) {
            lesson5_3_Employee empl1 = new lesson5_3_Employee(1,"Patapov",25,550,"politics");
            lesson5_3_Employee empl2 = new lesson5_3_Employee(2,"sstrelcov",32,860,"Enginering");
            empl1.yvelichenieZp();
            System.out.println("Novoe Zp: "+ empl1.salary);
            empl2.yvelichenieZp();
            System.out.println("Novoe Zp: "+ empl2.salary);

        }
    }


