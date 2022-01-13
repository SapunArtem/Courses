package TraningCodeWars;
import  java.util.*;

public class Cata8SqashTheBugs {
    public static int findLongest(final String str) {
    String[] spl = str.split(" ");
    int longest = 0;
    for (int i=0; i<spl.length; i++) {
        if (spl[i].length()> longest) {
            longest = spl[i].length();
        }
        }
        return longest;
    }

    public static void main(String[] args) {
       int i = findLongest("z fj wejndw");
        System.out.println(i);
    }
}
