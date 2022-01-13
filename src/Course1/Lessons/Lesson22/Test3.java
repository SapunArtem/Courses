package Course1.Lessons.Lesson22;

public class Test3 {
    void uvelichZP(Employee e){
        e.salary = e.salary+100;
    }
    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.sleep();
        doc.lechit();
    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("kushat");
    }

    void sleep() {
        System.out.println("spat");
    }
}

class Doctor extends Employee{
    void    lechit(){
        System.out.println("lechit");
    }
}

class Hirurg extends Doctor{
    String skalpel;
    void operaciya(){}
}

class Dantist extends Doctor{

}

class Teacher extends Employee{
    void   uchit(){
        System.out.println("uchit");
    }
}
class Driver extends Employee{ ;
    String nazvanieMashini;
    void   vodit(){
        System.out.println("vodit");
    }
}
