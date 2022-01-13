package Course1.Homework.Lesson11;

public class Car {
     String color;
     String engine;
     int chisloDoor;

    Car(String color,String engine,int chisloDoor){
        this.color=color;
        this.engine=engine;
        this.chisloDoor=chisloDoor;
    }

}

    class CarTest{

    void door(Car c1,int chsloDoor ){
        c1.chisloDoor=chsloDoor;
    }
    public  void changeColor(Car c1,Car c2){
        String c3 = c1.color;
      c1.color=c2.color;
      c2.color=c3;
    }
        public static void main(String[] args) {
        CarTest ct = new CarTest();
            Car car1 = new Car("red", "v6", 2);
            Car car2 = new Car("blue", "v8", 4);
            ct.door(car1,3);
            ct.changeColor(car1,car2);
            System.out.println("Информация о первой машине: Цвет: "+ car1.color + " Мотор "+ car1.engine + " Количество дверей "+car1.chisloDoor);
            System.out.println("Информация о второй машине: Цвет: "+ car2.color + " Мотор "+ car2.engine + " Количество дверей "+car2.chisloDoor);


        }
    }