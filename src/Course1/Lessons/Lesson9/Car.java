package Course1.Lessons.Lesson9;

public class Car {

    int a = 5;
    int b = 10;


    String color;
    int d = 10;
    String engine;
    static int count;



    public Car (String color,String engine){
        this.count ++;
        this.color=color;
        this.engine=engine;
        this.color=color;
        this.engine=engine;

    }


    public static void main(String[] args) {
        Car c = new Car("red","v6");
        System.out.println(c.color);
        System.out.println(c.color);
        int a = 10;

    }


}
