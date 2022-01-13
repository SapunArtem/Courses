package Course1.Homework.Lesson9;

public class Lesson9_2 {
    int a =1;
    static int b = 2;

    void abc(int a){
        System.out.println(b);
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(this.b);
    }

    public static void main(String[] args) {
        Lesson9_2 t = new Lesson9_2();
        t.abc(4);
    }
}
