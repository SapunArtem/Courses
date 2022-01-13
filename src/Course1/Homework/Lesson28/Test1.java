package Course1.Homework.Lesson28;

public class Test1 {
    public static void main(String[] args) {
       Tiger t = new Tiger();
       t.eat("myaso");
       try {
           t.drink("voda");
           try {
               t.drink("pivo");
           }catch (NeMyasoException a){
               System.out.println(a.getMessage());
           }
           catch (Exception a){
               System.out.println(a.getMessage());
           }
           finally {
               System.out.println("Eto inner finally block");
           }
       }
       catch (RuntimeException a){
           System.out.println(a.getMessage());
       }
       catch (Exception a){
           System.out.println(a.getMessage());
       }

    }
}

class NeMyasoException extends RuntimeException{
    NeMyasoException (String m){
        super(m);

    }
}
class NeVodaException extends Exception{
    NeVodaException (String voda){
        super(voda);
    }
}

 class Tiger{
    public void eat(String e){
        if (e.equals("myaso")){
            System.out.println("Tigr est myaso");
        }else {
            throw new NeMyasoException("Tigr ne est "+e);
        }
    }

     public void drink(String e){
         if (e.equals("voda")){
             System.out.println("Tigr pyet vodu");
         }else {
             throw new NeMyasoException("Tigr ne pyet "+e);
         }
     }
}
