package TraningCodeWars;

public class Cata7_5 {
    public static int abc(int a){
        if (a%5 == 0){
            return a;
        }
            while (a%5!=0) {
                a++;
            }
            return a;

        }

    public static void main(String[] args) {
        int i = abc(-9);
        System.out.println(i);
    }
}
