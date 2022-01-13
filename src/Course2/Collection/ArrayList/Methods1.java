package Course2.Collection.ArrayList;

import java.util.ArrayList;

public class Methods1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add(1,"Misha");
        for (String s : arrayList1){
            System.out.print(s+" ");
        }
        System.out.println();
       /* ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(50);*/
        System.out.println(arrayList1.get(2));
        arrayList1.set(1,"MAsha");
        arrayList1.remove(0);

        System.out.println(arrayList1);
    }
}
