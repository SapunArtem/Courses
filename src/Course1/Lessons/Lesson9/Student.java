package Course1.Lessons.Lesson9;

public class Student {
    public static int a = 10;
    int b = this.a;
    public static int c = 5;
    public int z = this.c;
    static int f = c;
}

class studentTest{
    public static void main(String[] args) {
        Student st1=new Student();
        Student st2 = new Student();
       Student st3;
       st1 = null;
    }
}
