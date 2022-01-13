package Course1.Lessons.Lesson22;

public class Test5 {
    public static void main(String[] args) {
        A a = new A();
        a.print();   //A-A можно вызвать только метод print,вызовется метод из класса А.
        // B d = new A(); //Не может быть создан ,так как объект класса А не может быть создан с типом донных B.
        A s = new B();
        s.print();  // Объект класса B но с тиопм данных класса А ,не может вызывать методы которых нет в классе А.
        s.println();
        B b = new B();
        b.print();
        b.tests();

    }
}

class A{
 void print(){
     System.out.println("privet");
 }
    void println(){
        System.out.println("privetik");
    }
}

class B extends A{
    void print(){
        System.out.println("poka");
    }
    void tests(){}
}
