package TraningCodeWars;

public class Cata8_6 {
    public static int sum(int num){
        int result = 0;
        for (int i = 0;i<=num;i++){
            result +=i;
        }
        return result;
    }
    public static void main(String[] args) {
   int t = sum(8);
        System.out.println(t);
    }
}
