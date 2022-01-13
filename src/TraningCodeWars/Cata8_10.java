package TraningCodeWars;

public class Cata8_10 {
    public static boolean isLove(final int x,final int y){
        if (x%2==0 && y%2!=0){
            return true;
        }else if (x%2!=0 && y%2==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean b =isLove(1,1);
        System.out.println(b);
    }
}
