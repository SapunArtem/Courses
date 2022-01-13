package TraningCodeWars;

public class Cata8DifferenceOfVolumesOfCuboids {
    public static int findDifference(final int[] firstCuboid,final int[]secondCuboid) {
        int result1 = 1;
        int result2 =1;
        for (int i : firstCuboid){
            result1 *= i;
        }
      for (int i : secondCuboid){
         result2 *=i;
      }
        return result1-result2;
    }

    public static void main(String[] args) {
        int i = findDifference(new int[]{4,5,6},new int[]{3,5,2});
        System.out.println(i);
    }

    /*public static void main(String[] args) {
        int [] array = {1,2,3};
        int total = 1;
        for (int i : array){
            total *= i;
        }
        System.out.println(total);
    }*/
}
