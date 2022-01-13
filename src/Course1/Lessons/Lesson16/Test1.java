package Course1.Lessons.Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("abcgvhgvabc");
        int a = s1.length();
        System.out.println(a);
        System.out.println(s1.charAt(3));
        System.out.println(s1.indexOf("abc"));
        System.out.println( s1.startsWith("abc",8));
        System.out.println(s1.endsWith("abc"));
    }
}