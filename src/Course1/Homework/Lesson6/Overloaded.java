package Course1.Homework.Lesson6;

public class Overloaded {

        int sum(){
            return 0;
        }
        int sum(int a){
            return a;
        }
        int sum(int a,int b){
            return a+b;
        }
        int sum(int a,int b,int c){
            return a+b+c;
        }
        int sum(int a,int b,int c,int d){
            return a+b+c+d;
        }
    }
    class OverloadedTest{
        public static void main(String[] args) {

            Overloaded summa = new Overloaded();
            System.out.println("summa vseh chisel: "+summa.sum());
            System.out.println("summa vseh chisel: "+summa.sum(1));
            System.out.println("summa vseh chisel: "+summa.sum(1,2));
            System.out.println("summa vseh chisel: "+summa.sum(1,2,3));
            System.out.println("summa vseh chisel: "+summa.sum(1,2,3,4));
        }
    }

