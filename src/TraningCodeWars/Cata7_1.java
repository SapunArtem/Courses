package TraningCodeWars;

public class Cata7_1 {
    public static boolean b(int i){
        int x =(int)Math.sqrt(i);
        if (x*x == i){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b1 = b(25);
        System.out.println(b1);
    }
}
