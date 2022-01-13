package Course1.Lessons.Lesson20;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");
     //   System.out.println("all: = "+all);
List<String> list = List.of("odin","dva","tri");
        System.out.println("list = "+list);
        List<String> list2 = List.copyOf(all);
        System.out.println("list2 = "+list2);
        }
    }

