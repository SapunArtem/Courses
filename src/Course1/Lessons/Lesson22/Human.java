package Course1.Lessons.Lesson22;

public class Human {

     protected String name = "kolya";

    protected static int salary = 150;
    protected void work(){
        System.out.println("rabotat");
    }
    protected static void otdihat(){
        System.out.println("otdihat");
    }
}

class Student extends Human{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(salary);
        s.work();
        otdihat();
    }
}
