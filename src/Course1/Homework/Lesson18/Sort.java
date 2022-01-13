package Course1.Homework.Lesson18;
import java.util.Arrays;
public class Sort {
    public static void sortirovka(int []array1){
        Arrays.sort(array1);
       for (int i = 0;i<array1.length;i++){
           System.out.print(array1[i]+" ");
       }

    }

    public static void main(String[] args) {
        int [] array2 = {3,6,8,1,5,9,2};
        sortirovka(array2);

    }
}
