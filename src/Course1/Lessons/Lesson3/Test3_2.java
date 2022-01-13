package Course1.Lessons.Lesson3;

public class Test3_2 {
    public static void main(String[] args) {
      /*  int a = 11;
        int b = 3;

        int celayaChast = a/b;
        int ostatoc = a%b;


        System.out.println(celayaChast);
        System.out.println(ostatoc);

        double d1 = 5.5;
        double d2 = 3.5;

        double d3 = d1/d2;
        System.out.println(d3);*/

        int x = 5;
        int y = 3;
       /* int z = x-y++;
        System.out.println(z);
        System.out.println(y);*/
        int z = x-++y;
        System.out.println(z);
        System.out.println(y);

        // a=5; 6; 5; 4; 5
        // ++a - --a - a-- + a++
        //  6  -  5  -  5  +  4  = 0

    }
}
