package Course1.Homework.Lesson17;

public class L17 {
    static boolean ravenstvo(StringBuilder sb1,StringBuilder sb2){
        boolean b = sb1==sb2;
        return b;
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Hello");
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(ravenstvo(sb1,sb2));
    }
}
