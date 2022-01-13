package Course1.Homework.Lesson20;
import java.util.*;
public class L20 {
    public static ArrayList<String> abc(String ... s1){
        ArrayList<String> list1 = new ArrayList<>();
        for (String s:s1){
            if (!list1.contains(s));
            list1.add(s);
        }
        Collections.sort(list1);
        System.out.print(list1);
        return list1;
    }

    public static void main(String[] args) {
        abc("A","C","D","B");
    }
}
