package Course1.Homework.Lesson8;

public class Lesson8_1 {
    static int abc(int a, int b, int c) {
        int result = a * b * c;
        return result;

    }

    static void abcd(int a1,int b1) {
        System.out.println("Celoy chastnoe : "+ a1/b1 + " Ostatoc: "+ a1%b1);
    }
}

    class Lesson8_1Test{
        public static void main(String[] args) {
            System.out.println(Lesson8_1.abc(1,2,3));
            System.out.println(Lesson8_1.abc(12,5,4));
            Lesson8_1.abcd(3,2);
            Lesson8_1.abcd(5,2);
        }
    }
