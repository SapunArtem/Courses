package Course1.Lessons.Lesson16;

public class Car {
    String color;
    String enhine;

    Car(String color,String enhine){
        this.color=color;
        this.enhine=enhine;
    }
    final static int a = 5;
public Car abc(String color){
    Car c10 = new Car(color,"v4");
    return c10;
}

    public static void main(String[] args) {
        Car c =new Car("red","V6");
        Car c2 = c.abc("black");
        System.out.println(c.color);
    }
}

