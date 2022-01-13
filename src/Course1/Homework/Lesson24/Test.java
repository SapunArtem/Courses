package Course1.Homework.Lesson24;

public class Test {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Mech");
        System.out.println(m.name);
        m.eat();
        m.swim();
        m.sleep();
        Speakable s = new Pingvin("pingv");
        s.speak();
        Animal a = new Lev("lev");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal mam = new Lev("Leva");
        System.out.println(mam.name);
        mam.run();
        mam.eat();
        mam.sleep();
        mam.speak();

    }
}
abstract class Animal{
    Animal(String name){this.name = name;}
    String name;
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal{
    Fish(String name){
    super(name);
    this.name = name;
    }
    public void sleep(){
        System.out.println("Vsegda interesno nablyudat,kak spyat ribi");
    }
    abstract void swim();
}
class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;

    }
    public void swim(){
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }
    public void eat(){
        System.out.println("Mechenosec ne xishnaya riba, i ona est obichniy ribiy korm!");
    }
}
abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name = name;

    }
    abstract void fly();
    public void speak(){
        System.out.println(name+" sings");
    }
}
class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name = name;

    }
    public void eat(){
        System.out.println("Pingvin lybit est ribu!");
    }
    public void sleep(){
        System.out.println("Pingvini spyat prijavshis drug k drugu!");
    }
    public void fly(){
        System.out.println("Pingvini ne umeyut pet kak solovyi!");
    }
}
abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name = name;

    }
    abstract void run();
}
class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name = name;

    }
    public void eat(){
        System.out.println("Lev ,kak lyuboy xishnik,lyubit myaso! ");
    }
    public void sleep(){
        System.out.println("Bolshuyu chast dnya lev spit!");
    }
    public void run(){
        System.out.println("Lev-eto ne samaya bistraya koshka!");
    }
}
interface Speakable{
    default void speak(){
        System.out.println("Somebody speak");
    }
}