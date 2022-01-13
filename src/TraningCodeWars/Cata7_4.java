package TraningCodeWars;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.List;

public class Cata7_4 {
    public static long filterString(final String value){
        long y = 0;
        long i = 0;
        List <Long> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : value.toCharArray()){
            if (Character.isDigit(ch)){
                y = Character.getNumericValue(ch);
String s = sb.append(y).toString();
i = Long.parseLong(s);



            }

        }
        return i;
    }

    public static void main(String[] args) {
        long q = filterString("132rfd3");
        System.out.println(q);

    }
}
