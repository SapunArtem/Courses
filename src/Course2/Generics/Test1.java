package Course2.Generics;

import Course1.Lessons.Lesson12.Car;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List <String> list = new ArrayList <>();
        /*list.add("Ok");
        list.add(5);
        list.add(new StringBuilder("poka"))*/;
        list.add("Ok");
        list.add("Poka");
        list.add("privet");
        list.add("dgfddgd");
        for (Object o : list){
            System.out.println(o+" dlina"+ ((String)o).length());
        }
    }
}
