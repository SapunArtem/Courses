package Course2.Generics;

import Course1.Lessons.Lesson10.A;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
    List <?> list = new ArrayList<Integer>();

    List <Double> list1 = new ArrayList<>();
    list1.add(3.14);
        list1.add(3.15);
        list1.add(3.16);
        showInfo(list1);
        List <String> list2 = new ArrayList<>();
        list2.add("ok");
        list2.add("poka");
        list2.add("privet");
        showInfo(list2);

        ArrayList <Integer> ali = new ArrayList<>();
       ali.add(3);
        ali.add(30);
        ali.add(4);
        System.out.println(summ(ali));
    }
    static void  showInfo(List<?> list){
        System.out.println("Moy list soedrjit sleduyushie elementi: " + list);
    }

    public static double summ(ArrayList<? extends Number> al){
        double summ = 0;
        for (Number n : al){
            summ += n.intValue();
        }
        return summ;
    }
}
