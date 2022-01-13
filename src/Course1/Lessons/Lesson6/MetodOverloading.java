package Course1.Lessons.Lesson6;

public class MetodOverloading {
    void show(int i1){
        System.out.println(i1);
        System.out.println("Data type is int");
    }
    void show(boolean b1){
        System.out.println(b1);
        System.out.println("Data type is boolean");

    }
    void show(String s1){
        System.out.println(s1);
        System.out.println("Data type is String");

    }
    void show (String s, int a){
        System.out.println("String: "+ s + " int " + a);
    }
    void show(int a,String s){
        System.out.println("Kakoy horoshiy den!!!");
    }
}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MetodOverloading mO = new MetodOverloading();
        int a = 500;
        mO.show(a);
        boolean b = true;
        mO.show(b);
        String s = "Privet";
        mO.show(s);
        mO.show("privet",10);


    }
}
