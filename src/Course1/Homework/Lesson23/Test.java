package Course1.Homework.Lesson23;

public class Test {
    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.s1 );
    }
}

class X{
    String s1 = "privet";
}
class Y extends X{
    boolean bool = false;
}
