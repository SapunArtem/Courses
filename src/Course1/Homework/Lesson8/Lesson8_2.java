package Course1.Homework.Lesson8;

public class Lesson8_2 {
    public static final double pi = 3.14;

    public double ploschadKruga(double rad1) {
        return pi * rad1 * rad1;
    }

    public static double dlinaOkrugnosti(double rad2) {
        return 2 * pi * rad2;

    }

    public void dannie(double rad3) {
        System.out.println("Radius  = " + rad3 + " PloshadKruga = " + ploschadKruga(rad3) + " dlinaokrugnosti = "
                + dlinaOkrugnosti(rad3));

    }
}
    class Lesson8_2Test{
        public static void main(String[] args) {
            Lesson8_2 kr1 = new Lesson8_2();
            kr1.ploschadKruga(4);
           Lesson8_2.dlinaOkrugnosti(2);
            kr1.dannie(7);
        }
    }


