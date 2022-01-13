package TraningCodeWars;

public class Cata8_8 {
    public static boolean isDivisible(long n ,long x,long y){
        if (n%x==0 && n%y==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b = isDivisible(100,5,3);
        System.out.println(b);
    }
}
