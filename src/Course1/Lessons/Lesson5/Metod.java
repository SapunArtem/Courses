package Course1.Lessons.Lesson5;

public class Metod {
    int summa(int a,int b,int c){
        int result = a+b+c;
        return result;
    }
    int sredneeArifmetic(int a1, int b1,int c1) {
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }
}
class test{
    public static void main(String[] args) {
        Metod t = new Metod();
        int summaTrexChisel = t.summa(1,2,3);
        System.out.println(summaTrexChisel);

        System.out.println(t.sredneeArifmetic(20,40,60));
    }
}
