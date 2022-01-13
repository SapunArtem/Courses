package Course1.Lessons.Lesson24;

public class Test1 {

}
abstract class Figura{
    int kolichestvoStoron = 0;
abstract void perimetr();
    abstract void ploshad();
    void showInfo(){
        System.out.println("Это фигура");
    }

}

class Kvadrat extends Figura{
    int kolichestvoStoron = 4;
    int storona1=10;
public void perimetr(){
    System.out.println("perimetr kvadrata = "+4*storona1);
}
public void ploshad(){
    System.out.println("ploshad kvadrata = "+ storona1*storona1);
}
}

class Pryamougolnik extends Figura{
    int kolichestvoStoron = 4;
    int storona1=8;
    int storona2=5;
    public void perimetr(){
        System.out.println("perimetr pryamougolnika = "+ 2*(storona1+storona2 ));
    }
    public void ploshad(){
        System.out.println("ploshad pryamougolnika = "+ storona1*storona2);
    }

}
class Okrugnost extends Figura{
    int kolichestvoStoron = 0;
    int radius=3;
    public void perimetr(){
        System.out.println("perimetr okrugnosti = "+ 2*3.14*radius);
    }
    public void ploshad(){
        System.out.println("ploshad okrugnosti = "+ 3.14*radius*radius);
    }
}
abstract class chetirehugolnik{
    void def(){
        System.out.println("Eto chetirehugolnik");
    }
}
