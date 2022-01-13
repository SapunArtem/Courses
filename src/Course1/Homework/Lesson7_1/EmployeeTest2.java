package Course1.Homework.Lesson7_1;

public class EmployeeTest2 {
    public static void main(String[] args) {
        Course1.Homework.Lesson7.Employee emp1 = new Course1.Homework.Lesson7.Employee(5);
       /* Course1.Homework.Lesson7.Employee emp2 = new Course1.Homework.Lesson7.Employee("Ivanov");
        Course1.Homework.Lesson7.Employee emp3 = new Course1.Homework.Lesson7.Employee(555.55);*/

       // System.out.println(emp1.Id);
        System.out.println(emp1.surname);
       // System.out.println(emp1.salary);

        emp1.idZnach();
        emp1.surnameZnach();
        emp1.salaryZnach();
    }
}
