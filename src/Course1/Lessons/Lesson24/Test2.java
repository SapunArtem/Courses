package Course1.Lessons.Lesson24;

public class Test2 {
}
class Employee{
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void  eat(){
        System.out.println("kushat");
    }
    void sleep(){
        System.out.println("spit");
    }
}

class Teacher extends Employee implements Help_able{
    int kolichestvoUchenikov;
    void uchit(){
        System.out.println("uchit");
    }
    public void pomosh(){
        System.out.println("uchitel okazivaet pomosh");
    }
    public void tushitPojar(){
        System.out.println("uchitel tushit Pojar");
    }
}
abstract class Driver extends Employee implements Help_able,Swim_able{
    String nazvanieMashini;
    void vodit(){
        System.out.println("vodit");
    }
    public void pomosh(){
        System.out.println("voditel okazivaet pomosh");
    }
    public void tushitPojar(){
        System.out.println("voditel tushit Pojar");
    }
    public void swim(){
        System.out.println("voditel mojet plavat");
    }
}

interface Help_able{
    void pomosh();
    void tushitPojar();
}
interface Swim_able{
    void swim();
}
