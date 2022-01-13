package Course1.Homework.Lesson29;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Test {

    DateTimeFormatter t1 = DateTimeFormatter.ofPattern("yyyy,MMMM-dd!!hh:mm");
    DateTimeFormatter t2 = DateTimeFormatter.ofPattern("hh:mm,dd/MM/yy");

    void smena(LocalDateTime ldt1, LocalDateTime ldt2, Period p1, Duration d1){
while (ldt1.isBefore(ldt2)){
    System.out.print("Работает с:"+ldt1.format(t1));
    ldt1=ldt1.plus(p1);
    System.out.println("До"+ldt1.format(t1));
    System.out.print("Отдыхаем с :"+ldt1.format(t2));
    ldt1=ldt1.plus(d1);
    System.out.println("До:"+ldt1.format(t2));
}
    }

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2016,1,01,9,00);
        LocalDateTime ldt2 = LocalDateTime.of(2016,12,31,9,00);
        Period p1 = Period.of(0,1,2);
        Duration d1 = Duration.ofMinutes(600);
        Test t = new Test();
        t.smena(ldt1,ldt2,p1,d1);
    }
}
