package Course1.Lessons.Lesson20;
import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList <StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("ok"));
        list.add(1,new StringBuilder("Hello"));
        for (StringBuilder s:list){
            System.out.println(s+" ");
        }
        System.out.println();
        ArrayList <StringBuilder> list2 = new ArrayList<>();
        list2.add(new StringBuilder("petrov"));
        list2.add(new StringBuilder("sidorov"));
        list.addAll(1,list2);
        System.out.println();

        list2.get(1).append("!");

        for (StringBuilder s:list) {
            System.out.println(s+" ");
        }

    }
}
