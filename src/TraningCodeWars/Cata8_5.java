package TraningCodeWars;

import java.util.Arrays;

public class Cata8_5 {
        public static double find_average(double[]array){
        double result = 0;
        for (double i : array) {
            if (array.length == 0){
                return 0;
            }
            result +=i;
        }
        return result /=array.length;

    }

    public static void main(String[] args) {
        double i = find_average(new double[]{3,2,5});
        System.out.println(i);
    }
}
