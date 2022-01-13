package Course2.Collection.ArrayList;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        //System.out.println(arrayList1);

        ArrayList<String> arrayList2 = new ArrayList<>(200);
        arrayList2.add("Zaur");
        arrayList2.add("Ivan");

        ArrayList<String> arrayList3 = new ArrayList<>(arrayList1);
        System.out.println(arrayList3);
    }
}
