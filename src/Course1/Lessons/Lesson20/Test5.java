package Course1.Lessons.Lesson20;

import java.util.*;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add("poka");
        list.add(1,"Hello");

        for (String s:list){
            System.out.println(s+" ");
        }
        System.out.println(list.lastIndexOf("poka"));
        System.out.println();
        System.out.println(list.size());
        System.out.println(list.contains("poka"));
        System.out.println(list.toString());

    }
}
