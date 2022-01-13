package Course1.Lessons.Lesson22;

public class Test4 {
}
 class Human2 {

    Human2(String n){
        this(n,null);
    }
  Human2(String n,String s){
      this.name = n;
      this.surename = s;
  }
     String name ;
    String surename ;

}

    class  Student2 extends Human2{
    Student2(){
        this(5);
        System.out.println("hello");

    }
        Student2(int i){
        super("petya");
        }
        public static void main(String[] args) {
            Student2 s = new Student2();
        }
    }
