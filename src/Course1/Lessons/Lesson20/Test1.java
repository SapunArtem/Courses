package Course1.Lessons.Lesson20;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("privet");
        Car c = new Car();
        list.add(c);
        Student s = new Student();
        list.add(s);

        list.add(new StringBuilder("ok"));

        ArrayList <String> list2 = new ArrayList<>(30);
        ArrayList <String> list5 = new ArrayList<>(list2);

        list2.add("poka");
        ArrayList <StringBuilder> list3 = new ArrayList<>();
    }
}

class Car{

}
class Student{

}
