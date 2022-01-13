package Course2.Generics.Igra;

public class Test {
    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Ivan",13);
        Schoolar schoolar2 = new Schoolar("Mariya",15);

        Student student1  = new Student("Nikolay",20);
        Student student2 = new Student("Kseniya",18);

        Employee employee1 = new Employee("Zaur",32);
        Employee employee2 = new Employee("Mikhail",47);

        Team <Schoolar> schoolarTeam = new Team<>("Drakoni");
        Team <Student> studentTeam = new Team<>("Vpered");
        Team <Employee> employeeTeam = new Team<>("rabotyagi");
        schoolarTeam.aaddNewPartivipant(schoolar1);
        schoolarTeam.aaddNewPartivipant(schoolar2);
        studentTeam.aaddNewPartivipant(student1);
        studentTeam.aaddNewPartivipant(student2);
        employeeTeam.aaddNewPartivipant(employee1);
        employeeTeam.aaddNewPartivipant(employee2);

    }
}
