package Course1.Lessons.Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
    ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        StringBuilder sb = new StringBuilder("privet");
        list.add(sb);
        list.add(new StringBuilder("ok"));
        list.add(1,new StringBuilder("Hello"));

        System.out.println(list.toString());
}
}
