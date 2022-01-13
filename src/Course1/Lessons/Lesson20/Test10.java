package Course1.Lessons.Lesson20;

import java.util.ArrayList;

public class Test10 {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("one");
        all.add("two");
        all.add("three");
        all.add("four");
        all.add("five");

        for (String s:all){
            System.out.println("Number= "+s + "and lenth " +s.length()  );
        }
    }
}
